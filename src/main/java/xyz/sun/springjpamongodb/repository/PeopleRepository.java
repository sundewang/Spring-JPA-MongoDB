package xyz.sun.springjpamongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import xyz.sun.springjpamongodb.entity.People;

import java.util.List;

public interface PeopleRepository extends MongoRepository<People, Long> {
    List<People> findByName(String name);
}
