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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Inisialisasi Object Input dari Class Scanner
        Scanner input = new Scanner(System.in);
    
        //Identifikasi Atribut
        String memilih;
        int luasBangun;
        boolean lagi = true;
        while (lagi){
        
        //Judul Program
         System.out.println("=================================================================");
         System.out.println("                  MENGHITUNG LUAS BANGUN DATAR                   ");
         System.out.println("=================================================================");
         System.out.println(" ");
         
        //Memberikan Kode Pilihan Luas Yang Akan Dipilih Oleh User
        System.out.println("KODE PILIHAN LUAS BANGUN DATAR");
        System.out.println("------------------------------");
        System.out.println("1. Luas Lingkaran");
        System.out.println("2. Luas Persegi");
        
        //User Memilih Luas
        System.out.print("Masukkan Kode Luas Yang Anda Inginkan : ");
         luasBangun = input.nextInt();
        
        //Menentukan Luas Yang Dipilih User
        switch(luasBangun){
            case 1:
                 System.out.println("Luas Lingkaran");
                 
                 //Object
                 Lingkaran panggil = new Lingkaran ();
                 
                 //Pengisian Atribut dan Menjalankan Method
                 panggil.hitung();
                 break;
            
            case 2:
                 System.out.println("Luas Persegi");
                 
                 //Object
                 Persegi memanggil = new Persegi ();
                 
                 //Pengisian Atribut dan Menjalankan Method
                 memanggil.hitung();
                 break;
            
            default:
                 System.out.println("Anda Salah Memasukkan Kode");
        }
     
        System.out.println(" ");
        System.out.println("Apakah Anda Ingin Menghitung Luas Bangun Datar Lagi ? (yes/no)");
         memilih = input.next();
          lagi = memilih.equals("yes");
        System.out.println("-----------------------------------------------------------------");
        System.out.println(" ");
        }
    }
}