/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan39.terbesarterkeciloo;

import java.util.Scanner;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan39TerbesarTerkecilOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MinMax mx = new MinMax ();
        
        System.out.println("====Program Nilai Terbesar dan Terkecil====");
        mx.inputPetugas();
        mx.inputMahasiswa();
        
        System.out.println("====Hasil Nilai Mahasiswa====");
        mx.cekNilai();
        mx.kecilBesar();
        
    }
    
}
