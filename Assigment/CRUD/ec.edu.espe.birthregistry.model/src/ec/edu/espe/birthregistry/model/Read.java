/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.birthregistry.model;

import java.util.Scanner;


/**
 *
 * @author DTj
 */
public class Read {
  Entry ent=new Entry();
  Scanner sc=new Scanner(System.in);
  String name;
  public void readInformation(){
      //llamar a la funcion
     ent.nameInformation();
     ent.lastnameoffather();
     ent.lastnameofmother();
     ent.date();
     ent.month();
     ent.year();
      
     
  }

    
}
