/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ev3_4_metodos;

/**
 *
 * @author Usuario
 */
public class EV3_4_metodos {

    public static void main(String[] args) {
        
        
        System.out.println(encontrarMayor(8,7));
        System.out.println(diasSemana (9));
    }

    // valor mas grande entre dos numeros enteros
    public static int encontrarMayor(int num1,int num2){
        // int resu;
       // if (num1 > num2)
         //resu = num1;
        //else 
            //resu = num2;
            
           //return resu;
           
           if (num1 > num2)
               return num1;
           else 
               return num2;
           
        
    
    }
    
    // metodo que regrese el dia de la semana en texto
    // pide el numero de 1 a 7 y regresa Lunes, Martes, etc
    
    
    
    public static String diasSemana(int dia){
    
    switch(dia){
            case 1: 
                return "domingo";
              
        
         case 2: 
                return"lunes";
              
                
                 case 3: 
                return "martes";
         case 4: 
          return "miercoles";
          
        
                 case 5: 
                return "jueves"; 
                
                 case 6: 
                 return "viernes";
                
                 case 7: 
                 return "sabado";  
                 
                 default:
                     return"numero de semana incorrecto";

    }
    
 
}

}
