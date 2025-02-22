/* NAMA FILE : Garis.java
 * DESKRIPSI : Berisi attribut dan method dalam class garis
 * PEMBUAT   : 24060123120039 / M. Daffa' Atstsaqif
 * TANGGAL   : 22 Februari 2025
 */


package GARIS;

import TITIK.Titik;

public class Garis {
    Titik Awal;
    Titik Akhir;
    static int counterGaris = 0;

    Garis(){
        Awal = new Titik(0.0,0.0);
        Akhir = new Titik(1.0, 1.0);
        counterGaris++;
    }

    Garis(Titik A, Titik B){
        this.Awal = A;
        this.Akhir = B;
        counterGaris++;
    }

    static int getCounterGaris(){
        return counterGaris;
    }

    Titik getAwal(){
        return Awal;
    }

    Titik getAkhir(){
        return Akhir;
    }

    void setAwal(Titik T){
        Awal = T;
    }

    void setAkhir(Titik T){
        Akhir = T;
    }

    public double getPanjangGaris(){
        return Awal.getJarak(Akhir);
    }

    public double getGradien(){
        return (Akhir.getOrdinat() - Awal.getOrdinat())/(Akhir.getAbsis() - Awal.getAbsis());
    }

    public Titik titikTengah(){
        return new Titik((Awal.getAbsis() + Akhir.getAbsis())/2, (Awal.getOrdinat() + Akhir.getOrdinat()));
    }

    public boolean isSejajar(Garis G){
        return this.getGradien() == G.getGradien();
    }

    public boolean isTegakLurus(Garis G){
        return this.getGradien() * G.getGradien() == -1;
    }

    void printGaris(){
        System.out.println("titk Awal = (" + Awal.getAbsis() + ", " + Awal.getOrdinat() + ")");
        System.out.println("titk Akhir = (" + Akhir.getAbsis() + ", " + Akhir.getOrdinat() + ")");
    }

    void printPersamaan(){
        System.out.println("y = " + getGradien() + "x" + (getGradien()*Awal.getAbsis() - Awal.getOrdinat()));
    }
}
