/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.EntitiesManagers;

import Model.Entities.Instituts;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author evans
 */
public class InstitutsManger extends Manager {
     
    
    public static ArrayList<Instituts> selectAll(){
        Instituts institut;
        ArrayList<Instituts> listInstitut= new ArrayList<>();
        try {
            rs=st.executeQuery("SELECT * FROM Instituts");
            while (rs.next()){
                institut= new Instituts(rs.getInt("id"), rs.getString("name_institut"),rs.getString("name_headmaster"),rs.getString("contact"),rs.getString("libele"));
                listInstitut.add(institut);
            }
            
        } catch (SQLException ex) {
             System.err.println(ex.getMessage());
        }
//       closeQuery();
        return listInstitut;
          
    }
    
     public static void insertInstitut(Instituts institut) {

        try {
            ps = connexion.prepareStatement("INSERT INTO Instituts (name_institut,libele,name_headmaster, contact)  VALUES(?,?,?,?)");
            ps.setString(1, institut.getNameInstitut());
            ps.setString(2, institut.getLibele());
            ps.setString(3, institut.getNameHeadmaster());
            ps.setString(4, institut.getContact());
            ps.executeUpdate();
             

            JOptionPane.showMessageDialog(null, "Une institut a été ajouter avec succes");

        } catch (SQLException ev) {
            JOptionPane.showMessageDialog(null, ev.getMessage());
        }
         closeQuery();
    }
}
