/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import Controlers.Controler;
import Model.Entities.Careers;
import Model.Entities.Instituts;
import Model.Entities.Students;
import Model.EntitiesManagers.CareersManager;
import Model.EntitiesManagers.InstitutsManger;
import Model.Entities.Users;
import Model.EntitiesManagers.StudentsManager;
import com.toedter.calendar.JDateChooser;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import projetapoo.Fonctions;

/**
 *
 * @author evans
 */
public class MainPage extends javax.swing.JFrame {

    JButton butInstitut;

    public MainPage() {

        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();

        //redimenssion du tableau
        table.setRowHeight(25);
        table.setRowHeight(0, 70);

        parametrebut.setIcon(new ImageIcon(getClass().getResource("/Images/icons-paramètres-.png")));
           triecombo2.setEnabled(false);
       
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        anneecombo.setSelectedItem(year + " - " + (year + 1));
       
    }

    public static JLabel getPhotolab() {
        return photolab;
    }

    public static JButton getInscriptionbut() {
        return institutbut;
    }

    public static JLabel getBienvenuelab() {
        return bienvenuelab;
    }

//    public static  JLabel getLabaceuil() {
//        return labacceuil;
//    }

    public JPanel getMenupan() {
        return menupan;
    }

    public static JPanel getOldpan() {
        return oldpan;
    }

    public JButton getSuivantbut() {
        return Suivantbut;
    }

    public static JTextField getAddressfield() {
        return addressfield;
    }

    public static JTextField getAddressmailfield() {
        return addressmailfield;
    }

    public static JTextField getFirstnamefield() {
        return firstnamefield;
    }

    public static JDateChooser getjDatenaiss() {
        return jDatenaiss;
    }

    public static JComboBox<String> getNationalitecombo() {
        return nationalitecombo;
    }

    public static JTextField getLastnamefield() {
        return lastnamefield;
    }

    public static JTextField getTelephonefield() {
        return telephonefield;
    }

    public static JLabel getChampvidelab() {
        return champvidelab;
    }

    public static JLabel getChampvidelab1() {
        return champvidelab1;

    }

    public static JComboBox<String> getSexecombo() {
        return sexecombo;
    }

    public static JComboBox<String> getCareercombo() {
        return careercombo;
    }

    public static JTextField getInstitutfiled() {
        return institutfield;
    }

    public static JComboBox<String> getLevelcombo() {
        return levelcombo;
    }

    public static JComboBox<String> getAnneecombo() {
        return anneecombo;
    }

    public int getIdinstitut() {
        return idinstitut;
    }

    public JPanel getSaisi2pan() {
        return saisi2pan;
    }

    public JPanel getSaisipan() {
        return saisipan;
    }

    public static JPanel getPhotopane() {
        return photopane;
    }

    public static JTextField getAddressfield1() {
        return addressfield1;
    }

    public static JTextField getAddressmailfield1() {
        return addressmailfield1;
    }

    public static JTextField getLupastnamefield() {
        return lupastnamefield;
    }

    public static JTextField getUpfirstnamefield() {
        return upfirstnamefield;
    }

    public static JLabel getUpphotolab() {
        return upphotolab;
    }

    public static JTextField getTelephonefield1() {
        return telephonefield1;
    }

    public static JLabel getUpchampvide() {
        return upchampvide;
    }

    public static JComboBox<String> getTriecombo() {
        return triecombo2;
    }

    public static JButton getInstitutbut() {
        return institutbut;
    }

    public static JButton getParametrebut() {
        return parametrebut;
    }

    public static JButton getDeconnexionbut() {
        return deconnexionbut;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menupan = new javax.swing.JPanel();
        panbarmenu = new javax.swing.JPanel();
        labchangeicon = new javax.swing.JLabel();
        menucacherpan = new javax.swing.JPanel();
        institutbut = new javax.swing.JButton();
        parametrebut = new javax.swing.JButton();
        deconnexionbut = new javax.swing.JButton();
        labacceuil = new javax.swing.JLabel();
        oldpan = new javax.swing.JPanel();
        acceuilpan = new javax.swing.JPanel();
        bienvenuelab = new javax.swing.JLabel();
        institutpan = new javax.swing.JPanel();
        labinscriptiom = new javax.swing.JLabel();
        choisepan = new javax.swing.JPanel();
        choiselab = new javax.swing.JLabel();
        newinscriptionbut = new javax.swing.JButton();
        mesetudiantbut = new javax.swing.JButton();
        Acceuilinsti = new javax.swing.JButton();
        parametrepan = new javax.swing.JPanel();
        labparametre = new javax.swing.JLabel();
        paraTerminer = new javax.swing.JButton();
        registrationpan = new javax.swing.JPanel();
        registrationlab = new javax.swing.JLabel();
        saisipan = new javax.swing.JPanel();
        saisi1pan = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lastnamefield = new javax.swing.JTextField();
        firstnamefield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDatenaiss = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        telephonefield = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        addressfield = new javax.swing.JTextField();
        nationalitecombo = new javax.swing.JComboBox<>();
        addphotobut = new javax.swing.JButton();
        photopane = new javax.swing.JPanel();
        photolab = new javax.swing.JLabel();
        addressmaillab = new javax.swing.JLabel();
        addressmailfield = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        champvidelab = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        retourS1 = new javax.swing.JButton();
        Suivantbut = new javax.swing.JButton();
        sexecombo = new javax.swing.JComboBox<>();
        saisi2pan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        careercombo = new javax.swing.JComboBox<>();
        levelcombo = new javax.swing.JComboBox<>();
        anneecombo = new javax.swing.JComboBox<>();
        institutfield = new javax.swing.JTextField();
        champvidelab1 = new javax.swing.JLabel();
        retourS2 = new javax.swing.JButton();
        terminerbut = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        AjoutInstitutpan = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        siglefield = new javax.swing.JTextField();
        contactfield = new javax.swing.JTextField();
        nameInstitutfiled = new javax.swing.JTextField();
        directeurnamefield = new javax.swing.JTextField();
        quitterAjoutInstitut = new javax.swing.JButton();
        ajouterInstitut = new javax.swing.JButton();
        mesetudiantspan = new javax.swing.JPanel();
        titreetudiantlab = new javax.swing.JLabel();
        finbut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        updtpane = new javax.swing.JPanel();
        upastnamelab = new javax.swing.JLabel();
        lupastnamefield = new javax.swing.JTextField();
        upfirstnamelab = new javax.swing.JLabel();
        upfirstnamefield = new javax.swing.JTextField();
        addressmaillab1 = new javax.swing.JLabel();
        addressmailfield1 = new javax.swing.JTextField();
        addressfield1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        telephonefield1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        upphotolab = new javax.swing.JLabel();
        upphotobut = new javax.swing.JButton();
        deletebut = new javax.swing.JButton();
        updatebut = new javax.swing.JButton();
        quittancebut = new javax.swing.JButton();
        recherchefield = new javax.swing.JTextField();
        triecombo2 = new javax.swing.JComboBox<>();
        upchampvide = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        triecombo1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        menupan.setBackground(new java.awt.Color(255, 255, 255));
        menupan.setPreferredSize(new java.awt.Dimension(300, 900));
        menupan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panbarmenu.setBackground(new java.awt.Color(0, 154, 255));
        panbarmenu.setPreferredSize(new java.awt.Dimension(50, 900));

        labchangeicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/retour.png"))); // NOI18N
        labchangeicon.setText(" ");
        labchangeicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labchangeiconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panbarmenuLayout = new javax.swing.GroupLayout(panbarmenu);
        panbarmenu.setLayout(panbarmenuLayout);
        panbarmenuLayout.setHorizontalGroup(
            panbarmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labchangeicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panbarmenuLayout.setVerticalGroup(
            panbarmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panbarmenuLayout.createSequentialGroup()
                .addComponent(labchangeicon, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(846, Short.MAX_VALUE))
        );

        menupan.add(panbarmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menucacherpan.setBackground(new java.awt.Color(0, 154, 255));
        menucacherpan.setPreferredSize(new java.awt.Dimension(250, 900));

        institutbut.setBackground(new java.awt.Color(250, 250, 250));
        institutbut.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        institutbut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconsAccueil.png"))); // NOI18N
        institutbut.setText("MES INSTITUTS");
        institutbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                institutbutActionPerformed(evt);
            }
        });

