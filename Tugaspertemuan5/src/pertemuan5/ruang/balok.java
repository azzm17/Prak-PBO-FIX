/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5.ruang;

/**
 *
 * @author User
 */
public class balok extends pertemuan5.bidang.persegipanjang implements MenghitungRuang{
    private double tinggi;
    
    public balok(double panjang, double lebar, double tinggi) {
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
        return 2*((this.getPanjang()*this.getLebar())+(this.getPanjang()*this.tinggi) + (this.getLebar()*this.getTinggi()));
    }
}
