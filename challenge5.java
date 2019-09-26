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
public class challenge5 {
    public static void main(String[] args) {
   System.out.println("Nilai terbesar adalah : " + nilaibil1());
    }
    public static int nilaibil1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan 1 : ");
        int  bil1 = input.nextInt();
        
        System.out.print("Masukkan bilangan 2 : ");
        int bil2 = input.nextInt();
        
        System.out.print("Masukkan bilangan 3 : ");
        int bil3 = input.nextInt();
        
        if(bil1>bil2 && bil1 > bil3) {
            int hasil = (bil1);
            return hasil;
        }else if (bil2>bil1 && bil2>bil3) {
            int hasil = (bil2);
           return hasil;
        }else if ( bil3>bil1 && bil3>bil2) {
            int hasil = (bil3);
            return hasil;
        }
        return 0;
        
    
    }
}
    
    
    
    

