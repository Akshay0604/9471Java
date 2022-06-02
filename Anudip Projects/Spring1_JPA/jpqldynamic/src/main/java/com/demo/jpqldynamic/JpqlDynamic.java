package com.demo.jpqldynamic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.demo.jpqldynamic.entity.StudentEntity;




public class JpqlDynamic 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_details");  
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin();  
          
        StudentEntity s1=new StudentEntity();  
       // s1.setS_id(101);  
        s1.setS_name("Gaurav");  
        s1.setS_age(24);  
          
        StudentEntity s2=new StudentEntity();  
     //   s2.setS_id(102);  
        s2.setS_name("Ronit");  
        s2.setS_age(22);  
          
        StudentEntity s3=new StudentEntity();  
       // s3.setS_id(103);  
        s3.setS_name("Rahul");  
        s3.setS_age(26);  
          
        em.persist(s1);  
        em.persist(s2);  
        em.persist(s3);       
  
        em.getTransaction().commit(); 
        
        Query query=em.createQuery("select s from StudentEntity s");
        @SuppressWarnings("unchecked")
		List<StudentEntity> list=query.getResultList();
        System.out.println("Student Details");
        for (StudentEntity s : list) {
			System.out.println(s.getS_name());
		}
          
        emf.close();  
        em.close();  
    }
}
