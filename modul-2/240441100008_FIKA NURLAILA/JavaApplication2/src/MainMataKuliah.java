/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class MainMataKuliah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MataKuliah mk1 = new MataKuliah("si01", "Pemrograman Dasar", 3);
        System.out.println("=== Daftar Mata Kuliah ===");
        mk1.tampilkanInfo();
        System.out.println();
        MataKuliah mk2 = new MataKuliah("si02", "Logika Informatika", 6);
        mk2.tampilkanInfo();

    }
    
}
