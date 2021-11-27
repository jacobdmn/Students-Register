package Students_Register;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class showInfo {
    Connection con = null;
    PreparedStatement pst1 = null;
    PreparedStatement pst2 = null;
    ResultSet rs = null;
    
    showInfo(){
        con = Connect.con();
    }
    
    public void selectStudentInfo(JTable table , int _id , JLabel bigFullName , JLabel fullName ,JLabel username , JLabel email){
        
        String query = "SELECT fullName, username, email FROM list_st WHERE id = "+ _id +"";
        try {
            pst1 = con.prepareStatement(query);
            rs = pst1.executeQuery();
            
            if(rs.next()){
                String  FName = rs.getString("fullName"),
                        UName = rs.getString("username"),
                        EM = rs.getString("email");
                
                bigFullName.setText(FName);
                fullName.setText(FName);
                username.setText(UName);
                email.setText(EM);
            }
            else
                JOptionPane.showMessageDialog(null, "Faild !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error in database !" , "" , JOptionPane.WARNING_MESSAGE);
        }
        finally {
            try {
                rs.close();
                pst1.close();
            } catch (SQLException ex) {
            }
        }
    }
    public void deleteStudent(JTable table, JLabel bigFullName , JLabel fullName ,JLabel username , JLabel email){
        String query1 = "SELECT username FROM list_st WHERE username ='" + username.getText() + "'";
        String query2 = "DELETE FROM list_st WHERE username ='" + username.getText() + "'";
        try{
            pst1 = con.prepareStatement(query1);
            pst2 = con.prepareStatement(query2);
            rs = pst1.executeQuery();
            if(rs.next()){
                pst2.execute();
                JOptionPane.showMessageDialog(null, "The Student is removed !");
            } else
                JOptionPane.showMessageDialog(null, "Please Select a Student !", ":(", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage(), ":(", JOptionPane.WARNING_MESSAGE);
        }
        finally {
            try {
                rs.close();
                pst1.close();
                pst2.close();
                bigFullName.setText("No Student Selected");
                fullName.setText(null);
                username.setText(null);
                email.setText(null);
            } catch (SQLException ex) {
            }
        }
        new showStudents().fillTable(table);
    }
}
