package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Class;
import model.Teacher;

/**
 *
 * @author Linh
 */
public class ClassDBContext extends DBContext {

    private PreparedStatement stm;
    private ResultSet rs;

    public Class getOne(Class c) {
        try {
            String sql = "select * from Class\n"
                    + "where ClassID = ?";
            stm = connection.prepareStatement(sql);
            stm.setInt(1, c.getClassID());
            rs = stm.executeQuery();

            while (rs.next()) {
                Class cl = Class.builder().ClassID(rs.getInt(1))
                        .ClassName(rs.getString(2)).build();
                
                return cl;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TeacherDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}