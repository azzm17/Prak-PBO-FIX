/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3.bidang;

/**
 *
 * @author User
 */
public class Lingkaran implements menghitungbidang{
    private double jarijari;

    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    public double getJarijari() {
        return jarijari;
    }
     
    @Override
    public double luas() {
        return this.jarijari*this.jarijari*Math.PI;
    }

    @Override
    public double keliling() {
        return Math.PI*this.jarijari*2;
    }
}
