/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet12;

/**
 *
 * @author asd
 */
import java.util.Scanner;
public class challenge4 {
    public static void main(String[] args) {
        System.out.println("kecepatan : " + cepat() + " km / jam ");
    }
    public static double cepat() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jarak :");
        int jarak = input.nextInt();
        
        
        System.out.print("Masukkan waktu tempuh :");
        int waktu = input.nextInt();
        int cepat = jarak/waktu;
        return cepat;
        
    
        
    }
    
    
}
