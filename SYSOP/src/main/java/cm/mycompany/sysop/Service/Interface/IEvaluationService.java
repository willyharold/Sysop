/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.Service.Interface;

import cm.mycompany.sysop.data.Evaluation;
import java.util.List;
import org.hibernate.service.spi.ServiceException;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author doumtsop
 */
@Transactional
public interface IEvaluationService {
    public Evaluation createEvaluation(Evaluation evaluation) throws ServiceException;
    public Evaluation updateEvaluation(Evaluation evaluation) throws ServiceException;
    public Evaluation findEvaluationById(Long id) throws ServiceException;
    public List<Evaluation> findAllEvaluation() throws ServiceException;
    public void deleteEvaluation(Long id) throws ServiceException;
}
