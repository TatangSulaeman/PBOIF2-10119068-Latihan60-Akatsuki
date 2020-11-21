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
public final class Member extends Akatsuki {
    
    public int pilihMember(){
        System.out.print("Ketikan no Anggota : ");
        Scanner inKey = new Scanner(System.in);
        return inKey.nextInt();
    }
    
    
    public Member () {
        int pilih = pilihMember();
        switch (pilih) {
            case 1 -> {
                this.nama = "Pein";
                this.asal = "Amegakure";
            }
            case 2 -> {
                this.nama = "Konan";
                this.asal = "Amegakure";
            }
            case 3 -> {
                this.nama = "Kisame";
                this.asal = "Kirigakure";
            }
                
            case 4 -> {
                this.nama = "Zetsu";
                this.asal = "Kusagakure";
            }
                
            case 5 -> {
                this.nama = "Tobi";
                this.asal = "Konohagakure";
            }
            case 6 -> {
                this.nama = "Deidara";
                this.asal = "Iwagakure";
            }
            case 7 -> {
                this.nama = "Hidan";
                this.asal= "Yugakure";
            }
            case 8 -> {
                this.nama = "Kakuzu";
                this.asal= "Takigakure";
            }
            case 9 -> {
                this.nama = "Sasori";
                this.asal= "Sunagakure";
            }
            case 10 -> {
                this.nama = "Itachi";
                this.asal= "Konohagakure";
            }
            case 11 -> {
                this.nama = "Orochimaru";
                this.asal= "Konohagakure";
            }
            default -> {
            }
        }
    }
     
}
