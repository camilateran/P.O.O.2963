/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.InformationManagement.model.Account;

import ec.edu.espe.InformationManagement.model.KeyClass.Account;
import java.util.Date;

/**
 *
 * @author DTj
 */
public class WebBasedAccount extends Account {
    private String url;
    private Date lastAccesedDate;

    public WebBasedAccount(String url, Date lastAccesedDate) {
        this.url = url;
        this.lastAccesedDate = lastAccesedDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getLastAccesedDate() {
        return lastAccesedDate;
    }

    public void setLastAccesedDate(Date lastAccesedDate) {
        this.lastAccesedDate = lastAccesedDate;
    }
    
    
    
    
}
