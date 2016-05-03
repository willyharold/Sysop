/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.Service.Interface;

import cm.mycompany.sysop.data.Idealiste;
import cm.mycompany.sysop.data.Ouvrier;
import java.util.List;
import org.hibernate.service.spi.ServiceException;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author doumtsop
 */
@Transactional
public interface IOuvrierService {
    public Ouvrier createOuvrier(Ouvrier ouvrier) throws ServiceException;
    public Ouvrier updateOuvrier(Ouvrier ouvrier) throws ServiceException;
    public Ouvrier findOuvrierById(Long id) throws ServiceException;
    public List<Ouvrier> findAllOuvrier() throws ServiceException;
}
