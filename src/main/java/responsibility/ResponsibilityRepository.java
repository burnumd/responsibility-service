package responsibility;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsibilityRepository extends MongoRepository<Responsibility, String> {
}
