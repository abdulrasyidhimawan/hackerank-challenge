import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);
        byte menu = in.nextByte();
         if( menu == 1){
            int sisi = in.nextInt();
            if(sisi < 128 && sisi >= 0){
                 System.out.println(persegi(sisi));
            }else{
                System.out.println("Input yang anda masukan tidak sesuai");
            }
           
        }else if(menu == 2){
            int alas = in.nextInt();
            int tinggi = in.nextInt();
            if(alas <128 && tinggi <128 && alas >= 0 && tinggi >= 0){
                 System.out.println( segitiga(alas,tinggi));
            }else{
                System.out.println("Input yang anda masukan tidak sesuai");
            }
           
        }else if(menu == 3){
            int jari = in.nextInt();
            if(jari < 128 && jari >= 0){
              int wert= (int) lingkaran(jari);
                System.out.println((double)wert);
            }else{
                System.out.println("Input yang anda masukan tidak sesuai");
            }
            
        }else{
        System.out.println("Input yang anda masukan tidak sesuai");
        }
    } 
    
     
     static int persegi(int sisi){
         int hasil = sisi*sisi;
         return hasil;
     }
     static int segitiga(int alas, int tinggi){
         int hasil = alas*tinggi/2;
         return hasil;
     }
     static double lingkaran(int jari){
         double hasil;
         if (jari % 7 == 0){
             hasil = 22/7*jari*jari;
         } else{
             
             hasil = 3.14*jari*jari;
         }
         return hasil;
    }
}
