package com.bora.user.repository;

import com.bora.user.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
    User findByUsername(String username);
    List<User> findByApproved(boolean approved);
}
