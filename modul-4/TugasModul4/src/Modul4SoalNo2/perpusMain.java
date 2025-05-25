/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul4SoalNo2;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class perpusMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        perpustakaan perpustakaan = new perpustakaan();

        boolean berjalan = true;
        while (berjalan) {
            System.out.println();
            System.out.println("=== MENU PERPUSTAKAAN ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Daftar Buku");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            int pilih = input.nextInt();
            input.nextLine(); // Bersihkan newline

            if (pilih == 1) {
                perpustakaan.tambahBuku();
            } else if (pilih == 2) {
                perpustakaan.tampilkanBuku();
            } else if (pilih == 3) {
                berjalan = false;
                System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
            } else {
                System.out.println("Menu tidak valid.");
            }
        }
    }
}
