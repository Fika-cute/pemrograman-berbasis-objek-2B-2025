/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalNo2;
 import java.util.ArrayList;
/**
 *
 * @author User
 */
  
public class Perpustakaan {
    public ArrayList<bukuFiksi> koleksiFiksi;
    public ArrayList<BukuNonFiksi> koleksiNonFiksi;

    public Perpustakaan() {
        koleksiFiksi = new ArrayList<>();
        koleksiNonFiksi = new ArrayList<>();
    }

    public void tambahBukuFiksi(bukuFiksi buku) {
        koleksiFiksi.add(buku);
    }

    public void tambahBukuNonFiksi(BukuNonFiksi buku) {
        koleksiNonFiksi.add(buku);
    }

    public void tampilkanKoleksi() {
        System.out.println("=== Buku Fiksi ===");
        for (bukuFiksi fiksi : koleksiFiksi) {
            fiksi.infoFiksi();
        }

        System.out.println("=== Buku Non-Fiksi ===");
        for (BukuNonFiksi nonFiksi : koleksiNonFiksi) {
            nonFiksi.infoNonFiksi();
        }
    }
}
