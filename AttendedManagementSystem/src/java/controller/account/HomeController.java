package controller.account;

import dal.AccountDBContext;
import dal.ClassDBContext;
import dal.ScheduleDBContext;
import dal.SubjectDBContext;
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
@WebServlet(name = "HomeController", urlPatterns = {"/account/home"})
public class HomeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int total_subject = new SubjectDBContext().countSubject();
        
        int total_class = new ClassDBContext().countClass();
        
        int total_account = new AccountDBContext().countAccount();
        
        int total_schedule = new ScheduleDBContext().countSchedule();
        
        request.setAttribute("total_subject", total_subject);
        request.setAttribute("total_class", total_class);
        request.setAttribute("total_account", total_account);
        request.setAttribute("total_schedule", total_schedule);
        request.getRequestDispatcher("../view/account/home_admin.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
