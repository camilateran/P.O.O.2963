/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonprueba;

import java.util.List;

public class FootballPlayer {

    

    private String name;

    

    private String team;

    public FootballPlayer() {
    }

    public FootballPlayer(String name,String team) {
       
        this.name = name;
 
        this.team = team;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return " Name=" + name + ", Team=" + team;
    }

}
