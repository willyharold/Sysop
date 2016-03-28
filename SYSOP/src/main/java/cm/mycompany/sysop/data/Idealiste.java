/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.data;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author doumtsop
 */
@Entity
public class Idealiste extends Personne{
    
    @OneToMany(mappedBy = "idealiste")
    private List<Suggestion> listSugestions;
}
