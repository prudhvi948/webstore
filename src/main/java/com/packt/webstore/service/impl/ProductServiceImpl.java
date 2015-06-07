package com.packt.webstore.service.impl;

import java.util.List;

import com.packt.webstore.domain.Product;
import com.packt.webstore.service.ProductService;
import com.packt.webstore.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

}
