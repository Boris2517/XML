package com.bora.registration.repository;

import com.bora.registration.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends MongoRepository<User,String> {
    User findByUsername(String username);
}
