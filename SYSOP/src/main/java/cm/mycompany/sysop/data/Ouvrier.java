/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author doumtsop
 */
@Entity
public class Ouvrier extends Personne{
    
    @ManyToOne
    private Evaluation evaluation;
    
    @ManyToMany
    private List<Entreprise> entreprise;

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }

    public List<Entreprise> getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(List<Entreprise> entreprise) {
        this.entreprise = entreprise;
    }
    
    
       
}
