package com.bora.admin.repository;

import com.bora.admin.entity.Admin;
import org.apache.catalina.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends MongoRepository<Admin, String> {
    User findByUsername(String username);
}
