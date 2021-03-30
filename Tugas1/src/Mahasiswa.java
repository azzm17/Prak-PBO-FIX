/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Mahasiswa 
{
    private String namaMhs;
    private String nimMhs;
    private int usia,uts,uas;
    private float nilai;
    public Mahasiswa(String namaMhs,String nimMhs,int uas,int usia,int uts)
    {
        this.namaMhs=namaMhs;
        this.nimMhs=nimMhs;
        this.uas=uas;
        this.usia=usia;
        this.uts=uts;
        this.nilai=(uts+uas)/2;
        
    };   
    public String getName(){
        return this.namaMhs;
    }
    public String getNim(){
        return this.nimMhs;
        
    }
    public int getAge(){
        return this.usia;
        
    }
    public float getNilai(){
        return this.nilai;
    }
    
}
