package Atuy;

import java.util.Scanner;

public class FungsiOperasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka1: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka2: ");
        double angka2 = input.nextDouble();

        FungsiUtama fungsi = new FungsiUtama(angka1, angka2);

        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        System.out.print("Pilihan operasi: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                fungsi.tambah();
                break;
            case 2:
                fungsi.kurang();
                break;
            case 3:
                fungsi.kali();
                break;
            case 4:
                fungsi.bagi();
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
        input.close();
    }
}
