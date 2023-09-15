package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/products/*")
public class ProductServlet extends HttpServlet{

    ProductService productService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getPathInfo();
        System.out.println("path "+ path);
        String[] pathParts = path.split("/");
        System.out.println("pathParts "+ Arrays.asList(pathParts));

        String op = pathParts[1];

        switch (op) {
            case "edit" -> {
                String id = pathParts[2];
                System.out.println("editing" + id);
            }
            case "list" -> {
                resp.setContentType("application/json");
                List<Product> products = productService.getProducts();
                resp.getWriter().println("[");
                for (int i = 0; i < products.size(); i++) {
                    Product product = products.get(i);
                    resp.getWriter().println("{");
                    resp.getWriter().println("\"id\": \"" + i + "\",");
                    resp.getWriter().println("\"name\": \"" + product.getName() + "\",");
                    resp.getWriter().println("\"price\": \"" + product.getPrice() + "\"");
                    resp.getWriter().println("}");
                    if (i < products.size() - 1) {
                        resp.getWriter().println(",");
                    }
                }
                resp.getWriter().println("]");
            }
        }
    }
}
