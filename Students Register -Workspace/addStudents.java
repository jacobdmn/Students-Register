/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students_Register;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Dz SQL Injectionner
 */
public class addStudents{
    private Connection con = null;
    private PreparedStatement pst = null;
    private PreparedStatement pst2 = null;
    private ResultSet rs = null;
    addStudents(){
        this.con = Connect.con();
    }
    public void addStudents(JTable table , JTextField fullName , JTextField username , JPasswordField password , JTextField email){
        try{
            String txtFullName = fullName.getText(),
                   txtUsername = username.getText(),
                   txtPassword = password.getText(),
                   txtEmail = email.getText();
            String sql = "INSERT INTO list_st (fullName , username , password , email) VALUES(?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, txtFullName);
            pst.setString(2, txtUsername);
            pst.setString(3, txtPassword);
            pst.setString(4, txtEmail);
            
            if(!txtFullName.equals("") && !txtUsername.equals("") && !txtPassword.equals("") && !txtEmail.equals("")){
                pst.execute();
                JOptionPane.showMessageDialog(null, "Student is added !");
                new showStudents().fillTable(table);
                fullName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
                username.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
                email.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
                password.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
            }
            else{
                if(txtFullName.equals(""))
                    fullName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255,51,51)));
                if(txtUsername.equals(""))
                    username.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255,51,51)));
                if(txtEmail.equals(""))
                    email.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255,51,51)));
                if(txtPassword.equals(""))
                    password.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255,51,51)));

                JOptionPane.showMessageDialog(null, "Wanting Info !", "Faild Adding !" , JOptionPane.ERROR_MESSAGE);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error in Adding !" , "Faild Adding !" , JOptionPane.ERROR_MESSAGE);
        }
        finally{
            try {
                String txtFullName = fullName.getText(),
                   txtUsername = username.getText(),
                   txtPassword = password.getText(),
                   txtEmail = email.getText();
                if(!txtFullName.equals("") && !txtUsername.equals("") && !txtPassword.equals("") && !txtEmail.equals("")){
                    fullName.setText("");
                    username.setText("");
                    password.setText("");
                    email.setText("");
                    pst.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error in Close DATABASE ! , \n The Error : \n"+e.getLocalizedMessage() , "Error !" , JOptionPane.WARNING_MESSAGE);
            }
             
        }
    }
    
}
