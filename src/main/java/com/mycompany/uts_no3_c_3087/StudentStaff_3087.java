/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_c_3087;

/**
 *
 * @author Tyaa
 */
public class StudentStaff_3087 extends Mahasiswa_3087 {
    private int unitKerja_3087, jamKerja_3087;

    public StudentStaff_3087(String nim_3087, String nama_3087, String jurusan_3087, double ipk_3087, int unitKerja_3087, int jamKerja_3087) {
        super(nim_3087, nama_3087, jurusan_3087, ipk_3087);
        this.unitKerja_3087 = unitKerja_3087;
        this.jamKerja_3087 = jamKerja_3087;
    }
    
    public double totalPendapatanSS_3087(){
        return jamKerja_3087 * 30000;
    }
    
    public void tampilDataMhsSS_3087(){
        System.out.println("===== Data Student Staff =====");
        super.tampilDataMhs_3087();
        System.out.println("Unit Kerja  : " + unitKerja_3087);
        System.out.println("Jam Kerja   : " + jamKerja_3087);
        System.out.println("Total Pendapatan    : " + totalPendapatanSS_3087());
        System.out.println("");
    }
}
