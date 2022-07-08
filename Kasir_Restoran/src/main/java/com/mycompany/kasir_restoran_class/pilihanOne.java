package com.mycompany.kasir_restoran_class;

import java.util.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class pilihanOne {
    public static void pilihanOne() {
        Scanner in = new Scanner(System.in);
        
        String nama_makanan;
        int jumlah_makanan, pilihan;
        double harga_makanan, total_harga, harga_utama, uang, kembalian;
        boolean diskon;
        
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        System.out.println("-------------------------------------------");
        System.out.print("Masukan no makanan --> ");
        pilihan = in.nextInt();
        System.out.print("Masukan Qty --> ");
        jumlah_makanan = in.nextInt();
        switch(pilihan) {
            case 1 :
                nama_makanan = "Ayam Bakar";
                harga_makanan = 24000;
                total_harga = calculatePrice(jumlah_makanan, harga_makanan);
                System.out.printf("Total harga: %s \n", kursIndonesia.format(total_harga));
                diskon = validationDiscont(jumlah_makanan, harga_makanan);
                if (diskon == true) {
                    System.out.println("Anda mendapatkan diskon 7.5%");
                    harga_utama = presentaseDiscont(harga_makanan, total_harga);   
                } else {
                    harga_utama = total_harga;
                }
                System.out.printf("Harga yang harus anda bayar: %s \n", kursIndonesia.format(harga_utama));
                System.out.println("-------------------------------------------");
                System.out.print("Bayar --> ");
                uang = in.nextDouble();
                if (uang >= harga_utama) {
                    System.out.println("Pembayaran berhasil");
                    kembalian = uang - harga_utama;
                    System.out.printf("kembalian : %s \n", kursIndonesia.format(kembalian));
                    System.out.println("\n\nBerikut note transaksi\n");
                    printNote(nama_makanan, jumlah_makanan, harga_makanan, harga_utama, uang, kembalian);
                } else {
                    System.out.println("Maaf uang anda tidak cukup\n");
                }
                
            break;
            case 2 :
                nama_makanan = "Ati Ampela Pete";
                harga_makanan = 15000;
                total_harga = calculatePrice(jumlah_makanan, harga_makanan);
                System.out.printf("Total harga: %s \n", kursIndonesia.format(total_harga));
                diskon = validationDiscont(jumlah_makanan, harga_makanan);
                if (diskon == true) {
                    System.out.println("Anda mendapatkan diskon 7.5%");
                    harga_utama = presentaseDiscont(harga_makanan, total_harga);    
                } else {
                    harga_utama = total_harga;
                }
                System.out.printf("Harga yang harus anda bayar: %s \n", kursIndonesia.format(harga_utama));
                System.out.println("-------------------------------------------");
                System.out.print("Bayar --> ");
                uang = in.nextDouble();
                if (uang >= harga_utama) {
                    System.out.println("Pembayaran berhasil");
                    kembalian = uang - harga_utama;
                    System.out.printf("kembalian : %s \n", kursIndonesia.format(kembalian));
                    System.out.println("\n\nBerikut note transaksi\n");
                    printNote(nama_makanan, jumlah_makanan, harga_makanan, harga_utama, uang, kembalian);
                } else {
                    System.out.println("Maaf uang anda tidak cukup\n");
                }
            break;
            case 3 :
                nama_makanan = "Ayam Goreng";
                harga_makanan = 24000;
                total_harga = calculatePrice(jumlah_makanan, harga_makanan);
                System.out.printf("Total harga: %s \n", kursIndonesia.format(total_harga));
                diskon = validationDiscont(jumlah_makanan, harga_makanan);
                if (diskon == true) {
                    System.out.println("Anda mendapatkan diskon 7.5%");
                    harga_utama = presentaseDiscont(harga_makanan, total_harga);    
                } else {
                    harga_utama = total_harga;
                }
                System.out.printf("Harga yang harus anda bayar: %s \n", kursIndonesia.format(harga_utama));
                System.out.println("-------------------------------------------");
                System.out.print("Bayar --> ");
                uang = in.nextDouble();
                if (uang >= harga_utama) {
                    System.out.println("Pembayaran berhasil");
                    kembalian = uang - harga_utama;
                    System.out.printf("kembalian : %s \n", kursIndonesia.format(kembalian));
                    System.out.println("\n\nBerikut note transaksi\n");
                    printNote(nama_makanan, jumlah_makanan, harga_makanan, harga_utama, uang, kembalian);
                } else {
                    System.out.println("Maaf uang anda tidak cukup\n");
                }
            break;
            case 4 :
                nama_makanan = "Cumi balado";
                harga_makanan = 15000;
                total_harga = calculatePrice(jumlah_makanan, harga_makanan);
                System.out.printf("Total harga: %s \n", kursIndonesia.format(total_harga));
                diskon = validationDiscont(jumlah_makanan, harga_makanan);
                if (diskon == true) {
                    System.out.println("Anda mendapatkan diskon 7.5%");
                    harga_utama = presentaseDiscont(harga_makanan, total_harga);    
                } else {
                    harga_utama = total_harga;
                }
                System.out.printf("Harga yang harus anda bayar: %s \n", kursIndonesia.format(harga_utama));
                System.out.println("-------------------------------------------");
                System.out.print("Bayar --> ");
                uang = in.nextDouble();
                if (uang >= harga_utama) {
                    System.out.println("Pembayaran berhasil");
                    kembalian = uang - harga_utama;
                    System.out.printf("kembalian : %s \n", kursIndonesia.format(kembalian));
                    System.out.println("\n\nBerikut note transaksi\n");
                    printNote(nama_makanan, jumlah_makanan, harga_makanan, harga_utama, uang, kembalian);
                } else {
                    System.out.println("Maaf uang anda tidak cukup\n");
                }
            break;
            case 5 :
                nama_makanan = "Ikan Tongkol";
                harga_makanan = 25000;
                total_harga = calculatePrice(jumlah_makanan, harga_makanan);
                System.out.printf("Total harga: %s \n", kursIndonesia.format(total_harga));
                diskon = validationDiscont(jumlah_makanan, harga_makanan);
                if (diskon == true) {
                    System.out.println("Anda mendapatkan diskon 7.5%");
                    harga_utama = presentaseDiscont(harga_makanan, total_harga);    
                } else {
                    harga_utama = total_harga;
                }
                System.out.printf("Harga yang harus anda bayar: %s \n", kursIndonesia.format(harga_utama));
                System.out.println("-------------------------------------------");
                System.out.print("Bayar --> ");
                uang = in.nextDouble();
                if (uang >= harga_utama) {
                    System.out.println("Pembayaran berhasil");
                    kembalian = uang - harga_utama;
                    System.out.printf("kembalian : %s \n", kursIndonesia.format(kembalian));
                    System.out.println("\n\nBerikut note transaksi\n");
                    printNote(nama_makanan, jumlah_makanan, harga_makanan, harga_utama, uang, kembalian);
                } else {
                    System.out.println("Maaf uang anda tidak cukup\n");
                }
            break;
            case 6 :
                nama_makanan = "Telor Dadar";
                harga_makanan = 15000;
                total_harga = calculatePrice(jumlah_makanan, harga_makanan);
                System.out.printf("Total harga: %s \n", kursIndonesia.format(total_harga));
                diskon = validationDiscont(jumlah_makanan, harga_makanan);
                if (diskon == true) {
                    System.out.println("Anda mendapatkan diskon 7.5%");
                    harga_utama = presentaseDiscont(harga_makanan, total_harga);    
                } else {
                    harga_utama = total_harga;
                }
                System.out.printf("Harga yang harus anda bayar: %s \n", kursIndonesia.format(harga_utama));
                System.out.println("-------------------------------------------");
                System.out.print("Bayar --> ");
                uang = in.nextDouble();
                if (uang >= harga_utama) {
                    System.out.println("Pembayaran berhasil");
                    kembalian = uang - harga_utama;
                    System.out.printf("kembalian : %s \n", kursIndonesia.format(kembalian));
                    System.out.println("\n\nBerikut note transaksi\n");
                    printNote(nama_makanan, jumlah_makanan, harga_makanan, harga_utama, uang, kembalian);
                } else {
                    System.out.println("Maaf uang anda tidak cukup\n");
                }
            break;
            default :
                System.out.println("Makanan tidak ada\n");
        }
    }
    
    public static boolean validationDiscont(int jumlah_makanan, double harga_makanan) {
        double harga = harga_makanan * jumlah_makanan;
        if (harga >= 100000) {
            return true;
        } else {
            return false;
        }
    }
    
    public static double calculatePrice(int jumlah_makanan, double harga_makanan) {
        double harga = harga_makanan * jumlah_makanan;
        return harga;
    }
    
    public static double presentaseDiscont(double harga_makanan, double total_harga) {
        double diskon = harga_makanan * 7.5 / 100;
        double harga_utama = total_harga - diskon;
        return harga_utama;
    }
    
    public static void printNote(String nama_makanan, int jumlah_makanan, double harga_makanan, double harga_utama, double uang, double kembalian) {
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("                                     Note Pembelian                                      ");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("\tNama makanan        | Jumlah |\tHarga makanan       |\tTotal harga              ");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("\t%-20s", nama_makanan);
        System.out.printf("\t%-5d", jumlah_makanan);
        System.out.printf("\t%-20s", kursIndonesia.format(harga_makanan));
        System.out.printf("\t%-20s\n\n", kursIndonesia.format(harga_utama));
        System.out.printf("\t\t\t\t\t\t\t\tUang awal : %s\n", kursIndonesia.format(uang));
        System.out.printf("\t\t\t\t\t\t\t\tKembalian : %s\n", kursIndonesia.format(kembalian));
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("                                     Terimakasih                                         ");
        System.out.println("-----------------------------------------------------------------------------------------\n");
    }
}
