/* NAMA FILE : MGaris.java
 * DESKRIPSI : Berisi pemanggilan dan penggunaan attribut dan method dalam class garis
 * PEMBUAT   : 24060123120039 / M. Daffa' Atstsaqif
 * TANGGAL   : 22 Februari 2025
 */


package GARIS;

import TITIK.Titik;

public class MGaris {
    public static void main(String[] args) {
        // Membuat Titik A dan Titik B
        Titik A = new Titik(2, 3);
        Titik B = new Titik(5, 7);

        // Membuat Garis dengan Titik A dan Titik B
        Garis G1 = new Garis(A, B);
        System.out.println("Garis G1 telah dibuat.");

        // Mencetak informasi titik awal dan titik akhir
        System.out.println("Titik Awal Garis G1: " + G1.getAwal());
        System.out.println("Titik Akhir Garis G1: " + G1.getAkhir());

        // Mencetak panjang garis
        System.out.println("Panjang Garis G1: " + G1.getPanjangGaris());

        // Mencetak gradien garis
        System.out.println("Gradien Garis G1: " + G1.getGradien());

        // Menghitung dan mencetak titik tengah garis
        Titik titikTengah = G1.titikTengah();
        System.out.println("Titik Tengah Garis G1: " + titikTengah);

        // Membuat Garis lain untuk perbandingan
        Titik C = new Titik(-2, -1);
        Titik D = new Titik(1, 3);
        Garis G2 = new Garis(C, D);
        System.out.println("Garis G2 telah dibuat.");

        // Mengecek apakah G1 sejajar dengan G2
        System.out.println("Apakah G1 sejajar dengan G2? " + G1.isSejajar(G2));

        // Mengecek apakah G1 tegak lurus dengan G2
        System.out.println("Apakah G1 tegak lurus dengan G2? " + G1.isTegakLurus(G2));

        // Mencetak semua informasi garis
        System.out.println("\nInformasi Garis G1:");
        G1.printGaris();

        System.out.println("\nInformasi Garis G2:");
        G2.printGaris();

        // Mencetak persamaan garis
        System.out.println("\nPersamaan Garis G1:");
        G1.printPersamaan();

        System.out.println("\nPersamaan Garis G2:");
        G2.printPersamaan();
    }
}
