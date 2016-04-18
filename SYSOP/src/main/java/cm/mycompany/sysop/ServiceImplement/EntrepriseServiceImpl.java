/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.ServiceImplement;

import cm.mycompany.sysop.Dao.Interface.IEntrepriseDao;
import cm.mycompany.sysop.ServiceInterface.IEntrepriseService;
import cm.mycompany.sysop.data.Entreprise;
import com.douwe.generic.dao.DataAccessException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.service.spi.ServiceException;

/**
 *
 * @author harold
 */
public class EntrepriseServiceImpl implements IEntrepriseService{

    private IEntrepriseDao entrepriseDao;

    public IEntrepriseDao getEntrepriseDao() {
        return entrepriseDao;
    }

    public void setEntrepriseDao(IEntrepriseDao entrepriseDao) {
        this.entrepriseDao = entrepriseDao;
    }
    
    public Entreprise createEntreprise(Entreprise entreprise) throws ServiceException {
        try {
            return entrepriseDao.create(entreprise);
        } catch (DataAccessException ex) {
            Logger.getLogger(EntrepriseServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de creation");   
        }
    }

    public Entreprise updateEntreprise(Entreprise entreprise) throws ServiceException {
        try {
            return entrepriseDao.update(entreprise);
        } catch (DataAccessException ex) {
            Logger.getLogger(EntrepriseServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de creation");
        }
    }

    public Entreprise findEntrepriseById(Long id) throws ServiceException {
        try {
            return entrepriseDao.findById(id);
        } catch (DataAccessException ex) {
            Logger.getLogger(EntrepriseServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de creation");
        }
    }

    public List<Entreprise> findAllEntreprise() throws ServiceException {
        try {
            return entrepriseDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(EntrepriseServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de creation");
        }
    }
    
}
