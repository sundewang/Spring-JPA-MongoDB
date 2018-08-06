package xyz.sun.springjpamongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import xyz.sun.springjpamongodb.entity.Person;

/**
 * @author sundewang
 * @date 2018/8/6
 */
public interface PersonRepository extends MongoRepository<Person, Long> {
}
