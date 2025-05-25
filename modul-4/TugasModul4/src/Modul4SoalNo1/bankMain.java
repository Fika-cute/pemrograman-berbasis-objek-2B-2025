package Modul4SoalNo1;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.Scanner;

public class bankMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        bank bankSaya = new bank();

        // Data awal
        bankSaya.tambahRekening("987734761234804", "Otong Sarotong", 1000000);
        bankSaya.tambahRekening("234567876555559", "Sukinooo", 1500000);

        boolean Menu = true;
        while (Menu) {
            System.out.println("=== MENU BANK ===");
            System.out.println("1. Tampilkan info nasabah");
            System.out.println("2. Tambah rekening baru");
            System.out.println("3. Setor");
            System.out.println("4. Tarik");
            System.out.println("5. Tambah nasabah baru");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    bankSaya.tampilkanDaftarRekening();
                    break;

                case 2:
                    System.out.print("Masukkan Nama Nasabah yang ingin menambah rekening: ");
                    String namaCari = input.nextLine();
                    ArrayList<rekeningBank> rekeningNasabah = bankSaya.getRekeningByNama(namaCari);
                    if (rekeningNasabah.isEmpty()) {
                        System.out.println("Nasabah belum terdaftar. Silakan daftarkan di menu 5.");
                    } else {
                        System.out.print("Masukkan No Rekening Baru: ");
                        String noBaru = input.nextLine();
                        if (bankSaya.cariRekening(noBaru) != null) {
                            System.out.println("Nomor rekening sudah ada. Gunakan nomor lain.");
                        } else {
                            System.out.print("Masukkan Saldo Awal: ");
                            double saldoBaru = input.nextDouble();
                            input.nextLine();
                            bankSaya.tambahRekening(noBaru, namaCari, saldoBaru);
                            System.out.println("Rekening tambahan berhasil ditambahkan untuk nasabah " + namaCari + ".");
                            System.out.println("Daftar rekening atas nama: " + namaCari);
                            for (rekeningBank rek : bankSaya.getRekeningByNama(namaCari)) {
                                rek.tampilkanInfo();
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.print("Masukkan No Rekening untuk Setor: ");
                    String norekSetor = input.nextLine();
                    System.out.print("Masukkan Jumlah Setoran: ");
                    double jmlSetor = input.nextDouble();
                    input.nextLine();
                    bankSaya.setor(norekSetor, jmlSetor);
                    break;

                case 4:
                    System.out.print("Masukkan No Rekening untuk Tarik: ");
                    String norekTarik = input.nextLine();
                    System.out.print("Masukkan Jumlah Penarikan: ");
                    double jmlTarik = input.nextDouble();
                    input.nextLine();
                    bankSaya.tarik(norekTarik, jmlTarik);
                    break;

                case 5:
                    System.out.print("Masukkan Nama Nasabah: ");
                    String namaBaru = input.nextLine();
                    System.out.print("Masukkan Nomor Rekening: ");
                    String norekBaru = input.nextLine();
                    if (bankSaya.cariRekening(norekBaru) != null) {
                        System.out.println("Nomor rekening sudah digunakan.");
                    } else {
                        System.out.print("Masukkan Saldo Awal (min Rp50.000): ");
                        double saldoAwal = input.nextDouble();
                        input.nextLine();
                        if (saldoAwal >= 50000) {
                            bankSaya.tambahRekening(norekBaru, namaBaru, saldoAwal);
                            System.out.println("Nasabah baru berhasil ditambahkan.");
                        } else {
                            System.out.println("Gagal menambahkan. Saldo minimal Rp50.000.");
                        }
                    }
                    break;

                case 6:
                    Menu = false;
                    System.out.println("Terima kasih telah menggunakan sistem bank.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }
        }
    }
}
