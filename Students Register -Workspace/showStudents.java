package Students_Register;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class showStudents {
    private Connection con = null;
    private PreparedStatement pst = null;
    private ResultSet rslt = null;
    showStudents(){
        con = Connect.con();
    }
    public void fillTable(JTable table){
        try {
            String sql = "SELECT * FROM list_st ORDER BY id DESC";
            pst = con.prepareStatement(sql);
            rslt = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rslt));
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            try {
                pst.close();
                rslt.close();
            } catch (SQLException ex) {
                Logger.getLogger(showStudents.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
