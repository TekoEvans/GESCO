/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.EntitiesManagers;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author evans
 */
public class Manager {

    protected static Connection connexion;
    protected static Statement st;
    protected static PreparedStatement ps;
    protected static ResultSet rs;


    public static void connect() {
        String driver = "com.mysql.jdbc.Driver";  // chemin d'acces au pilote
        String url = "jdbc:mysql://localhost:3306/angelApoo"; // chemin d'acces a la base de donne
        String user = "root"; // mom d'utilisateur
        String password = "";
        connexion = null;
        st = null;
        ps = null;
        rs = null;
        try { 
            Class.forName(driver);
            connexion = DriverManager.getConnection(url, user, password); // connection a 
            st= connexion.createStatement();
            
 
              
            
        } catch (Exception e) {
           
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    // fonction pour fermer la connection a la  base de donnees
    public static void closeDB() {
        if (connexion != null) {
            try {
                connexion.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

    public static void closeQuery() {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

    }

}
