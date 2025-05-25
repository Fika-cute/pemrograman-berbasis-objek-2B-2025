/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul5SoalNo1;

/**
 *
 * @author User
 */
public class manusiaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        manusia joko = new joko();
        manusia beni = new beni();
        manusia fani = new fani();
        manusia jani = new jani();

        System.out.println("--- Joko ---");
        joko.berbicara();
        joko.bekerja();
        joko.makan();
        System.out.println();

        System.out.println("--- Beni ---");
        beni.berbicara();
        beni.bekerja();
        beni.makan();
        System.out.println();

        System.out.println("--- Fani ---");
        fani.berbicara();
        fani.bekerja();
        fani.makan();
        System.out.println();

        System.out.println("--- Jani ---");
        jani.berbicara();
        jani.bekerja();
        jani.makan();
        System.out.println();
    } 
}
