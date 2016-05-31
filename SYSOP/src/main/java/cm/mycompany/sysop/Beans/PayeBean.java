/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.Beans;

import cm.mycompany.sysop.Service.Interface.IPayeService;
import cm.mycompany.sysop.data.Paye;
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

public class PayeBean {
    @ManagedProperty(value = "#{IPayeService}")
    private IPayeService iPayeService;
    private Paye paye;

    public IPayeService getiPayeService() {
        return iPayeService;
    }

    public void setiPayeService(IPayeService iPayeService) {
        this.iPayeService = iPayeService;
    }

    public Paye getPaye() {
        return paye;
    }

    public void setPaye(Paye paye) {
        this.paye = paye;
    }
    public Paye createPaye() throws ServiceException{
        return iPayeService.createPaye(paye);
        
    }
   
    public Paye updatePaye() throws ServiceException{
        return iPayeService.updatePaye(paye);
    }
    
    public List<Paye> findAllPaye() throws ServiceException{
        return iPayeService.findAllPaye();
    }
    
    public void deletePaye(Long id) throws ServiceException{
        iPayeService.deletePaye(paye.getId());
        
    }
    
}
