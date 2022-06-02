package com.manytomanyrelationship.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String name;
    public Role(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Role(String name) {
        super();
        this.name = name;
    }
    public Role() { // TODO Auto-generated constructor stub }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}