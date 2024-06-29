package com.example.JPA;

import com.example.JPA.models.Author;
import com.example.JPA.models.Video;
import com.example.JPA.repositories.VideoRepository;
import com.example.JPA.repositories.authorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);

	}
	//@Bean
	public CommandLineRunner commandLineRunner(authorRepository repo,
											   VideoRepository videoRepository){
			return args -> {
//				var author= Author.builder().firstName("Harsh").lastName("Dubey").age(20).build();
//				repo.save(author);
				var x= Video.builder().length(5)
						.name("HArsh")
						.build();
				videoRepository.save(x);
			};
	}

}
