package org.example;

import java.util.List;

public class ProductService {

    ProductRepository repository =new ProductRepository();

    public List<Product> getAllProducts() {
        return repository.findProducts();
    }

    public void addProduct(Product product) {
        System.out.println(product);
        if (!product.getName().isEmpty() && product.getPrice() > 0) {
            repository.addProduct(product);
        }
    }

    public void removeProduct(int productId) {
        repository.deleteProduct(productId);
    }
}
