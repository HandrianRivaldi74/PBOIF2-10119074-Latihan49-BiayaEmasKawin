/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10119074.latihan49.biayaemaskawin;

/**
 *
 * @author Acer
 * Nama      : HANDRIAN RIVALDI
 * Kelas     : PBOIF2
 * NIM       : 10119074
 * Deskrifsi : 
 */
public class IF210119074Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BiayaEmasKawin emasKawin = new BiayaEmasKawin("Hendi");

        emasKawin.setEmas(15.7);
        emasKawin.setHarga(570000.0);
        double emas = emasKawin.getEmas();
        double harga = emasKawin.getHarga();
        System.out.println("Jumlah Emas yang akan di beli : " + emas + " gram");
        System.out.println("Harga Emas Per/Gram           : Rp. " + harga);
        System.out.println("Total Bayar                   : Rp. "  + emasKawin.totalBayar(emas, harga));
    
    }
    
}
