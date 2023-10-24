/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugassp1;

package tugasp1;

class sepatu{
 String nama;
 String jenis;
 String warna;
 String model;
 String harga;
 
 void tampilkan(){
System.out.println(nama);
System.out.println(jenis);
System.out.println(warna);
System.out.println(model);
System.out.println(harga);
System.out.println("=======");
}

}

public class TugassP1 {
    
    public static void main(String[] args) {
       sepatu saskia= new sepatu();
       saskia.nama = "Saskia Astuti";
       saskia.jenis = "Nike";
       saskia.warna = "putih";
       saskia.model = "Sepatu Nike Air Max 97 ";
       saskia.harga = "110.000";
       saskia.tampilkan();
       
       
    }
    
}


