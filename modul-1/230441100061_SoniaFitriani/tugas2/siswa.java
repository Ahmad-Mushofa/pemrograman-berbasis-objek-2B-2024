/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

import java.util.Scanner;

/**
 *
 * @author sonia
 */
public class siswa {
    public static void main(String[] args) {
        // deklarasi variabel
        String nama ;
        String prodi;
        String alamat;
        int nim;
        

        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("### data mahasiswa ###");
        System.out.print("Nama: ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.nextLine();
        System.out.print("Alamat: ");
        alamat = keyboard.nextLine(); 
        System.out.print("prodi: ");
        prodi = keyboard.nextLine();
        // Tampilkan output lagi
        System.out.print("nim: ");
        // menggunakan scanner lagi
        nim = keyboard.nextInt();
        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("--------------------");
        
        System.out.println("Nama : " + nama);
        System.out.println("nim: " + nim);
        System.out.println("prodi: " +prodi );
        System.out.println("alamat:"+alamat);   
    }
}
