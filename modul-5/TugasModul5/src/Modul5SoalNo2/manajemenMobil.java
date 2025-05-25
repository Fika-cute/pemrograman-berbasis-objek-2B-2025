/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5SoalNo2;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class manajemenMobil {
    private ArrayList<mobil> daftarMobil;

    public manajemenMobil() {
        daftarMobil = new ArrayList<>();
    }

    public void tambah_mobil(mobil mobil) {
        daftarMobil.add(mobil);
    }

    public void operasikan_semua_mobil() {
        System.out.println("=== Operasi Semua Mobil ===");
        for (mobil mobil : daftarMobil) {
            mobil.nyalakanMesin();
            mobil.matikanMesin();
            System.out.println(); // Spasi antar mobil
        }
    }
}
