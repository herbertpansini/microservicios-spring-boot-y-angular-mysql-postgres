package com.vaxi.springbootmicroservice3apigateway.repository;

import com.vaxi.springbootmicroservice3apigateway.model.Role;
import com.vaxi.springbootmicroservice3apigateway.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    @Modifying
    @Query("UPDATE User SET role = :role WHERE username = :username")
    void updateUserRole(@Param("username") String username, @Param("role") Role role);
}