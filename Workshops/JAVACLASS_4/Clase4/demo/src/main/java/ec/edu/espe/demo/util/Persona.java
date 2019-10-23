package ec.edu.espe.demo.util;

public class Persona{
    private String name;
    private int edad;
    private String dni;

    public Persona(){

    }
    public Persona (String name, int edad, String dni, boolean valida){
        this.name = name;
        this.edad = edad;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
}