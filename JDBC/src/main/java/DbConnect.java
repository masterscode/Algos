import java.sql.*;

public class DbConnect {
    public static void main(String[] args) {
        String link = "jdbc:mysql://localhost/db_practice?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
//        String dbUrl = "jdbc:mysql://localhost:3306/db_practice";
        String dbUser = "root";
        String pw = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connector = DriverManager.getConnection(link, dbUser, pw);
            Statement stt = connector.createStatement();
            ResultSet result = stt.executeQuery("SELECT * FROM users");

            result.next();

            String last_names = result.getString("LastName");
            String first_names = result.getString("FirstName");

            System.out.printf(" first name: %s, lastname: %s",first_names, last_names);

            stt.close();
            connector.close();
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}
