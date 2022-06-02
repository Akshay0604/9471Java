package com.demo.jpaesports.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Team {
	 @Id
	 @GeneratedValue
	 private long id; 
	 private String name;
	 @OneToMany(mappedBy="team",  
	              targetEntity=Player.class, 
	    fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	 private List<Player> players; 

	 public List<Player> getPlayers() {return players;}
	 public void setPlayers(List<Player> p){players=p;}
	 public long getId() {return id;}
	 public void setId(long id) {this.id = id;}
	 public String getName() {return name;}
	 public void setName(String name) {this.name = name;}
}