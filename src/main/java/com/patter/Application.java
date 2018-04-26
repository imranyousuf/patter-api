package com.patter;

import com.patter.controller.CommentController;
import com.patter.controller.UserController;
import com.patter.entities.Comment;
import com.patter.entities.Idea;
import com.patter.entities.Space;
import com.patter.entities.User;
import com.patter.repos.CommentRepository;
import com.patter.repos.IdeaRepository;
import com.patter.repos.SpaceRepository;
import com.patter.repos.UserRepository;
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

import java.util.ArrayList;
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
    public CommandLineRunner check(IdeaRepository ideaRepository, SpaceRepository spaceRepository, CommentRepository commentRepository, UserRepository userRepository) {
        return args -> {

            log.info("IDEA----------------->");

            ideaRepository.save(new Idea("FB LOGIN TEST", "ADD A BUTTON",1));
            ideaRepository.save(new Idea("COFFEE MACHINE", "NEED COFFEE",2));
            ideaRepository.save(new Idea("MANAGER SUCKS", "CAN WE FIRE THEM",1));

            log.info("SPACE----------------->");

            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);

            String arrayString = list.toString();

            spaceRepository.save(new Space(false,arrayString,arrayString,2L));
            spaceRepository.save(new Space(false,arrayString,arrayString,3L));
            spaceRepository.save(new Space(true,arrayString,arrayString,1L));


            log.info("Comments----------------->");

            commentRepository.save(new Comment("Life is a test",12,2,true,2,1));
            commentRepository.save(new Comment("Islam",120,0,true,2,1));
            commentRepository.save(new Comment("Muslim",140,0,true,2,1));

            log.info("Users----------------->");

            userRepository.save(new User("imyousuf","Imran","Yousuf","imran@patter.com","hashedPassword","ValidateToekn","https://cdn.vox-cdn.com/thumbor/8tLchaDMIEDNzUD3mYQ7v1ZQL84=/0x0:2012x1341/920x613/filters:focal(0x0:2012x1341):format(webp)/cdn.vox-cdn.com/uploads/chorus_image/image/47070706/google2.0.0.jpg","1,2,3"));
            userRepository.save(new User("atef","Atef","Arabi","atef@patter.com","hashedPassword","ValidateToekn","https://cdn.vox-cdn.com/thumbor/8tLchaDMIEDNzUD3mYQ7v1ZQL84=/0x0:2012x1341/920x613/filters:focal(0x0:2012x1341):format(webp)/cdn.vox-cdn.com/uploads/chorus_image/image/47070706/google2.0.0.jpg","1,2,3"));
            userRepository.save(new User("daif","Saif","Nizam","saif@patter.com","hashedPassword","ValidateToekn","https://cdn.vox-cdn.com/thumbor/8tLchaDMIEDNzUD3mYQ7v1ZQL84=/0x0:2012x1341/920x613/filters:focal(0x0:2012x1341):format(webp)/cdn.vox-cdn.com/uploads/chorus_image/image/47070706/google2.0.0.jpg","1,2,3"));

        };
    }

}

