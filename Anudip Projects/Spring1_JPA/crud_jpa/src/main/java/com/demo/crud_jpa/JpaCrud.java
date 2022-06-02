package com.demo.crud_jpa;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.demo.crud_jpa.entity.Player;

public class JpaCrud 
{
    public static void main( String[] args )
    {
    		JpaCrud.createRecord(); 
    //		JpaCrud.retrieveRecord(); 
    //		JpaCrud.updateRecord(); 
    //		JpaCrud.deleteRecord(); 
    //		JpaCrud.queryRecords();
    //		JpaCrud.findByNamedQuery();
    //		JpaCrud.findByFuzzyNamedQuery();
    //		JpaCrud.criteriaQuery();
    //		JpaCrud.criteriaCountQuery();
    //		JpaCrud.criteriaVerifiedUsersQuery();
    //		JpaCrud.criteriaLoginNameAndPassword();
    //		JpaCrud.criteriaFindByCommonPassword();
    //		JpaCrud.criteriaFuzzyEmail();
    //		JpaCrud.criteriaBetweenDates();
    }


    

	private static void createRecord() {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA_CRUD");  
	    EntityManager em=emf.createEntityManager();  
	      
	    em.getTransaction().begin();
	    //Calendar c = new GregorianCalendar();
	    
		Player 	p1 = new Player();
				p1.setLoginName("Mayuresh");
				p1.setEmailAddress("mayuresh2899@gmail.com");
				p1.setPassword("Pendulum@135");
				p1.setLastAccessTime(new Date());
				p1.setRegistrationDate(new java.util.GregorianCalendar(2017,12,28));
				p1.setVerified(true);
				
				
		Player 	p2 = new Player();
				p2.setLoginName("Mansi");
				p2.setEmailAddress("mansikamble902@gmail.com");
				p2.setPassword("mansi@123");
				p2.setLastAccessTime(new Date());
				p2.setRegistrationDate(new java.util.GregorianCalendar(2018,5,10));
				p2.setVerified(true);
				
		Player 	p3 = new Player();
				p3.setLoginName("Tina");
				p3.setEmailAddress("tinathorat141@gmail.com");
				p3.setPassword("tiNa@33412mn");
				p3.setLastAccessTime(new Date());
				p3.setRegistrationDate(new java.util.GregorianCalendar(2016,07,14));
				p3.setVerified(true);
				
				
	    
	    Player 	p4 = new Player();
				p4.setLoginName("Israr");
				p4.setEmailAddress("IsrarKhan1@gmail.com");
				p4.setPassword("israr1212");
				p4.setLastAccessTime(new Date());	// can add (new java.util.Date());
			//	p4.setRegistrationDate(c); // can add (new java.util.GregorianCalendar(2020,07,14));
				p4.setVerified(false);
				
				em.persist(p1);
				em.persist(p2);
				em.persist(p3);
				em.persist(p4);
				em.getTransaction().commit();
				
				Query query =  em.createQuery("Select p1 from Player p1");  
		         @SuppressWarnings("unchecked")  
		       List<Player> plist =query.getResultList();  
		         System.out.println("Player Details :");  
		         for(Player p:plist) {
		            System.out.println(p.getId() + " " + p.getEmailAddress() + " " + p.getLastAccessTime() + " " + p.getLoginName() + " " + p.getPassword() 
		            + " " + p.getRegistrationDate() + " " + p.getVerified());     
		         }
				
				em.close();
				emf.close();
		
		}
	
	
	
	private static void retrieveRecord() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Long key = Long.valueOf(1);
		Player p = em.find(Player.class, key);
		System.out.println("retrive records");
		System.out.println(p.getPassword() + " " + p.getLoginName());

		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	
	public static void updateRecord() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin(); 

		Long key = Long.valueOf(1);
		Player p = em.find(Player.class, key);
		p.setPassword("pendulum@135");
		System.out.println("Update Record");

