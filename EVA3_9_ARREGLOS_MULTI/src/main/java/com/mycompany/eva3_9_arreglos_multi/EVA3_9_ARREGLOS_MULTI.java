/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_9_arreglos_multi;

/**
 *
 * @author Usuario
 */
public class EVA3_9_ARREGLOS_MULTI {

    public static void main(String[] args) {
       int [] billetes = {20, 50, 100, 200, 500, 1000};
        System.out.println(billetes.length);
       
       String [][] ciudades = {{"aguascalientes", "calvillo", "Jesus maria"},
       {" ensenada", "Mexicali", "Tecate", "Tijuana"},
       {"la paz", " cabo san lucas", "San jose del cabo"}};
       
       // System.out.println(ciudades.length);
        //System.out.println(ciudades[1].length);
       
        for (int i = 0; i < ciudades.length; i++) {
            
            for (int j = 0; j < ciudades[i].length; j++) {
                System.out.println(ciudades [i][j]);
                
            }
            
        }
        
    }
}
