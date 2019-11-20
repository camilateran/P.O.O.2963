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
public class DesktopBasedApplicationAccount extends Account{
    private String applicationName;

    public DesktopBasedApplicationAccount(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
}
