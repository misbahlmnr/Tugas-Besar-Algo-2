package com.mycompany.kasir_restoran;

import com.mycompany.kasir_restoran_class.getOption;
import java.util.*;

public class Kasir_Restoran {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan;
        boolean status = true;
        getOption ob = new getOption();
        
        while (status) {
            pilihan = ob.getOption();
            ob.validateOption(pilihan);
            status = getYesOrNo("Lakukan transaksi lagi");
        } 
        System.out.println("Terimakasih1");
    }
    
    public static boolean getYesOrNo(String message) {
        Scanner in = new Scanner(System.in);
        
        System.out.print(""+message+" (y/n) ");
        String pilihan = in.next();
        
        while (!pilihan.equalsIgnoreCase("y") && !pilihan.equalsIgnoreCase("n")) {
            System.err.println("pilihan anda bukan y/n. Silahkan pilih dengan benar");
            System.out.print("\n"+message+" (y/n) ");
            pilihan = in.next();
        }
        return pilihan.equalsIgnoreCase("y");
    }
}
