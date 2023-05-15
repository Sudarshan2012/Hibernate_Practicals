/*
 * 
 * Write down a program to show how to create basic hibernate application by inserting  the object in the table. 

   Entity file: Student- Student id, Student Name, Student Age 
 * */

package com.hibernate.demoproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class MainClass 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "Project has Started!!!" );
    	//creating the configuration
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
       // building the session factory on the configuration
        SessionFactory factory=cfg.buildSessionFactory();
        
      //creating the object
        Student s1=new Student();
        s1.setSid(101);
        s1.setSname("Ram");
        s1.setSage(14);
        
        //starting the session in the session factory
        Session session=factory.openSession();
        // starting the transaction
        Transaction tx=session.beginTransaction();
        // pushing the object in the session
        session.save(s1);
        //saving the transaction
        tx.commit();
        //closing the session and the factory
        session.close();
        factory.close();
    }
}
