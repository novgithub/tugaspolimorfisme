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
public class Main {
    
    public static void main(String[] args) {
        System.out.println("===BIAYA TRANSFER DEFAULT===");
        BiayaTransfer b = new BiayaTransfer();
        b.setOpsi();
        b.setBiaya();
        
        System.out.println("===BIAYA TRANSFER INDOMARET===");
        BiayaTransfer i = new Indomaret();
        i.setOpsi();
        i.setBiaya();
        
        System.out.println("===BIAYA TRANSFER ALFAMART===");
        BiayaTransfer a = new Alfamart();
        a.setOpsi();
        a.setBiaya();
        
        System.out.println("===BIAYA TRANSFER JNE===");
        BiayaTransfer j = new Jne();
        j.setOpsi();
        j.setBiaya();
        
        System.out.println("===BIAYA TRANSFER JNT===");
        BiayaTransfer t = new Jnt();
        t.setOpsi();
        t.setBiaya();
        
    }
}
