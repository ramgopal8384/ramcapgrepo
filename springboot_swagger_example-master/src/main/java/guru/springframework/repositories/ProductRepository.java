package guru.springframework.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import guru.springframework.domain.Product;

@RepositoryRestResource
public interface ProductRepository extends MongoRepository<Product, String>{
	Product findBy_id(String _id);
}
