/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.InformationManagement.model.KeyClass;

import ec.edu.espe.InformationManagement.model.Account.Password;
import ec.edu.espe.InformationManagement.model.Account.UserName;


/**
 *
 * @author DTj
 */
public class User {
    protected String username;
    protected String password;
    protected String fullname;
    protected String emailAddress;
    protected boolean isActive;
    //protected SetofActiveUser setofactive;
    
    public void checkPassword(Password password){
        
    }
    public TrustFriendGroup getTrustFriendsGroups(){
        return new TrustFriendGroup();
    }
    public User(){
        
    }
    public void longOn (UserName username, Password password){
        
    }
    public void modifyOwnPAPIS(){
        
    }
    public void logOff(){
        
    }
}
