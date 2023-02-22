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
public class Users {

    private int id;
    private String username;
    private String password;
    private String ruleUser;
    public String name;

    public Users(int id, String username, String password, String ruleUser, String name) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.ruleUser = ruleUser;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRuleUser() {
        return ruleUser;
    }

    public void setRuleUser(String ruleUser) {
        this.ruleUser = ruleUser;
    }

}
