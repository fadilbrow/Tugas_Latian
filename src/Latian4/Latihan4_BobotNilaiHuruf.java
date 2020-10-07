/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4_bobotnilaihuruf;
import java.util.Scanner;
/**
 *
 * @author Fadil
 */
public class Latihan4_BobotNilaiHuruf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String huruf;
        
        System.out.print("Masukkan Huruf = ");
        huruf = scan.nextLine();
        
        switch(huruf){
            case "A":
                System.out.println("4");
                break;
            case "B":
                System.out.println("3");
                break;
            case "C":
                System.out.println("2");
                break;
            case "D":
                System.out.println("1");
                break;
            case "E":
                System.out.println("0");
        }
        
    }
    
}
