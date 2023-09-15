<%@ page import="org.example.Product" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product List</title>
</head>
<body>
<h1>Product List</h1>
<a href="${pageContext.request.contextPath}/products/add">Add Product</a>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <%
        List<Product> products = (List<Product>) request.getAttribute("products");
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
    %>
    <tr>
        <td><%= product.getId() %></td>
        <td><%= product.getName() %></td>
        <td>$<%= product.getPrice() %></td>
        <td>
            <a href="${pageContext.request.contextPath}/products/delete/<%= product.getId() %>">Delete</a>
        </td>
    </tr>
    <%
        }
    %>
    </tbody>
</table>
</body>
</html>
