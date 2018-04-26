package com.patter;

import com.patter.controller.CommentController;
import com.patter.entities.Idea;
import com.patter.repos.IdeaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@SpringBootApplication
@EnableAutoConfiguration
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/imran")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    //Check which bean loaded
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }

        };
    }

    //Testing
    @Bean
    public CommandLineRunner check(IdeaRepository repository) {
        return args -> {

            repository.save(new Idea("FB LOGIN TEST", "ADD A BUTTON",1));
            repository.save(new Idea("COFFEE MACHINE", "NEED COFFEE",2));
            repository.save(new Idea("MANAGER SUCKS", "CAN WE FIRE THEM",1));

            log.info("All the customers");
            log.info("-----------------");

            for(Idea idea : repository.findAll()){
                log.info(idea.toString());
            }

            log.info("---------------");

            log.info(repository.findById(2L).toString());

            log.info("---------------");

           // log.info(repository.findByTitle("FB LOGIN TEST").toString());



        };
    }

}

