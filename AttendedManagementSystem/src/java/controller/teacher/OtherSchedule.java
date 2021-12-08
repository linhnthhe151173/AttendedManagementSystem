package controller.teacher;


import dal.ScheduleDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Schedule;

/**
 *
 * @author Linh
 */
@WebServlet(urlPatterns = {"/teacher/other_schedule"})
public class OtherSchedule extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<Schedule> list_schedule_all = new ArrayList<>();
        ScheduleDBContext dbSche = new ScheduleDBContext();
        list_schedule_all = dbSche.getAll();
        request.setAttribute("list_schedule_all", list_schedule_all);
        request.getRequestDispatcher("../view/teacher/other_schedule.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String date = request.getParameter("search_date");

        ArrayList<Schedule> list_schedule_all = new ArrayList<>();
        ScheduleDBContext dbSche = new ScheduleDBContext();
        list_schedule_all = dbSche.getAll();
        
        ArrayList<Schedule> list_schedule;
        Date search_date = null;

        if (date.equals("")) {
            list_schedule = new ArrayList<>();
            list_schedule_all = dbSche.getAll();
        } else {
            search_date = Date.valueOf(request.getParameter("search_date"));
            list_schedule = dbSche.getScheduleByDate(search_date);
        }

        request.setAttribute("list_schedule", list_schedule);
        request.setAttribute("search_date", search_date);
        request.setAttribute("list_schedule_all", list_schedule_all);
        request.getRequestDispatcher("../view/teacher/other_schedule.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
