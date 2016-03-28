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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import org.hibernate.annotations.ManyToAny;

/**
 *
 * @author harold
 */
@Entity
public class Entreprise implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @OneToMany(mappedBy = "entreprise")
    private List<Suggestion> listessuggetions;
    
    @OneToMany(mappedBy = "entreprise")
    private List<Tache> listesTaches;
    
    @ManyToMany(mappedBy = "entreprise")
<<<<<<< HEAD
    private Ouvrier ouvrier;
<<<<<<< HEAD
    
=======
=======
    private List<Ouvrier> ouvriers;
>>>>>>> e1462d7ba2055f4fe3a429c27fe9e9ea31fe04a1

>>>>>>> be1eb7338f0465ee825b0c7d2bb62e72d45a7be8
    @ManyToMany(mappedBy = "entreprise")
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

    public List<Suggestion> getListessuggetions() {
        return listessuggetions;
    }

    public void setListessuggetions(List<Suggestion> listessuggetions) {
        this.listessuggetions = listessuggetions;
    }

    public List<Tache> getListesTaches() {
        return listesTaches;
    }

    public void setListesTaches(List<Tache> listesTaches) {
        this.listesTaches = listesTaches;
    }

    public List<Ouvrier> getOuvriers() {
        return ouvriers;
    }

    public void setOuvriers(List<Ouvrier> ouvriers) {
        this.ouvriers = ouvriers;
    }

   
}
