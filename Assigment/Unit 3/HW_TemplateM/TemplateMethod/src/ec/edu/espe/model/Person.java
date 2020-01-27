
package ec.edu.espe.model;


public abstract class Person {
    private String name;
    private String DNI;
    
    public String identify(){
        String sentence = "Yo soy ";
        sentence = sentence + getTypeId();
        sentence = sentence + "El numero es ";
        sentence = sentence + getId();
        return sentence;
    }
    
    protected abstract String getId();
    
    protected  abstract String getTypeId();
    
    public String getName() {
        return name;
    }

    public void setName(String nombre) {
        this.name = name;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    
    
}
