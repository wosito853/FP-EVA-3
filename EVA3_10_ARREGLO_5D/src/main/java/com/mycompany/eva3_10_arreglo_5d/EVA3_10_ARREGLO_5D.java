/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_10_arreglo_5d;

/**
 *
 * @author Usuario
 */
public class EVA3_10_ARREGLO_5D {

    public static void main(String[] args) {
        int [][][][][] cinDim = new int [2][3][4][10][10];
        
        
        
        for (int i = 0; i < cinDim.length; i++) {
            for (int j = 0; j < cinDim[i].length; j++) {
                for (int k = 0; k < cinDim[i][j].length; k++) {
                    for (int l = 0; l < cinDim[i][j][k].length; l++) {
                        for (int m = 0; m < cinDim[i][j][k][l].length; m++) {
                    cinDim [i][j][k][l][m] = (int)(Math.random() * 100);
                            
                        }
                    }
    
                
                    
                }
                
            }
            
        }
        
        for (int i = 0; i < cinDim.length; i++) {
            for (int j = 0; j < cinDim[i].length; j++) {
                for (int k = 0; k < cinDim[i][j].length; k++) {
                    for (int l = 0; l < cinDim[i][j][k].length; l++) {
                        for (int m = 0; m < cinDim[i][j][k][l].length; m++) {
           System.out.print(cinDim [i][j][k][l][m]);
                            
                        }
                    }
    
                
                    
                }
                
            }
            
        }
        
        
        
        
        
    }
}
