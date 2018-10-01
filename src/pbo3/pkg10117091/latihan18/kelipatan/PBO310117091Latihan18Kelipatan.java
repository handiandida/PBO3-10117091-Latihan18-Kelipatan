/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117091.latihan18.kelipatan;

/**
 *
 * @author Lenovo 
 * Nama         : Dida Handian
 * Kelas        : IF-3 
 * Nim          : 10117091 
 * Deskripsi    : Program ini dapat menghitung bilangan dengan keliaptan
 * yang diinginkan
 */
public class PBO310117091Latihan18Kelipatan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Bil;
        double angka;
        double x;

        Bil = 13;
        angka = 0;
        x = 3.5;
        
        for (double i = 3.5; i < Bil; i++) {
            if (i <= Bil) {
                angka = x + angka;

                System.out.println("" + angka);
            }
        }
    }
    
}
