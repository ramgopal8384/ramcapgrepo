package guru.springframework.services;

import java.util.List;

import org.bson.types.ObjectId;

import guru.springframework.domain.Product;

public interface CRUDService<T> {
    List<?> listAll();

    T getById(Integer id);

    T saveOrUpdate(T domainObject);

    void delete(Integer id);
}
