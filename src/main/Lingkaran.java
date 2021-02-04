/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Lingkaran {
    
    //Inisialisasi Object Input dari Class Scanner
    Scanner input = new Scanner(System.in);
    
    //Mengidentifikasi Atribut
    double luas, phi = 3.14;
    int r;
    
    //Method Hitung
    public void hitung(){
        
        //Input Nilai Jari-Jari
        System.out.print("Masukkan Nilai Jari-Jari : ");
        r = input.nextInt();
     
        //Menghitung Luas Lingkaran 
        luas = phi*r*r;
        
        //Tampilkan Hasil Luas Lingkaran
        System.out.println("Luas Lingkaran = "+luas);
        
    }
    
}
