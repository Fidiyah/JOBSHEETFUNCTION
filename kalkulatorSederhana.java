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

public class kalkulatorSederhana {
    public static void main(String[] args) {
        System.out.println("Hasil penjumlahannya adalah :" + jumlahan(4,10));
        System.out.println("Hasil pengurangannya adalah : " + kurangan(40, 20));
        System.out.println("Hasil perkaliannya adalah : " + kali(20,2));
        System.out.println("Hasil pembagiannya adalah : " + bagi(8,2));
        System.out.println("Sisa hasil baginya adalah : "+ modulus(5,3));
    }
    public static double jumlahan(int bil1 , int bil2) {
        System.out.println("--PENJUMLAHAN--");
        bil1 = 4;
        bil2 = 10;
        double total = bil1 + bil2;
        return total;
    }
    public static double kurangan(int a , int b) {
        System.out.println("--PENGURANGAN--");
        a = 40;
        b =20;
        double hasil = a-b;
        return hasil;
    }
    public static double kali(int a , int b) {
        System.out.println("--PERKALIAN--");
        a = 20;
        b = 2;
        double hasil = a*b;
        return hasil;
    }
    public static double bagi( int p , int q) {
        System.out.println("--PEMBAGIAN--");
         p = 8;
         q = 2;
        double total = p/q;
        return total;
    }
    public static double modulus(int x , int y) {
        System.out.println("--MODULUS--");
         x = 3;
        y =5;
        if(x>y) {
            int hasil = x%y;
            return hasil;
        }else if (x <y){
            System.out.println("hasil error 404");
            
        }
        return 0;
    
    
}
}



    




            


            
    


            
    

    



