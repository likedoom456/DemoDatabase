package demo;

import com.mysql.jdbc.Driver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created at 221
 * 16-7-15 下午2:18.
 */

// JDBC = Java DataBase Connectivity
public class JDBC {
    private static final String ip = "C:\\Users\\Administrator\\Desktop\\ip1.txt";
    public static void main(String[] args){

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(ip));) {
            String str;
            new Driver();
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "112233445");
            String sql = "INSERT INTO user VALUES(?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            while ((str = bufferedReader.readLine()) != null) {
                preparedStatement.setString(1,str.substring(0,16));
                preparedStatement.setString(2, str.substring(16,31));
                preparedStatement.setString(3, str.substring(31));
                preparedStatement.executeUpdate();
            }
            preparedStatement.close();
            connection.close();
        } catch (IOException | StringIndexOutOfBoundsException | SQLException e) {
            e.printStackTrace();
        }
    }
}
