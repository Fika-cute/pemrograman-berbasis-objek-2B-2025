/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class MainMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa m1 = new Mahasiswa("Fika", "23044118", "Informatika");
        m1.tambahMataKuliah("Pemrograman Java");
        m1.tambahMataKuliah("Struktur Data");
        m1.tambahMataKuliah("ALgoritma");
        m1.tambahMataKuliah("make over badut");
        System.out.println("=== Biodata Mahasiswa ===");
        System.out.println("Mahasiswa -1");
        m1.tampilkanBiodata();
        System.out.println();

        Mahasiswa m2 = new Mahasiswa("Laila", "2304411002", "Sistem Informasi");
        m2.tambahMataKuliah("Basis Data");
        m2.tambahMataKuliah ("Basis Web");
        m2.tambahMataKuliah("Data bace");
        m2.tambahMataKuliah("DUHHHHHH");
        System.out.println("Mahasiswa -2");
        m2.tampilkanBiodata();
        System.out.println();
        
        Mahasiswa m3 = new Mahasiswa("Nur", "240441100001", "Industri");
        m3.tambahMataKuliah("Arsitektur Bangunan");
        m3.tambahMataKuliah ("Pengelolaan tanah");
        m3.tambahMataKuliah("rumah bubar");
        m3.tambahMataKuliah ("tanah gambut");
        System.out.println("Mahasiswa -3");
        m3.tampilkanBiodata();
        System.out.println();
        
        Mahasiswa m4 = new Mahasiswa("josa", "2404411028", "Elektro");
        m4.tambahMataKuliah("Kesetrum");
        m4.tambahMataKuliah ("Salah megang hati");
        m4.tambahMataKuliah("kehujanan");
        m4.tambahMataKuliah ("cintaaaaaaaaaa");
        System.out.println("Mahasiswa -4");
        m4.tampilkanBiodata();
        System.out.println();
        
        Mahasiswa m5 = new Mahasiswa("sinka", "2304411028", "Sistem Informasi");
        m5.tambahMataKuliah("Statistik");
        m5.tambahMataKuliah ("Manajemen");
        m5.tambahMataKuliah("bisnos");
        m5.tambahMataKuliah ("hmmmmmmm");
        System.out.println("Mahasiswa -5");
        m5.tampilkanBiodata();
        System.out.println();
        
        Mahasiswa m6 = new Mahasiswa("asya", "2504411001", "Mekantro");
        m6.tambahMataKuliah("Robot bot bot bot");
        m6.tambahMataKuliah ("ngga tau");
        m6.tambahMataKuliah("permobilan listrik");
        m6.tambahMataKuliah ("permotor tekotekan");
        System.out.println("Mahasiswa -6");
        m6.tampilkanBiodata();
        System.out.println();

        Mahasiswa.tampilkanJumlahMahasiswa();
    }
    
}
