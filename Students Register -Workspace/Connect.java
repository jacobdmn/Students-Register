package Students_Register;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Connect {
    public static final Connection con(){
        try{
            Class.forName("org.sqlite.JDBC");
            final Connection con = DriverManager.getConnection("jdbc:sqlite:Students.sqlite");
            return con;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Can't Connect !");
        }
        finally{
            System.exit(0);
        }
        return null;
    }
}