/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biayatransfer;

/**
 *
 * @author User
 */
 class Indomaret extends BiayaTransfer{
    
    @Override
    void setOpsi(){
        String indomaret = "Indomaret";
        System.out.println("Opsi Pembayaran Indomaret: "+indomaret);
    }
    
    @Override
    void setBiaya(){
        int biaya = 2500;
        System.out.println("Biaya Pembayaran Indomaret: "+biaya+" Rp");
    }
}
