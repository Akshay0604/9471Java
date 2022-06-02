package jpa.insert.samplejpadelete;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpa.insert.samplejpadelete.entity.StudentEntity;

public class DeleteStudent {  
	  
	    public static void main(String args[])  
	    {  
	    EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_delete");  
	    EntityManager em=emf.createEntityManager();  
	em.getTransaction().begin();  
  
    StudentEntity s=em.find(StudentEntity.class,102);  
em.remove(s);  
	em.getTransaction().commit();  
	emf.close();  
	em.close();  
	  
	    }  
	}