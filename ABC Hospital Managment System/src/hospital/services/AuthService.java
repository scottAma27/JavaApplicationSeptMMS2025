package hospital.services;

import abchospitalsystem.DBConnection;
import hospital.model.User;
import java.sql.*;

public class AuthService {
    
    public User login(String username, String passwordHash){
        String sql = "SELECT u.UserId, u.Username, u.Role, u.StaffId, u.IsActive, " +
                     "p.FirstName, p.LastName " +
                     "FROM Users u " +
                     "JOIN Staff s ON u.StaffId = s.StaffId " +
                     "JOIN Person p ON s.PersonId = p.PersonId " +
                     "WHERE u.Username=? AND u.PasswordHash=? AND u.IsActive=1";
        try(Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement(sql)){
            pst.setString(1, username);
            pst.setString(2, passwordHash);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                User user = new User();
                user.setUserId(rs.getInt("UserId"));
                user.setUsername(rs.getString("Username"));
                user.setRole(rs.getString("Role"));
                user.setStaffId(rs.getInt("StaffId"));
                user.setFullName(rs.getString("FirstName")+" "+rs.getString("LastName"));
                user.setActive(rs.getBoolean("IsActive"));
                return user;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}