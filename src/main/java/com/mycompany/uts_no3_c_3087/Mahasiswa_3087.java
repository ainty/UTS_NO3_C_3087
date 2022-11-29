/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_c_3087;

/**
 *
 * @author Tyaa
 */
public class Mahasiswa_3087 {
    protected String nim_3087, nama_3087, jurusan_3087;
    protected double ipk_3087;

    public Mahasiswa_3087(String nim_3087, String nama_3087, String jurusan_3087, double ipk_3087) {
        this.nim_3087 = nim_3087;
        this.nama_3087 = nama_3087;
        this.jurusan_3087 = jurusan_3087;
        this.ipk_3087 = ipk_3087;
    }
    
    public void tampilDataMhs_3087(){
        System.out.println("NIM             : " + nim_3087);
        System.out.println("Nama Mahasiswa  : " + nama_3087);
        System.out.println("Jurusan         : " + jurusan_3087);
        System.out.println("IPK             : " + ipk_3087);
    }
}
