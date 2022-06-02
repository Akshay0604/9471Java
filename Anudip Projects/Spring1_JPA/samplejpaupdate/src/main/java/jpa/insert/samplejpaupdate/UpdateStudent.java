package jpa.insert.samplejpaupdate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpa.insert.samplejpaupdate.entity.StudentEntity;

public class UpdateStudent {  
	    public static void main(String args[])  
    {  
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_update");  
	        EntityManager em=emf.createEntityManager();  
	          
	      
	          
	        StudentEntity s=em.find(StudentEntity.class,102);  
	        System.out.println("Before Updation");  
	        System.out.println("Student id = "+s.getS_id());  
	        System.out.println("Student Name = "+s.getS_name());  
	        System.out.println("Student Age = "+s.getS_age());  
	          
	        s.setS_age(30);  
	          
	        System.out.println("After Updation");  
	        System.out.println("Student id = "+s.getS_id());  
	        System.out.println("Student Name = "+s.getS_name());  
	        System.out.println("Student Age = "+s.getS_age());  
	          
	          
	    }  
	  
	}