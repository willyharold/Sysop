/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.ServiceImplement;

import cm.mycompany.sysop.ServiceInterface.IComptabilisateurService;
import cm.mycompany.sysop.data.Comptabiliseur;
import java.util.List;
import org.hibernate.service.spi.ServiceException;

/**
 *
 * @author harold
 */

public class ComptablisateurServiceImpl implements IComptabilisateurService{
    
    public Comptabiliseur createComptabiliseur(Comptabiliseur comptabiliseur) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Comptabiliseur updateComptabiliseur(Comptabiliseur comptabiliseur) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Comptabiliseur findComptabiliseurById(Long id) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Comptabiliseur> findAllComptabiliseur() throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
