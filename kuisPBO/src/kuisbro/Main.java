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

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactsManager myContactManager = new ContactsManager();
        Scanner input = new Scanner(System.in);
        
        String searchName;
        Contact addContact;
        
        //membuat objek Contact baru, set name, email, dan phoneNumber nya sesuai dengan teman
        addContact = new Contact("Rivano","123190084@student.upnyk.ac.id","082146836953");
        myContactManager.addContact(addContact);//memanggil method addContact di myContactsManager untuk menambahkan kontak
        //perulangan 1
        addContact = new Contact("Ayi","123190037@student.upnyk.ac.id","087744675617");
        myContactManager.addContact(addContact);//memanggil method addContact di myContactsManager untuk menambahkan kontak
        //perulangan 2
        addContact = new Contact("Dedi","123190042@student.upnyk.ac.id","08980357877");
        myContactManager.addContact(addContact);//memanggil method addContact di myContactsManager untuk menambahkan kontak
        //perulangan 3
        addContact = new Contact("Hanan","123190020@student.upnyk.ac.id","083866731132");
        myContactManager.addContact(addContact);//memanggil method addContact di myContactsManager untuk menambahkan kontak
        //perulangan terakhir
        addContact = new Contact("Arif","123190019@student.upnyk.ac.id","082246627884");
        myContactManager.addContact(addContact);//memanggil method addContact di myContactsManager untuk menambahkan kontak
        
        while(true){
            System.out.println("=== Mencari Nama Kontak ===");
            System.out.print("Masukkan Nama\t: "); 
            searchName = input.next();
            
            Contact hasil = myContactManager.searchContact(searchName);
            if (hasil != null) 
            {
                System.out.println("================================");
                System.out.println("\n~Kontak "+searchName+" DITEMUKAN~");
                System.out.println("\n ==========DATA KONTAK==========");
                System.out.println("Nama\t\t: "+ hasil.getName());
                System.out.println("Email\t\t: "+ hasil.getEmail());
                System.out.println("Nomor Telepon\t: "+ hasil.getPhoneNumber());
                System.out.println("================================");
            }
            else
            {
                System.out.println("\n~~Kontak TIDAK ditemukan~~");
            }
            
            System.out.print("\nIngin Cari Kontak lagi?(y/n)\t: "); 
            String ulangi = input.next();
            if (ulangi.equals("n")) 
            {
                return;
            }
        }
    }
    
}
