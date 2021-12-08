package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Teacher;
import model.TimeSlot;

/**
 *
 * @author Linh
 */
public class TimeSlotDBContext extends DBContext {
    
    private PreparedStatement stm;
    private ResultSet rs;

    public TimeSlot getOne(TimeSlot ts) {
        try {
            String sql = "select * from TimeSlot\n"
                    + "where TimeSlotID = ?";
            stm = connection.prepareStatement(sql);
            stm.setInt(1, ts.getTimeSlotID());
            rs = stm.executeQuery();

            while (rs.next()) {
                TimeSlot ts1 = TimeSlot.builder()
                        .TimeSlotID(rs.getInt(1))
                        .TimeSlotStart(rs.getTime(2))
                        .TimeSlotEnd(rs.getTime(3)).build();
                
                return ts1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TeacherDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
