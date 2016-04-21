/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.ServiceImplement;

import cm.mycompany.sysop.Dao.Interface.IOuvrierDao;
import cm.mycompany.sysop.ServiceInterface.IOuvrierService;
import cm.mycompany.sysop.data.Ouvrier;
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
public class OuvrierServiceImpl implements IOuvrierService{
    IOuvrierDao iOuvrierDao;

    public IOuvrierDao getiOuvrierDao() {
        return iOuvrierDao;
    }

    public void setiOuvrierDao(IOuvrierDao iOuvrierDao) {
        this.iOuvrierDao = iOuvrierDao;
    }
    
    
    public Ouvrier createOuvrier(Ouvrier ouvrier) throws ServiceException {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iOuvrierDao.create(ouvrier);
        } catch (DataAccessException ex) {
            Logger.getLogger(OuvrierServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw  new ServiceException("impossible de faire le create");
        }
    }

    public Ouvrier updateOuvrier(Ouvrier ouvrier) throws ServiceException {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iOuvrierDao.update(ouvrier);
        } catch (DataAccessException ex) {
            Logger.getLogger(OuvrierServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw  new ServiceException("impossible de faire la mise a jours");
        }
    }

    public Ouvrier findOuvrierById(Long id) throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iOuvrierDao.findById(id);
        } catch (DataAccessException ex) {
            Logger.getLogger(OuvrierServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw  new ServiceException("impossible de faire le findById");
        }
    }

    public List<Ouvrier> findAllOuvrier() throws ServiceException {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iOuvrierDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(OuvrierServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw  new ServiceException("impossible de faire le findAll");
        }
    }
    
}
