/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.templatemethod.controller;

/**
 *
 * @author camyt
 */
public abstract class House {
    public final String buildHouse(){
		return buildFoundation() +buildPillars()+buildWalls()+buildWindows()+ "House is built.";
	}
    private String buildWindows() {
		return "Building Glass Windows";
	}
    public abstract String buildWalls();
	public abstract String buildPillars();

    private String buildFoundation() {
		return "Building foundation with cement,iron rods and sand";
	}
    
    
}
