package SoalNo1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class MahasiswaKampus {
    String nama;
    String nim;
    
    public MahasiswaKampus (String nama, String nim){
        this.nama=nama;
        this.nim=nim;
    }
    
    public void infoMahasiswa(){
        System.out.println("Nama        : "+nama);
        System.out.println("Nim         : "+nim);
        
    }
    
}
