package xyz.sun.springjpamongodb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.Repository;
import xyz.sun.springjpamongodb.entity.Partner;
import xyz.sun.springjpamongodb.entity.People;
import xyz.sun.springjpamongodb.repository.PartnerRepository;
import xyz.sun.springjpamongodb.repository.PeopleRepository;
import xyz.sun.springjpamongodb.repository.PersonRepository;

import java.util.List;

@SpringBootApplication
public class SpringJpaMongodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaMongodbApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(PersonRepository repository) {
        return args -> {
            long count = repository.count();
            System.out.println(count);
        };
    }

    /*@Bean
    public CommandLineRunner demo(PeopleRepository repository) {
        return args -> {
            People sun = new People("sun", 25);
            repository.insert(sun);
            List<People> people = repository.findByName("sun");
            people.forEach(p -> System.out.println(p));
        };
    }*/

    /*@Bean
    public CommandLineRunner demo(PartnerRepository repository) {
        return args -> {
            Page<Partner> all = repository.findAll(PageRequest.of(1, 20));
            for (Partner partner : all) {
                System.out.println(partner.getId());
                if (partner.getStockNumId() >= 100000000) {
                    System.out.println("P");
                } else {
                    System.out.println("E");
                }
            }
        };
    }*/
}
