package com.nicholascoding.jpa;

import com.github.javafaker.Faker;
import com.nicholascoding.jpa.models.Author;
import com.nicholascoding.jpa.models.Video;
import com.nicholascoding.jpa.repositories.AuthorRepository;
import com.nicholascoding.jpa.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository repository,
			VideoRepository videoRepository
	) {
		// @Build usage
		return args -> {
			/* for (int i = 0; i < 50; i++) {
				Faker faker = new Faker();
				var author = Author.builder()
						.firstName(faker.name().firstName())
						.lastName(faker.name().firstName())
						.age(faker.number().numberBetween(19, 60))
						.email("contact" + i + "@gmail.com")
						.build();
				repository.save(author);
			} */
			/* var video = Video.builder().name("abc").length(5).build();
			videoRepository.save(video); */
		};
	}

}
