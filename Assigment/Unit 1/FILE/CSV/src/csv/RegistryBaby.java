package csv;

/**
 *
 * @author DTj
 */
public class RegistryBaby {
    private String name;
    private String lastname_father;
    private String lastname_mother;
    private int date;
    private int month;
    private int year;

    public RegistryBaby(String name, String lastname_father, String lastname_mother, int date, int month, int year) {
        this.name = name;
        this.lastname_father = lastname_father;
        this.lastname_mother = lastname_mother;
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

    public String getLastname_father() {
        return lastname_father;
    }

    public void setLastname_father(String lastname_father) {
        this.lastname_father = lastname_father;
    }

    public String getLastname_mother() {
        return lastname_mother;
    }

    public void setLastname_mother(String lastname_mother) {
        this.lastname_mother = lastname_mother;
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





