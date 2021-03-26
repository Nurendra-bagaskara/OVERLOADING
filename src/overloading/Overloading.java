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
public class Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // objek pemanggilan class toko
        Toko masuk =new Toko();
        masuk.Bunga(4);
        masuk.Bunga(3, 2);
    }
    
}
