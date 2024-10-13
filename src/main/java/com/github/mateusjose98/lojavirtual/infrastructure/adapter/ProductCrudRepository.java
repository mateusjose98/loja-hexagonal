package com.github.mateusjose98.lojavirtual.infrastructure.adapter;


import com.github.mateusjose98.lojavirtual.infrastructure.entity.ProductEntity;
import com.github.mateusjose98.lojavirtual.infrastructure.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository extends CrudRepository<ProductEntity, Integer> {
    Iterable<ProductEntity> findByUserEntity(UserEntity userEntity);
}
