package xyz.burgersdev.movies.Repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import xyz.burgersdev.movies.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {

}
