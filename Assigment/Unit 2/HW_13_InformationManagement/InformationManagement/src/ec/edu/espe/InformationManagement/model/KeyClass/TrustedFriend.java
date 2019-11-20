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
public class TrustedFriend extends User {
    
    public void listTrustedFriend(){
        List<String> trustedFriend = new ArrayList<>();
        trustedFriend.add("Juan");
        trustedFriend.add("Andrea");
        trustedFriend.add("Lorena");
        System.out.println(trustedFriend);
    }
    
    
    public void browseListofAccount(){
        
    }
    
    public void viewSharedAccountInf(){
        
    }
}
