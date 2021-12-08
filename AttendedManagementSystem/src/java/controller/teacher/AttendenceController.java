package controller.teacher;

import dal.ScheduleDBContext;
import dal.StudentDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Schedule;
import model.Student;

/**
 *
 * @author Linh
 */
public class AttendenceController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int scheduleID = Integer.parseInt(request.getParameter("scheduleID"));
        int classID = Integer.parseInt(request.getParameter("classID"));
        
        Schedule s = new ScheduleDBContext().getScheduleByID(scheduleID);
        ArrayList<Student> students = new ArrayList<>();
        StudentDBContext dbStu = new StudentDBContext();
        students = dbStu.getStudentByClassID(classID);
        
        request.setAttribute("s", s);
        request.setAttribute("students", students);
        request.getRequestDispatcher("../view/teacher/attendence.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
