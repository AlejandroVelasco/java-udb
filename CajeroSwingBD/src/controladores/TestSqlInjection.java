/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Usuario;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Salvador
 */
public class TestSqlInjection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UsuarioControl uc = new UsuarioControl();
        Scanner in = new Scanner(System.in);
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(flujo);
        try {
            System.out.println("Digite su usuario ");
            String usuario = br.readLine();
            System.out.println("Digite su contraseña ");
            String pass = br.readLine();
            Usuario usuarioValido = uc.validarUsuario(usuario, pass);
            if (usuarioValido == null) {
                System.out.println("Credenciales incorrectas ");
            } else {
                System.out.println("Usuario válido");
            }
        } catch (Exception e) {
        }

    }

}
