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
public class SemesterDBContext extends DBContext {
    
    private PreparedStatement stm;
    private ResultSet rs;
    
    public Semester getOne(Semester se) {
        try {
            String sql = "select * from Semester\n"
                    + "where SemesterID = ?";
            stm = connection.prepareStatement(sql);
            stm.setInt(1, se.getSemesterID());
            rs = stm.executeQuery();
            
            while (rs.next()) {
                
                Semester se1 = Semester.builder().SemesterID(rs.getInt(1))
                        .SemesterName(rs.getString(2)).build();
                
                return se1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SubjectDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
