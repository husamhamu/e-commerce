package com.husam.oneshop.service.product;

import java.util.List;

import com.husam.oneshop.dto.ProductDto;
import com.husam.oneshop.model.Product;
import com.husam.oneshop.request.AddProductRequest;
import com.husam.oneshop.request.ProductUpdateRequest;

public interface IProductService {
    Product addProduct(AddProductRequest product);
    Product getProductById(Long id);
    Product updateProduct(Long id, ProductUpdateRequest product);
    void deleteProductById(Long id);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);
    List<ProductDto> getConvertedProductDtos(List<Product> products);
    ProductDto convertToDto(Product product);
}
