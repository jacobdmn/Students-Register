package Students_Register;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Edit {
    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement pst2 = null;
    ResultSet rs = null;
    
    Edit(){
        con = Connect.con();
    }
    
    public void selectStudent(JTable table , int _id , JTextField fullName ,JTextField username , JPasswordField password , JTextField email){
        
        String query = "SELECT * FROM list_st WHERE id = "+ _id;
        try {
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            
            if(rs.next()){
                String  FName = rs.getString("fullName"),
                        UName = rs.getString("username"),
                        Pass = rs.getString("password"),
                        EM = rs.getString("email");
                
                fullName.setText(FName);
                username.setText(UName);
                password.setText(Pass);
                email.setText(EM);
            }
            else
                JOptionPane.showMessageDialog(null, "Faild !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in database !" , "" , JOptionPane.WARNING_MESSAGE);
        }
        finally {
            try {
                rs.close();
                pst.close();
            } catch (SQLException ex) {
            }
        }
    }
    
    public void editStudent(JTable table , int _id , JTextField fullName ,JTextField username , JPasswordField password , JTextField email){
        String query = "UPDATE list_st set fullName=? , username=? , password=? , email=? WHERE id="+_id;
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, fullName.getText());
            pst.setString(2, username.getText());
            pst.setString(3, password.getText());
            pst.setString(4, email.getText());
            if(!fullName.getText().equals("") && !username.getText().equals("") && !password.getText().equals("") && !email.getText().equals("")){
                pst.execute();
                JOptionPane.showMessageDialog(null, "Student is Edited !");
            }
            else
                JOptionPane.showMessageDialog(null, "Wanting Info !", "Faild Adding !" , JOptionPane.ERROR_MESSAGE);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "The Error \n" + ex.getLocalizedMessage());
        }
    }
    
}