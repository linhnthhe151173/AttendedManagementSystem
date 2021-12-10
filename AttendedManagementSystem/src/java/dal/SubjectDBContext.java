package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Semester;
import model.Subject;

/**
 *
 * @author Linh
 */
public class SubjectDBContext extends DBContext {

    private PreparedStatement stm;
    private ResultSet rs;

    public Subject getOne(Subject su) {
        try {
            String sql = "select * from Subject\n"
                    + "where SubjectID = ?";
            stm = connection.prepareStatement(sql);
            stm.setInt(1, su.getSubjectID());
            rs = stm.executeQuery();

            while (rs.next()) {

                Semester se = Semester.builder().SemesterID(rs.getInt(4)).build();
                se = new SemesterDBContext().getOne(se);

                Subject s = Subject.builder().SubjectID(rs.getInt(1))
                        .SubjectCode(rs.getString(2))
                        .TotalSlot(rs.getInt(3))
                        .SemesterID(se)
                        .SubjectName(rs.getString(5))
                        .build();
                return s;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SubjectDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int countSubject() {
        int total_subject = 0;
        try {
            String sql = "select count(*)\n"
                    + "from Subject";
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {                
                total_subject = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SubjectDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total_subject;
    }

}
