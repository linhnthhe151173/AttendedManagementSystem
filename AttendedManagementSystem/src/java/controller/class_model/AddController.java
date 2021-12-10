package controller.class_model;

import dal.ClassDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Linh
 */
@WebServlet(name = "AddClassController", urlPatterns = {"/class/add"})
public class AddController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("../view/admin/add_class.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String class_name = request.getParameter("class_name");
        
        model.Class c = model.Class.builder().ClassName(class_name).build();
        ClassDBContext dbC = new ClassDBContext();
        
        dbC.inert(c);
        response.sendRedirect("../class_detail");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
