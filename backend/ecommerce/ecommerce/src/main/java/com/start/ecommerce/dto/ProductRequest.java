package com.start.ecommerce.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductRequest(
        @NotBlank(message = "Le nom est obligatoire")
        String name,

        @NotNull(message = "Le prix est obligatoire")
        @Min(value = 0, message = "Le prix doit être positif")
        Double price,

        @Min(value = 0, message = "Le stock doit être positif")
        Integer stock,

        String category,
        String description,
        String imageUrl
) {}
