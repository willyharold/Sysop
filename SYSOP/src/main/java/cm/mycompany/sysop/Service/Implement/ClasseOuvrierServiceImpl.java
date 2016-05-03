package cm.mycompany.sysop.Service.Implement;

import cm.mycompany.sysop.Dao.Interface.IClasseOuvrierDao;
import cm.mycompany.sysop.Service.Interface.ICLasseOuvrierService;
import cm.mycompany.sysop.data.ClasseOuvrier;
import com.douwe.generic.dao.DataAccessException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.service.spi.ServiceException;

/**
 *
 * @author harold
 */
public class ClasseOuvrierServiceImpl implements ICLasseOuvrierService{

    private IClasseOuvrierDao classeOuvrierDao;

    public IClasseOuvrierDao getClasseOuvrierDao() {
        return classeOuvrierDao;
    }

    public void setClasseOuvrierDao(IClasseOuvrierDao classeOuvrierDao) {
        this.classeOuvrierDao = classeOuvrierDao;
    }
    
    
    public ClasseOuvrier createClasseOuvrier(ClasseOuvrier classeOuvrier) throws ServiceException {
        try {
            return classeOuvrierDao.create(classeOuvrier);
        } catch (DataAccessException ex) {
            Logger.getLogger(ClasseOuvrierServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de creation");
        }
        
    }

    public ClasseOuvrier updateClasseOuvrier(ClasseOuvrier classeOuvrier) throws ServiceException {
        try {
            return classeOuvrierDao.update(classeOuvrier);
        } catch (DataAccessException ex) {
            Logger.getLogger(ClasseOuvrierServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de creation");
        }
    }

    public ClasseOuvrier findClasseOuvrierById(Long id) throws ServiceException {
        try {
            return classeOuvrierDao.findById(id);
        } catch (DataAccessException ex) {
            Logger.getLogger(ClasseOuvrierServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de creation");
        }
    }

    public List<ClasseOuvrier> findAllClasseOuvrier() throws ServiceException {
        try {
            return classeOuvrierDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(ClasseOuvrierServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de creation");
        }
    }

    public void deleteClasseOuvrier(Long id) throws ServiceException {
        try {
            classeOuvrierDao.delete(classeOuvrierDao.findById(id));
        } catch (DataAccessException ex) {
            Logger.getLogger(ClasseOuvrierServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
