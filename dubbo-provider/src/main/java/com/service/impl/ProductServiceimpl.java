package com.service.impl;

import com.api.ProductService;
import com.dto.Product;
import com.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class ProductServiceimpl implements ProductService {

    //注解注入ProductMapper
    private final ProductMapper productMapper;

    @Autowired
    public ProductServiceimpl(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    //调用ProductMapper的方法返回Product的List列表
    public List<Product> getProduct() {
        return productMapper.getProductByName();
    }

}
