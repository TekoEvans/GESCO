package projetapoo;

import Model.Entities.Instituts;
import Model.EntitiesManagers.InstitutsManger;
import Model.Entities.Students;
import Model.EntitiesManagers.CareersManager;
import Model.EntitiesManagers.StudentsManager;
import javax.swing.JOptionPane;
import Vues.*;
import com.lowagie.text.Row;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Fonctions {

    private static String lienPhoto = null;
     

    public Fonctions() {
    }

    public static String getLienPhoto() {
        return lienPhoto;
    }

    public static void setLienPhoto(String lienPhoto) {
        Fonctions.lienPhoto = lienPhoto;
    }

    public static void choixImage(JLabel cadre1) {

        JFileChooser chooser = new JFileChooser("/home/evans/Documents/MesImageEtudiants");
        FileNameExtensionFilter filtre = new FileNameExtensionFilter("jpeg","jpg", "png" );
        chooser.setFileFilter(filtre);
        chooser.showOpenDialog(MainPage.getOldpan());
        File ficher = chooser.getSelectedFile();
//        ImageIcon photoIcon= new ImageIcon(ficher.toString());
//        // recadrage de l'image
//        Image photo= photoIcon.getImage();
//        Image photoCadrer=photo.getScaledInstance(cadre1.getWidth(), cadre1.getHeight() , Image.SCALE_SMOOTH);
//        ImageIcon photoIconCadrer= new ImageIcon(photoCadrer);
//        cadre1.setIcon(photoIconCadrer);
        lienPhoto = ficher.getAbsolutePath();
        PlacePhoto(cadre1, lienPhoto);

    }
        public static void PlacePhoto( JLabel  cadre1 ,String lien){
            ImageIcon photoIcon= new ImageIcon(lien);
        // recadrage de l'image
        Image photo= photoIcon.getImage();
        Image photoCadrer=photo.getScaledInstance(cadre1.getWidth(), cadre1.getHeight() , Image.SCALE_SMOOTH);
        ImageIcon photoIconCadrer= new ImageIcon(photoCadrer);
        cadre1.setIcon(null);
        cadre1.setText(null);
        cadre1.setIcon(photoIconCadrer);
        }

    public static void deconnection(JFrame a, JPanel oldpan) {
        int reponse = JOptionPane.showConfirmDialog(oldpan, "Voulez vous vous deconnecter?", "Attention", JOptionPane.YES_NO_OPTION);

        if (reponse == JOptionPane.YES_OPTION) {
            new PageConnection().setVisible(true);
            a.dispose();

        }
    }

    public static void smsAnnulation(JPanel oldpan, JPanel pan) {
        int reponse = JOptionPane.showConfirmDialog(oldpan, "L'enregistrement en cours sera annulé ", "Attention", JOptionPane.OK_CANCEL_OPTION);

        if (reponse == JOptionPane.OK_OPTION) {
//              
            Fonctions.passTo(oldpan, pan);
            MainPage.getInstitutbut().setEnabled(true);
            MainPage.getParametrebut().setVisible(true);
            MainPage.getParametrebut().setVisible(true);
            MainPage.getDeconnexionbut().setVisible(true);
        }
//             MainPage.getInscriptionbut().setEnabled(false);
    }

    public static void smsAnnulation2(JPanel oldpan, JPanel pan) {
        int reponse = JOptionPane.showConfirmDialog(oldpan, "Quitter?", "Attention", JOptionPane.OK_CANCEL_OPTION);

        if (reponse == JOptionPane.OK_OPTION) {
            MainPage.getInscriptionbut().setEnabled(true);
            Fonctions.passTo(oldpan, pan);

        } else {
            MainPage.getInscriptionbut().setEnabled(false);
        }
    }

    public static void resetField1() {

        PageConnection.getIdentifiantField().setText("");
        PageConnection.getPasswordField().setText("");
        PageConnection.getIdentifiantField().setBackground(new java.awt.Color(255, 255, 255));
        PageConnection.getPasswordField().setBackground(new java.awt.Color(255, 255, 255));
    }

    public static void resetField2() {

        MainPage.getLastnamefield().setText(null);

        MainPage.getLastnamefield().setBorder(BorderFactory.createLineBorder(new Color(0, 154, 255)));
        MainPage.getFirstnamefield().setText(null);

        MainPage.getFirstnamefield().setBorder(BorderFactory.createLineBorder(new Color(0, 154, 255)));

        MainPage.getSexecombo().setBorder(BorderFactory.createLineBorder(new Color(0, 154, 255)));
        MainPage.getjDatenaiss().setDate(null);

        MainPage.getjDatenaiss().setBorder(BorderFactory.createLineBorder(new Color(0, 154, 255)));
        MainPage.getNationalitecombo().setSelectedIndex(0);

        MainPage.getNationalitecombo().setBorder(BorderFactory.createLineBorder(new Color(0, 154, 255)));

        MainPage.getTelephonefield().setText(null);

        MainPage.getTelephonefield().setBorder(BorderFactory.createLineBorder(new Color(0, 154, 255)));
        MainPage.getAddressfield().setText(null);

        MainPage.getAddressfield().setBorder(BorderFactory.createLineBorder(new Color(0, 154, 255)));
        MainPage.getAddressmailfield().setText(null);

        MainPage.getAddressmailfield().setBorder(BorderFactory.createLineBorder(new Color(0, 154, 255)));
//            Fonctions.setLienPhoto(null);
        MainPage.getChampvidelab().setText(null);
        MainPage.getPhotolab().setText("PHOTO");
        MainPage.getPhotopane().setBorder(BorderFactory.createLineBorder(new Color(0, 154, 255)));
        lienPhoto = null;
    }

    public static void resetField3() {
        MainPage.getUpfirstnamefield().setText(null);
        MainPage.getLupastnamefield().setText(null);
        MainPage.getAddressfield1().setText(null);
        MainPage.getAddressmailfield1().setText(null);
        MainPage.getTelephonefield1().setText(null);
        MainPage.getUpphotolab().setIcon(null);
        MainPage.getUpphotolab().setText("PHOTO");
        MainPage.getUpchampvide().setText(null);

    }

    public static void resetBorder(JTextField champ, JLabel sms) {
        champ.setBorder(BorderFactory.createLineBorder(new Color(0, 154, 255)));
        sms.setText(null);
//            
//            MainPage.getLastnamefield().setBorder( BorderFactory.createLineBorder( new Color(0, 154, 255)));
//              
//            MainPage.getFirstnamefield().setBorder( BorderFactory.createLineBorder(new Color(0, 154, 255)));
//           
//            MainPage.getSexecombo().setBorder( BorderFactory.createLineBorder( new Color(0, 154, 255)));
//           
//            MainPage.getjDatenaiss().setBorder( BorderFactory.createLineBorder( new Color(0, 154, 255)));
//             
//            MainPage.getNationalitecombo().setBorder( BorderFactory.createLineBorder( new Color(0, 154, 255)));
//      
//            MainPage.getTelephonefield().setBorder( BorderFactory.createLineBorder(new Color(0, 154, 255)));
//             
//            MainPage.getAddressfield().setBorder( BorderFactory.createLineBorder( new Color(0, 154, 255)));
//     
//            MainPage.getAddressmailfield().setBorder(BorderFactory.createLineBorder( new Color(0, 154, 255)));
// 
//            sms.setText(null);

    }

    public static TableModel fillTable1(int id) {
        Object[] title = {"Matricule", "Nom", "Prénoms", "Spécialité", "Niveau", "Sexe"};
        int numRows = 0;
        String nameCigle;
        ArrayList<Students> students = StudentsManager.selectAll(id);
        DefaultTableModel model = new DefaultTableModel(title, numRows);

        for (Students st : students) {
            nameCigle = CareersManager.selectcareerCigle(st.getIdCareer());
            Object row[] = {st.getId(), st.getLastName(), st.getFristName(), nameCigle, st.getLevel(), st.getSex()};
            model.addRow(row);
        }
        return model;

    }

    public static TableModel fillTablebye(int id, String level) {
        Object[] title = {"Matricule", "Nom", "Prénoms", "Spécialité", "Niveau", "Sexe"};
        int numRows = 0;
        String nameCigle;
        ArrayList<Students> students = StudentsManager.selectAllbyLevel(id, level);
        DefaultTableModel model = new DefaultTableModel(title, numRows);

        for (Students st : students) {
            nameCigle = CareersManager.selectcareerCigle(st.getIdCareer());
            Object row[] = {st.getId(), st.getLastName(), st.getFristName(), nameCigle, st.getLevel(), st.getSex()};
            model.addRow(row);

        }
        return model;

    }

    public static TableModel fillTableRechercheNormal(int id, String srh) {
        Object[] title = {"Matricule", "Nom", "Prénoms", "Spécialité", "Niveau", "Sexe"};
        int numRows = 0;
        String nameCigle;
        ArrayList<Students> students = StudentsManager.recherche(id, srh);
        DefaultTableModel model = new DefaultTableModel(title, numRows);

        for (Students st : students) {
            nameCigle = CareersManager.selectcareerCigle(st.getIdCareer());
            Object row[] = {st.getId(), st.getLastName(), st.getFristName(), nameCigle, st.getLevel(), st.getSex()};
            model.addRow(row);

        }
        return model;

    }

    public static TableModel fillTablebyspecia(int id, String level, String spe) {
        Object[] title = {"Matricule", "Nom", "Prénoms", "Spécialité", "Niveau", "Sexe"};
        int numRows = 0;
        String nameCigle;
        ArrayList<Students> students = StudentsManager.selectAllbySpecilite(id, level, CareersManager.selectcareerId2(spe));
        DefaultTableModel model = new DefaultTableModel(title, numRows);

        for (Students st : students) {
            nameCigle = CareersManager.selectcareerCigle(st.getIdCareer());
            Object row[] = {st.getId(), st.getLastName(), st.getFristName(), nameCigle, st.getLevel(), st.getSex()};
            model.addRow(row);

        }
        return model;

    }

    public static TableModel fillTableforrecherche(int id, String level, String srh) {
        Object[] title = {"Matricule", "Nom", "Prénoms", "Spécialité", "Niveau", "Sexe"};
        int numRows = 0;
        String nameCigle;
        ArrayList<Students> students = StudentsManager.recherche(id, level, srh);
        DefaultTableModel model = new DefaultTableModel(title, numRows);

        for (Students st : students) {
            nameCigle = CareersManager.selectcareerCigle(st.getIdCareer());
            Object row[] = {st.getId(), st.getLastName(), st.getFristName(), nameCigle, st.getLevel(), st.getSex()};
            model.addRow(row);

        }
        return model;

    }

    public static void studentresetField() {

    }

    public static void changeColorBut(JButton but, JButton but1, JButton but2) {
        but.setBackground(new Color(184, 207, 229));
        but1.setBackground(new Color(250, 250, 250));
        but2.setBackground(new Color(183, 58, 58));
    }

    public static void changeColorBut0(JButton but, JButton but1, JButton but2) {
        but.setBackground(new Color(250, 250, 250));
        but1.setBackground(new Color(250, 250, 250));
        but2.setBackground(new Color(183, 58, 58));
    }

    public void changeIcon(JLabel button, String resoursImg) {
        ImageIcon img = new ImageIcon(getClass().getResource(resoursImg));
        button.setIcon(img);
    }

    public void changeIcon1(JLabel button, String resoursImg) {
//          ImageIcon img = new ImageIcon(getClass().getResource(resoursImg)); 

//        try
//        {    
//            transit = ImageIO.read(new File(resoursImg));
//           
//        }catch(IOException e){e.getMessage();}
//        
//         icon = new ImageIcon(transit);
//            button.setHorizontalAlignment(SwingConstants.RIGHT);
//            button.setIcon(icon);
////        
////        
    }

//         if(JOptionPane.showConfirmDialog(null, "Vous allez vous deconncter", "Deconnction", JOptionPane.OK_CANCEL_OPTION)==0){
//          new PageConnection().setVisible(true);
//          this.dispose();
//      }
//             
//        ArrayList<Instituts> institutlist =new ArrayList<>();
//        institutlist= InstitutsManger.selectAll();
//        if(institutlist!=null){
//            for(Instituts insti : institutlist){
//              JButton  but=new JButton(insti.getNameInstitut());
//                but.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 Fonctions.passTo(oldpan, registrationpan);
//                 registrationlab.setText(insti.getLibele());
//             }
//            });
//           }
//         Fonctions.passTo(oldpan, institutpan);
//        }
//    }                         
//            
    public static void passTo(JPanel oldpan, JPanel newpan) {
        oldpan.removeAll();
        oldpan.repaint();
        oldpan.revalidate();

        oldpan.add(newpan);
        oldpan.repaint();
        oldpan.revalidate();
    }

    public void cacherAfficherMenu(JPanel panmenu, boolean show, JLabel button) {

        if (show == true) {
            panmenu.setPreferredSize(new Dimension(50, panmenu.getHeight()));
            changeIcon(button, "/Images/retour.png");

        } else {
            panmenu.setPreferredSize(new Dimension(300, panmenu.getHeight()));
            changeIcon(button, "/Images/icons-menu.png");

        }

    }

    public static void onClick(JPanel menupan, JLabel labchangeicon, Boolean a, JFrame frame) {
        if (a == true) {
            new Fonctions().cacherAfficherMenu(menupan, a, labchangeicon);
            SwingUtilities.updateComponentTreeUI(frame);
            a = false;
        } else {
            new Fonctions().cacherAfficherMenu(menupan, a, labchangeicon);
            SwingUtilities.updateComponentTreeUI(frame);
            a = true;
        }
    }

//       fonction pour rechercher
    public static void rechercher(String str, JTable tab) {
        DefaultTableModel dm2 = (DefaultTableModel) tab.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(dm2);
        tab.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
        List<RowSorter.SortKey> sortlist = new ArrayList<>(6);
        sortlist.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
        sortlist.add(new RowSorter.SortKey(2, SortOrder.ASCENDING));
        trs.setSortKeys(sortlist);
    }

    public static void rechercherSpe(String str, JTable tab) {
        DefaultTableModel dm2 = (DefaultTableModel) tab.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(dm2);
        tab.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
        List<RowSorter.SortKey> sortlist = new ArrayList<>(6);
        sortlist.add(new RowSorter.SortKey(3, SortOrder.ASCENDING));

        trs.setSortKeys(sortlist);
    }

}
