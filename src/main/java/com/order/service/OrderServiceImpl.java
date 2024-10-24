package com.order.service;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.order.dao.OrderDao;
import com.order.entity.OrderEntity;
import com.order.entity.Product;

@Service
public class OrderServiceImpl implements OrderService {
	private static final String PRODUCT_SERVICE_URL = "http://localhost:8081/products";
	@Autowired
	private OrderDao orderRepo;
	@Autowired
	RestTemplate restTemplate;

	public OrderEntity createOrder(OrderEntity order) {
		List<Product> productList = new ArrayList();
	
		for (Integer productId : order.getProductid()) {
			String url = PRODUCT_SERVICE_URL + "/exists/" + productId;
			Product product = restTemplate.getForObject(url, Product.class);

			if (product == null) {
				throw new IllegalArgumentException("Product ID " + productId + " does not exist.");
			}
			productList.add(product);
			
		}
		order.setProductlist(productList);

		return orderRepo.save(order);
	}

}
