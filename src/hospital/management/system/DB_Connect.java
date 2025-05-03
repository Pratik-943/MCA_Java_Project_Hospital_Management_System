package hospital.management.system;

import java.sql.*;

public class DB_Connect {
    Connection con;
    Statement sm;
    public DB_Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/hospital_management_system", "root", "pratik");
            sm = con.createStatement();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }


}
