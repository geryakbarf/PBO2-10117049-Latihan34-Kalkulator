/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan34.kalkulator;

import java.util.Scanner;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program kalkulator untuk menghitung
 * fungsi aritmatika penjumlahan, pengurangan, perkalian, pembagian, dan sisa
 * hasil bagi
 */
public class PBO210117049Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner baca = new Scanner(System.in);
        Kalkulator bilangan = new Kalkulator();

        System.out.println("===Aplikasi Kalkulator Bilangan===");
        System.out.print("Masukkan Bilangan ke-1 : ");
        bilangan.value1 = baca.nextDouble();
        System.out.print("Masukkan Bilangan ke-2 : ");
        bilangan.value2 = baca.nextDouble();
        System.out.println("");
        System.out.println("Hasil Pertambahan : " + bilangan.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + bilangan.kurangBilangan());
        System.out.println("Hasil Perkalian : " + bilangan.kaliBilangan());
        System.out.println("Hasil Pembagian : " + bilangan.bagiBilangan());
        System.out.println("Sisa Hasil : " + bilangan.sisaBilangan());
    }

}
