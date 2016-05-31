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
import org.primefaces.model.SelectableDataModel;



/**
 *
 * @author doumtsop
 */
@ManagedBean
@RequestScoped
public class EntrepriseBean implements SelectableDataModel<Entreprise> {
    
    @ManagedProperty(value = "#{IEntrepriseService}")
    IEntrepriseService iEntrepriseService;
    
    
    private Entreprise entreprise = new Entreprise();
    private Entreprise entreprisechoisi = new Entreprise();
    private List<Entreprise> entreprises = new LinkedList<Entreprise>();

    
    public List<Entreprise> getEntreprises() {   

        try {
            entreprises = iEntrepriseService.findAllEntreprise();
        } catch (Exception e) {
            System.out.println(e);
        }
        return entreprises;
    }

    public void setEntreprises(List<Entreprise> entreprises) {
        this.entreprises = entreprises;
    }
  
    public EntrepriseBean() {
    }

    public Entreprise getEntreprise() {
        
        System.out.println("hello " +entreprise);
        return entreprise;
    }

    public Entreprise getEntreprisechoisi() {
        return entreprisechoisi;
    }

    public void setEntreprisechoisi(Entreprise entreprisechoisi) {
        this.entreprisechoisi = entreprisechoisi;
    }


    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
        System.out.println(entreprise);
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
      return iEntrepriseService.updateEntreprise(entreprisechoisi);
    }
    public Entreprise findEntrepriseById() throws ServiceException{
      return iEntrepriseService.findEntrepriseById(entreprise.getId());
    }
    
    public void deleteEntreprise(Long id) throws ServiceException{
       iEntrepriseService.deleteEntreprise(entreprise.getId());
    }

    @Override
    public Entreprise getRowData(String rowKey){

        List<Entreprise> ag = getEntreprises();
        for (Entreprise entre : ag) {
            if (entre.getId().equals(rowKey)) {
                return entre;
            }
        }
        return null;
    }

    @Override
    public Object getRowKey(Entreprise ag) {
        return ag.getId();
    }
    
}
