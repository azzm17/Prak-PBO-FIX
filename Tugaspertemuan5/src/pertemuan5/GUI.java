/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;
//untuk import java.awt.event sbeenarnya di akhirnya bisa diganti dengan * tetapi karena butuh actionevent dan listener saya buat seperti dibawah
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
//untuk javax.swing juga sbenarnya sama seperti java.awt tetapi karena lagi nyoba" jadi saya buat seperti dibawah
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import pertemuan5.bidang.persegipanjang;
import pertemuan5.ruang.balok;

/**
 *
 * @author User
 */
public class GUI extends JFrame implements ActionListener {
    JLabel judul=new JLabel("Kalkulator Balok");
    
    JLabel Panjang = new JLabel("Panjang");
    final JTextField fPanjang = new JTextField(99);  
    JLabel Lebar = new JLabel("Lebar");
    final JTextField fLebar = new JTextField(99);  
    JLabel Tinggi = new JLabel("Tinggi");
    final JTextField fTinggi = new JTextField(99);
    
    JLabel Hasil = new JLabel("Hasil : ");
    JLabel LuasPersegi = new JLabel(); 
    JLabel KelilingPersegi = new JLabel();
    JLabel VolumeBalok = new JLabel();
    JLabel LuasBalok = new JLabel(); 
    
    JButton bHitung = new JButton("Hitung");
    JButton bReset = new JButton("Reset");
    
    GUI()
    { 
        setTitle("Tugas pertemuan ke 5");
        //setSize merupakan pengaturan ukuran dari jframe
        setSize(320,320);
        setLayout(null);
        
        add(judul,"North");
        add(Panjang);
        //f=field
        add(fPanjang);
        add(Lebar);
        add(fLebar);
        add(Tinggi);
        add(fTinggi);
        add(Hasil);
        //b=button
        add(bHitung);
        add(bReset);
        
        judul.setForeground(Color.BLUE);
        Panjang.setForeground(Color.MAGENTA);
        Lebar.setForeground(Color.MAGENTA);
        Tinggi.setForeground(Color.MAGENTA);
        Hasil.setForeground(Color.BLUE);
       
        fPanjang.setBackground(Color.CYAN);
        fLebar.setBackground(Color.CYAN);
        fTinggi.setBackground(Color.CYAN);
        bHitung.setBackground(Color.GREEN);
        bReset.setBackground(Color.RED);
        
        judul.setBounds(120,5,100,20);
        Panjang.setBounds(20,30,200,20);
        fPanjang.setBounds(90, 30, 200, 20);
        Lebar.setBounds(20,60,150,20);
        fLebar.setBounds(90, 60, 200, 20);
        Tinggi.setBounds(20,90,150,20);
        fTinggi.setBounds(90, 90, 200, 20);
        Hasil.setBounds(50, 120, 150, 20);
        bHitung.setBounds(50, 240, 100, 30);
        bReset.setBounds(155, 240, 100, 30);
        bHitung.addActionListener(this);
        bReset.addActionListener(this);      
        
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == bHitung) 
        {
            
            try{
                double panjang, lebar, tinggi;
                panjang = Double.parseDouble(fPanjang.getText());
                lebar = Double.parseDouble(fLebar.getText());
                tinggi = Double.parseDouble(fTinggi.getText());
                persegipanjang persegi = new persegipanjang(panjang, lebar);
                balok balok = new balok(panjang, lebar, tinggi);               

                LuasPersegi.setText("Luas Persegi : " + Double.toString(persegi.luas()));
                add(LuasPersegi);
                LuasPersegi.setBounds(90, 140, 200, 20);
                LuasPersegi.setForeground(Color.RED);
                
                KelilingPersegi.setText("Keliling Persegi : " + Double.toString(persegi.keliling()));
                add(KelilingPersegi);
                KelilingPersegi.setBounds(90, 160, 200, 20);
                KelilingPersegi.setForeground(Color.ORANGE);
                
                VolumeBalok.setText("Volume Balok : " + Double.toString(balok.volume()));
                add(VolumeBalok);
                VolumeBalok.setBounds(90, 180, 200, 20);
                VolumeBalok.setForeground(Color.RED);
                
                LuasBalok.setText("Luas Permukaan Balok : " + Double.toString(balok.luaspermukaan()));
                add(LuasBalok);
                LuasBalok.setBounds(90, 200, 200, 20);
                LuasBalok.setForeground(Color.ORANGE);
            }
            catch(NumberFormatException ae){
                JOptionPane.showMessageDialog(null, ""+ae.getMessage());
            }
        }
        if (e.getSource() == bReset) 
        {
            fPanjang.setText(null);
            fLebar.setText(null);
            fTinggi.setText(null);
            LuasPersegi.setText(null);
            KelilingPersegi.setText(null);
            VolumeBalok.setText(null);
            LuasBalok.setText(null);
        }
    }
}
