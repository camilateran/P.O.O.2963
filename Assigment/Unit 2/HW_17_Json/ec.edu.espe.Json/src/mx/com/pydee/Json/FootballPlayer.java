/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.pydee.Json;

/**
 *
 * @author camyt
 */
public class FootballPlayer {
    private String name;
    private String team;
    private int position;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the team
     */
    public String getTeam() {
        return team;
    }

    /**
     * @param team the team to set
     */
    public void setTeam(String team) {
        this.team = team;
    }

    public FootballPlayer(String name, String team, int position) {
        this.name = name;
        this.team = team;
        this.position = position;
    }

   
    
    @Override
    public String toString(){
        return "Position: "+getPosition()+", Name: "+name+", Team: "+team;
    }

    /**
     * @return the position
     */
    public int getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(int position) {
        this.position = position;
    }
        
}
