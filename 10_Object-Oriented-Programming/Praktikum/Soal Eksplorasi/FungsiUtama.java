package Atuy;

import java.util.Scanner;

public class FungsiUtama {
    private double angka1;
    private double angka2;

    public FungsiUtama(double angka1, double angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    public double getAngka1() {
        return angka1;
    }

    public void setAngka1(double angka1) {
        this.angka1 = angka1;
    }

    public double getAngka2() {
        return angka2;
    }

    public void setAngka2(double angka2) {
        this.angka2 = angka2;
    }

    public double tambah() {
        double hasilTambah = angka1 + angka2;
        System.out.println("Penjumlahan: " + hasilTambah);
        return hasilTambah;
    }

    public double kurang() {
        double hasilKurang = angka1 - angka2;
        System.out.println("Pengurangan: " + hasilKurang);
        return hasilKurang;
    }

    public double kali() {
        double hasilKali = angka1 * angka2;
        System.out.println("Perkalian: " + hasilKali);
        return hasilKali;
    }

    public double bagi() {
        if (angka2 != 0) {
            double hasilBagi = angka1 / angka2;
            System.out.println("Pembagian: " + hasilBagi);
            return hasilBagi;
        } else {
            System.out.println("Tidak dapat melakukan pembagian oleh nol");
            return Double.NaN;
        }
    }
}