        parametrebut.setBackground(new java.awt.Color(250, 250, 250));
        parametrebut.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        parametrebut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons-paramètres-.png"))); // NOI18N
        parametrebut.setText("PARAMETRE");
        parametrebut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parametrebutActionPerformed(evt);
            }
        });

        deconnexionbut.setBackground(new java.awt.Color(183, 58, 58));
        deconnexionbut.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        deconnexionbut.setForeground(new java.awt.Color(255, 255, 255));
        deconnexionbut.setText("DECONNEXION");
        deconnexionbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deconnexionbutActionPerformed(evt);
            }
        });

        labacceuil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout menucacherpanLayout = new javax.swing.GroupLayout(menucacherpan);
        menucacherpan.setLayout(menucacherpanLayout);
        menucacherpanLayout.setHorizontalGroup(
            menucacherpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menucacherpanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labacceuil, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menucacherpanLayout.createSequentialGroup()
                .addGroup(menucacherpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deconnexionbut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(parametrebut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(institutbut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menucacherpanLayout.setVerticalGroup(
            menucacherpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menucacherpanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labacceuil, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(institutbut, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parametrebut, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deconnexionbut, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(634, Short.MAX_VALUE))
        );

        menupan.add(menucacherpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        jPanel1.add(menupan, java.awt.BorderLayout.LINE_START);

        oldpan.setBackground(new java.awt.Color(255, 255, 255));
        oldpan.setLayout(new java.awt.CardLayout());

        acceuilpan.setBackground(new java.awt.Color(255, 255, 255));
        acceuilpan.setToolTipText("");

        bienvenuelab.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        bienvenuelab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bienvenuelab.setText(" ");

        javax.swing.GroupLayout acceuilpanLayout = new javax.swing.GroupLayout(acceuilpan);
        acceuilpan.setLayout(acceuilpanLayout);
        acceuilpanLayout.setHorizontalGroup(
            acceuilpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acceuilpanLayout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(bienvenuelab, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(325, Short.MAX_VALUE))
        );
        acceuilpanLayout.setVerticalGroup(
            acceuilpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acceuilpanLayout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(bienvenuelab, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(414, Short.MAX_VALUE))
        );

        oldpan.add(acceuilpan, "card4");

        institutpan.setBackground(new java.awt.Color(255, 255, 255));
        institutpan.setForeground(new java.awt.Color(0, 153, 255));

        labinscriptiom.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labinscriptiom.setForeground(new java.awt.Color(0, 153, 255));
        labinscriptiom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labinscriptiom.setText("LISTES DES INSTITUTS");

        javax.swing.GroupLayout institutpanLayout = new javax.swing.GroupLayout(institutpan);
        institutpan.setLayout(institutpanLayout);
        institutpanLayout.setHorizontalGroup(
            institutpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(institutpanLayout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(labinscriptiom, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(508, Short.MAX_VALUE))
        );
        institutpanLayout.setVerticalGroup(
            institutpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(institutpanLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(labinscriptiom, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(781, Short.MAX_VALUE))
        );

        oldpan.add(institutpan, "card3");

        choisepan.setBackground(new java.awt.Color(255, 255, 255));

        choiselab.setBackground(new java.awt.Color(0, 153, 255));
        choiselab.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        choiselab.setForeground(new java.awt.Color(0, 154, 255));
        choiselab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        choiselab.setText(" ");

        newinscriptionbut.setBackground(new java.awt.Color(0, 153, 255));
        newinscriptionbut.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        newinscriptionbut.setForeground(new java.awt.Color(255, 255, 255));
        newinscriptionbut.setText("NOUVELLE INCRIPTION");
        newinscriptionbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newinscriptionbutActionPerformed(evt);
            }
        });

        mesetudiantbut.setBackground(new java.awt.Color(0, 153, 255));
        mesetudiantbut.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        mesetudiantbut.setForeground(new java.awt.Color(255, 255, 255));
        mesetudiantbut.setText("MES ETUDIANTS");
        mesetudiantbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesetudiantbutActionPerformed(evt);
            }
        });

        Acceuilinsti.setBackground(new java.awt.Color(0, 154, 255));
        Acceuilinsti.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        Acceuilinsti.setForeground(new java.awt.Color(255, 255, 255));
        Acceuilinsti.setText("Acceuil");
        Acceuilinsti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceuilinstiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout choisepanLayout = new javax.swing.GroupLayout(choisepan);
        choisepan.setLayout(choisepanLayout);
        choisepanLayout.setHorizontalGroup(
            choisepanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choisepanLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(choisepanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, choisepanLayout.createSequentialGroup()
                        .addComponent(newinscriptionbut, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(mesetudiantbut, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, choisepanLayout.createSequentialGroup()
                        .addComponent(choiselab, javax.swing.GroupLayout.PREFERRED_SIZE, 1201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, choisepanLayout.createSequentialGroup()
                        .addComponent(Acceuilinsti, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(548, 548, 548))))
        );
        choisepanLayout.setVerticalGroup(
            choisepanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choisepanLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(choiselab, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162)
                .addGroup(choisepanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newinscriptionbut, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesetudiantbut, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                .addComponent(Acceuilinsti, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );

        oldpan.add(choisepan, "card6");

        parametrepan.setBackground(new java.awt.Color(255, 255, 255));

        labparametre.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labparametre.setForeground(new java.awt.Color(0, 154, 255));
        labparametre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labparametre.setText("PARAMETRE DU COMPTE");

        paraTerminer.setBackground(new java.awt.Color(0, 154, 255));
        paraTerminer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        paraTerminer.setText("TERMINER");
        paraTerminer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraTerminerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout parametrepanLayout = new javax.swing.GroupLayout(parametrepan);
        parametrepan.setLayout(parametrepanLayout);
        parametrepanLayout.setHorizontalGroup(
            parametrepanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parametrepanLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(labparametre, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parametrepanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(paraTerminer, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(476, 476, 476))
        );
        parametrepanLayout.setVerticalGroup(
            parametrepanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parametrepanLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(labparametre, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 554, Short.MAX_VALUE)
                .addComponent(paraTerminer, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );

        oldpan.add(parametrepan, "card4");

        registrationpan.setBackground(new java.awt.Color(255, 255, 255));
        registrationpan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registrationlab.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        registrationlab.setForeground(new java.awt.Color(0, 154, 255));
        registrationlab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrationlab.setText(" ");
        registrationpan.add(registrationlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 10, 1270, 78));

        saisipan.setLayout(new java.awt.CardLayout());

        saisi1pan.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setText("Nom Etudiant:");

        lastnamefield.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        lastnamefield.setText("dums");
        lastnamefield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 154, 255)));
        lastnamefield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lastnamefieldMouseClicked(evt);
            }
        });

        firstnamefield.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        firstnamefield.setText("dums");
        firstnamefield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 154, 255)));
        firstnamefield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstnamefieldMouseClicked(evt);
            }
        });
        firstnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnamefieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setText("Sexe:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel8.setText("Date de naissance");

        jDatenaiss.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 154, 255)));
        jDatenaiss.setToolTipText("11 janv. 2023");
        jDatenaiss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDatenaissMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel9.setText("Numero de teléphone");

        telephonefield.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        telephonefield.setText("dums");
        telephonefield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 154, 255)));
        telephonefield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telephonefieldMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel11.setText("Adresse du domicil");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel12.setText("Nationalité");

        addressfield.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        addressfield.setText("dums");
        addressfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 154, 255)));
        addressfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addressfieldMouseClicked(evt);
            }
        });
        addressfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressfieldActionPerformed(evt);
            }
        });

        nationalitecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Togo", "Afrique du Sud ", "Algérie ", "Angola ", "Bénin  ", "Botswana ", "Burkina Faso ", "Burundi ", "Cameroun  ", "Cap-Vert ", " Comores ", "République du Congo ", "Congo (RDC) ", " Côte d’Ivoire ", " Djibouti ", " Égypte ", "Érythrée  ", "Éthiopie ", "Eswatini ", "Gabon  ", " Gambie ", "Ghana ", "Guinée ", "Guinée-Bissau ", "Guinée Équatoriale", "Kenya ", " Lesotho ", " Libéria ", " Libye ", " Madagscar ", " Malawi ", "Mali  ", "Maroc  ", " Maurice ", "Mauritanie ", "Mozambique ", " Namibie  ", "Niger  Nigeria ", "Ouganda ", "République centrafricaine  ", "Rwanda ", "São Tomé-et-Principe ", " Sénégal ", "Les Seychelles  ", " Sierra Leone  ", " Somalie ", "Soudan ", " Soudan du Sud ", " Tanzanie   ", "Tchad ", " Togo  ", " Tunisie (تونس)  ", " Zambie ", " Zimbabwe   " }));
        nationalitecombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 154, 255)));
        nationalitecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nationalitecomboActionPerformed(evt);
            }
        });

        addphotobut.setBackground(new java.awt.Color(0, 154, 255));
        addphotobut.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        addphotobut.setForeground(new java.awt.Color(255, 255, 255));
        addphotobut.setText("Ajoutter");
        addphotobut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addphotobutActionPerformed(evt);
            }
        });

        photopane.setBackground(new java.awt.Color(153, 153, 153));
        photopane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 154, 255)));
        photopane.setPreferredSize(new java.awt.Dimension(49, 15));
        photopane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        photolab.setBackground(new java.awt.Color(51, 0, 51));
        photolab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photolab.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        photopane.add(photolab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 170));

        addressmaillab.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        addressmaillab.setText("Adresse mail");

        addressmailfield.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        addressmailfield.setText("dums");
        addressmailfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 154, 255)));
        addressmailfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addressmailfieldMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel7.setText("Prenom Etudiant:");

        champvidelab.setForeground(new java.awt.Color(255, 0, 51));
        champvidelab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel10.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("INFORMATION PERSONELLE DE L'ETUTIANT");

        retourS1.setBackground(new java.awt.Color(0, 154, 255));
        retourS1.setText("Retour");
        retourS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourS1ActionPerformed(evt);
            }
        });

        Suivantbut.setBackground(new java.awt.Color(0, 154, 255));
        Suivantbut.setText("Suivant");
        Suivantbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuivantbutActionPerformed(evt);
            }
        });

        sexecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculin", "Feminin" }));
        sexecombo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 154, 255), 1, true));

        javax.swing.GroupLayout saisi1panLayout = new javax.swing.GroupLayout(saisi1pan);
        saisi1pan.setLayout(saisi1panLayout);
        saisi1panLayout.setHorizontalGroup(
            saisi1panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saisi1panLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(saisi1panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(photopane, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(saisi1panLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(addphotobut, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80)
                .addGroup(saisi1panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(saisi1panLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186)
                        .addGroup(saisi1panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressmailfield, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressmaillab, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(saisi1panLayout.createSequentialGroup()
                        .addGroup(saisi1panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sexecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(186, 186, 186)
                        .addGroup(saisi1panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDatenaiss, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressfield, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lastnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(saisi1panLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(saisi1panLayout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(telephonefield, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(saisi1panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(firstnamefield)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nationalitecombo, 0, 300, Short.MAX_VALUE)))
                .addContainerGap(205, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saisi1panLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(champvidelab, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
            .addGroup(saisi1panLayout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(retourS1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Suivantbut, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
        );
        saisi1panLayout.setVerticalGroup(
            saisi1panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saisi1panLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(saisi1panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(saisi1panLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(photopane, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addphotobut))
                    .addGroup(saisi1panLayout.createSequentialGroup()
                        .addGroup(saisi1panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(saisi1panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telephonefield, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(saisi1panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(saisi1panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(saisi1panLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addressfield, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDatenaiss, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(saisi1panLayout.createSequentialGroup()
                                .addComponent(firstnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sexecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(saisi1panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressmaillab, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(saisi1panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nationalitecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressmailfield, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45)
                .addComponent(champvidelab, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(saisi1panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Suivantbut, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retourS1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        saisipan.add(saisi1pan, "card2");

        saisi2pan.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("INSTITUT:");

        jLabel18.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("INFORMATION SUR LE PARCOURS  DE L'ETUTIANT");

        jLabel5.setText("NIVEAU:");

        jLabel19.setText("ANNEE ACCADEMIQUE:");

        jLabel20.setText("SPECIALITÉ:");

        careercombo.setEditable(true);
        careercombo.setToolTipText("selectioner une filiere");
        careercombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                careercomboMouseClicked(evt);
            }
        });
        careercombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                careercomboActionPerformed(evt);
            }
        });

        levelcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Licence I", "Licence II", "Licence III", "Master I", "Master II" }));

        anneecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022 - 2023", "2023 - 2024", "2024 - 2025", "2025 - 2026", "2026 - 2027", "2027 - 2028" }));

        institutfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        institutfield.setText(" ");

        champvidelab1.setForeground(new java.awt.Color(255, 0, 51));
        champvidelab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        retourS2.setBackground(new java.awt.Color(0, 154, 255));
        retourS2.setText("Retour");
        retourS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourS2ActionPerformed(evt);
            }
        });

        terminerbut.setBackground(new java.awt.Color(0, 154, 255));
        terminerbut.setText("Terminer");
        terminerbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminerbutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout saisi2panLayout = new javax.swing.GroupLayout(saisi2pan);
        saisi2pan.setLayout(saisi2panLayout);
        saisi2panLayout.setHorizontalGroup(
            saisi2panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saisi2panLayout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(319, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saisi2panLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(saisi2panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(institutfield)
                    .addComponent(anneecombo, 0, 663, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(levelcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(careercombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(247, 247, 247))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saisi2panLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(champvidelab1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saisi2panLayout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(retourS2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(terminerbut, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
        );
        saisi2panLayout.setVerticalGroup(
            saisi2panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saisi2panLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(institutfield, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(careercombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(levelcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(anneecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(champvidelab1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(saisi2panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retourS2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terminerbut, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        saisipan.add(saisi2pan, "card3");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("33333333333333");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(363, 363, 363)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(458, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(372, Short.MAX_VALUE))
        );

        saisipan.add(jPanel5, "card4");

        registrationpan.add(saisipan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 1170, 710));

        oldpan.add(registrationpan, "card5");

        AjoutInstitutpan.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("AJOUTER UNE INSTITURT A L'UNIVERSITE");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setText("SIGLE                           :");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setText("NOM DU DIRECTEUR  :");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setText("CONTACT                     :");

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setText("NOM INSTITUT            :");

        siglefield.setText(" ");
        siglefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siglefieldActionPerformed(evt);
            }
        });

        contactfield.setText(" ");

        directeurnamefield.setText(" ");
        directeurnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directeurnamefieldActionPerformed(evt);
            }
        });

        quitterAjoutInstitut.setBackground(new java.awt.Color(0, 153, 255));
        quitterAjoutInstitut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        quitterAjoutInstitut.setForeground(new java.awt.Color(255, 255, 255));
        quitterAjoutInstitut.setText("Quitter");
        quitterAjoutInstitut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterAjoutInstitutActionPerformed(evt);
            }
        });

        ajouterInstitut.setBackground(new java.awt.Color(0, 153, 255));
        ajouterInstitut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ajouterInstitut.setForeground(new java.awt.Color(255, 255, 255));
        ajouterInstitut.setText("Ajouter");
        ajouterInstitut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterInstitutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AjoutInstitutpanLayout = new javax.swing.GroupLayout(AjoutInstitutpan);
        AjoutInstitutpan.setLayout(AjoutInstitutpanLayout);
        AjoutInstitutpanLayout.setHorizontalGroup(
            AjoutInstitutpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AjoutInstitutpanLayout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addGroup(AjoutInstitutpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AjoutInstitutpanLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(289, 289, 289))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AjoutInstitutpanLayout.createSequentialGroup()
                        .addGroup(AjoutInstitutpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(AjoutInstitutpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(AjoutInstitutpanLayout.createSequentialGroup()
                                .addComponent(quitterAjoutInstitut, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ajouterInstitut, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(contactfield, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(directeurnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameInstitutfiled, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(siglefield, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(261, 261, 261))))
        );
        AjoutInstitutpanLayout.setVerticalGroup(
            AjoutInstitutpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AjoutInstitutpanLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addGroup(AjoutInstitutpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AjoutInstitutpanLayout.createSequentialGroup()
                        .addGroup(AjoutInstitutpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameInstitutfiled, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(AjoutInstitutpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(directeurnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AjoutInstitutpanLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(siglefield, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(AjoutInstitutpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AjoutInstitutpanLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AjoutInstitutpanLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(contactfield, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(AjoutInstitutpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouterInstitut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quitterAjoutInstitut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(378, Short.MAX_VALUE))
        );

        oldpan.add(AjoutInstitutpan, "card7");

        mesetudiantspan.setBackground(new java.awt.Color(255, 255, 255));
        mesetudiantspan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesetudiantspanMouseClicked(evt);
            }
        });

        titreetudiantlab.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        titreetudiantlab.setForeground(new java.awt.Color(0, 154, 255));
        titreetudiantlab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        finbut.setBackground(new java.awt.Color(0, 154, 255));
        finbut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        finbut.setText("Finir");
        finbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finbutActionPerformed(evt);
            }
        });

        table.setAutoCreateRowSorter(true);
        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 154, 255)));
        table.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        table.setToolTipText("");
        table.setGridColor(new java.awt.Color(0, 154, 255));
        table.setName("LISTES DES ETUDIANTS"); // NOI18N
        table.setSelectionBackground(new java.awt.Color(170, 207, 229));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setHeaderValue("");
            table.getColumnModel().getColumn(1).setHeaderValue("");
            table.getColumnModel().getColumn(2).setHeaderValue("");
            table.getColumnModel().getColumn(3).setHeaderValue("");
        }

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        updtpane.setBackground(new java.awt.Color(255, 255, 255));

        upastnamelab.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        upastnamelab.setText("Prenoms:*");

        lupastnamefield.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        lupastnamefield.setText("dums");
        lupastnamefield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 154, 255)));
        lupastnamefield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lupastnamefieldMouseClicked(evt);
            }
        });
        lupastnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupastnamefieldActionPerformed(evt);
            }
        });

        upfirstnamelab.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        upfirstnamelab.setText("Nom:*");

        upfirstnamefield.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        upfirstnamefield.setText("dums");
        upfirstnamefield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 154, 255)));
        upfirstnamefield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upfirstnamefieldMouseClicked(evt);
            }
        });
        upfirstnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upfirstnamefieldActionPerformed(evt);
            }
        });

        addressmaillab1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        addressmaillab1.setText("Adresse mail:*");

        addressmailfield1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        addressmailfield1.setText("dums");
        addressmailfield1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 154, 255)));
        addressmailfield1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addressmailfield1MouseClicked(evt);
            }
        });
        addressmailfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressmailfield1ActionPerformed(evt);
            }
        });

        addressfield1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        addressfield1.setText("dums");
        addressfield1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 154, 255)));
        addressfield1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addressfield1MouseClicked(evt);
            }
        });
        addressfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressfield1ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel21.setText("Adresse du domicil:*");

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel22.setText("Numero de teléphone:*");

        telephonefield1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        telephonefield1.setText("dums");
        telephonefield1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 154, 255)));
        telephonefield1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telephonefield1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout updtpaneLayout = new javax.swing.GroupLayout(updtpane);
        updtpane.setLayout(updtpaneLayout);
        updtpaneLayout.setHorizontalGroup(
            updtpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updtpaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updtpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updtpaneLayout.createSequentialGroup()
                        .addGroup(updtpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(upastnamelab, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                            .addComponent(upfirstnamelab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressmaillab1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressmailfield1)
                            .addComponent(telephonefield1)
                            .addComponent(addressfield1))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(updtpaneLayout.createSequentialGroup()
                        .addGroup(updtpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(upfirstnamefield, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lupastnamefield))
                        .addContainerGap())))
        );
        updtpaneLayout.setVerticalGroup(
            updtpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updtpaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(upfirstnamelab, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(upfirstnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(upastnamelab, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lupastnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(telephonefield1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressmaillab1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressmailfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jScrollPane2.setViewportView(updtpane);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 154, 255)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        upphotolab.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        upphotolab.setForeground(new java.awt.Color(0, 154, 255));
        upphotolab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        upphotolab.setText("PHOTO");
        upphotolab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upphotolabMouseClicked(evt);
            }
        });
        jPanel3.add(upphotolab, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 170, 173));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        upphotobut.setBackground(new java.awt.Color(0, 154, 255));
        upphotobut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        upphotobut.setText("Changer");
        upphotobut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upphotobutActionPerformed(evt);
            }
        });

        deletebut.setBackground(new java.awt.Color(0, 154, 255));
        deletebut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        deletebut.setText("Supprimer");
        deletebut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebutActionPerformed(evt);
            }
        });

        updatebut.setBackground(new java.awt.Color(0, 154, 255));
        updatebut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        updatebut.setText("Modifier");
        updatebut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebutActionPerformed(evt);
            }
        });

        quittancebut.setBackground(new java.awt.Color(0, 154, 255));
        quittancebut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        quittancebut.setText("Voir quittance");
        quittancebut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quittancebutActionPerformed(evt);
            }
        });

        recherchefield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 154, 255)));
        recherchefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recherchefieldActionPerformed(evt);
            }
        });
        recherchefield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                recherchefieldKeyReleased(evt);
            }
        });

        triecombo2.setEditable(true);
        triecombo2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        triecombo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cariere" }));
        triecombo2.setSelectedIndex(-1);
        triecombo2.setToolTipText("Trier par spécialité");
        triecombo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 154, 255)));
        triecombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triecombo2ActionPerformed(evt);
            }
        });

        upchampvide.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        upchampvide.setForeground(new java.awt.Color(255, 0, 51));
        upchampvide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        upchampvide.setText(" ");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel23.setText("RECHERCHE PAR NOM / PRENOMS:");

        triecombo1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        triecombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Niveau", "Licence I", "Licence II", "Licence III", "Master I", "Master II" }));
        triecombo1.setToolTipText("Trier par nivaeu");
        triecombo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 154, 255)));
        triecombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triecombo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mesetudiantspanLayout = new javax.swing.GroupLayout(mesetudiantspan);
        mesetudiantspan.setLayout(mesetudiantspanLayout);
        mesetudiantspanLayout.setHorizontalGroup(
            mesetudiantspanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mesetudiantspanLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(titreetudiantlab, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mesetudiantspanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mesetudiantspanLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(triecombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(triecombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mesetudiantspanLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(recherchefield, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addGroup(mesetudiantspanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mesetudiantspanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mesetudiantspanLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(upchampvide, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mesetudiantspanLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(upphotobut))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(mesetudiantspanLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(mesetudiantspanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mesetudiantspanLayout.createSequentialGroup()
                        .addComponent(quittancebut, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(finbut, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mesetudiantspanLayout.createSequentialGroup()
                        .addComponent(deletebut, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193)
                        .addComponent(updatebut, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(680, 680, 680)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mesetudiantspanLayout.setVerticalGroup(
            mesetudiantspanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mesetudiantspanLayout.createSequentialGroup()
                .addGroup(mesetudiantspanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titreetudiantlab, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mesetudiantspanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mesetudiantspanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(recherchefield, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(mesetudiantspanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(triecombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(triecombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(mesetudiantspanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mesetudiantspanLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(upphotobut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(upchampvide, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mesetudiantspanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletebut, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebut, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quittancebut, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finbut, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        oldpan.add(mesetudiantspan, "card8");

        jPanel1.add(oldpan, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void lupastnamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupastnamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lupastnamefieldActionPerformed

    private void upfirstnamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upfirstnamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upfirstnamefieldActionPerformed

    private void addressmailfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressmailfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressmailfield1ActionPerformed

    private void addressfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressfield1ActionPerformed

    private void upphotolabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upphotolabMouseClicked

    }//GEN-LAST:event_upphotolabMouseClicked

    private void lupastnamefieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lupastnamefieldMouseClicked

    }//GEN-LAST:event_lupastnamefieldMouseClicked

    private void upfirstnamefieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upfirstnamefieldMouseClicked

    }//GEN-LAST:event_upfirstnamefieldMouseClicked
    private void addressfieldActionPerformed(java.awt.event.MouseEvent evt) {

    }

    private void firstnamefieldActionPerformed(java.awt.event.MouseEvent evt) {

    }
    private void addressmailfield1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressmailfield1MouseClicked

    }//GEN-LAST:event_addressmailfield1MouseClicked

    private void addressfield1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressfield1MouseClicked

    }//GEN-LAST:event_addressfield1MouseClicked

    private void telephonefield1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telephonefield1MouseClicked


    }//GEN-LAST:event_telephonefield1MouseClicked

    private void careercomboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_careercomboMouseClicked
        careercombo.setBorder(BorderFactory.createLineBorder(new Color(0, 154, 255)));
        champvidelab1.setText(null);
    }//GEN-LAST:event_careercomboMouseClicked

    private void lastnamefieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastnamefieldMouseClicked
        Fonctions.resetBorder(lastnamefield, champvidelab);
    }//GEN-LAST:event_lastnamefieldMouseClicked

    private void addressmailfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressmailfieldMouseClicked
        Fonctions.resetBorder(addressmailfield, champvidelab);
    }//GEN-LAST:event_addressmailfieldMouseClicked

    private void firstnamefieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstnamefieldMouseClicked
        Fonctions.resetBorder(firstnamefield, champvidelab);
    }//GEN-LAST:event_firstnamefieldMouseClicked

    private void telephonefieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telephonefieldMouseClicked
        Fonctions.resetBorder(telephonefield, champvidelab);
    }//GEN-LAST:event_telephonefieldMouseClicked

    private void addressfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressfieldMouseClicked
        Fonctions.resetBorder(addressmailfield, champvidelab);
//         champvidelab.setText("ici");
    }//GEN-LAST:event_addressfieldMouseClicked

    private void jDatenaissMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDatenaissMouseClicked
        jDatenaiss.setBorder(BorderFactory.createLineBorder(new Color(0, 154, 255)));

    }//GEN-LAST:event_jDatenaissMouseClicked

    private void upphotobutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upphotobutActionPerformed
         int i = table.getSelectedRow();
        if (i != -1) {
            
             
            Fonctions.choixImage(upphotolab);
             
        } else {
            upchampvide.setText("Selectionez l'etudiant(e) d'abord");
        }
        
        
        
    }//GEN-LAST:event_upphotobutActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        upchampvide.setText(null);
        int i = table.getSelectedRow();
        int id = (int) table.getModel().getValueAt(i, 0);
        Students st = StudentsManager.selectStu(id);
        upfirstnamefield.setText(st.getLastName());
        lupastnamefield.setText(st.getFristName());
        addressfield1.setText(st.getAdress());
        addressmailfield1.setText(st.getEmail());
        telephonefield1.setText(st.getTelephone());
        upphotolab.setIcon(null);
        if (st.getPhoto() == null) {
            upphotolab.setText("PAS DE PHOTO");
        } else {
//             
 
            Fonctions.PlacePhoto(upphotolab, st.getPhoto());
        }


    }//GEN-LAST:event_tableMouseClicked

    private void updatebutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebutActionPerformed
        int i = table.getSelectedRow();
        if (i != -1) {
            TableModel model = table.getModel();
            int id = (int) model.getValueAt(i, 0);

            int reponse = JOptionPane.showConfirmDialog(null, "L'etudiant(e) " + id + ""
                    + " va etre Modifié(e)", "Attention", JOptionPane.OK_CANCEL_OPTION);

            if (reponse == JOptionPane.OK_OPTION) {
                Controler.controllerStuUp(id);
                table.setModel(Fonctions.fillTable1(idinstitut));
            }
//            Fonctions.resetField3();
        } else {
            upchampvide.setText("Selectionez l'etudiant a modifié(e)");
        }
    }//GEN-LAST:event_updatebutActionPerformed

    private void deletebutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebutActionPerformed
        int i = table.getSelectedRow();
        if (i != -1) {
            TableModel model = table.getModel();
            int id = (int) model.getValueAt(i, 0);

            int reponse = JOptionPane.showConfirmDialog(null, " confirmer la suppression de l'etudiant(e) " + id, "Attention", JOptionPane.OK_CANCEL_OPTION);

            if (reponse == JOptionPane.OK_OPTION) {
                StudentsManager.delete(id);
                table.setModel(Fonctions.fillTable1(idinstitut));
            }
            Fonctions.resetField3();
        } else {
            upchampvide.setText("Selectionez l'etudiant a supprimé(e)");
        }
    }//GEN-LAST:event_deletebutActionPerformed

    private void mesetudiantspanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesetudiantspanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mesetudiantspanMouseClicked

    private void paraTerminerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraTerminerActionPerformed

        if (JOptionPane.showConfirmDialog(oldpan, "Quitter les paramettres?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {

            Fonctions.changeColorBut0(parametrebut, institutbut, deconnexionbut);
            Fonctions.passTo(oldpan, acceuilpan);
            institutbut.setVisible(true);
            deconnexionbut.setVisible(true);
        }

    }//GEN-LAST:event_paraTerminerActionPerformed

    private void triecombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triecombo1ActionPerformed
//        triecombo2.setEnabled(true);
        triecombo2.setSelectedItem("cariere");
        if(triecombo1.getSelectedItem().toString().equals("Niveau")){
            triecombo2.setEnabled(false);
          table.setModel(Fonctions.fillTable1(idinstitut));
        }else{
            table.setModel(Fonctions.fillTablebye(idinstitut, triecombo1.getSelectedItem().toString()));
            triecombo2.setEnabled(true);
        }
        
    }//GEN-LAST:event_triecombo1ActionPerformed

    private void recherchefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recherchefieldActionPerformed

    }//GEN-LAST:event_recherchefieldActionPerformed

    private void recherchefieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_recherchefieldKeyReleased
       if(!triecombo1.getSelectedItem().toString().equals("Niveau")){
           table.setModel(Fonctions.fillTableforrecherche(idinstitut, triecombo1.getSelectedItem().toString(),recherchefield.getText()));
       }else{
             table.setModel(Fonctions.fillTableRechercheNormal(idinstitut,  recherchefield.getText()));
       }
        
    }//GEN-LAST:event_recherchefieldKeyReleased

    private void triecombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triecombo2ActionPerformed
        if (!triecombo2.getSelectedItem().toString().equals("cariere")) {

            table.setModel(Fonctions.fillTablebyspecia(idinstitut, triecombo1.getSelectedItem().toString(), triecombo2.getSelectedItem().toString()));
        }

    }//GEN-LAST:event_triecombo2ActionPerformed

    private void quittancebutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quittancebutActionPerformed
         int i = table.getSelectedRow();
        if (i != -1) {
            TableModel model = table.getModel();
            int id = (int) model.getValueAt(i, 0);
            StudentsManager.JasperReport(id);
        }else{
             upchampvide.setText("Selectionez l'etudiant concerné(e)");
        }
    }//GEN-LAST:event_quittancebutActionPerformed

    public static int idinstitut;
    public static int idcareer;

    private void institutbutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_institutbutActionPerformed
        Fonctions.changeColorBut(institutbut, parametrebut, deconnexionbut);
        ArrayList<Instituts> listInstitut = InstitutsManger.selectAll();

        int x = 150, y = 200;

        if (listInstitut != null) {
            for (Instituts insti : listInstitut) {

                butInstitut = new JButton(insti.getNameInstitut());
                if (x < 1100) {
                    butInstitut.setBounds(x, y, 200, 100);

                    x+= 250;

                } else {
                    x = 150;
                    y += 200;
                    butInstitut.setBounds(x, y, 200, 100);
                    
                }
                
                
                butInstitut.setBackground(new Color(0, 153, 255));
                butInstitut.setFont(new Font("Dialog", 1, 22));
                  butInstitut.setForeground(new Color(255, 255, 255));
                institutpan.add(butInstitut);
                
                butInstitut.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        // String[] list = new String[listcareer.size()];
                        ArrayList<Careers> listcareer = CareersManager.selectAll(insti.getId());
                        if (listcareer != null) {
                            careercombo.removeAllItems();
                          triecombo1.setSelectedItem("Niveau"); 
                           
                           triecombo2.setSelectedItem("cariere"); 
                            careercombo.setSelectedItem("Choisir la specialié");
                            
                            for (Careers career : listcareer) {
                                careercombo.addItem(career.getCareerName());
                                careercombo.setEditable(false);
                                triecombo2.setEditable(false);
                                triecombo2.addItem(career.getCigle());
                            }
                        }
                        if (PageConnection.user.getRuleUser().equals("teacher")) {
                            newinscriptionbut.setEnabled(false);
                           
                            upphotobut.setVisible(false);
                            updatebut.setVisible(false);
                            deletebut.setVisible(false);
                        }

                        Fonctions.passTo(oldpan, choisepan);
                         //remplissage du champ institut pour chaque instuitu
                        idinstitut = insti.getId();
                        
                        institutfield.setText(insti.getLibele());
                        institutfield.setEditable(false);
                        choiselab.setText(insti.getLibele());
                        registrationlab.setText("INSCRIPTION L'"+ insti.getLibele());
                        titreetudiantlab.setText("LES ETUDIANTS DE " + "L'" + insti.getNameInstitut());
                    }
                });
                
            }

       butInstitut = new JButton(" + Institut");
            if (x < 1100) {
                x += 250;
                butInstitut.setBounds(x, y, 200, 100);
                

            } else {
                x = 150;
                y+= 200;
                butInstitut.setBounds(x, y, 200, 100);
            }
