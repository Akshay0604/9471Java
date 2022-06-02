package com.manytomanyrelationship.entity;

import javax.persistence.*;

import java.util.Collection;
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String username;
    String password;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;
    public Users() {
    }
    public Users(String username, String password, Collection<Role> roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Collection<Role> getRoles() {
        return roles;
    }
    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }
}