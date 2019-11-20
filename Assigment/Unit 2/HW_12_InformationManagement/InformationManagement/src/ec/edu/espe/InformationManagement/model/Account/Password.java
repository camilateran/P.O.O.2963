/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.InformationManagement.model.Account;

import ec.edu.espe.InformationManagement.model.KeyClass.Account;
import ec.edu.espe.InformationManagement.model.PasswordGenerator.EndDate;
import ec.edu.espe.InformationManagement.model.PasswordGenerator.InformationUser;
import ec.edu.espe.InformationManagement.model.PasswordGenerator.StartDate;
import java.util.List;

/**
 *
 * @author DTj
 */
public class Password {
    
    List<StartDate> startDate;
    List<EndDate> endDate;
    List<InformationUser> informationUser;
    List<Account> account;
      
    
    
    public void useAccount(){
        
    }
    
}
