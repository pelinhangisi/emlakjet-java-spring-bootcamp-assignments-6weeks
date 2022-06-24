package com.pelinhangisi.publisher.dao;


import com.pelinhangisi.publisher.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
