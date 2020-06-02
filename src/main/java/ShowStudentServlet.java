import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ShowStudentServlet", urlPatterns = "/users")
public class ShowStudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        out.println("<h3>Hello " + name + "</h3>");

        try{
            int grade = Integer.parseInt(request.getParameter("grade"));
            out.println("<span>Grade: " + grade + ".00</span>");
        }catch (NumberFormatException e){
            e.printStackTrace();
            out.println("Grade not present");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");

        if(name.equals("admin")){
            response.sendRedirect("/bad-place");
        }

        out.println("<h1>This is your post param: " + name + "</h1>");
    }

}
