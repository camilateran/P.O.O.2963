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
public class Glass extends House {
    
    @Override
	public String buildWalls() {
		return "Building Glass Walls";
	}

	@Override
	public String buildPillars() {
		return "Building Pillars with glass coating";
	}
}
