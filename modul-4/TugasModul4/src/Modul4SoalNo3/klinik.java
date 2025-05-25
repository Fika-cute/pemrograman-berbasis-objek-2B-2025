/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul4SoalNo3;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class klinik {
    private ArrayList<pasien> daftarPasien;

    public klinik() {
        daftarPasien = new ArrayList<>();
        // Data awal
        daftarPasien.add(new pasien("fika", 18, "error"));
        daftarPasien.add(new pasien("josa", 19, "demam PBW"));
        daftarPasien.add(new pasien("hema", 20, "demam PDD"));
        daftarPasien.add(new pasien("istii", 19, "Gamon jung-jaeehyun"));
    }

    public void tambahPasien(Scanner input) {
        System.out.print("Masukkan nama pasien: ");
        String nama = input.nextLine();
        System.out.print("Masukkan umur pasien: ");
        int umur = input.nextInt();
        input.nextLine(); // membersihkan enter
        System.out.print("Masukkan keluhan: ");
        String keluhan = input.nextLine();

        daftarPasien.add(new pasien(nama, umur, keluhan));
        System.out.println(" Pasien berhasil ditambahkan.");
    }

    public void tampilkanPasien() {
        if (daftarPasien.isEmpty()) {
            System.out.println("Belum ada data pasien.");
        } else {
            System.out.println("--- Daftar Pasien ---");
            int index = 1;
            for (pasien p : daftarPasien) {
                System.out.println("Pasien " + index++);
                System.out.println(" Nama   : " + p.getNama());
                System.out.println(" Umur   : " + p.getUmur());
                System.out.println(" Keluhan: " + p.getKeluhan());
                System.out.println();
            }
        }
    }
}
