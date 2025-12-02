package com.start.ecommerce.service.impl;

import com.start.ecommerce.dto.ProductRequest;
import com.start.ecommerce.dto.ProductResponse;
import com.start.ecommerce.mapper.ProductMapper;
import com.start.ecommerce.model.Product;
import com.start.ecommerce.repository.ProductRepository;
import com.start.ecommerce.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    @Override
    public ProductResponse create(ProductRequest request) {
        Product product = ProductMapper.toEntity(request);
        return ProductMapper.toDto(repository.save(product));
    }

    @Override
    public ProductResponse getById(Long id) {
        Product product = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produit non trouvé"));
        return ProductMapper.toDto(product);
    }

    @Override
    public Page<ProductResponse> getAll(int page, int size) {
        return repository.findAll(PageRequest.of(page, size))
                .map(ProductMapper::toDto);
    }

    @Override
    public ProductResponse update(Long id, ProductRequest request) {
        Product product = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produit non trouvé"));

        product.setName(request.name());
        product.setPrice(request.price());
        product.setStock(request.stock());
        product.setCategory(request.category());
        product.setDescription(request.description());
        product.setImageUrl(request.imageUrl());

        return ProductMapper.toDto(repository.save(product));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
