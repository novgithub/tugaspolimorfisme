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
 class Jnt extends BiayaTransfer{
    
    @Override
    void setOpsi(){
        String jnt = "Jnt";
        System.out.println("Opsi Pembayaran Jnt: "+jnt);
    }
    
    @Override
    void setBiaya(){
        int biaya = 7000;
        System.out.println("Biaya Pembayaran Jnt: "+biaya+" Rp");
    }
}
