/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class MainKampus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kampus k1 = new Kampus("Universitas Trunojoyo", "Madura");
        Kampus k2 = new Kampus("Universitas 123", "bandung"); 
        Kampus k3 = new Kampus("", "Surabaya");

        k1.tampilkandata();
        k2.tampilkandata();
        k3.tampilkandata();

        Kampus.tampilkan();

        
    }
}
