/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entities;

import java.util.Date;

/**
 *
 * @author evans
 */
public class Students {
    private int id;
    private int idInstitut;
    private int idCareer;
    private String  lastName;
    private String  fristName;
    private  Date birthDate;
    private  String sex;
    private  String nationality;
    private  String level;
    private  String address;
    private  String email;
    private  String telephone;
//    private  int registrationNum;
    private  String registrationDate;
    
    private String photo;

    public Students(int id, String lastName, String fristName, Date birthDate,
            String sex, String nationality, String level, String adress, String email,
            String telephone,int idInstitut ,int idCareer ,String registrationDate,String photo) {
        this.id = id;
        this.idInstitut = idInstitut;
        this.idCareer = idCareer;
        this.lastName = lastName;
        this.fristName = fristName;
        this.birthDate = birthDate;
        this.sex = sex;
        this.nationality = nationality;
        this.level = level;
        this.address = adress;
        this.email = email;
        this.telephone = telephone;
//        this.registrationNum = registrationNum;
        this.registrationDate = registrationDate;
        this.photo=photo;
    }
    public Students( String lastName, String fristName, Date birthDate,
            String sex, String nationality, String level, String address, String email,
            String telephone,int idInstitut ,int idCareer , String registrationDate,String photo) {
         
        this.idInstitut = idInstitut;
        this.idCareer = idCareer;
        this.lastName = lastName;
        this.fristName = fristName;
        this.birthDate = birthDate;
        this.sex = sex;
        this.nationality = nationality;
        this.level = level;
        this.address = address;
        this.email = email;
        this.telephone = telephone;
        this.registrationDate = registrationDate;
        this.photo=photo;
       
    }


    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFristName() {
        return fristName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getSex() {
        return sex;
    }

    public String getNationality() {
        return nationality;
    }

    public String getLevel() {
        return level;
    }

    public String getAdress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

//    public int getRegistrationNum() {
//        return registrationNum;
//    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public int getIdInstitut() {
        return idInstitut;
    }

    public int getIdCareer() {
        return idCareer;
    }
    

    public String getPhoto() {
        return photo;
    }

     
      
}
