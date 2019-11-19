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
    
   public void ManagerPAPIS(){
   }
    
    public User addNewUser(){
        return new User();
    }
    
    public String deleteUser(){
        Exception e = null;
        return e.getMessage();
    }
    
    public User editUser(User user){
        return user;
    }
    
    public User archiveUser(){
        return new User();
    }    

}
