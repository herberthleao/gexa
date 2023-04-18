package me.herberthleao.gexa.services;

import me.herberthleao.gexa.persistence.entities.Product;
import me.herberthleao.gexa.persistence.repositories.ProductRepository;

import java.math.BigDecimal;

@org.springframework.stereotype.Service
public class ProductService extends Service
{
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    public void create(
        String name,
        BigDecimal price,
        String description,
        String barcode
    ) {
        Product product = new Product(name, price, description, barcode);
        this.productRepository.save(product);
    }
}
