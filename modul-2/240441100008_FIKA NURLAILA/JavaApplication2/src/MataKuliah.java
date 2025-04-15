/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class MataKuliah {
    String kode;
    String nama;
    int sks;

    public MataKuliah(String kode, String nama, int sks) {
        if (!DSKSValid(sks)) {
            System.out.println("Tidak Valid, Jumlah SKS kurang dari 2");
        }
        if (!TSKSValid(sks)){
            System.out.println("Tidak Valid, Jumlah SKS lebih dari 3");
        }
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public static boolean DSKSValid(int sks) {
        return sks >= 2 ;
    }
    
    public static boolean TSKSValid(int sks) {
        return sks <= 3 ;
    }

    public void tampilkanInfo() {
        System.out.println(kode + " - " + nama + " (" + sks + " SKS)");
    }
}

