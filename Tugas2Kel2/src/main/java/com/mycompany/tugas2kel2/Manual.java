/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas2kel2;

/**
 *
 * @author ACER
 */
public class Manual extends Motor{
    
    // Subclass Constructor
    Manual(String tipeTransmisi, String tipeBaterai, int masaMaintenance, String merk)
    {
        super(tipeTransmisi, tipeBaterai, masaMaintenance, merk);
    }
    
    @Override
    void tampilkanSpek()
    {
        super.tampilkanSpek();
        System.out.print("Jenis Motor: Manual");
    }
}
