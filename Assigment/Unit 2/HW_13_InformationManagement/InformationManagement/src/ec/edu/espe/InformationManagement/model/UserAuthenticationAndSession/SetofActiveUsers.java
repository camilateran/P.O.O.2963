/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.InformationManagement.model.UserAuthenticationAndSession;

import ec.edu.espe.InformationManagement.model.Account.UserName;
import ec.edu.espe.InformationManagement.model.KeyClass.User;
import java.util.List;


public class SetofActiveUsers {
    
   private List<User> user;
    
    public boolean findUser(UserName userName){
        if(userName == user){
            return true;
        }
        else 
            return false;
    }
}
