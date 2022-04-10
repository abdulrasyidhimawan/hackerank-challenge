import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int saldo = in.nextInt();
        int tambah = in.nextInt();
        System.out.println(output(saldo,tambah));
    }
    static double output(int saldo,int tambah){
    int total = saldo+tambah;
    double bonus = total*0.05/100;
    double temp = total-7003.5;
    double hasil = temp+bonus;
        return hasil;
    }
    }
