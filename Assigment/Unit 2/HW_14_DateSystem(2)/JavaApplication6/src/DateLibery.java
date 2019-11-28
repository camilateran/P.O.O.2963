
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author camyt
 */
public class DateLibery {
    
     public ArrayList<Integer> edad(String fecha_nac) {    
   
    Date fechaActual = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    String hoy = formato.format(fechaActual);
    String[] dat1 = fecha_nac.split("/");
    String[] dat2 = hoy.split("/");
    int anos = Integer.parseInt(dat2[2]) - Integer.parseInt(dat1[2]);
    int mes = Integer.parseInt(dat2[1]) - Integer.parseInt(dat1[1]);
    int dias =  Integer.parseInt(dat2[0]) - Integer.parseInt(dat1[0]);
   
    
    // despues de hoy
    
        
    if((Integer.parseInt(dat1[0]) >  Integer.parseInt(dat2[0])) && (Integer.parseInt(dat1[1]) >  Integer.parseInt(dat2[1])) && 
            (Integer.parseInt(dat1[2]) >  Integer.parseInt(dat2[2]))){
        System.out.println("Error");
    } 
    if (Integer.parseInt(dat1[1])==2){
        if(Integer.parseInt(dat1[0]) >28){
            System.out.println("Error");
        }
    }
    
    if((Integer.parseInt(dat1[1])==1) || (Integer.parseInt(dat1[1])==3) ||(Integer.parseInt(dat1[1])==5)||(Integer.parseInt(dat1[1])==7)||
            (Integer.parseInt(dat1[1])==8)||(Integer.parseInt(dat1[1])==10)||(Integer.parseInt(dat1[1])==12)){
        if(Integer.parseInt(dat1[0])>31){
            System.out.println("ERROR");
        }
    }
     
    if((Integer.parseInt(dat1[1])==4) || (Integer.parseInt(dat1[1])==6) ||(Integer.parseInt(dat1[1])==9)||(Integer.parseInt(dat1[1])==11)){
        if(Integer.parseInt(dat1[0])>30){
            System.out.println("ERROR");
        }
    if(Integer.parseInt(dat1[0])<=0){
        System.out.println("Error");
    }
    if(Integer.parseInt(dat1[1])>12){
        System.out.println("Error");
    }
    if(Integer.parseInt(dat1[1])<1){
        System.out.println("Error");
    }
        
    }
    
    ArrayList<Integer> dates = new ArrayList<Integer>();
    dates.add(anos);
    dates.add(mes);
    dates.add(dias);
    
    return dates;
    
}
}