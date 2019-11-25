/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Date;

/**
 *
 * @author camyt
 */
public class FECHA {
    private int month;
    private int dia;
    private int anio;

    public FECHA(int dia, int month, int anio) {
        this.dia = dia;
        this.month = month;
        this.anio = anio;
    }
    
    public int numDia(int mes){
        int numDia = 0;
        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                numDia = 31;
                break;
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                numDia = 30;
                break;
            case 2:
                numDia= 28;
                break;
            default:
                numDia = -1;
              
        }
        return numDia;
        
    }
   
    private boolean valMes(int mes){
        if(mes>=1 && mes<=12)
            return true;
        else
            return false;
    }
     private boolean valDia(int dia, int mes, int anio){
        if(dia>=1 && dia<numDia(mes)){
            return true;
        }
        else
             return false;
    }
     private boolean valyear(int anio){
         if(anio<0)
             return true;
         else 
             return false;
     }
}
