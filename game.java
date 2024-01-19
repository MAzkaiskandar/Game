/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author dell
 */
public class game {
    public static void main(String[] args) {
        
        //membuat objek player
        player hero = new player();
        
        //mengisi atribut player
        hero.name = "Hero";
        hero.speed = 78;
        hero.healthPoin = 100;
        hero.damage = 65;
        hero.armour = 50;
        //menjalankan method
        hero.run();
        hero.attack();
        hero.defense();
        
        if(hero.isDead()){
            System.out.println("Game over");
        }
        
    }
}
