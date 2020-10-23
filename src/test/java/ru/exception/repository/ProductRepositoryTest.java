package ru.exception.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.exception.domain.Product;
import ru.exception.exceptions.NotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    ProductRepository repository = new ProductRepository();
    Product product1 = new Product(1);
    Product product2 = new Product(5);

    @BeforeEach
    public void setUp() {
        repository.save(product1);
        repository.save(product2);
    }

    @Test
    void testRemoveExistElement() {
        repository.removeById(1);
        assertEquals(repository.findAll().length, 1);
    }

    @Test()
    void testRemoveNotExistElement() {
        Exception exception = assertThrows(NotFoundException.class, () -> repository.removeById(3));

        String expectedMessage = "Element with id: " + 3 + " not found";
        String actualMessage = exception.getMessage();

        assertEquals(actualMessage, expectedMessage);
    }
}