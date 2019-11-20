/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.InformationManagement.view;

import ec.edu.espe.InformationManagement.model.Account.Password;
import ec.edu.espe.InformationManagement.model.KeyClass.TrustFriendGroup;
import ec.edu.espe.InformationManagement.model.KeyClass.TrustedFriend;
import ec.edu.espe.InformationManagement.model.KeyClass.User;
import ec.edu.espe.InformationManagement.model.PasswordGenerator.PasswordGenerator;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author DTj
 */
public class InformationManagement {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        User users = new User();
        TrustFriendGroup friendGroup = new TrustFriendGroup();
        TrustedFriend trustedFriend = new TrustedFriend();
        
        
        
        boolean valuser = false, valpassword=false;
        while(valuser == false){   
        System.out.println("User: ");
        String user = in.nextLine();
        valuser=users.longOn(user);
        }
        while(valpassword == false){
        System.out.println("Password: ");
        String password = in.nextLine();
        valpassword=users.checkPassword(password);
        };        
        if (valpassword == true){
            
            users.getTrustFriendsGroups();
            System.out.println("--TrustFriendsGroups--");
            friendGroup.listTrustFriendGroup();
            System.out.println("--TrustFriends--");
            trustedFriend.listTrustedFriend();
            
        }
    }
}
