/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3.ruang;

/**
 *
 * @author User
 */
public class Balok extends pertemuan3.bidang.persegipanjang implements menghitungruang{
    private double tinggi;
    
    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    public double volume() {
        return this.luas()*this.tinggi;
    }

    @Override
    public double luaspermukaan() {
        return 4*(this.getPanjang()+this.tinggi + this.getLebar());
    }
}
