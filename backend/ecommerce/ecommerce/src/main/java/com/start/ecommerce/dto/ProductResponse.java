package com.start.ecommerce.dto;

public record ProductResponse(
        Long id,
        String name,
        Double price,
        Integer stock,
        String category,
        String description,
        String imageUrl
) {}
