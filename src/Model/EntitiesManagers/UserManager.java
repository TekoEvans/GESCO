/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.EntitiesManagers;

import Controlers.Controler;
import Model.Entities.Users;
import java.util.ArrayList;
import Vues.PageConnection;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;
import projetapoo.ProjetApoo;

/**
 *
 * @author evans
 */
public class UserManager extends Manager {

    static boolean etat = false;
    public static int id;
    public static String password;
    public static String username;
    public static String name;
    public static String rule;

    public static boolean verifUser() {

        try {
             
            ps = connexion.prepareStatement("SELECT * FROM Users WHERE username=?  ");
            ps.setString(1, PageConnection.getIdentifiantField().getText());
            rs = ps.executeQuery();
            if (rs.next()) {
                if (PageConnection.getPasswordField().getText().equals(rs.getString("password"))) {

                    etat = true;
                    id = rs.getInt("id");
                    username = rs.getString("username");
                    name = rs.getString("name");
                    password = rs.getString("password");
                    rule = rs.getString("rule_user");

                } else {
                    
                    PageConnection.getMotdpserror().setForeground(Color.RED);

                    PageConnection.getMotdpserror().setText("Mot de passe incorrect veuillez reesayez!");

                }

            } else {

                PageConnection.getIdentiferror().setForeground(Color.RED);
                PageConnection.getIdentiferror().setText("Identifiant  ou mot de passe incorrect veuillez reesayez!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return etat;

//         closeDB();
    }

}
