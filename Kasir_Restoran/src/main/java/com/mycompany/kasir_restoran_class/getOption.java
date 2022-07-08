package com.mycompany.kasir_restoran_class;
import com.mycompany.kasir_restoran_class.pilihanOne;
import com.mycompany.kasir_restoran_class.pilihanTwo;

import java.util.*;

public class getOption {
    public static int getOption() {
        
        Scanner in = new Scanner(System.in);
        int pilihan;
        
        System.out.println("-------------------------------------------");
        System.out.println("              KASIR RESTORAN             ");
        System.out.println("-------------------------------------------");
        System.out.println("Daftar Makananan :\n");
        System.out.print("1. Ayam Bakar\t\t Rp. 24.000\n2. Ati Ampela Pete\t Rp. 15.000\n3. Ayam Goreng\t\t Rp. 24.000\n4. Cumi balado\t\t Rp. 15.000\n5. Ikan Tongkol\t\t Rp. 25.000\n6. Telor Dadar\t\t Rp. 15.000\n");
        System.out.println("-------------------------------------------");
        System.out.println("Pilih inputan: \n");
        System.out.print("1. pilih satu makanan\n2. Pilih banyak makanan\n\n");
        System.out.print("Masukan pilihan: ");
        pilihan = in.nextInt();
        return pilihan;
    }
    
    public static void validateOption(int pilihan) {
        pilihanOne ob1 = new pilihanOne();
        pilihanTwo ob2 = new pilihanTwo();
        switch(pilihan) {
            case 1: ob1.pilihanOne();
            break;
            case 2: ob2.pilihanTwo();
            break;
            default: 
                System.out.println("pilihan tidak ada!");
            break;
        }
    }
    
    
        
}
