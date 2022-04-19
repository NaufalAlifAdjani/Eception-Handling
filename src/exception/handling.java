/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author SENJU
 */
public class handling {
    public static void main(String[] args) {
    try{//untuk menangani dimana munculnya kesalahan yang ingin di proses
           String[] siswa = new String[2];
           siswa[0] = "Krisna";
           siswa[1] = "Nopal";
           siswa[2] = "Reza";
           System.out.println(siswa[4]);
           //====================================
           
           //fungsi exception handling ketika ada suatu kesalahan atau eror akan bisa terdeteksi dan memunculkan arahan yang benar
           
        }catch(ArrayIndexOutOfBoundsException ex){ //catch untuk menangani jenis exception
            System.out.println("Data Array Yang Ingin Dikeluarkan Tidak Ada");
        }
    }

}
