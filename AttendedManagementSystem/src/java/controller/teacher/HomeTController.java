package controller.teacher;

import dal.ScheduleDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.Instant;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Schedule;

/**
 *
 * @author Linh
 */
public class HomeTController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        
        //get today's schedule
        ArrayList<Schedule> list_schedule = new ArrayList<>();
        ScheduleDBContext dbSche = new ScheduleDBContext();
        
        list_schedule = dbSche.getScheduleByDate(date);
        
        request.setAttribute("date", date);
        request.setAttribute("list_schedule", list_schedule);
        request.getRequestDispatcher("../view/teacher/today_schedule.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
