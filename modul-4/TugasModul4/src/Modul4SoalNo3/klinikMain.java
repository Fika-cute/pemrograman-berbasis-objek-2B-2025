/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul4SoalNo3;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class klinikMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        klinik klinikSaya = new klinik();

        boolean running = true;
        while (running) {
            System.out.println("=== MENU KLINIK ===");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Tampilkan Pasien");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            input.nextLine(); // bersihkan newline

            switch (menu) {
                case 1:
                    klinikSaya.tambahPasien(input);
                    break;
                case 2:
                    klinikSaya.tampilkanPasien();
                    break;
                case 3:
                    running = false;
                    System.out.println("Terima kasih, program selesai.");
                    break;
                default:
                    System.out.println("️ Pilihan tidak valid.");
            }
        }
    }
}
