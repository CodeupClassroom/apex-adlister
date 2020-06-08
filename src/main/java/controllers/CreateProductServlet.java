package controllers;

import daos.DaoFactory;
import models.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CreateProductServlet", urlPatterns = "/products/create")
public class CreateProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));

        Product newProduct = new Product();
        newProduct.setName(name);
        newProduct.setPrice(price);

        DaoFactory.getProductsDao().insert(newProduct);

        response.sendRedirect("/products");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/products/create.jsp").forward(request, response);
    }
}
