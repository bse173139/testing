/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailtester;

import java.util.regex.Pattern;

/**
 *
 * @author Ameer
 */
public class Emailtester {
    public boolean emailvalid(String email){
        return Pattern.matches("^[A-Za-z0-9+_.-]+@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}", email);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Emailtester et=new Emailtester();
        System.out.println(et.emailvalid("user@domain.com"));
    }
 
}