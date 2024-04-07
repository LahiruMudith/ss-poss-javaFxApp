package org.resturant.Model;

import org.resturant.db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployerLoginModel {
    public static boolean loginCustomer(String empNum) {
        Connection connection = DBConnection.getDbConnection().getConnection();
        try {
            PreparedStatement stm = connection.prepareStatement("select id from login where id=?");
            stm.setObject(1, empNum);

            ResultSet results = stm.executeQuery();
            boolean next = results.next();
//            Login login = new Login();
//
//            if (results.next()) {
//                login.setId(results.getString(1));
//                login.setName(results.getString(2));
//                login.setAddress(results.getString(3));
//            }
            return next;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
