/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetapoo;

import Model.Entities.Users;
import Model.EntitiesManagers.CareersManager;
import Model.EntitiesManagers.Manager;
import Vues.MainPage;
import Vues.PageConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author evans
 */
public class ProjetApoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager.connect();
        
        PageConnection pc= new PageConnection();
        pc.setVisible(true);
//        PageConnection.user = new Users(1, "mawena", "dums", "admiddnn", "charles");
//
//        MainPage mainPage = new MainPage();
//        mainPage.setVisible(true);
       
    }
    
}
