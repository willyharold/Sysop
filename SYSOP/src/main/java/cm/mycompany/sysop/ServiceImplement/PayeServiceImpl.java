/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.ServiceImplement;

import cm.mycompany.sysop.ServiceInterface.IPayeService;
import cm.mycompany.sysop.data.Paye;
import java.util.List;
import org.hibernate.service.spi.ServiceException;

/**
 *
 * @author harold
 */
public class PayeServiceImpl implements IPayeService{

    public Paye createPaye(Paye paye) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Paye updatePaye(Paye Paye) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Paye findPayeById(Long id) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Paye> findAllPaye() throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
