/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas2kel2;

/**
 *
 * @author ACER
 */
public class Motor {
    String tipeTransmisi;
    String tipeBaterai;
    int masaMaintenance;
    String[] merk;
    
    // Cara 1
//    private int jmlMerk = 0;

    // Constructor
//    public Motor(String tipeTransmisi, String tipeBaterai, int masaMaintenance, String merk) {
//        this.tipeTransmisi = tipeTransmisi;
//        this.tipeBaterai = tipeBaterai;
//        this.masaMaintenance = masaMaintenance;
//        this.merk = new String[10]; // Inisialisasi array merk dengan panjang 10
//        this.merk[jmlMerk] = merk;
//        this.jmlMerk++;
//    }

    // Method
//    public void tampilkanSpek() {
//        System.out.println("Tipe Transmisi : " + tipeTransmisi);
//        System.out.println("Tipe Baterai : " + tipeBaterai);
//        System.out.println("Masa Maintenance : " + masaMaintenance + " bulan");
//        System.out.print("Merk : \n");
//        for (int i = 0; i< jmlMerk; i++) {
//        System.out.println(merk[i] + " ");
//            }
//        
//        System.out.println();
//
//        }
    
    // Cara 2
    public Motor(String tipeTransmisi, String tipeBaterai, int masaMaintenance, String[] merk) {
        this.tipeTransmisi = tipeTransmisi;
        this.tipeBaterai = tipeBaterai;
        this.masaMaintenance = masaMaintenance;
        this.merk = merk;
    }


    // Method
    void tampilkanSpek() {
        for(int i = 0; i < merk.length;i++)
        {
            
        System.out.println("Tipe Transmisi : " + tipeTransmisi);
        System.out.println("Tipe Baterai : " + tipeBaterai);
        System.out.println("Masa Maintenance : " + masaMaintenance + " bulan");
        System.out.print("Merk : " + merk[i]);        
        
        System.out.println();
        System.out.println();
        }
        
        System.out.println("============================");
    }
}

