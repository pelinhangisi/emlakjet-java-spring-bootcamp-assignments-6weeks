package com.pelinhangisi.consumer.dao;



import com.pelinhangisi.consumer.entitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT COUNT(*) FROM User")
    int getNumberOfUsers();

}
