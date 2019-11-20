/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.InformationManagement.model.UserAuthenticationAndSession;

import ec.edu.espe.InformationManagement.model.KeyClass.User;

/**
 *
 * @author camyt
 */
public class UserSession {

    private User user;

    public UserSession(User user) {
        this.user = user;
    }

    UserSession() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setUser(User user) {
        this.user=user;
    }

    public void clearUser(User user) {
        user=null;
    }

    public User getCurrentUser() {
        return user;
    }
}
