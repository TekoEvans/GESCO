/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlers;

import javax.swing.JOptionPane;
import Model.Entities.*;
import Model.EntitiesManagers.CareersManager;
import Model.EntitiesManagers.InstitutsManger;
import Model.EntitiesManagers.Manager;
import Model.EntitiesManagers.StudentsManager;
import Model.EntitiesManagers.UserManager;
import Vues.MainPage;

import Vues.PageConnection;
import java.awt.Color;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import projetapoo.Fonctions;

/**
 *
 * @author evans
 */
public class Controler {

    static Users user = null;
    static Students st;
   

    public Controler() {
        super();
    }

    public static Users controlUser() {

        if (PageConnection.getIdentifiantField().getText().isEmpty()) {
            PageConnection.getIdentiferror().setForeground(Color.RED);
            PageConnection.getIdentiferror().setText("Veuillez saisir votre identifiant!");
        }
        if (PageConnection.getPasswordField().getText().isEmpty()) {
            PageConnection.getMotdpserror().setForeground(Color.RED);
            PageConnection.getMotdpserror().setText("Veuillez saisir votre mot de passe!");
        } else {
            if (UserManager.verifUser()) {
                user = new Users(UserManager.id, UserManager.username, UserManager.password, UserManager.rule, UserManager.name);
            }
        }

        return user;

    }

    public static Instituts controllerInstitut(String nameInstitut, String nameHeadmaster, String contact, String libele) {
        Instituts institut = null;
        if (nameInstitut.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Veuillez entrer le nom de l'institut");
        } else if (nameHeadmaster.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Veuillez entrer le nom du directeur");
        } else if (contact.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Veuillez entrer le numero du directeur");
        } else if (libele.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Veuillez entrer le sigle");
        } else {
            institut = new Instituts(nameInstitut, nameHeadmaster, contact, libele);

        }
        return institut;
    }

    ;
    public static void controllerStu1() {

        
        if (MainPage.getLastnamefield().getText().isEmpty()) {

            MainPage.getChampvidelab().setText("Veuillez entrer le nom");
            MainPage.getFirstnamefield().setBorder(BorderFactory.createLineBorder(new Color(255, 0, 51)));
        }
       else  if (MainPage.getFirstnamefield().getText().isEmpty()) {
            MainPage.getChampvidelab().setText("Veuillez entrer le prénom");
            MainPage.getLastnamefield().setBorder(BorderFactory.createLineBorder(new Color(255, 0, 51)));
        
        
        } else if (MainPage.getjDatenaiss().getDate() == null) {

            MainPage.getChampvidelab().setText("Veuillez choisir une date valide");
            MainPage.getjDatenaiss().setBorder(BorderFactory.createLineBorder(new Color(255, 0, 51)));
        } else if (MainPage.getNationalitecombo().getSelectedItem().toString().isEmpty()) {

            MainPage.getChampvidelab().setText("Veuillez choisir la nationalité");
            MainPage.getNationalitecombo().setBorder(BorderFactory.createLineBorder(new Color(255, 0, 51)));

        } else if (MainPage.getTelephonefield().getText().isEmpty()) {

            MainPage.getChampvidelab().setText("Veuillez entrer le  numero de l'étudiant");
            MainPage.getTelephonefield().setBorder(BorderFactory.createLineBorder(new Color(255, 0, 51)));
        } else if (MainPage.getAddressfield().getText().isEmpty()) {

            MainPage.getChampvidelab().setText("Veuillez  entrer l'adresse");
            MainPage.getAddressfield().setBorder(BorderFactory.createLineBorder(new Color(255, 0, 51)));
        } else if (MainPage.getAddressmailfield().getText().isEmpty()) {

            MainPage.getChampvidelab().setText("Veuillez  entrer l'email ");
            MainPage.getAddressmailfield().setBorder(BorderFactory.createLineBorder(new Color(255, 0, 51)));
        } //        else if(Fonctions.getLienPhoto().equals("")){
        //            MainPage.getChampvidelab().setText("Veuillez ajouter une photo de l'etudiant");
        //             
        //        } 
        else {
            Fonctions.passTo(MainPage.saisipan, MainPage.saisi2pan);
            MainPage.getChampvidelab1().setText(null);
        }
    }

    public static boolean controllerStu2(String careerName) {
        boolean verif=false;
        if(MainPage.getCareercombo().getSelectedItem().toString().equals("Choisir la specialité")){
            
            MainPage.getChampvidelab1().setText("Veuillez choisir une specialié ");
            MainPage.getCareercombo().setBorder(BorderFactory.createLineBorder( new Color(255, 0, 51)));
 
        } else{
                    String lien=  Fonctions.getLienPhoto();
                   int idcarers= CareersManager.selectcareerId(careerName); 
         st = new Students(MainPage.getLastnamefield().getText().toUpperCase(),
                MainPage.getFirstnamefield().getText(), MainPage.getjDatenaiss().getDate(),
                MainPage.getSexecombo().getSelectedItem().toString(), MainPage.getNationalitecombo().getSelectedItem().toString(),
                MainPage.getLevelcombo().getSelectedItem().toString(), MainPage.getAddressfield().getText(),
                MainPage.getAddressmailfield().getText(), MainPage.getTelephonefield().getText(),
                MainPage.idinstitut,idcarers, MainPage.getAnneecombo().getSelectedItem().toString(),  lien
        );
       
           verif=StudentsManager.insertSutdent(st);
        }
            return verif;
    }
    

    public static void controllerStuUp(int id ) {
        if (MainPage.getLupastnamefield().getText().isEmpty()) {
     
            MainPage.getUpchampvide().setText( "Touts les champs * sont obligatoires");
        } else if (MainPage.getUpfirstnamefield().getText().isEmpty()) {
            MainPage.getUpchampvide().setText( "Touts les champs * sont obligatoires");
        } else if (MainPage.getAddressmailfield1().getText().isEmpty()) {
             MainPage.getUpchampvide().setText( "Touts les champs * sont obligatoires");
        } else if (MainPage.getAddressfield1().getText().isEmpty()) {
             MainPage.getUpchampvide().setText("Touts les champs * sont obligatoires");
        } else if (MainPage.getTelephonefield1().getText().isEmpty()) {
            MainPage.getUpchampvide().setText( "Touts les champs * sont obligatoires");
        }  
        else {
          StudentsManager.Update(id );

        }
    }

    public static TableModel fillTable() {

        Object[] title = {"Numero", "Nom", "Prénoms", "Date de Naissance", "Sexe", "suprimer"};
        int numRows = 0;
        ArrayList<Students> etudiants = StudentsManager.selectAll();
        DefaultTableModel model = new DefaultTableModel(title, numRows);

        for (Students etu : etudiants) {
            Object row[] = {etu.getId(), etu.getLastName(), etu.getFristName(), etu.getBirthDate(), etu.getSex()};
            model.addRow(row);
        }
        return model;

    }

}
       
//else if(MainPage.getLevelcombo().getSelectedItem().toString().isEmpty() ){
//            
//            MainPage.getChampvidelab1().setText("Veuillez choisir le niveau ");
//            MainPage.getLevelcombo().setBorder(BorderFactory.createLineBorder( new Color(255, 0, 51)));
        
//else if(MainPage.getAnneecombo().getSelectedItem().toString().isEmpty() ){
//            
//            MainPage.getChampvidelab1().setText("Veuillez precisé l'annee academinque ");
//            MainPage.getAnneecombo().setBorder(BorderFactory.createLineBorder( new Color(255, 0, 51)));
//        }
//        