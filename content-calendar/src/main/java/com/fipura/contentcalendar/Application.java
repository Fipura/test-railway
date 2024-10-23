package com.fipura.contentcalendar;

import com.fipura.contentcalendar.config.ContentCalendarProperties;
import com.fipura.contentcalendar.repository.ContentRepository;
import com.fipura.contentcalendar.model.Content;
import com.fipura.contentcalendar.model.Status;
import com.fipura.contentcalendar.model.Type;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
    CommandLineRunner commandLineRunner(ContentRepository repository) {
        return args -> {
            Content content = new Content("Posted using CommandLineRunner",
                    "CommandLineRunner allows us to run something after the app is setup",
                    Status.IDEA,
                    Type.ARTICLE,
                    LocalDateTime.now().plusMinutes(5),
                    LocalDateTime.now(),
                    "");
            repository.save(content);
        };
    }

}
