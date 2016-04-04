/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.DAoTest;

import cm.mycompany.sysop.DAoImplement.OuvrierDaoImpl;
import cm.mycompany.sysop.Dao.Interface.IOuvrierDao;
import cm.mycompany.sysop.data.Ouvrier;
import com.douwe.generic.dao.DataAccessException;
import com.douwe.generic.dao.impl.GenericDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author doumtsop
 */
public class test {
    public static void main(String[] args) throws DataAccessException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sysopPU");
        EntityManager em = emf.createEntityManager();
        IOuvrierDao iOuvrierDao = new OuvrierDaoImpl();
        ((GenericDao) iOuvrierDao).setManager(em);
        System.out.println("hello");
        
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        
        Ouvrier ouvrier = new Ouvrier();
        ouvrier.setAge(12);
        ouvrier.setNom("mokai");
        ouvrier.setPrenom("pros");
        iOuvrierDao.create(ouvrier);
        
        tx.commit();
            
       
    }
}
