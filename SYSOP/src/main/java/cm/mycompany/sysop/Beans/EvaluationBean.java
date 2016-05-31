/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.Beans;

import cm.mycompany.sysop.Service.Interface.IEvaluationService;
import cm.mycompany.sysop.data.Evaluation;
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
public class EvaluationBean {
    @ManagedProperty(value = "#{IEvaluationService}")
    private IEvaluationService iEvaluationService;
    private Evaluation evaluation;

    public IEvaluationService getiEvaluationService() {
        return iEvaluationService;
    }

    public void setiEvaluationService(IEvaluationService iEvaluationService) {
        this.iEvaluationService = iEvaluationService;
    }

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }
    
    public Evaluation createEvaluation() throws ServiceException{
        return iEvaluationService.createEvaluation(evaluation);
    }
    
    public Evaluation updateEvaluation() throws ServiceException{
        return iEvaluationService.updateEvaluation(evaluation);
    }
    
    public List<Evaluation> findAllEvaluation() throws ServiceException{
        return iEvaluationService.findAllEvaluation();
    }
    
    public void deleteEvaluation() throws ServiceException{
        iEvaluationService.deleteEvaluation(evaluation.getId());
    }
    
}
