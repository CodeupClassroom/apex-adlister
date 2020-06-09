package controllers;

import daos.DaoFactory;
import interfaces.Products;
import models.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ViewProductsServlet", urlPatterns = "/products")
public class ViewProductsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Products products = DaoFactory.getProductsDao();
        List<Product> productList = products.all();
        request.setAttribute("products", productList);
        request.getRequestDispatcher("/WEB-INF/products/index.jsp").forward(request, response);
    }
}
