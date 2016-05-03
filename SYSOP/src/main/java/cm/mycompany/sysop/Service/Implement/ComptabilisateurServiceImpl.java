/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.Service.Implement;

import cm.mycompany.sysop.Dao.Interface.IComptabiliseurDao;
import cm.mycompany.sysop.Service.Interface.IComptabilisateurService;
import cm.mycompany.sysop.data.Comptabiliseur;
import com.douwe.generic.dao.DataAccessException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.service.spi.ServiceException;

/**
 *
 * @author harold
 */
public class ComptabilisateurServiceImpl implements IComptabilisateurService{
    private IComptabiliseurDao comptabiliseurDao;

    public IComptabiliseurDao getComptabiliseurDao() {
        return comptabiliseurDao;
    }

    public void setComptabiliseurDao(IComptabiliseurDao comptabiliseurDao) {
        this.comptabiliseurDao = comptabiliseurDao;
    }
    
    public Comptabiliseur createComptabiliseur(Comptabiliseur comptabiliseur) throws ServiceException {
        try {
            return comptabiliseurDao.create(comptabiliseur);
        } catch (DataAccessException ex) {
            Logger.getLogger(ComptabilisateurServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de creation");
        }
    }

    public Comptabiliseur updateComptabiliseur(Comptabiliseur comptabiliseur) throws ServiceException {
        try {
            return comptabiliseurDao.update(comptabiliseur);
        } catch (DataAccessException ex) {
            Logger.getLogger(ComptabilisateurServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de creation");
        }
}

    public Comptabiliseur findComptabiliseurById(Long id) throws ServiceException {
        try {
            return comptabiliseurDao.findById(id);
        } catch (DataAccessException ex) {
            Logger.getLogger(ComptabilisateurServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de creation");
        }
}

    public List<Comptabiliseur> findAllComptabiliseur() throws ServiceException {
        try {
            return comptabiliseurDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(ComptabilisateurServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de creation");
        }
}

    public void deleteComptabilisateur(Long id) throws ServiceException {
        try {
            comptabiliseurDao.delete(comptabiliseurDao.findById(id));
        } catch (DataAccessException ex) {
            Logger.getLogger(ComptabilisateurServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
}
