/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

import java.util.Scanner;
import pertemuan3.ruang.Balok;
import pertemuan3.ruang.Kerucut;
/**
 *
 * @author User
 */
public class Main {
    
    public static void main(String[] args) {
        int pilih;
        Scanner cin=new Scanner(System.in);
        do {
            System.out.println("\nINPUT");
            System.out.println("1. Balok");
            System.out.println("2. Kerucut");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilih=cin.nextInt();
            if (pilih==1) {
                double pjg,lebar,tinggi;
                System.out.print("Panjang = ");
                pjg=cin.nextDouble();
                System.out.print("Lebar = ");
                lebar=cin.nextDouble();
                System.out.println("Tinggi = ");
                tinggi=cin.nextDouble();
                pertemuan3.ruang.Balok balok=new Balok(pjg,lebar,tinggi);
                System.out.println("____OUTPUT____");
                System.out.println("LUAS PERSEGI\t = "+balok.luas());
                System.out.println("KELILING PERSEGI= "+balok.keliling());
                System.out.println("VOLUME BALOK\t = "+balok.volume());
                System.out.println("KELILING BALOK\t = "+balok.luaspermukaan());
            }
            else if (pilih==2) {
                double jarijari,tinggi;
                System.out.print("Jari-Jari = ");
                jarijari=cin.nextDouble();
                System.out.print("Tinggi = ");
                tinggi=cin.nextDouble();
                pertemuan3.ruang.Kerucut kerucut=new Kerucut(jarijari,tinggi);
                System.out.println("____OUTPUT____");
                System.out.println("LUAS LINGKARAN\t\t = "+kerucut.luas());
                System.out.println("KELILING LINGKARAN\t = "+kerucut.keliling());
                System.out.println("VOLUME KERUCUT\t\t = "+kerucut.volume());
                System.out.println("KELILING KERUCUT\t = "+kerucut.luaspermukaan());
            }
            else {
                return;
            }
        } while (true);
        
        
    }
    
}
