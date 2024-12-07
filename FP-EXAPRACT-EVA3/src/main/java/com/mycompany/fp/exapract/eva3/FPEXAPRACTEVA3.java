/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.fp.exapract.eva3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class FPEXAPRACTEVA3 {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);

        
        int numEstudiantes;
        do {
            System.out.print("Ingrese el numero de estudiantes: ");
            numEstudiantes = captu.nextInt();
            if (numEstudiantes <= 0) {
                
    System.out.println("El numero de estudiantes debe ser mayor a 0");
            }
        } while (numEstudiantes <= 0);

        //  arreglo para las calificaciones
        double[] calificaciones = new double[numEstudiantes];

       
        for (int i = 0; i < numEstudiantes; i++) {
            double calificacion;
            do {
           System.out.print("Ingrese la calificacion del estudiante " + (i + 1) + " (0-100):");
          calificacion = captu.nextDouble();
         if (calificacion < 0 || calificacion > 100) {
             
    System.out.println("La calificacion debe estar entre 0 y 100");
    
                }
            }
            while (calificacion < 0 || calificacion > 100);
            calificaciones[i] = calificacion;
        }

      
        double promedio = calcularPromedio(calificaciones);

       
int mayorAlPromedio = calificacionesMayores(calificaciones, promedio);

        
    double calificacionMasAlta = calificacionMasAlta(calificaciones);
       double calificacionMasBaja = calificacionMasBaja(calificaciones);

       
 System.out.println("Resultados:");
System.out.println("Promedio de calificaciones: " + promedio);
    System.out.println("Numero de estudiantes con calificacion mayor o igual al promedio:" + mayorAlPromedio);
 System.out.println("Calificacion mas alta:" + calificacionMasAlta);
     System.out.println("Calificacion mas baja: " + calificacionMasBaja);

        captu.close();
    }

    // calcula promedio
    public static double calcularPromedio(double[] calificaciones) {
        double acum = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            acum += calificaciones[i];
        }
        return acum / calificaciones.length;
    }

    // contador calificas mayores o iguales al promedio
    public static int calificacionesMayores(double[] calificaciones, double promedio) {
        int acum2 = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i] >= promedio) {
                acum2++;
            }
        }
        return acum2;
    }

    // la califa mas alta
    public static double calificacionMasAlta(double[] calificaciones) {
        double masAlta = calificaciones[0];
        for (int i = 1; i < calificaciones.length; i++) {
            if (calificaciones[i] > masAlta) {
                masAlta = calificaciones[i];
            }
        }
        return masAlta;
    }

    //la califa mas baja
    public static double calificacionMasBaja(double[] calificaciones) {
        double minima = calificaciones[0];
        for (int i = 1; i < calificaciones.length; i++) {
            if (calificaciones[i] < minima) {
                minima = calificaciones[i];
            }
        }
        return minima;
    }
}
