package com.ghostappi.backend.controller;

import java.util.List;
import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import com.ghostappi.backend.service.ProductService;
import com.ghostappi.backend.model.Product;

@Controller
public class ProductController {

        @Autowired
        private ProductService productServvice;

        @QueryMapping
        public List<Product> getAllProducts() {
                return productServvice.getAll();
        }

        @QueryMapping
        public Product getById(@Argument int idProduct) {
                return productServvice.getById(idProduct);
        }

        @QueryMapping
        public List<Product> getProductsByBrandId(@Argument Integer idBrand) {
                return productServvice.getProductsByBrandId(idBrand);
        }

}