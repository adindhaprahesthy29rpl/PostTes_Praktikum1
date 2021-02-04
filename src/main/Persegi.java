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
public class Persegi {
    
    //Inisialisasi Object Input dari Class Scanner
    Scanner input = new Scanner(System.in);
    
    //Mengidentifikasi Atribut
    double luas;
    int sisi;
    
    //Method Hitung
    public void hitung(){
        
        //Input Nilai Jari-Jari
        System.out.print("Masukkan Nilai Sisi Persegi : ");
        sisi = input.nextInt();
     
        //Menghitung Luas Lingkaran 
        luas = sisi*sisi;
        
        //Tampilkan Hasil Luas Lingkaran
        System.out.println("Luas Persegi = "+luas);
        
    }
}
