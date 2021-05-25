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
//
public class ContactsManager {
    private Contact [] myFriends;
    private int friendsCount;
    
    //membuat constructor
    ContactsManager() {
        this.myFriends=new Contact[500];
        this.friendsCount=0;
    }
    
    //soal no 3c (menambahkan method void addContact)
    public void addContact(Contact contact){
        this.myFriends[this.friendsCount]=contact;
        this.friendsCount++;
    }
    
    //soal no 3d (menambahkan method Contact searchContact)
    public Contact searchContact(String searchName){
        for (int i=0; i<this.friendsCount; i++) {
            if (searchName.toUpperCase().equals(this.myFriends[i].getName().toUpperCase())) {
                return this.myFriends[i];
            }
        }
        
        return null;
    }
    
}
