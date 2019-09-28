/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.birthregistry.model;

/**
 *
 * @author DTj
 */
public class Create {
   private String name;
   private String lastnameoffahter;
   private String lastnameofmother;
   private String date;
   private String month;
   private String year;
   private String weight;

    public Create(String name, String lastnameoffahter, String lastnameofmother, String date, String month, String year, String weight) {
        this.name = name;
        this.lastnameoffahter = lastnameoffahter;
        this.lastnameofmother = lastnameofmother;
        this.date = date;
        this.month = month;
        this.year = year;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastnameoffahter() {
        return lastnameoffahter;
    }

    public void setLastnameoffahter(String lastnameoffahter) {
        this.lastnameoffahter = lastnameoffahter;
    }

    public String getLastnameofmother() {
        return lastnameofmother;
    }

    public void setLastnameofmother(String lastnameofmother) {
        this.lastnameofmother = lastnameofmother;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
   
   

   
    
}
