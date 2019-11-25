/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumsystem;

/**
 *
 * @author camyt
 */
public enum DiaSemana {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);
    
    private boolean working;

    private DiaSemana(boolean working) {
        this.working = working;
    }

    @Override
    public String toString() {
        if(working == true){
            return "The day: "+this.name()+" is laborable";
        }
        else
            return "The day: "+this.name()+" is not laborable";
    }
    
    
    
    
}
