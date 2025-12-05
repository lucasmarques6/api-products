package com.lmp.speedrun.service;

import com.lmp.speedrun.entity.Product;
import com.lmp.speedrun.repository.ProductRepository;
import com.lmp.speedrun.utils.StringUtils;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

  private final ProductRepository productRepository;
  private final StringUtils stringUtils;

  public ProductService(ProductRepository productRepository, StringUtils stringUtils) {
    this.productRepository = productRepository;
    this.stringUtils = stringUtils;
  }

  public Product createProduct(Product product){
    System.out.println("Producto ingresado: " + product);
    return this.productRepository.save(product);
  }

  public Product getProductById(Long id){
    Optional<Product> productOptional = this.productRepository.findById(id);

    if (productOptional.isEmpty()){
      throw new RuntimeException("Producto no encontrado con ID: " + id);
    }
    return productOptional.get();
  }

  public List<Product> findAllProducts(String name, String category){
    if (!name.isEmpty() && !category.isEmpty() )
      return this.productRepository.findByNameContainingIgnoreCaseAndCategoryContainingIgnoreCase(
          name, category);
    if (!name.isEmpty()){
      return this.productRepository.findByNameContainingIgnoreCase(name);
    }
    if (!category.isEmpty()){
      return this.productRepository.findByCategoryContainingIgnoreCase(category);
    }
    return this.productRepository.findAll();
  }

  public Product editProductById(Long id, Product dataToEdit) {
    Product product = this.getProductById(id);

    if (!stringUtils.isEmpty(dataToEdit.getName())) {
      System.out.printf(
          "Editando nombre de: '%s' a -> '%s'%n",
          product.getName(),
          dataToEdit.getName());
      product.setName(dataToEdit.getName());
    }

    // --- Description ---
    if (!stringUtils.isEmpty(dataToEdit.getDescription())) {
      System.out.printf(
          "Editando description de: '%s' a -> '%s'%n",
          product.getDescription(),
          dataToEdit.getDescription());
      product.setDescription(dataToEdit.getDescription());
    }

    // --- Category ---
    if (!stringUtils.isEmpty(dataToEdit.getCategory())) {
      System.out.printf(
          "Editando category de: '%s' a -> '%s'%n",
          product.getCategory(),
          dataToEdit.getCategory());
      product.setCategory(dataToEdit.getCategory());
    }

    // --- Price ---
    if (dataToEdit.getPrice() != null && dataToEdit.getPrice() > 0) {
      System.out.printf(
          "Editando price de: %s a -> %s%n",
          product.getPrice(),
          dataToEdit.getPrice()
      );
      product.setPrice(dataToEdit.getPrice());
    }

    // --- Stock ---
    if (dataToEdit.getStock() != null && dataToEdit.getStock() >= 0) {
      System.out.printf(
          "Editando stock de: %s a -> %s%n",
          product.getStock(),
          dataToEdit.getStock()
      );
      product.setStock(dataToEdit.getStock());
    }

    return this.productRepository.save(product);
  }

}
