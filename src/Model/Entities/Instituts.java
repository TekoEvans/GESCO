/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entities;

/**
 *
 * @author evans
 */
public class Instituts {
    
   private int id ;
   private String nameInstitut;
   private String nameHeadmaster;
   private String contact;
   private String libele;

    public Instituts(int id, String nameInstitut, String nameHeadmaster,String contact,String libele) {
        this.id = id;
        this.contact= contact;
        this.nameInstitut = nameInstitut;
        this.nameHeadmaster = nameHeadmaster;
        this.libele=libele;
    }
    public Instituts( String nameInstitut, String nameHeadmaster,String contact,String libele) {
        this.contact= contact;
        this.nameInstitut = nameInstitut;
        this.nameHeadmaster = nameHeadmaster;
        this.libele=libele;
    }

    public void setLibele(String libele) {
        this.libele = libele;
    }

    public String getLibele() {
        return libele;
    }
    

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameInstitut() {
        return nameInstitut;
    }

    public void setNameInstitut(String nameInstitut) {
        this.nameInstitut = nameInstitut;
    }

    public String getNameHeadmaster() {
        return nameHeadmaster;
    }

    public void setNameHeadmaster(String nameHeadmaster) {
        this.nameHeadmaster = nameHeadmaster;
    }
   
}
