import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/videomanager?useSSL=false","root","wang201314");
        Statement stmt = connection.createStatement();
        stmt.execute("select * from admin_user");
    }
}
