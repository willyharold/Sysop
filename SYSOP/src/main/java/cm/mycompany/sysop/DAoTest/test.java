/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.DAoTest;

import cm.mycompany.sysop.DAo.Implement.OuvrierDaoImpl;
import cm.mycompany.sysop.Dao.Interface.IOuvrierDao;
import cm.mycompany.sysop.Service.Interface.IEntrepriseService;
import cm.mycompany.sysop.Service.Interface.IOuvrierService;
import cm.mycompany.sysop.data.Entreprise;
import cm.mycompany.sysop.data.Ouvrier;
import com.douwe.generic.dao.DataAccessException;
import com.douwe.generic.dao.impl.GenericDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author doumtsop
 */
public class test {
    public static void main(String[] args) throws DataAccessException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-Config.xml");
//        IOuvrierService iOuvrierService = (IOuvrierService)ctx.getBean("IOuvrierService");
//        Ouvrier ouvrier = new Ouvrier();
//        ouvrier.setAge(12);
//        ouvrier.setNom("Achilo");
//        ouvrier.setPrenom("t");
//        iOuvrierService.createOuvrier(ouvrier);

        IEntrepriseService entrepriseService = (IEntrepriseService)ctx.getBean("IEntrepriseService");
        Entreprise entreprise = new Entreprise();
        entreprise.setCode("1234");
        entreprise.setIntitule("REFERENCE");
        entrepriseService.createEntreprise(entreprise);

    }
}
