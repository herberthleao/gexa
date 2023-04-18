package me.herberthleao.gexa.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.GenerationType;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product
{
    @Id
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "sequence-generator"
    )
    @SequenceGenerator(
        name = "sequence-generator",
        sequenceName = "products_id_seq",
        allocationSize = 1
    )
    private Long id;
    private String name;
    private BigDecimal price;
    private String description;
    private String barcode;

    public Product(
        String name,
        BigDecimal price,
        String description,
        String barcode
    ) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.barcode = barcode;
    }

    protected Product() {}
}
