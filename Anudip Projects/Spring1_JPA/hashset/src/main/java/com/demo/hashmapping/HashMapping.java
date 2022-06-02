package com.demo.hashmapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.hashmapping.entity.Address;
import com.demo.hashmapping.entity.Employee;

/**
 * Hello world!
 *
 */
public class HashMapping 
{
    public static void main(String[] args) {  
    	
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Hash_mapping");  
        EntityManager em=emf.createEntityManager();  
      
    em.getTransaction().begin();  

    Address a1=new Address();  
        a1.setE_pincode(201301);  
        a1.setE_city("Noida");  
        a1.setE_state("Uttar Pradesh");  
          
    Address a2=new Address();  
        a2.setE_pincode(302001);  
    a2.setE_city("Jaipur");  
    a2.setE_state("Rajasthan");  
          
    Employee e1=new Employee();  
//    e1.setE_id(1);  
    e1.setE_name("Vijay");  
    e1.getAddress().add(a1);  
      
    Employee e2=new Employee();  
  //  e2.setE_id(2);  
    e2.setE_name("John");  
    e2.getAddress().add(a2);  
      
em.persist(e1);  
    em.persist(e2);  
    em.getTransaction().commit();  
      
    em.close();  
    emf.close();
    }
}
