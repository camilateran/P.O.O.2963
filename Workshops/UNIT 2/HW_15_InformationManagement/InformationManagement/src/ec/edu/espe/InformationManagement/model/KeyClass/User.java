/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.InformationManagement.model.KeyClass;

import sun.security.util.Password;

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
    
    public void ChechPassword(Password password){
        
    }
    public TrustFriendsGroups getTrustFriendsGroups(){
        return new TrustFriendsGroups();
    }
    public User(){
        
    }
}
