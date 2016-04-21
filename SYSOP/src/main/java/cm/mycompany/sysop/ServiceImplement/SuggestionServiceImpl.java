/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.ServiceImplement;

import cm.mycompany.sysop.Dao.Interface.ISuggestionDao;
import cm.mycompany.sysop.ServiceInterface.ISuggestionService;
import cm.mycompany.sysop.data.Suggestion;
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
public class SuggestionServiceImpl implements ISuggestionService{
    ISuggestionDao iSuggestionDao;

    public ISuggestionDao getiSuggestionDao() {
        return iSuggestionDao;
    }

    public void setiSuggestionDao(ISuggestionDao iSuggestionDao) {
        this.iSuggestionDao = iSuggestionDao;
    }
    
    
    public Suggestion createSuggestion(Suggestion suggestion) throws ServiceException {
        try {
            //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iSuggestionDao.create(suggestion);
        } catch (DataAccessException ex) {
            Logger.getLogger(SuggestionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw  new ServiceException("impossible de faire le create");
        }
    }

    public Suggestion updateSuggestion(Suggestion suggestion) throws ServiceException {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iSuggestionDao.update(suggestion);
        } catch (DataAccessException ex) {
            Logger.getLogger(SuggestionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw  new ServiceException("impossible de faire le update");
        }
    }

    public Suggestion findSuggestionById(Long id) throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iSuggestionDao.findById(id);
        } catch (DataAccessException ex) {
            Logger.getLogger(SuggestionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw  new ServiceException("impossible de faire le le update");
        }
    }

    public List<Suggestion> findAllSuggestion() throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iSuggestionDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(SuggestionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw  new ServiceException("impossible de faire le findALL");
        }
    }
    
}
