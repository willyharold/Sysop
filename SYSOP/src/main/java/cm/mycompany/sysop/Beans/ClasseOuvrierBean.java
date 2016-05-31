/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.Beans;

import cm.mycompany.sysop.Service.Interface.ICLasseOuvrierService;
import cm.mycompany.sysop.data.ClasseOuvrier;
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
public class ClasseOuvrierBean {
    @ManagedProperty(value = "#{ICLasseOuvrierService}")
    private ICLasseOuvrierService icLasseOuvrierService;
    private ClasseOuvrier classeOuvrier;

    public ICLasseOuvrierService getIcLasseOuvrierService() {
        return icLasseOuvrierService;
    }

    public void setIcLasseOuvrierService(ICLasseOuvrierService icLasseOuvrierService) {
        this.icLasseOuvrierService = icLasseOuvrierService;
    }
    
    public ClasseOuvrier getClasseOuvrier() {
        return classeOuvrier;
    }

    public void setClasseOuvrier(ClasseOuvrier classeOuvrier) {
        this.classeOuvrier = classeOuvrier;
    }
 
    public ClasseOuvrier createClasseOuvrier() throws ServiceException{
        return icLasseOuvrierService.createClasseOuvrier(classeOuvrier);
    }
   
    public ClasseOuvrier updateClasseOuvrier() throws ServiceException{
        return icLasseOuvrierService.updateClasseOuvrier(classeOuvrier);
    }
    
    public List<ClasseOuvrier> findAllClasseOuvrier() throws ServiceException{
        return icLasseOuvrierService.findAllClasseOuvrier();
    }
    
    public void deleteClasseOuvrier(Long id) throws ServiceException{
        icLasseOuvrierService.deleteClasseOuvrier(classeOuvrier.getId());
    }
    
}
