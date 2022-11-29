/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no3_c_3087;

/**
 *
 * @author Tyaa
 */
public class UTS_NO3_C_3087 {

    public static void main(String[] args) {
        AsistenPraktikum_3087 asprak = new AsistenPraktikum_3087("21103087", "Nur Ainie", "Sistem Informasi", 3.80, "PBO", 12);
        
        asprak.totalPendapatanAsprak_3087();
        asprak.tampilDataMhsAsprak_3087();
        
        StudentStaff_3087 SS = new StudentStaff_3087("21103055", "Novita", "Sistem Informasi", 3.90, 1, 2);
        
        SS.totalPendapatanSS_3087();
        SS.tampilDataMhsSS_3087();
    }
}
