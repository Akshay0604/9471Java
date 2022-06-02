package com.manytomanyrelationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manytomanyrelationship.entity.Users;
@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> { 
}