/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalNo2;

/**
 *
 * @author User
 */
public class BukuNonFiksi extends Buku{
    public String topik;
    public static int jumlahNonFiksi = 0;

    public BukuNonFiksi(String judul, String penulis, String topik) {
        super(judul, penulis);
        this.topik = topik;
        jumlahNonFiksi ++;
    }

    public void infoNonFiksi() {
        info();
        System.out.println("Topik : " + topik);
        System.out.println();
    }
    
    public static int Jumlahnonfiksi() {
        return jumlahNonFiksi;
    }
}

