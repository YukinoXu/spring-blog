package com.yukinoxu.blog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.yukinoxu.blog.entity.User;
import com.yukinoxu.blog.repository.UserRepository;

@SpringBootApplication
public class BlogApplication {
	private static final Logger log = LoggerFactory.getLogger(BlogApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserRepository repository) {
		return (args) -> {
			log.info("Customers found with findAll()");
			log.info("------------------------------");
			for (User user : repository.findAll()) {
				log.info(user.toString());
			}
		};
	}
}
