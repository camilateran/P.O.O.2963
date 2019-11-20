/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.InformationManagement.model.Account;

import ec.edu.espe.InformationManagement.model.KeyClass.Account;

/**
 *
 * @author DTj
 */
public class Comment {
    private Account account;

    public Comment(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
}
