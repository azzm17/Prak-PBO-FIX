/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisbro;

/**
 *
 * @author User
 */
public class Contact {
    private String name;
    private String email;
    private String phoneNumber;
    
    public Contact (String name,String email,String phoneNumber){
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }
    
    //public string get
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    //public void set
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
