package com.github.mateusjose98.lojavirtual.infrastructure.mapper;

import com.github.mateusjose98.lojavirtual.domain.Product;
import com.github.mateusjose98.lojavirtual.infrastructure.entity.ProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface ProductMapper {
    @Mappings(
            {
                    @Mapping(source = "id", target = "id"),
                    @Mapping(source = "name", target = "name"),
                    @Mapping(source = "description", target = "description"),
                    @Mapping(source = "price", target = "price"),
                    @Mapping(source = "dateCreated", target = "dateCreated"),
                    @Mapping(source = "dateUpdated", target = "dateUpdated"),
                    @Mapping(source = "userEntity", target = "user")

            }
    )
    Product toProduct(ProductEntity productEntity);

    Iterable<Product> toProducts(Iterable<ProductEntity> productEntities);

    @InheritInverseConfiguration
    ProductEntity toProductEntity(Product product);
}
