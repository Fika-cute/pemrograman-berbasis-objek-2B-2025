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

public class bank {
    private ArrayList<rekeningBank> daftarRekening;

    public bank() {
        daftarRekening = new ArrayList<>();
    }

    public void tambahRekening(String noRek, String nama, double saldoAwal) {
        if (cariRekening(noRek) == null) {
            daftarRekening.add(new rekeningBank(noRek, nama, saldoAwal));
            System.out.println("Rekening berhasil ditambahkan.");
        } else {
            System.out.println("Nomor rekening sudah ada.");
        }
    }

    public rekeningBank cariRekening(String noRek) {
        for (rekeningBank rek : daftarRekening) {
            if (rek.getNoRekening().equals(noRek)) {
                return rek;
            }
        }
        return null;
    }

    public void setor(String noRek, double jumlah) {
        rekeningBank rek = cariRekening(noRek);
        if (rek != null) {
            rek.setor(jumlah);
            System.out.println("Setoran berhasil.");
        } else {
            System.out.println("Rekening tidak ditemukan.");
        }
    }

    public void tarik(String noRek, double jumlah) {
        rekeningBank rek = cariRekening(noRek);
        if (rek != null) {
            if (rek.tarik(jumlah)) {
                System.out.println("Penarikan berhasil.");
            } else {
                System.out.println("Saldo tidak mencukupi.");
            }
        } else {
            System.out.println("Rekening tidak ditemukan.");
        }
    }

    public void tampilkanDaftarRekening() {
        if (daftarRekening.isEmpty()) {
            System.out.println("Belum ada rekening.");
        } else {
            System.out.println("--- Daftar Rekening Nasabah ---");
            System.out.println();
            for (rekeningBank rek : daftarRekening) {
                rek.tampilkanInfo();
            }
        }
    }

    public ArrayList<rekeningBank> getRekeningByNama(String nama) {
        ArrayList<rekeningBank> hasil = new ArrayList<>();
        for (rekeningBank rek : daftarRekening) {
            if (rek.getNamaPemilik().equals(nama)) {
                hasil.add(rek);
            }
        }
        return hasil;
    }

}



