package com.mycompany.kasir_restoran_class;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

public class pilihanTwo {
    public static void pilihanTwo() {
        
        Scanner in = new Scanner(System.in);
        
        int [] jumlah, pilihan;
        String [][] tumpukan_list_makanan;
        boolean diskon;
        double total_harga = 0, uang = 0, kembalian = 0;
        
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        
        System.out.println("-------------------------------------------");
        System.out.print("Mau berapa makanan --> ");
        int inp = in.nextInt();
        jumlah = new int [inp];
        pilihan = new int[6];
        tumpukan_list_makanan = new String [inp][5];
        for (int i = 0; i < jumlah.length; i++) {
            System.out.println("-------------------------------------------");
            System.out.printf("Masukan Data Makanan ke --> %d\n", i+1);
            System.out.print("Masukan No Makanan --> ");
            pilihan[i] = in.nextInt();
            System.out.print("Masukan Qty --> ");
            jumlah[i] = in.nextInt();
            switch(pilihan[i]) {
                case 1:
                    tumpukan_list_makanan[i][0] = "Ayam Bakar";
                    tumpukan_list_makanan[i][1] = jumlah[i] + "";
                    tumpukan_list_makanan[i][2] = "24000";                    
                    tumpukan_list_makanan[i][3] = hitungTotal(tumpukan_list_makanan[i][1], tumpukan_list_makanan[i][2]);
                    tumpukan_list_makanan[i][4] = tumpukan_list_makanan[i][3];
                break;
                case 2:
                    tumpukan_list_makanan[i][0] = "Ati Ampela Pete";
                    tumpukan_list_makanan[i][1] = jumlah[i] + "";
                    tumpukan_list_makanan[i][2] = "15000";
                    tumpukan_list_makanan[i][3] = hitungTotal(tumpukan_list_makanan[i][1], tumpukan_list_makanan[i][2]);
                    tumpukan_list_makanan[i][4] = tumpukan_list_makanan[i][3];
                break;
                case 3:
                    tumpukan_list_makanan[i][0] = "Ayam Goreng";
                    tumpukan_list_makanan[i][1] = jumlah[i] + "";
                    tumpukan_list_makanan[i][2] = "24000";
                    tumpukan_list_makanan[i][3] = hitungTotal(tumpukan_list_makanan[i][1], tumpukan_list_makanan[i][2]);
                    tumpukan_list_makanan[i][4] = tumpukan_list_makanan[i][3];
                break;
                case 4:
                    tumpukan_list_makanan[i][0] = "Cumi balado";
                    tumpukan_list_makanan[i][1] = jumlah[i] + "";
                    tumpukan_list_makanan[i][2] = "15000";
                    tumpukan_list_makanan[i][3] = hitungTotal(tumpukan_list_makanan[i][1], tumpukan_list_makanan[i][2]);
                    tumpukan_list_makanan[i][4] = tumpukan_list_makanan[i][3];
                break;
                case 5:
                    tumpukan_list_makanan[i][0] = "Ikan Tongkol";
                    tumpukan_list_makanan[i][1] = jumlah[i] + "";
                    tumpukan_list_makanan[i][2] = "25000";
                    tumpukan_list_makanan[i][3] = hitungTotal(tumpukan_list_makanan[i][1], tumpukan_list_makanan[i][2]);
                    tumpukan_list_makanan[i][4] = tumpukan_list_makanan[i][3];
                break;
                case 6:
                    tumpukan_list_makanan[i][0] = "Telor Dadar";
                    tumpukan_list_makanan[i][1] = jumlah[i] + "";
                    tumpukan_list_makanan[i][2] = "15000";
                    tumpukan_list_makanan[i][3] = hitungTotal(tumpukan_list_makanan[i][1], tumpukan_list_makanan[i][2]);
                    tumpukan_list_makanan[i][4] = tumpukan_list_makanan[i][3];
                break;
                default:
                    System.out.println("maaf menu tidak ada.");
            }
        }
        
        for (int i=0; i < tumpukan_list_makanan.length;i++) {
            total_harga += Double.parseDouble(tumpukan_list_makanan[i][4]);
        }
        System.out.println("-------------------------------------------");
        if (total_harga >= 100000) {
            System.out.println("Anda mendapatkan diskon 7.5%");
            total_harga = total_harga - (total_harga * 7.5 / 100);
        }
        System.out.printf("Total harga: %s\n", kursIndonesia.format(total_harga));
        System.out.println("-------------------------------------------");
        System.out.print("Bayar --> ");
        uang = in.nextDouble();
        if (uang >= total_harga) {
            System.out.println("Pembayaran berhasil");
            kembalian = uang - total_harga;
            System.out.printf("Kembalian %s\n\n", kursIndonesia.format(kembalian));
            System.out.println("Berikut nota transaksi\n");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("                                     Note Pembelian                                      ");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("\tNama makanan        | Jumlah |\tHarga makanan       |\tTotal harga              ");
            System.out.println("-----------------------------------------------------------------------------------------");
            for (int i = 0; i < tumpukan_list_makanan.length; i++) {
                System.out.printf("\t%-20s", tumpukan_list_makanan[i][0]);
                System.out.printf("\t%-5s", tumpukan_list_makanan[i][1]);
                System.out.printf("\t%-20s", tumpukan_list_makanan[i][2]);
                System.out.printf("\t%-20s\n\n", tumpukan_list_makanan[i][4]);
            }
            System.out.printf("\t\t\t\t\t\t\t\tTotal harga semua : %s\n", kursIndonesia.format(total_harga));
            System.out.printf("\t\t\t\t\t\t\t\tUang awal : %s\n", kursIndonesia.format(uang));
            System.out.printf("\t\t\t\t\t\t\t\tKembalian : %s\n", kursIndonesia.format(kembalian));
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("                                     Terimakasih                                         ");
            System.out.println("-----------------------------------------------------------------------------------------\n");
        } else {
            System.out.println("Maaf uang anda tidak cukup.");
        }
        
        
    }
    
    public static String hitungTotal(String jml, String hrg) {
        int jumlah = Integer.parseInt(jml);
        double harga = Double.parseDouble(hrg);
        double totalHarga = harga * jumlah;
        String result = totalHarga + "";
        return result;
    }
    
//    public static boolean cekDiskon(String totalHrg) {
//        double harga = Double.parseDouble(totalHrg);
//        
//        if (harga >= 100000) {
//            return true;
//        } else {
//            return false;
//        }
//    }
    
//    public static String generateHargaBayar(String hargaBarang, String totalHarga) {
//        double hargaBrng = Double.parseDouble(hargaBarang);
//        double totalHrg = Double.parseDouble(totalHarga);
//        
//        double diskon = hargaBrng * 7.5 / 100;
//        double hrgUtama = totalHrg - diskon;
//        String result = hrgUtama + "";
//        
//        return result;
//    }
}
