/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1_kelulusan1;
import java.util.Scanner;
/**
 *
 * @author Fadil
 */
public class Latihan1_Kelulusan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Masukkan nama anda = ");
        String nama = inp.next();
        
        System.out.print("Masukkan NIM = ");
        String nim = inp.next();
        
        System.out.print("Masukkan Nilai = ");
        int nilai = inp.nextInt();
        
        System.out.println("-----HASIL-----");

        System.out.println("Masukkan nama anda = "+nama);
        System.out.println("Masukkan NIM = "+nim);
        System.out.println("Masukkan Nilai = "+nilai);
        
        if(nilai > 75){
            System.out.println("Selamat anda lulus");
        } else if(nilai < 75){
            System.out.println("Anda tidak lulus");
        }
    }
    
}