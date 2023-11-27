/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;
import models.Product;

/**
 *
 * @author User
 */
import java.util.HashMap;
import java.util.Map;

public class ProductRepository {
    private Map<String, Product> productsList;

    public ProductRepository() {
        this.productsList = new HashMap<>();
        // Initialize productsList or load data from a database/file
    }

    public Product getProduct(String productId) {
        return productsList.get(productId);
    }

    public void updateProduct(Product product) {
        if (productsList.containsKey(product.getProductId())) {
            productsList.put(product.getProductId(), product);
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void addProduct(Product product) {
        if (!productsList.containsKey(product.getProductId())) {
            productsList.put(product.getProductId(), product);
            System.out.println("Product added successfully.");
        } else {
            System.out.println("Product with the same ID already exists.");
        }
    }

    public void deleteProduct(String productId) {
        if (productsList.containsKey(productId)) {
            productsList.remove(productId);
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found for deletion.");
        }
    }

    public void displayAllProducts() {
        System.out.println("List of Products:");
        for (Product product : productsList.values()) {
            System.out.println(product);
        }
    }

    // Other methods for managing products within the repository
}

