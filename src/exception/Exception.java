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
public class Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //program salah
           String[] siswa = new String[2];
           siswa[0] = "Krisna";
           siswa[1] = "Nopal";
           siswa[2] = "Reza";
           System.out.println(siswa[4]);    
        //eror karena data array 4 tidak ada
        //program benar di class handling
    }
    
}
