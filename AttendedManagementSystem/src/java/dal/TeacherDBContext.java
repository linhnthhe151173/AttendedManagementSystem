package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Teacher;

/**
 *
 * @author Linh
 */
public class TeacherDBContext extends DBContext {

    private PreparedStatement stm;
    private ResultSet rs;

    public Teacher getOne(Teacher t) {
        try {
            String sql = "select * from Teacher\n"
                    + "where TeacherID = ?";
            stm = connection.prepareStatement(sql);
            stm.setInt(1, t.getTeacherID());
            rs = stm.executeQuery();
            
            while (rs.next()) {                
                Teacher t1 = Teacher.builder().TeacherID(rs.getInt(1))
                        .TeacherName(rs.getString(2))
                        .TeacherImage(rs.getString(3))
                        .TeacherGender(rs.getBoolean(4))
                        .TeacherAddress(rs.getString(5))
                        .TeacherEmail(rs.getString(6))
                        .TeacherPhone(rs.getString(7))
                        .TeacherDOB(rs.getDate(8)).build();
                
                return t1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TeacherDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
