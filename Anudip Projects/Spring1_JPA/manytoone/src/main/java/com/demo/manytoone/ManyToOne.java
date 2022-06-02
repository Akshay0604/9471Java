package com.demo.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.manytoone.entity.Library;
import com.demo.manytoone.entity.Student;

public class ManyToOne {  
	  
    public static void main(String[] args) {  
          
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("books_issued");  
          
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin();  
          
        Library lib=new Library();  
       // lib.setBook_id(101);  
        lib.setBook_name("Data Structure");  
          
        em.persist(lib);  
          
        Student st1=new Student();  
        //st1.setS_id(1);  
        st1.setS_name("Vipul");  
       st1.setLib(lib);  
      
          
        Student st2=new Student();  
        //st2.setS_id(2);  
        st2.setS_name("Vimal");  
        st2.setLib(lib);  
          
        em.persist(st1);;  
        em.persist(st2);  
          
          
        em.getTransaction().commit();  
        em.close();  
        emf.close();  
          
    }  
      
}