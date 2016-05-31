/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.Beans;

import cm.mycompany.sysop.Service.Interface.ITacheService;
import cm.mycompany.sysop.data.Tache;
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
public class TacheBean {
    @ManagedProperty(value = "#{ITacheService}")
    private ITacheService iTacheService;
    private Tache tache;

    public ITacheService getiTacheService() {
        return iTacheService;
    }

    public void setiTacheService(ITacheService iTacheService) {
        this.iTacheService = iTacheService;
    }

    public Tache getTache() {
        return tache;
    }

    public void setTache(Tache tache) {
        this.tache = tache;
    }
    public Tache createTache() throws ServiceException{
       return iTacheService.createTache(tache);
    }
    
    public void deleteTache() throws ServiceException{
        iTacheService.deleteTache(tache.getId());
    }
    
    public Tache updateTache() throws ServiceException{
       return iTacheService.updateTache(tache);
    }
    
    public List<Tache> findAllTache() throws ServiceException{
       return iTacheService.findAllTache();
    }
    
}
