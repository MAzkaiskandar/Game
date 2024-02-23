/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;


public class main {
    public static void main(String[] args) {
        
    
      user user = new user("aaa","bbb");
        user user1 = new user();
        
        user.setUsername("LOL");
        user.setPassword( "LIL");
        user.setStatus(true);
        user.setId(0);
        
        System.out.println("Username : "+user.getUsername());
        System.out.println("Password : "+user.getPassword());
    }
}


