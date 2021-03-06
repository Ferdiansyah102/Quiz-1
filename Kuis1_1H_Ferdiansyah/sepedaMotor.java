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
public class sepedaMotor {
    public String merk;
    public boolean kontakMotor;
    public int kecepatanMotor;

    void sepedaMotor(String honda, String yamaha, String suzuki, String ducati) {
       
    }
    void SepedaMotor(String merk){
        this.merk=merk;
    }
    void nyalakanMotor(boolean kontakMotor){
        this.kontakMotor = kontakMotor;
    }
    void matikanMotor(boolean kontakMotor){
        this.kontakMotor = kontakMotor;
    }
    void tambahKecepatanMotor(int kecepatanMotor){
        kecepatanMotor=+ 5 ;
    }
    void kurangiKecepatan(){
        kecepatanMotor =-5;
    }
    void info(){
        System.out.println("=========================");
        if(kontakMotor == true){
            System.out.println("sepeda motor telah hidup");
        }else{
            System.out.println("sepeda motor mati");
        }
        System.out.println("kecepatan : " + kecepatanMotor);
        System.out.println("=========================");
    }
}
