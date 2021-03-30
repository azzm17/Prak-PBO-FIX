/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nama,nim;
        int uts,uas,usia,pilih;
        float nilai;
        //membuat scanner baru
        pilih=2;
        Scanner cin=new Scanner(System.in);
        Mahasiswa mhs=null;
        do {
            if (pilih==1) {
                System.out.println("\nKenalin Nama ku "+mhs.getName()+", nim "+mhs.getNim()+", ");
                System.out.println("\n Usia = "+mhs.getAge());
                System.out.println("\n Nilai Akhir = "+mhs.getNilai());
            }
            else if (pilih==2) {
                System.out.println("==Edit Data==");
                System.out.print("Nama\t : ");
                nama=cin.nextLine();
                System.out.print("Nim\t : ");
                nim=cin.nextLine();
                System.out.print("Usia\t : ");
                usia=cin.nextInt();
                System.out.print("Uts\t : ");
                uts=cin.nextInt();
                System.out.print("Uas\t : ");
                uas=cin.nextInt();
                mhs=new Mahasiswa(nama,nim,uas,usia,uts);
                
            }
            else{
                return;
            }
            System.out.println("\n\n\n==Opsi Data==");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Edit Data");
            System.out.println("3. Keluar");
            System.out.print("Pilih : ");
            pilih=cin.nextInt();
        } while (true);
        
    }
}
