/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_5_metodos_arreglos;

/**
 *
 * @author Usuario
 */
public class EVA3_5_METODOS_ARREGLOS {

    public static void main(String[] args) {
    String diasSemana [] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", 
       "Sabado", "Domingo"};
    imprimirArreglo(diasSemana);
    
    String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    imprimirArreglo(meses);
    
    
    int billetes [] = {20, 50, 100, 200,500, 1000 };
     imprimirBilletes(billetes);
    
    }
    
       // IMPRIMIR ARREGLO DE CADENAS

      public static void imprimirArreglo(String[] arreglo){

          for (int i = 0; i < arreglo.length; i++){
              System.out.println(arreglo[i]);
}

}
      
      
         public static void imprimirBilletes(int[] arreglo){

          for (int i = 0; i < arreglo.length; i++){
              System.out.println(arreglo[i]);
}

}


}