//              
            butInstitut.setBackground(new Color(0, 153, 255));
            butInstitut.setFont(new Font("Dialog", 1, 22));
            butInstitut.setForeground(new Color(255, 255, 255));
            if (!PageConnection.user.getRuleUser().equals("teacher")) {
                parametrepan.add(butInstitut);
            }

            butInstitut.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    Fonctions.passTo(oldpan, AjoutInstitutpan);

                }
            });

            Fonctions.passTo(oldpan, institutpan);
            
        }
    }// GEN-LAST:event_institutbutActionPerformed

    private void deconnexionbutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deconnexionbutActionPerformed
        Fonctions.changeColorBut( institutbut, parametrebut,deconnexionbut);
//        institutbut.setVisible(false);
//        parametrebut.setVisible(false);
        Fonctions.deconnection(this, oldpan);
    }// GEN-LAST:event_deconnexionbutActionPerformed

    private void parametrebutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_parametrebutActionPerformed
        Fonctions.changeColorBut(parametrebut, institutbut, deconnexionbut);
        institutbut.setVisible(false);
        deconnexionbut.setVisible(false);

//        
        Fonctions.passTo(oldpan, parametrepan);
//        }
//        institutbut.setEnabled(true);
    }// GEN-LAST:event_parametrebutActionPerformed

    boolean a = true;

    private void labchangeiconMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_labchangeiconMouseClicked
        if (a == true) {
            new Fonctions().cacherAfficherMenu(menupan, a, labchangeicon);
            SwingUtilities.updateComponentTreeUI(this);
            a = false;
        } else {
            new Fonctions().cacherAfficherMenu(menupan, a, labchangeicon);
            SwingUtilities.updateComponentTreeUI(this);
            a = true;
        }

    }// GEN-LAST:event_labchangeiconMouseClicked

     

    private void newinscriptionbutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_newinscriptionbutActionPerformed
        parametrebut.setVisible(false);
        deconnexionbut.setVisible(false);
        Fonctions.resetField2();
        
        Fonctions.passTo(oldpan, registrationpan);

        institutbut.setEnabled(false);
    }// GEN-LAST:event_newinscriptionbutActionPerformed

    private void directeurnamefieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_directeurnamefieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_directeurnamefieldActionPerformed

    private void siglefieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_siglefieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_siglefieldActionPerformed

    private void quitterAjoutInstitutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_quitterAjoutInstitutActionPerformed

        if (JOptionPane.showConfirmDialog(oldpan, "Annuler l'ajout?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
            Fonctions.passTo(oldpan, institutpan);
        }
    }// GEN-LAST:event_quitterAjoutInstitutActionPerformed

    private void ajouterInstitutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ajouterInstitutActionPerformed

        Instituts inti = Controlers.Controler.controllerInstitut(siglefield.getText(), nameInstitutfiled.getText(),
                contactfield.getText(), directeurnamefield.getText());
        InstitutsManger.insertInstitut(inti);
    }// GEN-LAST:event_ajouterInstitutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        Fonctions.passTo(oldpan, institutpan);
    }// GEN-LAST:event_jButton1ActionPerformed

    private void addphotobutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addphotobutActionPerformed
        Fonctions.choixImage(photolab);
    }// GEN-LAST:event_addphotobutActionPerformed

    private void mesetudiantbutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_mesetudiantbutActionPerformed
        parametrebut.setVisible(false);
        deconnexionbut.setVisible(false);
        institutbut.setEnabled(false);
        Fonctions.resetField3();
        table.setModel(Fonctions.fillTable1(idinstitut));
        Fonctions.passTo(oldpan, mesetudiantspan);

    }// GEN-LAST:event_mesetudiantbutActionPerformed

    private void finbutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        parametrebut.setVisible(true);
        deconnexionbut.setVisible(true);
        institutbut.setEnabled(true);
        Fonctions.passTo(saisipan, saisi1pan);
        Fonctions.passTo(oldpan, choisepan);
        Fonctions.setLienPhoto(null);
        triecombo1.setSelectedItem("Niveau");
        triecombo2.setSelectedItem("cariere");
         triecombo2.setEnabled(false);
    }// GEN-LAST:event_jButton2ActionPerformed

    private void retourS1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_retourS1ActionPerformed
        Fonctions.smsAnnulation(oldpan, choisepan);
    }// GEN-LAST:event_retourS1ActionPerformed

    private void SuivantbutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SuivantbutActionPerformed
        Controler.controllerStu1();

    }// GEN-LAST:event_SuivantbutActionPerformed

    private void AcceuilinstiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_retourS2ActionPerformed
        parametrebut.setVisible(true);
        deconnexionbut.setVisible(true);
        institutbut.setEnabled(true);
        Fonctions.changeColorBut0(parametrebut, institutbut, deconnexionbut);
        Fonctions.passTo(oldpan, acceuilpan);
