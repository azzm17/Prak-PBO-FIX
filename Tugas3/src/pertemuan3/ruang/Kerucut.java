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
public class Kerucut extends pertemuan3.bidang.Lingkaran implements menghitungruang{
    private double tinggi;

    public Kerucut(double jari, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume() {
        return this.luas()*this.tinggi/3;
    }

    @Override
    public double luaspermukaan() {
        double res = (this.tinggi*this.tinggi)+(this.getJarijari()*this.getJarijari());
        double s = Math.sqrt(res);
        return (this.luas())+(Math.PI*this.getJarijari()*s);
    }
}
