/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.InformationManagement.model.Account;

import ec.edu.espe.InformationManagement.model.KeyClass.Account;

/**
 *
 * @author DTj
 */
public class PhysicalAccesAccount extends Account{
    private String locationOrDevice;
    private String Instructions;

    public PhysicalAccesAccount(String locationOrDevice, String Instructions) {
        this.locationOrDevice = locationOrDevice;
        this.Instructions = Instructions;
    }

    public String getLocationOrDevice() {
        return locationOrDevice;
    }

    public void setLocationOrDevice(String locationOrDevice) {
        this.locationOrDevice = locationOrDevice;
    }

    public String getInstructions() {
        return Instructions;
    }

    public void setInstructions(String Instructions) {
        this.Instructions = Instructions;
    }




}
