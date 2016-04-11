/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.ServiceImplement;

import cm.mycompany.sysop.Dao.Interface.IEvaluationDao;
import cm.mycompany.sysop.ServiceInterface.IEvaluationService;
import cm.mycompany.sysop.data.Evaluation;
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
public class EvaluationServiceImpl implements IEvaluationService{
    
    IEvaluationDao iEvaluationDao;

    public IEvaluationDao getiEvaluationDao() {
        return iEvaluationDao;
    }

    public void setiEvaluationDao(IEvaluationDao iEvaluationDao) {
        this.iEvaluationDao = iEvaluationDao;
    }
    
    
    
    public Evaluation createEvaluation(Evaluation evaluation) throws ServiceException {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iEvaluationDao.create(evaluation);
        } catch (DataAccessException ex) {
            Logger.getLogger(EvaluationServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de creation");
        }
    }

    public Evaluation updateEvaluation(Evaluation evaluation) throws ServiceException {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iEvaluationDao.update(evaluation);
        } catch (DataAccessException ex) {
            Logger.getLogger(EvaluationServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de creation");
        }
    }

    public Evaluation findEvaluationById(Long id) throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iEvaluationDao.findById(id);
        } catch (DataAccessException ex) {
            Logger.getLogger(EvaluationServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de creation");
        }
    }

    public List<Evaluation> findAllEvaluation() throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iEvaluationDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(EvaluationServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de creation");
        }
    }
    
}
