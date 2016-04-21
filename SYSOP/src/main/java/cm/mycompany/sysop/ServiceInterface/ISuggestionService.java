/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.ServiceInterface;

import cm.mycompany.sysop.data.Suggestion;
import java.util.List;
import org.hibernate.service.spi.ServiceException;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author doumtsop
 */
@Transactional
public interface ISuggestionService {
    public Suggestion createSuggestion(Suggestion suggestion) throws ServiceException;
    public Suggestion updateSuggestion(Suggestion suggestion) throws ServiceException;
    public Suggestion findSuggestionById(Long id) throws ServiceException;
    public List<Suggestion> findAllSuggestion() throws ServiceException;
}
