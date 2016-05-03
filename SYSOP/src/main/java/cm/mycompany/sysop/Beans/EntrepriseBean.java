/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.Beans;

import cm.mycompany.sysop.Service.Interface.IEntrepriseService;
import cm.mycompany.sysop.data.Entreprise;
import com.douwe.generic.dao.DataAccessException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import org.hibernate.service.spi.ServiceException;



/**
 *
 * @author doumtsop
 */
@ManagedBean
@RequestScoped
public class EntrepriseBean {
    
    @ManagedProperty(value = "#{IEntrepriseService}")
    IEntrepriseService iEntrepriseService;
    
    
    private Entreprise entreprise = new Entreprise();
    private List<Entreprise> entreprises = new LinkedList<Entreprise>();

    
    public List<Entreprise> getEntreprises() {   

        try {
            entreprises = iEntrepriseService.findAllEntreprise();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(entreprises);
        return entreprises;
    }

    public void setEntreprises(List<Entreprise> entreprises) {
        this.entreprises = entreprises;
    }
  
    public EntrepriseBean() {
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public IEntrepriseService getiEntrepriseService() {
        return iEntrepriseService;
    }

    public void setiEntrepriseService(IEntrepriseService iEntrepriseService) {
        this.iEntrepriseService = iEntrepriseService;
    }
    
    
    public Entreprise createEntreprise() throws ServiceException{
      return iEntrepriseService.createEntreprise(entreprise);
    }
    public Entreprise updateEntreprise() throws ServiceException{
      return iEntrepriseService.updateEntreprise(entreprise);
    }
    public Entreprise findEntrepriseById() throws ServiceException{
      return iEntrepriseService.findEntrepriseById(entreprise.getId());
    }
    
    public void deleteEntreprise(Long id) throws ServiceException{
       iEntrepriseService.deleteEntreprise(entreprise.getId());
    }
    
}
