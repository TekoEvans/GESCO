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
public class Careers {
    private int id;
    private String careerName;
    private String cigle;
    private int idInstitut;

    public Careers(int id, String careerName,String cigle, int idInstitut) {
        this.id = id;
        this.careerName = careerName;
        this.cigle = cigle;
        this.idInstitut= idInstitut;
    }
    public Careers(String careerName) {
         
        this.careerName = careerName;
         
    }
    public Careers(int id, String careerName ,String cigle) {
        this.id = id;
        this.careerName = careerName;
        this.cigle = cigle;
         
    }

    public int getIdInstitut() {
        return idInstitut;
    }

    public void setIdInstitut(int idInstitut) {
        this.idInstitut = idInstitut;
    }
     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCareerName() {
        return careerName;
    }

    public void setCareerName(String careerName) {
        this.careerName = careerName;
    }

    public String getCigle() {
        return cigle;
    }
    
    
    
}
