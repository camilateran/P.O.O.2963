
package ec.edu.espe.birthregistry.model;

/**
 *
 * @author DTj
 */
public class RegistryBaby {
   private String name;
   private String lastnameoffahter;
   private String lastnameofmother;
   private int date;
   private int month;
   private int year;

    public RegistryBaby(String name, String lastnameoffahter, String lastnameofmother, int date, int month, int year) {
        this.name = name;
        this.lastnameoffahter = lastnameoffahter;
        this.lastnameofmother = lastnameofmother;
        this.date = date;
        this.month = month;
        this.year = year;
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
   
   public String[] getArray(){
        String[] datos ={String.valueOf(date), String.valueOf(month), String.valueOf(year)};
        return datos;
   }

    
   

   
    
}
