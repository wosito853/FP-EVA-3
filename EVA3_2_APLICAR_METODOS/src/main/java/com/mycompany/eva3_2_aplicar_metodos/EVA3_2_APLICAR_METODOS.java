/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_2_aplicar_metodos;

/**
 *
 * @author Usuario
 */
public class EVA3_2_APLICAR_METODOS {

    public static void main(String[] args) {
       int resu;
       resu = sumarDosNumeros(5, 10);
        System.out.println("resultado =" + resu);
        // segunda alternativa
        
        System.out.println("resultado =" + sumarDosNumeros(5,10));
      // no les interesa el resultado
  
      sumarDosNumeros(5,10); //EL RESULTADO SE PIERDE
      
      
    }
    
    public static int sumarDosNumeros(int num1, int num2){
        int suma;
        suma = num1 + num2;
    return suma;
    }
}
