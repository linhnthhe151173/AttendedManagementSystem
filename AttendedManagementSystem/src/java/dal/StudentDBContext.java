package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Semester;
import model.Student;

/**
 *
 * @author Linh
 */
public class StudentDBContext extends DBContext{

    private PreparedStatement stm;
    private ResultSet rs;

    public ArrayList<Student> getStudentByClassID(int ClassID) {
        ArrayList<Student> students = new ArrayList<>();
        try {
            String sql = "select s.*\n"
                    + "from ClassMember c inner join Student s\n"
                    + "on c.StudentID = s.StudentID\n"
                    + "where c.ClassID = ?";
            
            stm = connection.prepareStatement(sql);
            stm.setInt(1, ClassID);
            rs = stm.executeQuery();
            
            while (rs.next()) {      
                
                Semester se = Semester.builder().SemesterID(rs.getInt(9)).build();
                se = new SemesterDBContext().getOne(se);
                
                Student s = Student.builder()
                        .StudentID(rs.getString(1))
                        .StudentName(rs.getString(2))
                        .StudentImage(rs.getString(3))
                        .StudentGender(rs.getBoolean(4))
                        .StudentAddress(rs.getString(5))
                        .StudentEmail(rs.getString(6))
                        .StudentPhone(rs.getString(7))
                        .StudentDOB(rs.getDate(8))
                        .SemesterID(se)
                        .build();
                
                students.add(s);
            }
            return students;
        } catch (SQLException ex) {
            Logger.getLogger(StudentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
