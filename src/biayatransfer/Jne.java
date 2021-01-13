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
class Jne extends BiayaTransfer{
    
    @Override
    void setOpsi(){
        String jne = "Jne";
        System.out.println("Opsi Pembayaran Jne: "+jne);
    }
    
    @Override
    void setBiaya(){
        int biaya = 9000;
        System.out.println("Biaya Pembayaran Jne: "+biaya+" Rp");
    }
}
