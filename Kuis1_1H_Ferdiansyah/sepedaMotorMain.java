/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Kuis1_1H_Ferdiansyah;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class sepedaMotorMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sepedaMotor[] merkArr = new sepedaMotor[4];
        merkArr[0] = new sepedaMotor();
        merkArr[0].merk = "Honda";
        merkArr[1] = new sepedaMotor();
        merkArr[1].merk = "Yamaha";
        merkArr[2] = new sepedaMotor();
        merkArr[2].merk = "Ducati";
        merkArr[3] = new sepedaMotor();
        merkArr[3].merk = "Suzuki";
        
        System.out.println("===============");
        System.out.println("===     Pemilihan      ===");
        int pilih;
        do {
            System.out.println("1.Pilih Sepeda Motor");
            System.out.println("2.Nyalakan sepeda motor");
            System.out.println("3.Tambah kecepatan");
            System.out.println("4.kurangi kecepatan");
            System.out.println("5.Matikan sepeda motor");
            System.out.println("6. keluar");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1 :
                    merkArr[].merk;
                    System.out.println("");
                    break;
                case 2 :
                    
            }
        while (pilih==1||pilih==2||pilih==3);
        }
   }
}

