package ru.exception.manager;

import ru.exception.repository.ProductRepository;

public class ProductManager {
    private ProductRepository repository;


    public ProductManager(ProductRepository repository) {
        this.repository = repository;
    }
}
