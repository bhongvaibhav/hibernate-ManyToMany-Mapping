package com.tybsc.hibernate6_ManyToMany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       SessionFactory factory = new Configuration().configure().buildSessionFactory();
       Session session = factory.openSession();
       Transaction tx = session.beginTransaction();

       
       Employee e1 = new Employee(11,"ABC");
       Employee e2 = new Employee(12,"PQR");
       
       Project p1 = new Project(111,"Management System");
       Project p2 = new Project(112,"Echo System");
       Project p3 = new Project(113,"Library System");
       Project p4 = new Project(114,"Hostel System");
       
       ArrayList<Employee>empList1 = new ArrayList<Employee>();
       empList1.add(e1);
       
       ArrayList<Project>prjList1 = new ArrayList<Project>();
       prjList1.add(p1);
       prjList1.add(p2);
       
       e1.setProjects(prjList1);
       
       ArrayList<Employee>empList2 = new ArrayList<Employee>();
       empList2.add(e2);
       
       ArrayList<Project>prjList2 = new ArrayList<Project>();
       prjList2.add(p1);
       prjList2.add(p2);
       prjList2.add(p3);
       prjList2.add(p4);
       
       e2.setProjects(prjList2);
       
       session.save(e1);
       session.save(e2);
       
       
       session.save(p1);
       session.save(p2);
       session.save(p3);
       session.save(p4);
       
       tx.commit();
       
       session.close();
       factory.close();
           
    }
}
