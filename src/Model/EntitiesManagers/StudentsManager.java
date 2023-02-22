 
package Model.EntitiesManagers;

import Model.Entities.Students;
import Vues.MainPage;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.awt.Color;
import java.awt.Font;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import projetapoo.Fonctions;

/**
 * @author evans
 */
public class StudentsManager extends Manager {
    
    
    public static void insertImage(){
        
        
    }
    public static boolean insertSutdent(Students etu)  {
       boolean verif=false;
            SimpleDateFormat f =   new SimpleDateFormat("yyyy-MM-dd") ;
        try {
            ps = connexion.prepareStatement("INSERT INTO Students (last_name,"
                    + "first_name,birth_date ,sex,level, address, email,telephone,"
                    + "nationality,id_institut,id_career,Anne_acc,photo)  VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, etu.getLastName());
            ps.setString(2, etu.getFristName());
            ps.setString(3,  f.format(etu.getBirthDate()));
            ps.setString(4, etu.getSex());
            ps.setString(5, etu.getLevel());
            ps.setString(6, etu.getAdress());
            ps.setString(7, etu.getEmail());
            ps.setString(8, etu.getTelephone());
            ps.setString(9, etu.getNationality());
            ps.setInt(10, etu.getIdInstitut());
            ps.setInt(11, etu.getIdCareer());
            ps.setString(12,  etu.getRegistrationDate() );
            ps.setString(13, etu.getPhoto()); 
            ps.executeUpdate();
             
            UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 18));
            UIManager.put("OptionPane.messageForeground", new ColorUIResource( new Color(0,154,255))); 
            JOptionPane.showMessageDialog(MainPage.saisipan, "Un etudiant a été ajouter avec succes");
           verif=true;
        } catch (SQLException  ev) {
            JOptionPane.showMessageDialog(MainPage.saisipan,  "Cet etudiant existe deja");
        }
         
