package basic.db;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
public class mainDB {
    public static void main(String[] args) throws SQLException {
        mysqliconn db = new mysqliconn("localhost", "testjava", "root", "");

        String getData = "SELECT * FROM demo";

        ResultSet result = db.selectData(getData);
        ResultSetMetaData data = result.getMetaData();
        // lay ten cot
        StringBuilder print = new StringBuilder();
        for (int i = 1; i <= data.getColumnCount(); ++i) {
            print.append(data.getColumnName(i)).append("\t");
        }
        System.out.println(print);
        while (result.next()) {
            StringBuilder row = new StringBuilder();
            for (int i = 1; i <= data.getColumnCount(); ++i) {
                row.append(result.getString(i)).append("\t");
            }
            System.out.println(row);
        }
        db.closeConnect();
    }
}
