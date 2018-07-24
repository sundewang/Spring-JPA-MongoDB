package xyz.sun.springjpamongodb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.Repository;
import xyz.sun.springjpamongodb.entity.People;
import xyz.sun.springjpamongodb.repository.PeopleRepository;

import java.util.List;

@SpringBootApplication
public class SpringJpaMongodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaMongodbApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(PeopleRepository repository) {
        return args -> {
            People sun = new People("sun", 25);
            repository.insert(sun);
            List<People> people = repository.findByName("sun");
            people.forEach(p -> System.out.println(p));
        };
    }
}
