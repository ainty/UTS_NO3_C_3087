/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_c_3087;

/**
 *
 * @author Tyaa
 */
public class AsistenPraktikum_3087 extends Mahasiswa_3087 {
    private String mkAsistensi_3087;
    private int jmlPertemuan_3087, pendapatan_3087;
    

    public AsistenPraktikum_3087(String nim_3087, String nama_3087, String jurusan_3087, double ipk_3087, String mkAsistensi_3087, int jmlPertemuan_3087) {
        super(nim_3087, nama_3087, jurusan_3087, ipk_3087);
        this.mkAsistensi_3087 = mkAsistensi_3087;
        this.jmlPertemuan_3087 = jmlPertemuan_3087;
    }
    
    public double totalPendapatanAsprak_3087(){
        return jmlPertemuan_3087 * 50000;
    }
    
    public void tampilDataMhsAsprak_3087(){
        System.out.println("===== Data Asisten Praktikum =====");
        super.tampilDataMhs_3087();
        System.out.println("MK Asistensi        : " + mkAsistensi_3087);
        System.out.println("Jumlah Pertemuan    : " + jmlPertemuan_3087);
        System.out.println("Total Pendapatan    : " + totalPendapatanAsprak_3087());
        System.out.println("");
    }
}
