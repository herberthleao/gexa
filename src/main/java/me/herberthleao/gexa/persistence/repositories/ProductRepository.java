package me.herberthleao.gexa.persistence.repositories;

import me.herberthleao.gexa.persistence.entities.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long>
{
}
