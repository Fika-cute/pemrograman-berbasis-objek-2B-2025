/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SoalNo2;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class bukuXperpustakaanMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();

        System.out.print("Berapa jumlah buku fiksi yang ingin ditambahkan? ");
        int jumlahFiksi = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahFiksi; i++) {
            System.out.println("Buku Fiksi -" + (i + 1));
            System.out.print("Judul: ");
            String judul = input.nextLine();
            System.out.print("Penulis: ");
            String penulis = input.nextLine();
            System.out.print("Genre: ");
            String genre = input.nextLine();
            System.out.println("     -----     ");

            bukuFiksi buku = new bukuFiksi(judul, penulis, genre);
            perpustakaan.tambahBukuFiksi(buku);
        }

        System.out.println();
        System.out.print("Berapa jumlah buku non-fiksi yang ingin ditambahkan? ");
        int jumlahNonFiksi = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahNonFiksi; i++) {
            System.out.println("Buku Non Fiksi -" + (i + 1));
            System.out.print("Judul: ");
            String judul = input.nextLine();
            System.out.print("Penulis: ");
            String penulis = input.nextLine();
            System.out.print("Topik: ");
            String topik = input.nextLine();
            System.out.println("     -----     ");

            BukuNonFiksi buku = new BukuNonFiksi(judul, penulis, topik);
            perpustakaan.tambahBukuNonFiksi(buku);
        }

        System.out.println("=== Buku di Perpustakaan ===");
        perpustakaan.tampilkanKoleksi();
        
        System.out.println("=== Jumlah Buku Tersimpan ===");
        System.out.println("Buku Fiksi     : " + bukuFiksi.JumlahFiksi());
        System.out.println("Buku Non-Fiksi : " + BukuNonFiksi.Jumlahnonfiksi());
    }
}
    