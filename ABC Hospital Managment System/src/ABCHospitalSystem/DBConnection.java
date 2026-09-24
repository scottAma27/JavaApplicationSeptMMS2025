package abchospitalsystem;
import java.sql.*;


public class DBConnection {
    public static Connection getConnection(){
        try{
            String url = "jdbc:sqlserver://localhost:1433;databaseName="
                    + "ABCHospitalDataBase;encrypt=true;trustServerCertificate=true;";
            
            String user = "mainhospital";
            String pass = "12345";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url, user, pass);
        }catch(Exception e){
            System.out.println("DB Error: "+e.getMessage());
            return null;
        }
    }
}