package lk.edu.ijse.utill;

//import lk.edu.ijse.paymentsystem.db.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lk.edu.ijse.db.DBConnection;

public class Idcounter {

    private Connection connection;

    public Idcounter() {
//        connection = ConnectionFactory.getInstance().getConnection();
        connection = DBConnection.getDBConnection().getConnection();
    }

    public static String getLastId(String tableName, String columName) throws SQLException {
        String sql = String.format("SELECT %s FROM %s ORDER BY %s DESC LIMIT 1", columName, tableName, columName);
        Connection connection = DBConnection.getDBConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return rst.getString(1);
        }
        return null;
    }
}
