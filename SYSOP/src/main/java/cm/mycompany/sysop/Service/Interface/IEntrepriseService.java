/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.Service.Interface;

import cm.mycompany.sysop.data.Entreprise;
import com.douwe.generic.dao.DataAccessException;
import java.util.List;
import org.hibernate.service.spi.ServiceException;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author harold
 */
@Transactional
public interface IEntrepriseService {
    
    public Entreprise createEntreprise(Entreprise entreprise) throws ServiceException;
    
    public Entreprise updateEntreprise(Entreprise entreprise) throws ServiceException;
    
    public Entreprise findEntrepriseById(Long id) throws ServiceException;
    
    public List<Entreprise> findAllEntreprise() throws ServiceException;
    
    public void deleteEntreprise(Long id) throws ServiceException;

}
