package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Role;

/**
 *
 * @author Linh
 */
public class AccountDBContext extends DBContext{

    private PreparedStatement stm;
    private ResultSet rs;

    public Account getOne(Account account) {
        try {
            String sql = "SELECT * FROM Account WHERE username = ? AND password = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, account.getUsername());
            stm.setString(2, account.getPassword());
            rs = stm.executeQuery();
            if (rs.next()) {
                Role role = Role.builder()
                        .RoleID(rs.getInt(4)).build();
                role = new RoleDBContext().getOne(role);
                
                
                Account account1 = Account.builder()
                        .username(rs.getString(1))
                        .password(rs.getString(2))
                        .displayName(rs.getString(3))
                        .RoleID(role)
                        .build();
                return account1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int countAccount() {
        int total_account = 0;
        try {
            String sql = "select count(*)\n"
                    + "from Account";
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {                
                total_account = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SubjectDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total_account;
    }
}
