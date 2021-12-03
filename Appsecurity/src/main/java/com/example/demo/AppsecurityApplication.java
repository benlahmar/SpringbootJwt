package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class AppsecurityApplication implements CommandLineRunner{
//	@Autowired
//	private TaskRepository taskRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(AppsecurityApplication.class, args);
	}

	@Bean
	
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
			return new BCryptPasswordEncoder();
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		//taskRepository.save(new Task(null,"T1"));  taskRepository.save(new Task(null,"T2"));  taskRepository.save(new Task(null,"T3"));

		
		
	}

}
