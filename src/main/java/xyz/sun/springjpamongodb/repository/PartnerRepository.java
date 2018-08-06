package xyz.sun.springjpamongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import xyz.sun.springjpamongodb.entity.Partner;

/**
 * @author sundewang
 * @date 2018/7/25
 */
public interface PartnerRepository extends MongoRepository<Partner, Long> {
}
