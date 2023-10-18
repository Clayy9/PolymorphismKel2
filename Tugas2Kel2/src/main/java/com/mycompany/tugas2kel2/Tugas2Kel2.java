/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas2kel2;

/**
 *
 * @author ACER
 */
public class Tugas2Kel2 {

    public static void main(String[] args) {
        // Cara 1
//        Matic vario = new Matic("Manual", "Lead-Acid Battery", 12, "Yamaha");
//        vario.tampilkanSpek();
//        Matic nmax = new Matic("Manual", "Li-Ion", 12, "Honda");
//        nmax.tampilkanSpek();

        // Cara 2
        String[] merkMatic = {"Honda", "Vespa", "Yamaha", "Suzuki"};
        String[] merkManual = {"Honda", "Yamaha", "Aprilia"};
        
        Matic motorMatic = new Matic("Matic", "Li-Ion", 3, merkMatic );
        motorMatic.tampilkanSpek();
        
        Manual motorManual = new Manual("Matic", "Li-Ion", 3, merkManual);
        motorManual.tampilkanSpek();

    }
}