		em.getTransaction().commit();
		em.close();
		emf.close();
	}

	public static void deleteRecord() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
        
		Long key = Long.valueOf(1);
		Player p = em.find(Player.class, key);
		em.remove(p); // record is deleted
		

		em.getTransaction().commit();
		System.out.println("Delete Record");
		em.close();
		emf.close();
	}
	public static void queryRecords() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Query query = em.createQuery("select distinct p from Player as p", Player.class);
		

		List<Player> players = query.getResultList();

		for (Player p : players) {
			System.out.println("The password is :" + p.getPassword());
		}

		for (int i = 0; i < players.size(); i++) {
			Player player = players.get(i);
			System.out.println(player.getLoginName());
		}
		em.flush();		// to clean memory of buffer same like clean project 
		//entityManager.detach(arg0);h();
		em.getTransaction().commit();
		System.out.println("Query Record");
	}
	
	public static void findByNamedQuery() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Query query=  em.createNamedQuery("Player.findByPASS");
		query.setParameter("pass", "pendulum@135");		// yeh tha iss line peh("email", "tinathorat141@gmail.com");
		List<Player> players = query.getResultList();

		for (Player p : players) {
			System.out.println(p);
		}

		for (int i = 0; i < players.size(); i++) {
			Player p = players.get(i);
			System.out.println(p.getLoginName());
		}
		
		em.getTransaction().commit();
		System.out.println("Find By Name Record");
	}
	
	public static void findByFuzzyNamedQuery() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Query query=  em.createNamedQuery("Player.findByFuzzyEmail");
		query.setParameter("email", "%2899%");	// to be checked
		List<Player> players = query.getResultList();

		for (Player p : players) {
			System.out.println(p);
		}

		for (int i = 0; i < players.size(); i++) {
			Player p = players.get(i);
			System.out.println(p.getLoginName());
		}
		em.getTransaction().commit();
		System.out.println("find by fuzyname record");
	}
	
	public static void criteriaQuery() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Player> cq = cb.createQuery(Player.class);
		
		
		Root<Player> from = cq.from(Player.class);  
		cq.orderBy(cb.asc(from.get("loginName")));
		
		TypedQuery<Player> q = em.createQuery(cq);  
         List<Player> players = q.getResultList();
         
		//list.forEach(list -> System.out.println(list));
         
         for (Player p : players) {
        	 System.out.println("Criteria Query Output");
 			System.out.println(p);
 			}
         
		em.getTransaction().commit();
		System.out.println("Criteria Query Record");
		
	}
	
	public static void criteriaCountQuery() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Long> cq = cb.createQuery(Long.class);
		cq.select(cb.count(cq.from(Player.class)));
		
		TypedQuery<Long> query = em.createQuery(cq);
		System.out.println("Total no. of players:");
		System.out.println(query.getSingleResult());
		
		em.getTransaction().commit();
		System.out.println("Criteria count record");
	}
	
	public static void criteriaVerifiedUsersQuery() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Player> cQuery = builder.createQuery(Player.class);
		
		Root<Player> root = cQuery.from(Player.class);     
		
		ParameterExpression<Boolean> flag = builder.parameter(Boolean.class);
		Predicate expression = builder.equal(root.get("verified"), flag);
		
		cQuery.select(root).where(expression);
		
		TypedQuery<Player> query = em.createQuery(cQuery);
		query.setParameter(flag, true);
		List<Player> players = query.getResultList();
		//players.forEach(player -> System.out.println(player.getVerified()));
		 for (Player p : players) {
	 			System.out.println(p);
	 			}
		
		em.getTransaction().commit();
		System.out.println("criteria verified Record");
	}
	
	public static void criteriaLoginNameAndPassword() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Player> cQuery = builder.createQuery(Player.class);
		
		Root<Player> root = cQuery.from(Player.class);     
		
		ParameterExpression<String> password = builder.parameter(String.class);
		Expression<Boolean> passwordExpression = builder.equal(root.get("password"), password);
		
		ParameterExpression<String> loginName = builder.parameter(String.class);
		Expression<Boolean> loginExpression = builder.equal(root.get("loginName"), loginName);
		
		
		Predicate loginAndPassword = builder.and(loginExpression, passwordExpression);
		
		cQuery.select(root).where(loginAndPassword);
		
		TypedQuery<Player> query = em.createQuery(cQuery);
		query.setParameter(loginName, "Mayuresh");
		query.setParameter(password, "pendulum@135");
		Player player = query.getSingleResult();
		System.out.println(player);
		
		em.getTransaction().commit();
		System.out.println("Criteria login record");
	}
	
	public static void criteriaFindByCommonPassword() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-tutorial");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Player> cQuery = builder.createQuery(Player.class);
		
		Root<Player> root = cQuery.from(Player.class);     
		
		ParameterExpression<String> password = builder.parameter(String.class);
		Expression<Boolean> passwordExpression = builder.equal(root.get("password"), password);
		cQuery.select(root).where(passwordExpression);
		
		TypedQuery<Player> query = em.createQuery(cQuery);
		query.setParameter(password, "pwd");
		List<Player> players = query.getResultList();
		//players.forEach(player -> System.out.println(player.getLoginName()));
		
		em.getTransaction().commit();
		System.out.println("Criteria find by common Password");
	}
	
	public static void criteriaFuzzyEmail() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-tutorial");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Player> cQuery = builder.createQuery(Player.class);
		
		Root<Player> root = cQuery.from(Player.class);     
	//	Predicate predicate = builder.like(root.get("emailAddress"), "%scja%");
		
		//cQuery.select(root).where(predicate);
		
		TypedQuery<Player> query = em.createQuery(cQuery);
		//query.setParameter(email, true);
		List<Player> players = query.getResultList();
		//players.forEach(player -> System.out.println(player.getEmailAddress()));
		
		em.getTransaction().commit();
		System.out.println("Criteria fuzzy record");
	}
	
	
	public static void criteriaBetweenDates() throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-tutorial");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Player> cQuery = builder.createQuery(Player.class);
		
		Root<Player> root = cQuery.from(Player.class);     
		
		ParameterExpression<String> email = builder.parameter(String.class);
		//Predicate predicate = builder.like(root.get("emailAddress"), "%ma%");
		java.text.SimpleDateFormat textFormat = 
			    new java.text.SimpleDateFormat("yyyy-MM-dd");
		Date startDate = new Date();
		startDate = textFormat.parse("1998-1-1");
		
		Date endDate = new Date();
		startDate = textFormat.parse("2018-6-1");
		
		//Predicate predicate =  builder.between(root.get("lastAccessTime"), startDate, endDate);
		    //predicate.add(date);

		//cQuery.select(root).where(predicate);
		
		TypedQuery<Player> query = em.createQuery(cQuery);
		//query.setParameter(email, true);
		List<Player> players = query.getResultList();
		//players.forEach(player -> System.out.println(player.getLastAccessTime())); 
		
		List<Player> users = new java.util.ArrayList();
		//users.add(player);
		
		em.getTransaction().commit();
		System.out.println("Criteria Between dates");
	}}