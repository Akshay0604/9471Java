package com.demo.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.onetoone.entity.Library;
import com.demo.onetoone.entity.Student;



public class OneToOne{  
	  
	    public static void main(String[] args) {  
	          
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Book_issued" );  
	           EntityManager em = emf.createEntityManager( );  
	           em.getTransaction( ).begin( );  
	          
	           Student st1=new Student();  
	         //  st1.setS_id(1);  
	           st1.setS_name("Vipul");  
	             
	           Student st2=new Student();  
	         //  st2.setS_id(2);  
	           st2.setS_name("Vimal");  
	             
	             
	           em.persist(st1);  
	           em.persist(st2);  
	           Library lib1=new Library();  
	          // lib1.setB_id(101);  
	           lib1.setBook_name("Data Structure");  
	           lib1.setStudent(st1);  
	             
	           Library lib2=new Library();  
	         //  lib2.setB_id(102);  
	           lib2.setBook_name("DBMS");  
	           lib2.setStudent(st2);  
	             
	           em.persist(lib1);  
	           em.persist(lib2);  
	             
	           em.getTransaction().commit();  
	             
	           em.close();  
	           emf.close();  
	    }  
	      
	      
	}