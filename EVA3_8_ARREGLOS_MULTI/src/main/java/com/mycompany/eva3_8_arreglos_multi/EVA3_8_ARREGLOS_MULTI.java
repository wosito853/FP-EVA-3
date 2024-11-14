/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_arreglos_multi;

/**
 *
 * @author Usuario
 */
public class EVA3_8_ARREGLOS_MULTI {

    public static void main(String[] args) {
            int [][][] cubo = new int [2][5][3];
            // llenado
            System.out.println(cubo.length);
            System.out.println(cubo[1].length);
            System.out.println(cubo[0].length);
            System.out.println(cubo[0][0].length);
                    for (int i = 0; i < cubo.length; i++) {//  primera dimension
        for (int j = 0; j < cubo[i].length; j++) {//  segunda dimension
                for (int k = 0; k < cubo[i][j].length; k++) { // tercera dimension
                cubo [i][j][k] = (int)(Math.random() * 100);
            }
               
          }
            
        }
                    // imprimir los valores 
                                 for (int i = 0; i < cubo.length; i++) {//  primera dimension
        for (int j = 0; j < cubo[i].length; j++) {//  segunda dimension
                for (int k = 0; k < cubo[i][j].length; k++) { // tercera dimension
                cubo [i][j][k] = (int)(Math.random() * 100);
                
                    System.out.print("[" + cubo[i][j][k] + "]");
            }
          }
        } 

    }
    
    
}
