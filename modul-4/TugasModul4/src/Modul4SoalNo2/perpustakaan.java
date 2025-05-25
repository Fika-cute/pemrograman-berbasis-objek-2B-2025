/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul4SoalNo2;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class perpustakaan {
    private buku[] daftarBuku;
    private int jumlahBuku;
    private int kapasitas = 100;
    Scanner input = new Scanner(System.in);

    public perpustakaan() {
    daftarBuku = new buku[kapasitas];
    jumlahBuku = 0;

    // Data awal
    daftarBuku[jumlahBuku++] = new buku("Cinderella", "putri fika", 30);
    daftarBuku[jumlahBuku++] = new buku("putri tidur", "fika bocan", 20);
    }

    public void tambahBuku() {
        if (jumlahBuku < kapasitas) {
            System.out.print("Masukkan Judul Buku: ");
            String judul = input.nextLine();
            System.out.print("Masukkan Nama Penulis: ");
            String penulis = input.nextLine();
            System.out.print("Masukkan Jumlah Halaman: ");
            int halaman = input.nextInt();
            input.nextLine(); // Bersihkan newline

            daftarBuku[jumlahBuku] = new buku(judul, penulis, halaman);
            jumlahBuku++;
            System.out.println("Buku berhasil ditambahkan.");
        } else {
            System.out.println("Kapasitas perpustakaan penuh.");
        }
    }

    public void tampilkanBuku() {
        if (jumlahBuku == 0) {
            System.out.println("Belum ada buku yang ditambahkan.");
        } else {
            System.out.println();
            System.out.println("Daftar Buku di Perpustakaan:");
            for (int i = 0; i < jumlahBuku; i++) {
                System.out.println("-- Buku " + (i + 1)+" --");
                System.out.println("Judul: " + daftarBuku[i].getJudul());
                System.out.println("Penulis: " + daftarBuku[i].getPenulis());
                System.out.println("Jumlah Halaman: " + daftarBuku[i].getJumlahHalaman());
                System.out.println();
            }
        }
    }
}
