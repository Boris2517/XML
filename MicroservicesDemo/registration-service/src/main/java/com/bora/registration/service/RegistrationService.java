package com.bora.registration.service;

import com.bora.registration.entity.User;
import com.bora.registration.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    private RegistrationRepository registrationRepository;

    @Autowired
    public RegistrationService(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }


    public User registerUser(User user) {

        if(registrationRepository.findByUsername(user.getUsername()) == null) {
            return registrationRepository.insert(user);
        }

        return null;
    }
}
