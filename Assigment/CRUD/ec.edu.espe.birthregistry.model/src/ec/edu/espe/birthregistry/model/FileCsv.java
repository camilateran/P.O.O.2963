/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.birthregistry.model;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author DTj
 */
public class FileCsv {
  Entry ent=new Entry();
  Scanner sc=new Scanner(System.in);
  String name;
  public void readInformation(){
      ArrayList <Registry> registrybaby= new ArrayList();
      registrybaby.add(new Registry());
      
      CsvWriter csvWriter = new CsvWriter("RegistryBaby.csv");
      
      
  }

    
}
