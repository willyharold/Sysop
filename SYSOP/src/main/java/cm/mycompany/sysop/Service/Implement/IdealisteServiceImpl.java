/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.Service.Implement;

import cm.mycompany.sysop.Dao.Interface.IIdealisteDao;
import cm.mycompany.sysop.Service.Interface.IIdealisteService;
import cm.mycompany.sysop.data.Idealiste;
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
public class IdealisteServiceImpl implements IIdealisteService{
    
    IIdealisteDao iIdealisteDao;

    public IIdealisteDao getiIdealisteDao() {
        return iIdealisteDao;
    }

    public void setiIdealisteDao(IIdealisteDao iIdealisteDao) {
        this.iIdealisteDao = iIdealisteDao;
    }
    
    
    public Idealiste createIdealiste(Idealiste idealiste) throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iIdealisteDao.create(idealiste);
        } catch (DataAccessException ex) {
            Logger.getLogger(IdealisteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw  new ServiceException("impossible de faire le create");
        }
    }

    public Idealiste updateIdealiste(Idealiste idealiste) throws ServiceException {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iIdealisteDao.update(idealiste);
        } catch (DataAccessException ex) {
            Logger.getLogger(IdealisteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw  new ServiceException("impossible de update");
        }
    }

    public Idealiste findIdealisteById(Long id) throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iIdealisteDao.findById(id);
        } catch (DataAccessException ex) {
           Logger.getLogger(IdealisteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
           throw  new ServiceException("impossible de faire la recherche");
        }
    }

    public List<Idealiste> findAllIdealiste() throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iIdealisteDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(IdealisteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw  new ServiceException("impossible de faire le findAll");
        }
    }

    @Override
    public void deleteIdealiste(long id) throws ServiceException {
        try {
            iIdealisteDao.delete(iIdealisteDao.findById(id));
        } catch (DataAccessException ex) {
            Logger.getLogger(IdealisteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
