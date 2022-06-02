package com.demo.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.manytomany.entity.Library;
import com.demo.manytomany.entity.Student;

public class ManyToMany {  
    
    public static void main(String[] args) {  
          
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("books_issued");  
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin();  
          
        Student st1=new Student("Vipul",null);  
        Student st2=new Student("Vimal",null);  
          
        em.persist(st1);  
        em.persist(st2);  
          
          
        ArrayList<Student> al1=new ArrayList<Student>();  
    ArrayList<Student> al2=new ArrayList<Student>();  
          
        al1.add(st1);  
        al1.add(st2);  
          
        al2.add(st1);  
        al2.add(st2);  
          
        Library lib1=new Library("Data Structure",al1);  
        Library lib2=new Library("DBMS",al2);  
          
          
        em.persist(lib1);  
        em.persist(lib2);  
          
        em.getTransaction().commit();  
        em.close();  
        emf.close();  
          
    }  
  
}
