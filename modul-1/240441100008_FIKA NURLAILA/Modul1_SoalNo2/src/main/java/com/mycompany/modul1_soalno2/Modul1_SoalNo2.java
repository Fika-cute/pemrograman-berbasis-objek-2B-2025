/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul1_soalno2;
import java.util.Scanner;

/**
 *
 * @author User
 */

public class Modul1_SoalNo2 {

    String nama;
    String nim;
    String jurusan;
    String alamat;

    Modul1_SoalNo2(String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    void tampilkanData() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Alamat  : " + alamat);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("-- Masukkan data mahasiswa --");
        System.out.print("Nama    : ");
        String nama1 = input.nextLine();
        System.out.print("NIM     : ");
        String nim1 = input.nextLine();
        System.out.print("Jurusan : ");
        String jurusan1 = input.nextLine();
        System.out.print("Alamat  : ");
        String alamat1 = input.nextLine();

        
        System.out.println("-- Masukkan data mahasiswa --");
        System.out.print("Nama    : ");
        String nama2 = input.nextLine();
        System.out.print("NIM     : ");
        String nim2 = input.nextLine();
        System.out.print("Jurusan : ");
        String jurusan2 = input.nextLine();
        System.out.print("Alamat  : ");
        String alamat2 = input.nextLine();
        
        System.out.println("-- Masukkan data mahasiswa --");
        System.out.print("Nama    : ");
        String nama3 = input.nextLine();
        System.out.print("NIM     : ");
        String nim3 = input.nextLine();
        System.out.print("Jurusan : ");
        String jurusan3 = input.nextLine();
        System.out.print("Alamat  : ");
        String alamat3 = input.nextLine();
        
        Modul1_SoalNo2 mahasiswa1 = new Modul1_SoalNo2(nama1, nim1, jurusan1, alamat1);
        Modul1_SoalNo2 mahasiswa2 = new Modul1_SoalNo2(nama2, nim2, jurusan2, alamat2);
        Modul1_SoalNo2 mahasiswa3 = new Modul1_SoalNo2(nama3, nim3, jurusan3, alamat3);
            
        System.out.println("=== Daftar Mahasiswa ===");
        System.out.println("- Mahasiswa -1 -");
        mahasiswa1.tampilkanData();
        System.out.println("- Mahasiswa -2 -");
        mahasiswa2.tampilkanData();
        System.out.println("- Mahasiswa -3 -");
        mahasiswa3.tampilkanData();
        System.out.println();
    }
}