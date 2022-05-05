package com.bora.admin;

import com.bora.admin.entity.Admin;
import com.bora.admin.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;


@SpringBootApplication
public class AdminServiceApplication {

	private AdminRepository adminRepository;

	@Autowired
	public AdminServiceApplication(AdminRepository adminRepository) {
		this.adminRepository = adminRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AdminServiceApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {
		Admin admin = new Admin("admin", "admin");
		if(adminRepository.findByUsername(admin.getUsername()) == null) {
			adminRepository.insert(admin);
			System.out.println("Administrator je dodat!");
		} else {
			System.out.println("Administator vec postoji!");
		}
	}

}
