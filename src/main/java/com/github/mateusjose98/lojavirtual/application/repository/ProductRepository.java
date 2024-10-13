package com.github.mateusjose98.lojavirtual.application.repository;

import com.github.mateusjose98.lojavirtual.domain.Product;
import com.github.mateusjose98.lojavirtual.domain.User;

public interface ProductRepository {
    Iterable<Product> getProducts();

    Iterable<Product> getProductsByUser(User user);

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProductById(Integer id);
}
