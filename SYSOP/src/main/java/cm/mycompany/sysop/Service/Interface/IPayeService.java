/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.Service.Interface;

import cm.mycompany.sysop.data.Paye;
import java.util.List;
import org.hibernate.service.spi.ServiceException;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author harold
 */
@Transactional
public interface IPayeService {
    public Paye createPaye(Paye paye) throws ServiceException;
   
    public Paye updatePaye(Paye Paye) throws ServiceException;
    
    public Paye findPayeById(Long id) throws ServiceException;
    
    public List<Paye> findAllPaye() throws ServiceException;
    
    public void deletePaye(Long id) throws ServiceException;
}

