/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.Service.Interface;

import cm.mycompany.sysop.data.Comptabiliseur;
import cm.mycompany.sysop.data.Rendement;
import java.util.List;
import org.hibernate.service.spi.ServiceException;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author harold
 */
@Transactional
public interface IComptabilisateurService {
    public Comptabiliseur createComptabiliseur(Comptabiliseur comptabiliseur) throws ServiceException;
    
    public Comptabiliseur updateComptabiliseur(Comptabiliseur comptabiliseur) throws ServiceException;
    
    public Comptabiliseur findComptabiliseurById(Long id) throws ServiceException;
    
    public List<Comptabiliseur> findAllComptabiliseur() throws ServiceException;
    
    public void deleteComptabilisateur(Long id) throws ServiceException;

}
