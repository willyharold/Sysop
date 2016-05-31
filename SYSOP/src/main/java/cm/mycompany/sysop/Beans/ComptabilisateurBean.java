/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.Beans;

import cm.mycompany.sysop.Service.Interface.IComptabilisateurService;
import cm.mycompany.sysop.data.Comptabiliseur;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import org.hibernate.service.spi.ServiceException;

/**
 *
 * @author harold
 */
@ManagedBean
@RequestScoped
public class ComptabilisateurBean {
    @ManagedProperty(value = "#{IComptabilisateurService}")
    private IComptabilisateurService icomptabilisateurService;
    private Comptabiliseur comptabiliseur;

    public IComptabilisateurService getIcomptabilisateurService() {
        return icomptabilisateurService;
    }

    public void setIcomptabilisateurService(IComptabilisateurService icomptabilisateurService) {
        this.icomptabilisateurService = icomptabilisateurService;
    }

    public Comptabiliseur getComptabiliseur() {
        return comptabiliseur;
    }

    public void setComptabiliseur(Comptabiliseur comptabiliseur) {
        this.comptabiliseur = comptabiliseur;
    }
    
    public Comptabiliseur createComptabiliseur() throws ServiceException{
       return icomptabilisateurService.createComptabiliseur(comptabiliseur);
    }
    
    public Comptabiliseur updateComptabiliseur() throws ServiceException{
        return icomptabilisateurService.updateComptabiliseur(comptabiliseur);
    }
    
    public List<Comptabiliseur> findAllComptabiliseur() throws ServiceException{
        return icomptabilisateurService.findAllComptabiliseur();
    }
    
    public void deleteComptabilisateur() throws ServiceException{
      icomptabilisateurService.deleteComptabilisateur(comptabiliseur.getId());
    }

    
}
