package Modul4SoalNo1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class rekeningBank {
    private String noRekening;
    private String nasabah;
    private double saldo;

    public rekeningBank(String noRekening, String nasabah, double saldoAwal) {
        this.noRekening = noRekening;
        this.nasabah = nasabah;
        this.saldo = saldoAwal;
    }

    //getter
    public String getNoRekening() {
        return noRekening;
    }

    public String getNamaPemilik() {
        return nasabah;
    }

    public double getSaldo() {
        return saldo;
    }

    //setter
    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
        }
    }

    public boolean tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }

    public void tampilkanInfo() {
        System.out.println("No Rekening: " + noRekening);
        System.out.println("Nama : " + nasabah);
        System.out.println("Saldo: Rp" + saldo);
        System.out.println("------------------------");
        System.out.println();
    }
}


