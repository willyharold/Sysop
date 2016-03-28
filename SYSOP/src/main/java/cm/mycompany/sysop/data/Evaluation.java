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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author doumtsop
 */
@Entity
public class Evaluation implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToMany(mappedBy = "evaluation")
    private List<Tache> listesTaches;
    
    @OneToMany(mappedBy = "evaluation")
    private List<Ouvrier> listOuvriers;
    
    @ManyToOne
    private Comptabiliseur comptabiliseur;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Tache> getListesTaches() {
        return listesTaches;
    }

    public void setListesTaches(List<Tache> listesTaches) {
        this.listesTaches = listesTaches;
    }

    public List<Ouvrier> getListOuvriers() {
        return listOuvriers;
    }

    public void setListOuvriers(List<Ouvrier> listOuvriers) {
        this.listOuvriers = listOuvriers;
    }

    public Comptabiliseur getComptabiliseur() {
        return comptabiliseur;
    }

    public void setComptabiliseur(Comptabiliseur comptabiliseur) {
        this.comptabiliseur = comptabiliseur;
    }
    
}
