/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.Service.Interface;

import cm.mycompany.sysop.data.ClasseOuvrier;
import cm.mycompany.sysop.data.Paye;
import java.util.List;
import org.hibernate.service.spi.ServiceException;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author harold
 */
@Transactional
public interface ICLasseOuvrierService {
    public ClasseOuvrier createClasseOuvrier(ClasseOuvrier classeOuvrier) throws ServiceException;
   
    public ClasseOuvrier updateClasseOuvrier(ClasseOuvrier classeOuvrier) throws ServiceException;
    
    public ClasseOuvrier findClasseOuvrierById(Long id) throws ServiceException;
    
    public List<ClasseOuvrier> findAllClasseOuvrier() throws ServiceException;
    
    public void deleteClasseOuvrier(Long id) throws ServiceException;
}
