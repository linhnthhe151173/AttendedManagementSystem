package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Schedule;
import model.Subject;
import model.Teacher;
import model.TimeSlot;

/**
 *
 * @author Linh
 */
public class ScheduleDBContext extends DBContext {

    private PreparedStatement stm;
    private ResultSet rs;

    public ArrayList<Schedule> getScheduleByDate(Date date) {
        ArrayList<Schedule> listSchedule = new ArrayList<>();
        try {
            String sql = "select * from Schedule\n"
                    + "where ScheduleDate = ?";

            stm = connection.prepareStatement(sql);
            stm.setDate(1, date);
            rs = stm.executeQuery();

            while (rs.next()) {

                Teacher t = Teacher.builder().TeacherID(rs.getInt(2)).build();
                t = new TeacherDBContext().getOne(t);

                Subject su = Subject.builder().SubjectID(rs.getInt(3)).build();
                su = new SubjectDBContext().getOne(su);

                model.Class c = model.Class.builder().ClassID(rs.getInt(4)).build();
                c = new ClassDBContext().getOne(c);

                Date dateSchedule = Date.valueOf(rs.getString(6));

                TimeSlot ts = TimeSlot.builder().TimeSlotID(rs.getInt(5)).build();
                ts = new TimeSlotDBContext().getOne(ts);

                Schedule s = Schedule.builder().ScheduleID(rs.getInt(1))
                        .TeacherID(t)
                        .SubjectID(su)
                        .ClassID(c)
                        .TimeSlotID(ts)
                        .ScheduleDate(dateSchedule).build();
                
                listSchedule.add(s);
            }
            return listSchedule;
        } catch (SQLException ex) {
            Logger.getLogger(ScheduleDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void main(String[] args) {
        ArrayList<Schedule> listSchedule = new ArrayList<>();
        ScheduleDBContext dao = new ScheduleDBContext();
        long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        
        listSchedule = dao.getScheduleByDate(date);
        for (Schedule schedule : listSchedule) {
            System.out.println(schedule);
        }
    }

}