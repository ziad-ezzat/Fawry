package org.example;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product("Pen", 1.0));
        products.add(new Product("Pencil", 0.5));
        products.add(new Product("Eraser", 0.3));
        products.add(new Product("Notebook", 2.0));
    }

    public List<Product> getProducts() {
        return products;
    }
}
