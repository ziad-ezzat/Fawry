package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/products/*")
public class ProductServlet extends HttpServlet {

    ProductService service =new ProductService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String path = request.getPathInfo();
        String[] pathParts = path.split("/");
        String currentPage = pathParts[1];
        System.out.println(currentPage);
        switch (currentPage) {
            case "home" -> {
                request.setAttribute("products",service.getAllProducts());
                request.getRequestDispatcher("/ProductsHome.jsp").forward(request,response);
            }
            case "add" -> {
                request.getRequestDispatcher("/AddProduct.jsp").forward(request,response);
            }
            case "delete" -> {
                int id = Integer.parseInt(pathParts[2]);
                service.removeProduct(id);
                response.sendRedirect(getServletContext().getContextPath()+"/products/home");
            }
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            String name = req.getParameter("name");
            double price = Double.parseDouble(req.getParameter("price"));

            Product product = new Product();

            product.setName(name);
            product.setPrice(price);

            service.addProduct(product);
            resp.sendRedirect(getServletContext().getContextPath()+"/products/home");
    }
}
