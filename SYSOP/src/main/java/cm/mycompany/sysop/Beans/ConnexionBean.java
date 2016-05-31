/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.Beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author harold
 */
@ManagedBean
@RequestScoped
public class ConnexionBean {
    
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String connexion(){
        System.out.println("hello");
        if(username.isEmpty()||password.isEmpty())
            return "error";
        
        if((username.compareTo("root")==0)&&(password.compareTo("root")==0))
            return "admin";
        else return "dashboard";
        
    }
}
