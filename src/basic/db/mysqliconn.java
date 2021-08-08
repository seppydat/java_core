package basic.db;

import java.sql.*;

public class mysqliconn {
    private final String hostName;
    private final String dbName;
    private final String userName;
    private final String password;
    private Connection connectDB = null;

    // Kết nối vào MySQL.
    public mysqliconn(String hostName, String dbName,
                     String userName, String password) {
        this.hostName = hostName;
        this.dbName = dbName;
        this.userName = userName;
        this.password = password;

    }

    public void openConnect() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Cấu trúc URL Connection dành cho Oracle
        // Ví dụ: jdbc:mysql://localhost:3306/simplehr
        String connectionURL = "jdbc:mysql://" + this.hostName + ":3306/" + this.dbName +  "?useSSL=false";

        this.connectDB = DriverManager.getConnection(connectionURL, this.userName,
                this.password);
    }

    public void closeConnect() throws SQLException {
        this.connectDB.close();
    }

    public boolean runSQL(String sql) {
        try {
            this.openConnect();
            Statement stmt = this.connectDB.createStatement();
            stmt.execute(sql);
            this.closeConnect();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public ResultSet selectData(String sql) {
        try {
            this.openConnect();
            Statement stmt = this.connectDB.createStatement();
            return stmt.executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}