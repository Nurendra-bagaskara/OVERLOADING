/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author ASUS
 */
public class Toko {
    
    //method bunga dan penerapan overloading dan menggunakan parameter
    public void Bunga(int a) {
        System.out.println("=====================================");
        System.out.println("<<< Program Penjualan Bunga Mawar >>>");
        System.out.println("=====================================");
        System.out.println("Hargha Bunga Mawar\t\t : Rp.5000/Tangkai");
        System.out.println("Jumlah Barang Yang dibeli\t : " + a + " Tangkai");
        int total = a * 5000;
        System.out.println("Total harga pembelian adalah\t : " + "Rp." + total);
        System.out.println("");

    }
    
    //method bunga dan penerapan overloading dan menggunakan parameter
    public void Bunga(int a, int b) {
        System.out.println("======================================================");
        System.out.println("<<< Program Penjualan Bunga Mawar Dan Bunga Melati >>>");
        System.out.println("======================================================");
        System.out.println("Hargha Bunga Mawar\t\t : Rp.5000/Tangkai");
        System.out.println("Hargha Bunga Melati\t\t : Rp.6000/Tangkai");
        System.out.println("Jumlah Bunga Mawar Yang dibeli\t : " + a + " Tangkai");
        System.out.println("Jumlah Bunga Melati Yang dibeli\t : " + b + " Tangkai");
        int total = (a * 5000)+(b* 6000);
        System.out.println("Total harga pembelian adalah\t : " + "Rp." + total);
    }
}
