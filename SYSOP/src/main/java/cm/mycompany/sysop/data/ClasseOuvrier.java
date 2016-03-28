/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.data;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author harold
 */
@Entity
public class ClasseOuvrier {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    
    @ManyToOne
    private Rendement rendement;

    
    @ManyToMany
    private List<Entreprise> entreprise;

    
    @ManyToOne
    private Paye paye;

    public Paye getPaye() {
        return paye;
    }

    public void setPaye(Paye paye) {
        this.paye = paye;
    }

    public List<Entreprise> getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(List<Entreprise> entreprise) {
        this.entreprise = entreprise;
    }
     
            
    public Rendement getRendement() {
        return rendement;
    }

    public void setRendement(Rendement rendement) {
        this.rendement = rendement;
    }

        
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
}
