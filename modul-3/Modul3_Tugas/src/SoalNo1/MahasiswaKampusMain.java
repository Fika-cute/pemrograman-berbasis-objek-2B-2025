package SoalNo1;


import SoalNo1.MahasiswaReguler;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class MahasiswaKampusMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MahasiswaReguler mr1 = new MahasiswaReguler ("Fika","24001","R304");
        MahasiswaReguler mr2 = new MahasiswaReguler ("nur","24002","R309");
        MahasiswaReguler mr3 = new MahasiswaReguler ("laila","24003","R307");
        
        System.out.println("== Mahasiswa Reguler ==");
        System.out.println();
        mr1.infoReguler();
        mr2.infoReguler();
        mr3.infoReguler();
        System.out.println();
        
        MahasiswaBeasiswa mb1 = new MahasiswaBeasiswa("bambang","25001","bank BRI");
        MahasiswaBeasiswa mb2 = new MahasiswaBeasiswa("alfa","25002","KIP Kuliah");
        MahasiswaBeasiswa mb3 = new MahasiswaBeasiswa("faris","25003","Daerah");
        System.out.println("== Mahasiswa Beasiswa ==");
        System.out.println();
        mb1.infoBeasiswa();
        mb2.infoBeasiswa();
        mb3.infoBeasiswa();
    }
    
}
