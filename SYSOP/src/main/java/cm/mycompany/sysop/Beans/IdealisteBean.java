/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.Beans;

import cm.mycompany.sysop.Service.Interface.IIdealisteService;
import cm.mycompany.sysop.Service.Interface.IOuvrierService;
import cm.mycompany.sysop.data.Idealiste;
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
public class IdealisteBean {
    
    @ManagedProperty(value = "#{IIdealisteService}")
    private IIdealisteService idealisteService;

    private Idealiste idealiste;

    public Idealiste getIdealiste() {
        return idealiste;
    }

    public void setIdealiste(Idealiste idealiste) {
        this.idealiste = idealiste;
    }
       
    
    public IIdealisteService getIdealisteService() {
        return idealisteService;
    }

    public void setIdealisteService(IIdealisteService idealisteService) {
        this.idealisteService = idealisteService;
    }
    
    public Idealiste createIdealiste() throws ServiceException{
        return idealisteService.createIdealiste(idealiste);
    }
    
    public void deleteIdealiste() throws ServiceException{
        idealisteService.deleteIdealiste(idealiste.getId());
    }
  
    public Idealiste updateIdealiste(Idealiste idealiste) throws ServiceException{
        return idealisteService.updateIdealiste(idealiste);
    }
    
    public List<Idealiste> findAllIdealiste() throws ServiceException{
        return idealisteService.findAllIdealiste();
    }
    
    
}
