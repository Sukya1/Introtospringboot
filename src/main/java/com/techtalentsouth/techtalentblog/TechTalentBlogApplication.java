package com.techtalentsouth.techtalentblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.techtalentsouth.techtalentblog.BlogPost.BlogPostController;

//@ComponentScan(basePackageClasses = BlogPostController.class)
@SpringBootApplication

public class TechTalentBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechTalentBlogApplication.class, args);
	}

}
