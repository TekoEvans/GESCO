/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.EntitiesManagers;

import Model.Entities.Careers;
import static Model.EntitiesManagers.Manager.rs;
import Vues.MainPage;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author evans
 */
public class CareersManager extends Manager {

    public static ArrayList<Careers> selectAll(int id_institut) {

        ArrayList<Careers> listcareer = new ArrayList<>();
        Careers career;
        try {
            ps = connexion.prepareStatement("SELECT  id, career_name ,cigle FROM Careers  WHERE id_institut = ?");
            ps.setInt(1, id_institut);
            rs = ps.executeQuery();
            while (rs.next()) {
                career = new Careers(rs.getInt("id"), rs.getString("career_name") ,rs.getString("cigle"));
                listcareer.add(career);
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
//        closeQuery();
        return listcareer;
    }

    
     public static int selectcareerId(String careername){
          int idCareer=0;
         try {
              ps=connexion.prepareStatement("SELECT id FROM Careers WHERE  career_name= ? ");
              ps.setString(1, careername);
              rs = ps.executeQuery();
              
              while (rs.next()) {
                idCareer =   rs.getInt("id");
                
            }
         } catch (Exception e) {
         }
        return idCareer;
         
     }
     
     public static int selectcareerId2(String careercigle){
          int idCareer=0;
         try {
              ps=connexion.prepareStatement("SELECT id FROM Careers WHERE  cigle= ? ");
              ps.setString(1, careercigle);
              rs = ps.executeQuery();
              
              while (rs.next()) {
                idCareer =   rs.getInt("id");
                
            }
         } catch (Exception e) {
         }
        return idCareer;
         
     }
//   
     
       public static String selectcareerCigle(int id){
          String  nameCigle=null;
         try {
              ps=connexion.prepareStatement("SELECT cigle FROM Careers WHERE  id= ? ");
              ps.setInt(1, id);
              rs = ps.executeQuery();
              
              while (rs.next()) {
                nameCigle =   rs.getString("cigle");
                
            }
         } catch (Exception e) {
         }
        return nameCigle;
         
     }
//     SELECT COUNT(DISTINCT career_name) FROM Careers WHERE id_institut=1; 
}

     
     



