/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */


public class Kampus {
    String namakampus;
    String alamat;

    static int jumlahkampus = 0;

    public Kampus(String namakampus, String alamat) {
        if (namabenar(namakampus)) {
            this.namakampus = namakampus;
            this.alamat = alamat;

            jumlahkampus++;
        } else {
            System.out.println("Nama kampus tidak valid = " + namakampus);
        }
    }

    public void tampilkandata() {
        if (namakampus != null) {
            System.out.println("Nama Kampus = " + namakampus);
            System.out.println("Alamat = " + alamat);
        }
    }

    public static void tampilkan() {
        if (jumlahkampus > 0) {
            System.out.println("Jumlah Kampus = " + jumlahkampus);
            System.out.println("Total Mahasiswa = " + Mahasiswa.tampilkanJumlahMahasiswa());

        } else {
            System.out.println("Tidak ada kampus yang valid.");
        }
    }

    public static boolean namabenar(String nama) {
        return nama != null && !nama.isEmpty() && !nama.matches(".*\\d.*");
    }

    public String Namakampus() {
        return namakampus;
    }

}