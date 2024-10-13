package com.github.mateusjose98.lojavirtual.infrastructure.configuration;

import com.github.mateusjose98.lojavirtual.application.repository.ProductRepository;
import com.github.mateusjose98.lojavirtual.application.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public ProductService productService(ProductRepository productRepository) {
        return new ProductService(productRepository);
    }
}
