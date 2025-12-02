package com.start.ecommerce.mapper;

import com.start.ecommerce.dto.ProductRequest;
import com.start.ecommerce.dto.ProductResponse;
import com.start.ecommerce.model.Product;

public class ProductMapper {

    public static Product toEntity(ProductRequest dto) {
        return Product.builder()
                .name(dto.name())
                .price(dto.price())
                .stock(dto.stock())
                .category(dto.category())
                .description(dto.description())
                .imageUrl(dto.imageUrl())
                .build();
    }

    public static ProductResponse toDto(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getStock(),
                product.getCategory(),
                product.getDescription(),
                product.getImageUrl()
        );
    }
}
