/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author harold
 */
@Entity
public class Rendement implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    
    @OneToMany(mappedBy = "rendement")
    private List<ClasseOuvrier> classeOuvrier;

   
    
    public List<ClasseOuvrier> getClasseOuvrier() {
        return classeOuvrier;
    }

    public void setClasseOuvrier(List<ClasseOuvrier> classeOuvrier) {
        this.classeOuvrier = classeOuvrier;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
}
