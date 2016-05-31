/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.Service.Interface;

import cm.mycompany.sysop.data.ClasseOuvrier;
import cm.mycompany.sysop.data.Rendement;
import java.util.List;
import org.hibernate.service.spi.ServiceException;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author harold
 */
@Transactional
public interface IRendementService {
    
    public Rendement createRendement(Rendement rendement) throws ServiceException;
    
    public Rendement updateRendement(Rendement rendement) throws ServiceException;
    
    public Rendement findRendementById(Long id) throws ServiceException;
    
    public List<Rendement> findAllRendement() throws ServiceException;
    
    public void deleteRendement(Long id) throws ServiceException;
    
}
