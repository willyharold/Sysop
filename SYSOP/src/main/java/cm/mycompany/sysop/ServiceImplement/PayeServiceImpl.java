/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.ServiceImplement;

import cm.mycompany.sysop.Dao.Interface.IPayeDao;
import cm.mycompany.sysop.ServiceInterface.IPayeService;
import cm.mycompany.sysop.data.Paye;
import com.douwe.generic.dao.DataAccessException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.service.spi.ServiceException;

/**
 *
 * @author harold
 */
public class PayeServiceImpl implements IPayeService{

    private IPayeDao payeDao;

    public IPayeDao getPayeDao() {
        return payeDao;
    }

    public void setPayeDao(IPayeDao payeDao) {
        this.payeDao = payeDao;
    }
    
    
    public Paye createPaye(Paye paye) throws ServiceException {
        try {
            return payeDao.create(paye);
        } catch (DataAccessException ex) {
            Logger.getLogger(PayeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de creation");
        }
    }

    public Paye updatePaye(Paye Paye) throws ServiceException {
        try {
            return payeDao.update(Paye);
        } catch (DataAccessException ex) {
            Logger.getLogger(PayeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        throw new ServiceException("erreur de creation");
        }
        
    }

    public Paye findPayeById(Long id) throws ServiceException {
        try {
            return payeDao.findById(id);
        } catch (DataAccessException ex) {
            Logger.getLogger(PayeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de creation");
        }
    }

    public List<Paye> findAllPaye() throws ServiceException {
        try {
            return payeDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(PayeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de creation");
        }
    }

    public void deletePaye(Long id) throws ServiceException {
        try {
            payeDao.delete(payeDao.findById(id));
        } catch (DataAccessException ex) {
            Logger.getLogger(PayeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
    
}
