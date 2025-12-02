package com.start.ecommerce.service;

import com.start.ecommerce.dto.ProductRequest;
import com.start.ecommerce.dto.ProductResponse;
import org.springframework.data.domain.Page;

public interface ProductService {

    ProductResponse create(ProductRequest request);

    ProductResponse getById(Long id);

    Page<ProductResponse> getAll(int page, int size);

    ProductResponse update(Long id, ProductRequest request);

    void delete(Long id);
}
