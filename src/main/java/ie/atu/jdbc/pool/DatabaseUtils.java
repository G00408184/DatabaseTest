package ie.atu.jdbc.pool;

import java.sql.*;
import javax.sql.DataSource;
import com.mysql.cj.jdbc.MysqlDataSource;

public class DatabaseUtils {
    //later we will look at storing this type of data in a better location like a properties file
    private static final String URL = "jdbc:mysql://localhost:3306/exampledatabase";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";
    private static final DataSource dataSource;

    static {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setURL(URL);
        mysqlDataSource.setUser(USERNAME);
        mysqlDataSource.setPassword(PASSWORD);
        dataSource = mysqlDataSource;
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}