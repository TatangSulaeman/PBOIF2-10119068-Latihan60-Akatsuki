/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.akatsuki.tugas;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan program Akatsuki
 * 
 */
public class Main {
    public static void main(String[]args){
        String outputText =
                
                "Pilih Member :" + "\n" +
                "1. Pein" + "\n" +
                "2. Konan"+ "\n" +
                "3. Kisame"+ "\n" +
                "4. Zetsu"+ "\n" +
                "5. Tobi"+ "\n" +
                "6. Deidara"+ "\n" +
                "7. Hidan"+ "\n" +
                "8. Kakuzu"+ "\n" +
                "9. Sasori"+ "\n" +
                "10. Itachi";
        System.out.println(outputText);
        Member member = new Member();
        
        System.out.println("Nama \t\t: " +member.nama);
        System.out.println("Asal \t\t: " +member.asal);
       
    }
}
