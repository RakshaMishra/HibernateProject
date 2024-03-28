package com.kodnest;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodnest.entity.Bike;
import com.kodnest.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg = new Configuration();
       cfg.configure();
    SessionFactory factory  = cfg.buildSessionFactory();
   Session session= factory.openSession();
   
   Transaction tr=session.beginTransaction();
   Student s=new Student("aditi",5);
   //session .update(s);
   //session.delete(s);
   //Bike b=new Bike("ktm",3);
   session.save(s);
  // session.save(b);
   tr.commit();
   
    
     }
}
