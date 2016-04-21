/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.ServiceImplement;

import cm.mycompany.sysop.Dao.Interface.ITacheDao;
import cm.mycompany.sysop.ServiceInterface.ITacheService;
import cm.mycompany.sysop.data.Tache;
import com.douwe.generic.dao.DataAccessException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.service.spi.ServiceException;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author doumtsop
 */
@Transactional
public class TacheServiceImpl implements ITacheService{
    ITacheDao iTacheDao;

    public ITacheDao getiTacheDao() {
        return iTacheDao;
    }

    public void setiTacheDao(ITacheDao iTacheDao) {
        this.iTacheDao = iTacheDao;
    }
    
    
    public Tache createTache(Tache tache) throws ServiceException {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iTacheDao.create(tache);
        } catch (DataAccessException ex) {
            Logger.getLogger(TacheServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw  new ServiceException("impossible de faire le create");
        }
    }

    public Tache updateTache(Tache tache) throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iTacheDao.update(tache);
        } catch (DataAccessException ex) {
            Logger.getLogger(TacheServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw  new ServiceException("impossible de faire le update");
        }
    }

    public Tache findTacheById(Long id) throws ServiceException {
        try {
            //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iTacheDao.findById(id);
        } catch (DataAccessException ex) {
            Logger.getLogger(TacheServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw  new ServiceException("impossible de faire le findById");
        }
    }

    public List<Tache> findAllTache() throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iTacheDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(TacheServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw  new ServiceException("impossible de faire le findAll");
        }
    }
    
}
