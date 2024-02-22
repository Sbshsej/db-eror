import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
    Connection c;
Statement s;
    conn() {
        try {

            c = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "03102022");
     s =c.createStatement();
        }catch (Exception e)
        {e.printStackTrace();
    }
}}