/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.InformationManagement.model.KeyClass;

import ec.edu.espe.InformationManagement.model.Account.Password;
import ec.edu.espe.InformationManagement.model.Account.UserName;
import java.util.ArrayList;


/**
 *
 * @author DTj
 */
public class User {
    protected String userName;
    protected String password="1234";
    protected String fullname;
    protected String emailAddress;
    protected boolean isActive;
    //protected SetofActiveUser setofactive;
 
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    
    public boolean checkPassword(String password){
        
        if(this.password.equals(password)){
            return true;
        }
        return false;
    }
    public ArrayList<TrustFriendGroup> getTrustFriendsGroups(){
    
        ArrayList<TrustFriendGroup> trustFriendGroup= new ArrayList<>();
       
        TrustFriendGroup group = new TrustFriendGroup();
        trustFriendGroup.add(group);
        
        return trustFriendGroup;
    
    }
    
    public User(){
        
    }
    public boolean longOn (String username){
        String name = "Camila";
        if(username.equals(name)){
            
            return true;
        }
        else{
                    
            return false;}
    }

    
    
    public void modifyOwnPAPIS(){
        
    }
    public void logOff(){
        
    }
}
