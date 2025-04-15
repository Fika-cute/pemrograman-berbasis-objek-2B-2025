/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    ArrayList<String> MataKuliah;

    private static int jumlahMahasiswa = 2;

    public Mahasiswa(String nama, String nim, String prodi) {
        if (!NIMValid(nim)) {
            System.out.println("NIM tidak valid. Harus dimulai dengan '23'");
        }
        if (!PNIMValid(nim)){
            System.out.println("Nim tidak valid. Harus 10 digit");
        }
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.MataKuliah = new ArrayList<>();
        jumlahMahasiswa++;
        
    }

    // Menambahkan mata kuliah ke daftar
    public void tambahMataKuliah(String mataKuliah) {
        MataKuliah.add(mataKuliah);
    }

    // Menampilkan biodata lengkap beserta daftar mata kuliah
    public void tampilkanBiodata() {
        System.out.println("Nama       : " + nama);
        System.out.println("NIM        : " + nim);
        System.out.println("Prodi      : " + prodi);
        System.out.println("Mata Kuliah yang diambil:");
        for (String mk : MataKuliah) {
            System.out.println(" - " + mk);
        }
    }

    // Method khusus (class method) untuk menampilkan jumlah mahasiswa
    public static int tampilkanJumlahMahasiswa() {
        System.out.println("Total Mahasiswa yang telah dibuat: " + jumlahMahasiswa);
        return jumlahMahasiswa;
    }

    // Method statis untuk validasi NIM
    public static boolean NIMValid(String nim) {
        return nim.startsWith("23") && nim.matches("\\d+");
    }
    
    public static boolean PNIMValid(String nim) {
        return nim.length() ==10;
    }
    
}
