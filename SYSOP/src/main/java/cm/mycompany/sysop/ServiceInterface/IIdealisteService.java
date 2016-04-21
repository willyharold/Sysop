/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.ServiceInterface;

import cm.mycompany.sysop.data.Evaluation;
import cm.mycompany.sysop.data.Idealiste;
import java.util.List;
import org.hibernate.service.spi.ServiceException;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author doumtsop
 */
@Transactional
public interface IIdealisteService {
    public Idealiste createIdealiste(Idealiste idealiste) throws ServiceException;
    public Idealiste updateIdealiste(Idealiste idealiste) throws ServiceException;
    public Idealiste findIdealisteById(Long id) throws ServiceException;
    public List<Idealiste> findAllIdealiste() throws ServiceException;
}
