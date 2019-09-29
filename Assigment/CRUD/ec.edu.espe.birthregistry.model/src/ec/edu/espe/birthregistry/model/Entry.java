package ec.edu.espe.birthregistry.model;

import java.util.Scanner;

/**
 *
 * @author DTj
 */
public class Entry {

    Scanner registro = new Scanner(System.in);
    public String name;
    public String lastnameoffahter;
    public String lastnameofmother;
    public int date;
    public int month;
    public int year;

    public String nameInformation() {
        System.out.println("Ingrese nombre: ");
        name = registro.nextLine();
        return name;
    }
    public String lastnameoffather(){
        System.out.println("Ingrese el apellido paterno: ");
        lastnameoffahter = registro.nextLine();
        return lastnameoffahter;
    }
    public String lastnameofmother(){
        System.out.println("Ingrese el apellido materno: ");
        lastnameofmother = registro.nextLine();
        return lastnameofmother;
    }
    public int date(){
       System.out.println("Ingrese dia: ");
       date = registro.nextInt();
       return date;
    }
    public int month(){
        System.out.println("Ingrese mes: ");
        month = registro.nextInt();
        return month;
    }
    public int year(){
        System.out.println("Ingrese año: ");
        year = registro.nextInt();
        return year;
    }

    public String getName(String name) {
        this.name=name;
        return this.name;
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

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
