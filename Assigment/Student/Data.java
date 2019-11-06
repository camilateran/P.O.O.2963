/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

public class Data {
    private String name;
    private String lastname;
    private int phone;
    private float[] not = new float[3];

    public Data(String name, String lastname, int phone){
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public float[] getNot() {
        return not;
    }

    public void setNot(float[] not) {
        this.not = not;
    }
    
    public String[] getArray(){
        String[] datos ={String.valueOf(name), String.valueOf(lastname), String.valueOf(phone)};
        return datos;
    }
    
    
    
}
