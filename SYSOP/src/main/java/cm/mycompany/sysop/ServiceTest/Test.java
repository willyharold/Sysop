/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.sysop.ServiceTest;

import cm.mycompany.sysop.Service.Interface.IOuvrierService;
import cm.mycompany.sysop.data.Ouvrier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author doumtsop
 */
public class Test {
    public static void main(String[] args) {
         System.out.println( "Hello World!" );
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:Spring-Config.xml");    
        IOuvrierService iOuvrierService = ctx.getBean("IOuvrierService", IOuvrierService.class);
        Ouvrier ouvrier= new Ouvrier();
        ouvrier.setAge(16);
        ouvrier.setNom("mokai");
        ouvrier.setPrenom("le Pros");
        iOuvrierService.createOuvrier(ouvrier);
        
        System.out.println("SUCCES OF OPERATIONS");
    }
       
}
