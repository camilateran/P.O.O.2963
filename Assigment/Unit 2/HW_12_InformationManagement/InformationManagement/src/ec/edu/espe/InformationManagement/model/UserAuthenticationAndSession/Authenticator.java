/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.InformationManagement.model.UserAuthenticationAndSession;

import ec.edu.espe.InformationManagement.model.Account.Password;
import ec.edu.espe.InformationManagement.model.Account.UserName;
import ec.edu.espe.InformationManagement.model.KeyClass.User;

/**
 *
 * @author camyt
 */
public class Authenticator {
    public void logIn (UserName username, Password password){
        
    }
    public void logOut(){
        
    }
    public UserSession userSession(){
        return new UserSession();
    }
    
    public boolean activeUser(SetofActiveUsers activeUsers){
        return true;
    }
    public User user(){
        return new User();
    }
}
