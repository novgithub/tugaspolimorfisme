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
class Alfamart extends BiayaTransfer{
    
    @Override
    void setOpsi(){
        String alfamart = "Alfamart";
        System.out.println("Opsi Pembayaran Alfamart: "+alfamart);
    }
    
    @Override
    void setBiaya(){
        int biaya = 2500;
        System.out.println("Biaya Pembayaran Alfamart: "+biaya+" Rp");
    }
}
