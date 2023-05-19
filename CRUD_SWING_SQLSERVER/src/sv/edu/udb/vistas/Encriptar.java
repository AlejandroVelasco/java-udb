/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.vistas;

import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author aleev
 */
public class Encriptar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String pass = "123456";
        String password = DigestUtils.sha512Hex(pass);
        System.out.println(password);
    }
    
}
