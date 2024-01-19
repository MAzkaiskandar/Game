/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author dell
 */
public class Drone {
    
    //atribut
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;
    
    //method
    void terbang(){
        energi--;
        if(energi > 10){
            //terbang berarti nilai ketinggian bertambah
            ketinggian++;
            System.out.println("Drone terbang");
            
            
        }else{
            System.out.println("energi lemah:drone ga bisa terbang");
        }
    }
    void matikanmesin(){
        if(ketinggian >0){
            System.out.println("mesin tidak bisa dimatikan karena sedang terbang");
        }else{
            System.out.println("mesin dimatikan");
        }
    }
    void turun(){
        //ketinggian berkurang,karena turun
        ketinggian--;
        energi--;
    }
    void belok(){
        energi--;
        System.out.println("drone belok");
        //belok kemana?,perlu dicek
    }
    void maju(){
       energi--;
        System.out.println("drone maju ke depan");
        kecepatan++;
    }
    void mudur(){
        energi--;
        System.out.println("drone mundur");
        kecepatan++;
    }
}
