package com.service.impl;

import com.api.ProductService;
import com.dto.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "productService")
public class ProductServiceimpl implements ProductService {
    public List getProduct() {
        Product p = new Product();
        p.setName("product1");
        p.setPrice("100");
        List<Product> l = new ArrayList<Product>();
        l.add(p);
        return l;
    }
}