        return verif;
    }
    
    
    

    public static ArrayList selectAll() {
        ArrayList<Students> list = new ArrayList<>();
        Students etu;
        try {
            rs = st.executeQuery("SELECT * FROM Students");
            while (rs.next()) {
                etu = new Students(rs.getInt("id"), rs.getString("last_name"), 
                        rs.getString("first_name"), rs.getDate("birth_date"), 
                        rs.getString("sex"),rs.getString("nationality"),
                        rs.getString("level"), rs.getString("address"),
                        rs.getString("email"),rs.getString("telephone"),
                        rs.getInt("id_institut"),rs.getInt("id_career"),
                        rs.getString("Anne_acc"),rs.getString("photo"));
                list.add(etu);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return list;
    }
    public static ArrayList selectAll(int id) {
        ArrayList<Students> list = new ArrayList<>();
        Students etu;
        try {
           rs = st.executeQuery("SELECT * FROM Students where id_institut="+id );
            
           
            while (rs.next()) {
                etu = new Students(rs.getInt("id"), rs.getString("last_name"), 
                        rs.getString("first_name"), rs.getDate("birth_date"), 
                        rs.getString("sex"),rs.getString("nationality"),
                        rs.getString("level"), rs.getString("address"),
                        rs.getString("email"),rs.getString("telephone"),
                        rs.getInt("id_institut"),rs.getInt("id_career"),
                        rs.getString("Anne_acc"),rs.getString("photo"));
                list.add(etu);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return list;
    }
    
    
    
       public static ArrayList selectAllbyLevel(int id,String level) {
        ArrayList<Students> list = new ArrayList<>();
        Students etu;
        try {
            
           rs = st.executeQuery("SELECT * FROM Students where id_institut="+id+" AND level='"+level+"'");
            while (rs.next()) {
                etu = new Students(rs.getInt("id"), rs.getString("last_name"), 
                        rs.getString("first_name"), rs.getDate("birth_date"), 
                        rs.getString("sex"),rs.getString("nationality"),
                        rs.getString("level"), rs.getString("address"),
                        rs.getString("email"),rs.getString("telephone"),
                        rs.getInt("id_institut"),rs.getInt("id_career"),
                        rs.getString("Anne_acc"),rs.getString("photo"));
                list.add(etu);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return list;
    }
     
       
       
       public static ArrayList selectAllbySpecilite(int id,String level,int idcareer) {
        ArrayList<Students> list = new ArrayList<>();
        Students etu;
        try {
            
           rs = st.executeQuery("SELECT * FROM Students where id_institut="+id+" AND level='"+level+"' AND id_career="+idcareer);
            while (rs.next()) {
                etu = new Students(rs.getInt("id"), rs.getString("last_name"), 
                        rs.getString("first_name"), rs.getDate("birth_date"), 
                        rs.getString("sex"),rs.getString("nationality"),
                        rs.getString("level"), rs.getString("address"),
                        rs.getString("email"),rs.getString("telephone"),
                        rs.getInt("id_institut"),rs.getInt("id_career"),
                        rs.getString("Anne_acc"),rs.getString("photo"));
                list.add(etu);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return list;
        
       }
        
         public static ArrayList recherche(int id,String level, String rsh) {
        ArrayList<Students> list = new ArrayList<>();
        Students etu;
        try {
            
           rs = st.executeQuery("SELECT * FROM Students where( last_name like '%"
                    +rsh + "%' or first_name like '%" + rsh + "%') AND id_institut="+id+" AND level='"+level+"' " );
            while (rs.next()) {
                etu = new Students(rs.getInt("id"), rs.getString("last_name"), 
                        rs.getString("first_name"), rs.getDate("birth_date"), 
                        rs.getString("sex"),rs.getString("nationality"),
                        rs.getString("level"), rs.getString("address"),
                        rs.getString("email"),rs.getString("telephone"),
                        rs.getInt("id_institut"),rs.getInt("id_career"),
                        rs.getString("Anne_acc"),rs.getString("photo"));
                list.add(etu);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return list; 
    }
         
        
         public static ArrayList recherche(int id, String rsh) {
        ArrayList<Students> list = new ArrayList<>();
        Students etu;
        try {
            
           rs = st.executeQuery("SELECT * FROM Students where( last_name like '%"
                    +rsh + "%' or first_name like '%" + rsh + "%') AND id_institut="+id  );
            while (rs.next()) {
                etu = new Students(rs.getInt("id"), rs.getString("last_name"), 
                        rs.getString("first_name"), rs.getDate("birth_date"), 
                        rs.getString("sex"),rs.getString("nationality"),
                        rs.getString("level"), rs.getString("address"),
                        rs.getString("email"),rs.getString("telephone"),
                        rs.getInt("id_institut"),rs.getInt("id_career"),
                        rs.getString("Anne_acc"),rs.getString("photo"));
                list.add(etu);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return list; 
    }
         
    public static  Students selectStu(int id) {
         
        Students stu=null;
        try {
           rs = st.executeQuery("SELECT * FROM Students where id ="+id );
            
           
            while (rs.next()) {
                stu = new Students(rs.getInt("id"), rs.getString("last_name"),
                        rs.getString("first_name"),rs.getDate("birth_date"), 
                        rs.getString("sex"),rs.getString("nationality"),
                        rs.getString("level"), rs.getString("address"),
                        rs.getString("email"),rs.getString("telephone"),
                        rs.getInt("id_institut"),rs.getInt("id_career"),
                        rs.getString("Anne_acc"),rs.getString("photo"));
               
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return stu;
    }

    
        
    
    public static void delete(int id) {

        try {

            ps = connexion.prepareStatement(" DELETE FROM Students WHERE id = ?");

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + " probleme de supression");
        }
         
//        JOptionPane.showMessageDialog(null," L'etudiant "  + id+ " a ete Suprimé");
    }

//    public static ArrayList<Students> rechercher(String rsh , int id,int idCareer ) {
//        ArrayList<Students> liste = new ArrayList<>();
//        Students etu;
//        try {
//
//            rs = st.executeQuery("select * from Etudiants where last_name like '%"
//                    +rsh + "%' or first_name like '%" + rsh + "%' WHERE id ="+id+" AND id_career"+idCareer);
//            while (rs.next()) {
//                etu = new Students(rs.getInt("id"), rs.getString("last_name"), rs.getString("first_name"), rs.getDate("birth_date"), rs.getString("sex"));
//                liste.add(etu);
//            }
//        } catch (SQLException e) {
//            System.err.println(e.getMessage());
//        }
//        return liste;
//    }

    public static void Update(int id) {

        try {
            ps = connexion.prepareStatement("UPDATE Students SET last_name = ? , first_name=? , email=?, address=? ,telephone=? ,photo=? WHERE id=? ");

            ps.setString(1, MainPage.getUpfirstnamefield().getText() .toUpperCase());
            ps.setString(2,  MainPage.getLupastnamefield().getText());
            ps.setString(3, MainPage.getAddressmailfield1().getText().toLowerCase());
            ps.setString(4,  MainPage.getAddressfield1().getText().toUpperCase());
            ps.setString(5,  MainPage.getTelephonefield1().getText());
            ps.setString(6,  Fonctions.getLienPhoto() );
             ps.setInt(7,  id);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(MainPage.getOldpan(), "Etudiant "+id +" Modifier");

        } catch (SQLException ev) {
            JOptionPane.showMessageDialog(MainPage.getOldpan(), ev.getMessage());
        }
//        closeQuery();

    }
    
    
    public static void JasperReport(int id){
        try {
            JasperDesign jdesign= JRXmlLoader.load("/home/evans/Documents/MesCodeJava/projetApoo/src/Vues/report1.jrxml");
            String rqt="SELECT Students.last_name, Students.first_name ,\n" +
"Students.birth_date,Students.photo,Instituts.libele,\n" +
"Careers.career_name,Students.Anne_acc, Students.level , \n" +
"Instituts.name_headmaster \n" +
"FROM Students \n" +
"JOIN Instituts \n" +
"ON id_institut= Instituts.id \n" +
"JOIN Careers \n" +
"ON Students.id_career=Careers.id \n" +
"WHERE Students.id="+id; 
            JRDesignQuery updateQuery= new JRDesignQuery();
           updateQuery.setText(rqt);
            jdesign.setQuery(updateQuery);
            JasperReport jreport= JasperCompileManager.compileReport(jdesign);
            JasperPrint jprint = JasperFillManager.fillReport(jreport, null, connexion);
            
            JasperViewer.viewReport(jprint, false);
        }
//        catch (ClassNotFoundException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//        catch(SQLException e){
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
        catch(JRException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
