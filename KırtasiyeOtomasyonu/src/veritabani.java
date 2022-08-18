    import java.sql.*;
public class veritabani {
    public static Connection getConnetcion(){
        Connection connection= null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/kirtasiyeprojesi", "root", ""); 
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
