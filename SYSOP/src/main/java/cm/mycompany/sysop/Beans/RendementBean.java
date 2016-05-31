/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.Beans;

import cm.mycompany.sysop.Service.Interface.IRendementService;
import cm.mycompany.sysop.data.Rendement;
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
public class RendementBean {
    @ManagedProperty(value = "#{IRendementService}")
    private IRendementService iRendementService;
    private Rendement rendement;

    public IRendementService getiRendementService() {
        return iRendementService;
    }

    public void setiRendementService(IRendementService iRendementService) {
        this.iRendementService = iRendementService;
    }

    public Rendement getRendement() {
        return rendement;
    }

    public void setRendement(Rendement rendement) {
        this.rendement = rendement;
    }
    
    public Rendement createRendement() throws ServiceException{
        return iRendementService.createRendement(rendement);
    }
    
    public Rendement updateRendement() throws ServiceException{
        return iRendementService.updateRendement(rendement);
    }
        
    public List<Rendement> findAllRendement() throws ServiceException{
        return iRendementService.findAllRendement();
    }
    
    public void deleteRendement() throws ServiceException{
        iRendementService.deleteRendement(rendement.getId());
    }
}
