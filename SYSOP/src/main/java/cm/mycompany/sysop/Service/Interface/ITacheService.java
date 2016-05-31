/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.Service.Interface;

import cm.mycompany.sysop.data.Suggestion;
import cm.mycompany.sysop.data.Tache;
import java.util.List;
import org.hibernate.service.spi.ServiceException;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author doumtsop
 */
@Transactional
public interface ITacheService {
    public Tache createTache(Tache tache) throws ServiceException;
    
    public void deleteTache(Long id) throws ServiceException;
    
    public Tache updateTache(Tache tache) throws ServiceException;
    
    public Tache findTacheById(Long id) throws ServiceException;
    
    public List<Tache> findAllTache() throws ServiceException;
}
