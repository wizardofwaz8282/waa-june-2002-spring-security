package edu.miu.cs545.springsecurityjwt.service;

import edu.miu.cs545.springsecurityjwt.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> findProductByMinPrice(int minPrice);
    List<ProductDto> findProductByCatAndPrice(int maxPrice,int id);
    List<ProductDto> findProductByName(String name);
    List<ProductDto> findProductByUserId(int userId);

    ProductDto createProduct(ProductDto productDto);

    ProductDto updateProduct(int id, ProductDto productDto);

    List<ProductDto> getAllProducts();

    void deleteProduct(int id);
}
