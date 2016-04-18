/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.ServiceImplement;

import cm.mycompany.sysop.ServiceInterface.IRendementService;
import cm.mycompany.sysop.data.Rendement;
import java.util.List;
import org.hibernate.service.spi.ServiceException;

/**
 *
 * @author harold
 */
public class RendementServiceImpl implements IRendementService{

    public Rendement createRendement(Rendement rendement) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Rendement updateRendement(Rendement rendement) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Rendement findRendementById(Long id) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Rendement> findAllRendement() throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
