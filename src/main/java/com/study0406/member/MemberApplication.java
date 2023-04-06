package com.study0406.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MemberApplication implements CommandLineRunner {

	@Autowired
	private hr_personRepository hr_personRepo;

	public static void main(String[] args) {
		SpringApplication.run(MemberApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<hr_person> hr_persons = hr_personRepo.findAll();

		hr_persons.forEach(System.out::println);

		System.exit(0);

	}

}
