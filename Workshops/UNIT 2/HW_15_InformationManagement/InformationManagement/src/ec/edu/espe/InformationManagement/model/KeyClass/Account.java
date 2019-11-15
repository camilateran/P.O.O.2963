/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.InformationManagement.model.KeyClass;

import ec.edu.espe.InformationManagement.model.Account.Comment;
import ec.edu.espe.InformationManagement.model.Account.Password;
import ec.edu.espe.InformationManagement.model.Account.Property;
import ec.edu.espe.InformationManagement.model.Account.Reminder;
import ec.edu.espe.InformationManagement.model.Account.UserName;
import java.util.List;

/**
 *
 * @author DTj
 */
public class Account extends AccountorNote{
    protected UserName username;
    protected Password password;
    protected List<Property> property;
    protected List<Reminder> reminder;
    protected Comment coment;
    
   
    
    
    
    
    
}
