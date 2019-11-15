/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.InformationManagement.model.KeyClass;

/**
 *
 * @author DTj
 */
public class SystemAdminUser extends User{
    
    //add
    public User addUser(){
        return new User();
    }
    //delete
    public String DeleteUser(){
        Exception e = null;
        return e.getMessage();
    }
    //edit
    public User editUser(User user){
        return user;
    }
}
