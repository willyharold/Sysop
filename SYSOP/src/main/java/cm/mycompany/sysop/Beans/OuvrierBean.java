/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.Beans;

import cm.mycompany.sysop.Service.Interface.IOuvrierService;
import cm.mycompany.sysop.data.Ouvrier;
import java.util.List;
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
public class OuvrierBean {
    
    @ManagedProperty(value = "#{IOuvrierService}")
    IOuvrierService iOuvrierService;
    
    private Ouvrier ouvrier = new Ouvrier();

    public OuvrierBean() {
    }

    public IOuvrierService getiOuvrierService() {
        return iOuvrierService;
    }

    public void setiOuvrierService(IOuvrierService iOuvrierService) {
        this.iOuvrierService = iOuvrierService;
    }

    public Ouvrier getOuvrier() {
        return ouvrier;
    }

    public void setOuvrier(Ouvrier ouvrier) {
        this.ouvrier = ouvrier;
    }
    
    public Ouvrier createOuvrier() throws ServiceException{
     return iOuvrierService.createOuvrier(ouvrier);
    }
    public Ouvrier updateOuvrier() throws ServiceException{
     return iOuvrierService.updateOuvrier(ouvrier);
    }
    public Ouvrier findOuvrierById() throws ServiceException{
     return iOuvrierService.findOuvrierById(ouvrier.getId());
    }
    public List<Ouvrier> findAllOuvrier() throws ServiceException{
     return iOuvrierService.findAllOuvrier();
    }
}
