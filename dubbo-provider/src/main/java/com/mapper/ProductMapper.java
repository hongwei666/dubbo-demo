package com.mapper;

import com.dto.Product;

import java.util.List;

public interface ProductMapper {
    List<Product> getProductByName();
}
