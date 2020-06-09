package controllers;

import daos.DaoFactory;
import models.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ShowProductServlet", urlPatterns = "/product")
public class ShowProductServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long id = Long.parseLong(request.getParameter("id"));

        try{
            Product product = DaoFactory.getProductsDao().findOne(id);
            request.setAttribute("product", product);
        } catch (IndexOutOfBoundsException ex){
            request.setAttribute("error", "Product does not exist");
        }

        HttpSession session = request.getSession();
        request.setAttribute("isAdmin", session.getAttribute("isAdmin"));

        request.getRequestDispatcher("/WEB-INF/products/show.jsp").forward(request, response);
    }
}