/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.Service.Implement;

import cm.mycompany.sysop.Dao.Interface.IRendementDao;
import cm.mycompany.sysop.Service.Interface.IRendementService;
import cm.mycompany.sysop.data.Rendement;
import com.douwe.generic.dao.DataAccessException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.service.spi.ServiceException;

/**
 *
 * @author harold
 */
public class RendementServiceImpl implements IRendementService{

    private IRendementDao rendementDao;

    public IRendementDao getRendementDao() {
        return rendementDao;
    }

    public void setRendementDao(IRendementDao rendementDao) {
        this.rendementDao = rendementDao;
    }
    
    
    public Rendement createRendement(Rendement rendement) throws ServiceException {
        try {
            return rendementDao.create(rendement);
        } catch (DataAccessException ex) {
            Logger.getLogger(RendementServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de creation");
        }
    }

    public Rendement updateRendement(Rendement rendement) throws ServiceException {
        try {
            return rendementDao.update(rendement);
        } catch (DataAccessException ex) {
            Logger.getLogger(RendementServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de creation");
        }
    }

    public Rendement findRendementById(Long id) throws ServiceException {
        try {
            return rendementDao.findById(id);
        } catch (DataAccessException ex) {
            Logger.getLogger(RendementServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de creation");
        }
    }

    public List<Rendement> findAllRendement() throws ServiceException {
        try {
            return rendementDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(RendementServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de creation");
        }
    }

    public void deleteRendement(Long id) throws ServiceException {
        try {
            rendementDao.delete(rendementDao.findById(id));
        } catch (DataAccessException ex) {
            Logger.getLogger(RendementServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
    
}
