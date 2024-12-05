package com.ghostappi.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghostappi.backend.model.Product;
import com.ghostappi.backend.repository.ProductRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Product getById(Integer idProduct) {
        return productRepository.findById(idProduct).get();
    }

    public List<Product> getProductsByBrandId(Integer idBrand) {
        return productRepository.findByBrandIdBrand(idBrand);
    }
}