//         for(int i=0; i<=triecombo2.getItemCount(); i++){
//             triecombo2.removeItemAt(i);
//         }   
               triecombo2.removeAllItems();
               triecombo2.addItem("cariere");
               
    }

    private void retourS2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_retourS2ActionPerformed
        Fonctions.passTo(saisipan, saisi1pan);

    }// GEN-LAST:event_retourS2ActionPerformed

    private void terminerbutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_terminerbutActionPerformed

        if (Controler.controllerStu2(careercombo.getSelectedItem().toString())) {
            table.setModel(Fonctions.fillTable1(idinstitut));
//             parametrebut.setEnabled(false);
            Fonctions.resetField3();
            Fonctions.passTo(oldpan, mesetudiantspan);
        }

    }// GEN-LAST:event_terminerbutActionPerformed

    private void addressmailfieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addressmailfieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_addressmailfieldActionPerformed

    private void nationalitecomboActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nationalitecomboActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_nationalitecomboActionPerformed

    private void careercomboActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_careercomboActionPerformed
        careercombo.setBorder(BorderFactory.createLineBorder(new Color(0, 154, 255)));
        champvidelab1.setText(null);
    }// GEN-LAST:event_careercomboActionPerformed

    // /**
    // * @param args the command line arguments
    // */
