package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Attendence;
import model.Schedule;
import model.Student;

/**
 *
 * @author Linh
 */
public class AttendenceDBContext extends DBContext {

    private PreparedStatement stm;
    private ResultSet rs;

    public void insert(ArrayList<Attendence> list_attendence) {
        try {
            connection.setAutoCommit(false);
            String sql = "INSERT INTO [dbo].[Attendence]\n"
                    + "           ([StudentID]\n"
                    + "           ,[ScheduleID]\n"
                    + "           ,[Present]\n"
                    + "           ,[AttendenceDate])\n"
                    + "     VALUES\n"
                    + "           (? , ?, ?, ?)";

            for (Attendence a : list_attendence) {
                stm = connection.prepareStatement(sql);
                stm.setString(1, a.getStudentID().getStudentID());
                stm.setInt(2, a.getScheduleID().getScheduleID());
                stm.setBoolean(3, a.isPresent());
                stm.setDate(4, a.getAttendenceDate());
                stm.executeUpdate();
            }
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(AttendenceDBContext.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(AttendenceDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(AttendenceDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {
        AttendenceDBContext dao = new AttendenceDBContext();
        ArrayList<Attendence> list_attendence = new ArrayList<>();
        Student s = Student.builder()
                .StudentID("HE1511")
                .build();
        Schedule sc = Schedule.builder()
                .ScheduleID(1).build();
        long millis = System.currentTimeMillis();
            Date attendenceDate = new Date(millis);
        Attendence a = Attendence.builder()
                .StudentID(s)
                .ScheduleID(sc)
                .Present(Boolean.parseBoolean("1"))
                .AttendenceDate(attendenceDate).build();
        
        list_attendence.add(a);
        dao.insert(list_attendence);
    }
}
