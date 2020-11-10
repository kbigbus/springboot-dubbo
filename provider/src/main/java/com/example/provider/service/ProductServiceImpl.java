package com.example.provider.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service
@Component("productService")
public class ProductServiceImpl implements ProductService{

    @Override
    public String getProductName(Integer productId) {
        return "产品名称"+productId;
    }
}
