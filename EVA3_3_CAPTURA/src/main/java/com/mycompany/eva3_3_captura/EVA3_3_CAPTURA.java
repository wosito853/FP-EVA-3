/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_3_CAPTURA {

    public static void main(String[] args) {
        String nombre = capturarTexto("introduce tu nombre:");
                String apellido = capturarTexto("introduce tu apellido:");
               
                
                
                int edad = capturaEdad ("introduce tu edad:");
               
                
                double sal = capturaSalario ("introduce tu salario:");
                
                
                
                
                 System.out.println("nombre:" + nombre);
                System.out.println("apeliido:" + apellido);
                 System.out.println("edad:" + edad);
                 System.out.println("salario:" + sal);
    }
    // CAPTURAR TEXTO
    public static String capturarTexto(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        String texto = captu.nextLine();
        return texto;
    
    }
    
    public static int capturaEdad (String mensaje){
     Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        int num1 = captu.nextInt();
        captu.nextLine();
        return num1;
    }
    
     public static double capturaSalario (String mensaje){
     Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        double dob1 = captu.nextDouble();
        return dob1;
    
     } 
}
