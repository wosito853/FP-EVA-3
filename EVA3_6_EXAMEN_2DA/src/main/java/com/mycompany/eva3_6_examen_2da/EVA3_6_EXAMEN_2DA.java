/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_6_examen_2da;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_6_EXAMEN_2DA {
    
    public static final int PIEDRA = 1;
    public static final int PAPEL = 2;
    public static final int TIJERA= 3;
    
    public static final int EMPATE= 0;
    public static final int GANA = 1;
    public static final int PIERDE= 2;

    public static void main(String[] args) {
         int jugadaUsu;
         int jugadaComp;
         int resuJugada;
        do{
   jugadaUsu = capturarJugada("introduce tu jugada (1 - piedra,2 - papel, 3 tijera, 0 - sair");
    jugadaComp = generarJugadaComp();
    resuJugada = evaluarJugadas(jugadaUsu, jugadaComp);
        } while(jugadaUsu != 0);// mientras no quiera salir (opcion 0)
        
        
        
        
    }
    
    // pediir datos al usurario
    public static int capturarJugada(String mensaje){
           Scanner captu = new Scanner(System.in);
           System.out.println(mensaje);
           int resu = captu.nextInt();
           return resu;
        
        
      
    
    }
    // generar jugada de la computadora
    
    public static int generarJugadaComp(){
    int resu;
    double valor = Math.random();
    if ((valor >= 0) && (valor < 0.3))
        resu = 1; // piedra
    else if ((valor >= .3) && (valor < 0.6))
        resu = 1; // papel
    else if ((valor >= 0) && (valor < 0.3))
        resu = 1; // piedra
    else 
        resu = 3;// Tijera
    
    return resu;
    
    }
    
    // Evaluar jugada = : empate, 1 - Gano, 2 - pierdo
     public static int evaluarJugadas(int jugadaU, int JugadaC){
        // 9 opciones de posibles combinaciones
        int resu;
        if ((jugadaU == PIEDRA) && (JugadaC == PIEDRA))
            resu = EMPATE;
        else if((jugadaU == PIEDRA) && (JugadaC == PAPEL))
            resu = PIERDE;
        else if ((jugadaU == PIEDRA) && (JugadaC == TIJERA))
            resu = GANA ;
        else if ((jugadaU == PAPEL) && (JugadaC == PIEDRA))
            resu = GANA ;
        else if ((jugadaU ==PAPEL) && (JugadaC == PAPEL))
            resu = EMPATE;
        else if ((jugadaU == PAPEL) && (JugadaC == TIJERA))
            resu = PIERDE;
        else if ((jugadaU == TIJERA) && (JugadaC == PIEDRA))
            resu = PIERDE;
             else if ((jugadaU == TIJERA) && (JugadaC == PAPEL))
            resu = GANA ;
        else 
            resu = EMPATE;
        return resu;
     }
}
