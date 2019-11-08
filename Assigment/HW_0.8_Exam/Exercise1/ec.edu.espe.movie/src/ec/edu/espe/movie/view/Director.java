
package ec.edu.espe.movie.view;


public class Director {
    private String name;
    private String lastname;
    private String country;
    
    public Director(String name,String lastname,String country ){
        this.country=country;
        this.name=name;
        this.lastname= lastname;
                
    }
    Director() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
 
    
}
