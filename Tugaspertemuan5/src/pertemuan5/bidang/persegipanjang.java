/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5.bidang;

/**
 *
 * @author User
 */
public class persegipanjang implements MenghitungBidang{
    private double panjang;
    private double lebar;

    public persegipanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }
    
    @Override
    public double luas() {
        return this.panjang*this.lebar;
    }

    @Override
    public double keliling() {
        return 2*(this.panjang+this.lebar);
    }
}
