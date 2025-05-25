/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul5SoalNo2;

/**
 *
 * @author User
 */
public class mobilMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        manajemenMobil manajemen = new manajemenMobil();
        
        mobil sedan = new mobilSedan();
        mobil sport = new mobilSport();
        
        manajemen.tambah_mobil(sedan);
        manajemen.tambah_mobil(sport);

        manajemen.operasikan_semua_mobil();
    }
    
}
