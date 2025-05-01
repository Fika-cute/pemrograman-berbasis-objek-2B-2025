/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalNo2;

/**
 *
 * @author User
 */
class bukuFiksi extends Buku {
    public String genre;
    public static int jumlahFiksi = 0;

    public bukuFiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        this.genre = genre;
        jumlahFiksi ++;
    }

    public void infoFiksi() {
        info();
        System.out.println("Genre : " + genre);
        System.out.println();
    }
    
    public static int JumlahFiksi() {
        return jumlahFiksi;
    }
}

