/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.Beans;

import cm.mycompany.sysop.Service.Interface.ISuggestionService;
import cm.mycompany.sysop.data.Suggestion;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import org.hibernate.service.spi.ServiceException;

/**
 *
 * @author harold
 */
@ManagedBean
@RequestScoped
public class SuggestionBean {
    @ManagedProperty(value = "#{ISuggestionService}")
    private ISuggestionService iSuggestionService;
    private Suggestion suggestion;

    public ISuggestionService getiSuggestionService() {
        return iSuggestionService;
    }

    public void setiSuggestionService(ISuggestionService iSuggestionService) {
        this.iSuggestionService = iSuggestionService;
    }

    public Suggestion getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(Suggestion suggestion) {
        this.suggestion = suggestion;
    }
    
    public Suggestion createSuggestion() throws ServiceException{
        return iSuggestionService.createSuggestion(suggestion);
    }
    
    public void deleteSuggestion() throws ServiceException{
        iSuggestionService.deleteSuggestion(suggestion.getId());
    }
    
    public Suggestion updateSuggestion() throws ServiceException{
        return iSuggestionService.updateSuggestion(suggestion);
    }
      
    public List<Suggestion> findAllSuggestion() throws ServiceException{
        return iSuggestionService.findAllSuggestion();
    }
}
