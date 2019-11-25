/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.InformationManagement.model.KeyClass;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DTj
 */
public class TrustFriendGroup {
    private int label;
   
 
    
    private ArrayList<Account> account ;

    public ArrayList<Account> getAccount() {
        return account;
    }
    private List <AccountorNote> accountornote;
    private List<TrustFriendGroup> trustFriendsGroups = new ArrayList<>();  
    
  
    
    public void definedInformationOwner(){
        
    }
    public void listTrustFriendGroup(){
        List<String> friendGroup = new ArrayList<>();
        friendGroup.add("Family");
        friendGroup.add("Job");
        friendGroup.add("School");
        System.out.println(friendGroup);
        
        //List<TrustFriendGroup> trustFriendsGroups = new ArrayList<>();
       // trustFriendsGroups.add(new TrustFriendGroup);
    }
   
   
    
    

}