//     public static void main(String args[]) {
     /* Set the Nimbus look and feel */
     //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code
//     (optional) ">
     /* If Nimbus (introduced in Java SE 6) is not available, stay with the
     default look and feel.
     * For details see
     http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    
     //</editor-fold>
    
     /* Create and display the form */
//     java.awt.EventQueue.invokeLater(new Runnable() {
//     public void run() {
//     new MainPage().setVisible(true);
//     }
//     });
//     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acceuilinsti;
    private javax.swing.JPanel AjoutInstitutpan;
    private javax.swing.JButton Suivantbut;
    private javax.swing.JPanel acceuilpan;
    private javax.swing.JButton addphotobut;
    static javax.swing.JTextField addressfield;
    static javax.swing.JTextField addressfield1;
    static javax.swing.JTextField addressmailfield;
    static javax.swing.JTextField addressmailfield1;
    private javax.swing.JLabel addressmaillab;
    private javax.swing.JLabel addressmaillab1;
    private javax.swing.JButton ajouterInstitut;
    static javax.swing.JComboBox<String> anneecombo;
    private static javax.swing.JLabel bienvenuelab;
    static javax.swing.JComboBox<String> careercombo;
    private static javax.swing.JLabel champvidelab;
    private static javax.swing.JLabel champvidelab1;
    private javax.swing.JLabel choiselab;
    private javax.swing.JPanel choisepan;
    private javax.swing.JTextField contactfield;
    private static javax.swing.JButton deconnexionbut;
    private javax.swing.JButton deletebut;
    private javax.swing.JTextField directeurnamefield;
    private javax.swing.JButton finbut;
    static javax.swing.JTextField firstnamefield;
    private static javax.swing.JButton institutbut;
    static javax.swing.JTextField institutfield;
    private javax.swing.JPanel institutpan;
    static com.toedter.calendar.JDateChooser jDatenaiss;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JLabel labacceuil;
    private javax.swing.JLabel labchangeicon;
    private javax.swing.JLabel labinscriptiom;
    private javax.swing.JLabel labparametre;
    static javax.swing.JTextField lastnamefield;
    static javax.swing.JComboBox<String> levelcombo;
    static javax.swing.JTextField lupastnamefield;
    private javax.swing.JPanel menucacherpan;
    private javax.swing.JPanel menupan;
    private javax.swing.JButton mesetudiantbut;
    private javax.swing.JPanel mesetudiantspan;
    private javax.swing.JTextField nameInstitutfiled;
    static javax.swing.JComboBox<String> nationalitecombo;
    private javax.swing.JButton newinscriptionbut;
    private static javax.swing.JPanel oldpan;
    private javax.swing.JPanel panbarmenu;
    private javax.swing.JButton paraTerminer;
    private static javax.swing.JButton parametrebut;
    private javax.swing.JPanel parametrepan;
    private static javax.swing.JLabel photolab;
    private static javax.swing.JPanel photopane;
    private javax.swing.JButton quittancebut;
    private javax.swing.JButton quitterAjoutInstitut;
    private javax.swing.JTextField recherchefield;
    private javax.swing.JLabel registrationlab;
    static javax.swing.JPanel registrationpan;
    private javax.swing.JButton retourS1;
    private javax.swing.JButton retourS2;
    private javax.swing.JPanel saisi1pan;
    public static javax.swing.JPanel saisi2pan;
    public static javax.swing.JPanel saisipan;
    static javax.swing.JComboBox<String> sexecombo;
    private javax.swing.JTextField siglefield;
    private javax.swing.JTable table;
    static javax.swing.JTextField telephonefield;
    static javax.swing.JTextField telephonefield1;
    private javax.swing.JButton terminerbut;
    private javax.swing.JLabel titreetudiantlab;
    private static javax.swing.JComboBox<String> triecombo1;
    private static javax.swing.JComboBox<String> triecombo2;
    private javax.swing.JLabel upastnamelab;
    private static javax.swing.JLabel upchampvide;
    private javax.swing.JButton updatebut;
    private javax.swing.JPanel updtpane;
    static javax.swing.JTextField upfirstnamefield;
    private javax.swing.JLabel upfirstnamelab;
    private javax.swing.JButton upphotobut;
    private static javax.swing.JLabel upphotolab;
    // End of variables declaration//GEN-END:variables

}
