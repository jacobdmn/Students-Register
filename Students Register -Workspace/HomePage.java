package Students_Register;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class HomePage extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    HomePage() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage("img/admin.png"));
        con = Connect.con();
        new showStudents().fillTable(table_st);
        this.table_st.setShowGrid(true);
        getContentPane().setBackground(origin.getBackground());
        this.top_logo.setBackground(null);
        this.left_part.setBackground(null);
        this.right_part.setBackground(null);
        this.footer.setBackground(null);
        this.add_st.setBackground(null);
        this.edit_st.setBackground(null);
        this.delete_st.setBackground(null);
        this.search_box.setBackground(null);
        Color color = Color.decode("#F0F0F0");
        this.add_st.setBackground(color);
        this.edit_st.setBackground(color);
        this.delete_st.setBackground(color);
        this.chngeBG.setBackground(null);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top_logo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        left_part = new javax.swing.JPanel();
        actions = new javax.swing.JTabbedPane();
        add_st = new javax.swing.JPanel();
        fullNameNew = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        usernameNew = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        emailNew = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        addNew = new javax.swing.JButton();
        action1 = new javax.swing.JLabel();
        passwordNew = new javax.swing.JPasswordField();
        show = new javax.swing.JButton();
        edit_st = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        fullNameEdit = new javax.swing.JTextField();
        emailEdit = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        passwordEdit = new javax.swing.JPasswordField();
        usernameEdit = new javax.swing.JTextField();
        show2 = new javax.swing.JButton();
        saveEdit = new javax.swing.JButton();
        action2 = new javax.swing.JLabel();
        delete_st = new javax.swing.JPanel();
        smal_line = new javax.swing.JLabel();
        big_fullName = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        fullName_inDelete = new javax.swing.JLabel();
        username_inDelete = new javax.swing.JLabel();
        email_inDelete = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        action3 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        right_part = new javax.swing.JPanel();
        tableShowSt = new javax.swing.JScrollPane();
        table_st = new javax.swing.JTable();
        search_box = new javax.swing.JPanel();
        search = new javax.swing.JTextField();
        big_fullName1 = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        line = new javax.swing.JLabel();
        powerd = new javax.swing.JLabel();
        devloper = new javax.swing.JLabel();
        chngeBG = new javax.swing.JPanel();
        changeBG = new javax.swing.JLabel();
        yellow = new javax.swing.JPanel();
        green = new javax.swing.JPanel();
        blue = new javax.swing.JPanel();
        origin = new javax.swing.JPanel();
        Menu = new javax.swing.JMenuBar();
        exit = new javax.swing.JMenu();
        add_st_b = new javax.swing.JMenuItem();
        edit_st_b = new javax.swing.JMenuItem();
        delete_st_b = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        edit_st_b1 = new javax.swing.JMenuItem();
        delete_st_b1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();
        version = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome To Students Register");
        setBackground(new java.awt.Color(204, 204, 204));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setResizable(false);

        top_logo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 153, 255)));

        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/control_st.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setFocusCycleRoot(true);

        javax.swing.GroupLayout top_logoLayout = new javax.swing.GroupLayout(top_logo);
        top_logo.setLayout(top_logoLayout);
        top_logoLayout.setHorizontalGroup(
            top_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        top_logoLayout.setVerticalGroup(
            top_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top_logoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        actions.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 3, new java.awt.Color(51, 153, 255)));
        actions.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        actions.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N

        add_st.setPreferredSize(new java.awt.Dimension(419, 317));

        fullNameNew.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fullNameNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameNewfullNameActionPerformed(evt);
            }
        });

        jLabel33.setText("Password");

        jLabel34.setText("Full Name");

        usernameNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameNewusernameActionPerformed(evt);
            }
        });

        jLabel35.setText("E-mail");

        emailNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailNewemailActionPerformed(evt);
            }
        });

        jLabel36.setText("Username");

        addNew.setText("Add New Student");
        addNew.setBorder(null);
        addNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewaddActionPerformed(evt);
            }
        });

        action1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        action1.setForeground(new java.awt.Color(153, 0, 0));
        action1.setText("Add Student :");

        passwordNew.setMargin(new java.awt.Insets(2, 2, 0, 2));
        passwordNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordNewMouseClicked(evt);
            }
        });
        passwordNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordNewActionPerformed(evt);
            }
        });

        show.setText("Show");
        show.setBorder(null);
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout add_stLayout = new javax.swing.GroupLayout(add_st);
        add_st.setLayout(add_stLayout);
        add_stLayout.setHorizontalGroup(
            add_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_stLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(add_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addNew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(add_stLayout.createSequentialGroup()
                        .addComponent(action1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_stLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(add_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(add_stLayout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fullNameNew, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(add_stLayout.createSequentialGroup()
                        .addGroup(add_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(add_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailNew)
                            .addComponent(usernameNew)
                            .addComponent(passwordNew, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        add_stLayout.setVerticalGroup(
            add_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_stLayout.createSequentialGroup()
                .addComponent(action1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(add_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullNameNew, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(add_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailNew, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(add_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(usernameNew))
                .addGap(18, 18, 18)
                .addGroup(add_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addGroup(add_stLayout.createSequentialGroup()
                        .addGroup(add_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(passwordNew, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(show, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(addNew, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        actions.addTab("Add Students", add_st);

        jLabel38.setText("Full Name");

        fullNameEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fullNameEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameEditfullNameActionPerformed(evt);
            }
        });

        emailEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailEditemailActionPerformed(evt);
            }
        });

        jLabel39.setText("E-mail");

        jLabel40.setText("Username");

        jLabel41.setText("Password");

        passwordEdit.setMargin(new java.awt.Insets(2, 2, 0, 2));

        usernameEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameEditusernameActionPerformed(evt);
            }
        });

        show2.setText("Show");
        show2.setBorder(null);
        show2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show2MouseClicked(evt);
            }
        });
        show2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show2show_hide6show_hideActionPerformed(evt);
            }
        });

        saveEdit.setText("Save Change");
        saveEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEditadd6addActionPerformed(evt);
            }
        });

        action2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        action2.setForeground(new java.awt.Color(51, 102, 255));
        action2.setText("Edit Student :");

        javax.swing.GroupLayout edit_stLayout = new javax.swing.GroupLayout(edit_st);
        edit_st.setLayout(edit_stLayout);
        edit_stLayout.setHorizontalGroup(
            edit_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_stLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(edit_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(edit_stLayout.createSequentialGroup()
                        .addComponent(action2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edit_stLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(edit_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(edit_stLayout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fullNameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(edit_stLayout.createSequentialGroup()
                        .addGroup(edit_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(edit_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailEdit)
                            .addComponent(usernameEdit)
                            .addComponent(passwordEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(show2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        edit_stLayout.setVerticalGroup(
            edit_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_stLayout.createSequentialGroup()
                .addComponent(action2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(edit_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullNameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(edit_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(edit_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usernameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(edit_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(edit_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(show2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(saveEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        actions.addTab("Edit Students", edit_st);

        delete_st.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_stMouseClicked(evt);
            }
        });

        smal_line.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        smal_line.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        smal_line.setText("------------------------------------------------------");
        smal_line.setToolTipText("");

        big_fullName.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        big_fullName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        big_fullName.setText("No Student Selected");
        big_fullName.setToolTipText("");

        jLabel45.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel45.setText("Full Name :");

        jLabel46.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel46.setText("Username :");

        jLabel47.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel47.setText("Email");

        fullName_inDelete.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        fullName_inDelete.setForeground(new java.awt.Color(255, 0, 0));

        username_inDelete.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        username_inDelete.setForeground(new java.awt.Color(255, 0, 0));

        email_inDelete.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        email_inDelete.setForeground(new java.awt.Color(255, 0, 0));

        info.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        info.setForeground(new java.awt.Color(0, 153, 0));
        info.setText("Info About This Students :");

        action3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        action3.setForeground(new java.awt.Color(51, 102, 255));
        action3.setText("Delete Student :");

        delete.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        delete.setText("Delete Student");
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout delete_stLayout = new javax.swing.GroupLayout(delete_st);
        delete_st.setLayout(delete_stLayout);
        delete_stLayout.setHorizontalGroup(
            delete_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(delete_stLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(delete_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(big_fullName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(smal_line, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addGroup(delete_stLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 174, Short.MAX_VALUE))
                    .addGroup(delete_stLayout.createSequentialGroup()
                        .addComponent(action3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, delete_stLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(delete_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(delete_stLayout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addGap(18, 18, 18)
                                .addComponent(email_inDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(delete_stLayout.createSequentialGroup()
                                .addGroup(delete_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel46)
                                    .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(delete_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(username_inDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fullName_inDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, delete_stLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        delete_stLayout.setVerticalGroup(
            delete_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_stLayout.createSequentialGroup()
                .addComponent(action3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(big_fullName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(smal_line, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(delete_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(delete_stLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(fullName_inDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(username_inDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(delete_stLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(delete_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_inDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        actions.addTab("Delete Students", delete_st);

        javax.swing.GroupLayout left_partLayout = new javax.swing.GroupLayout(left_part);
        left_part.setLayout(left_partLayout);
        left_partLayout.setHorizontalGroup(
            left_partLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actions, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
        left_partLayout.setVerticalGroup(
            left_partLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actions, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        );

        table_st.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        table_st.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        table_st.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table_st.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        table_st.setDropMode(javax.swing.DropMode.ON);
        table_st.setFillsViewportHeight(true);
        table_st.setName(""); // NOI18N
        table_st.setRowHeight(25);
        table_st.setRowMargin(4);
        table_st.setSelectionBackground(new java.awt.Color(204, 204, 204));
        table_st.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_stMouseClicked(evt);
            }
        });
        tableShowSt.setViewportView(table_st);

        search_box.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 153, 255)));

        search.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchfullNameActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        big_fullName1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        big_fullName1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        big_fullName1.setText("Search :");
        big_fullName1.setToolTipText("");
        big_fullName1.setIconTextGap(1);

        javax.swing.GroupLayout search_boxLayout = new javax.swing.GroupLayout(search_box);
        search_box.setLayout(search_boxLayout);
        search_boxLayout.setHorizontalGroup(
            search_boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_boxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(big_fullName1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search)
                .addContainerGap())
        );
        search_boxLayout.setVerticalGroup(
            search_boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_boxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(search_boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(big_fullName1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout right_partLayout = new javax.swing.GroupLayout(right_part);
        right_part.setLayout(right_partLayout);
        right_partLayout.setHorizontalGroup(
            right_partLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right_partLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableShowSt, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(search_box, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        right_partLayout.setVerticalGroup(
            right_partLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right_partLayout.createSequentialGroup()
                .addComponent(search_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableShowSt, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        line.setBackground(new java.awt.Color(153, 255, 153));
        line.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        line.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        line.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(51, 153, 255)));
        line.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        line.setFocusCycleRoot(true);
        line.setMaximumSize(new java.awt.Dimension(200, 20));
        line.setMinimumSize(new java.awt.Dimension(200, 20));
        line.setPreferredSize(new java.awt.Dimension(200, 20));

        powerd.setBackground(new java.awt.Color(153, 255, 153));
        powerd.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        powerd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        powerd.setText("Powerd By");
        powerd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        powerd.setFocusCycleRoot(true);
        powerd.setMaximumSize(new java.awt.Dimension(200, 20));
        powerd.setMinimumSize(new java.awt.Dimension(200, 20));
        powerd.setPreferredSize(new java.awt.Dimension(200, 20));

        devloper.setBackground(new java.awt.Color(153, 255, 153));
        devloper.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        devloper.setForeground(new java.awt.Color(51, 0, 153));
        devloper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        devloper.setText("Jackob_Programmer");
        devloper.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        devloper.setFocusCycleRoot(true);
        devloper.setMaximumSize(new java.awt.Dimension(200, 20));
        devloper.setMinimumSize(new java.awt.Dimension(200, 20));
        devloper.setPreferredSize(new java.awt.Dimension(200, 20));
        devloper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                devloperMouseClicked(evt);
            }
        });

        changeBG.setBackground(new java.awt.Color(153, 255, 153));
        changeBG.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        changeBG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changeBG.setText("Change Background :");
        changeBG.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        changeBG.setFocusCycleRoot(true);
        changeBG.setMaximumSize(new java.awt.Dimension(200, 20));
        changeBG.setMinimumSize(new java.awt.Dimension(200, 20));
        changeBG.setPreferredSize(new java.awt.Dimension(200, 20));

        yellow.setBackground(new java.awt.Color(255, 255, 204));
        yellow.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));
        yellow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        yellow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yellowMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout yellowLayout = new javax.swing.GroupLayout(yellow);
        yellow.setLayout(yellowLayout);
        yellowLayout.setHorizontalGroup(
            yellowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        yellowLayout.setVerticalGroup(
            yellowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        green.setBackground(new java.awt.Color(204, 255, 204));
        green.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));
        green.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        green.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                greenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout greenLayout = new javax.swing.GroupLayout(green);
        green.setLayout(greenLayout);
        greenLayout.setHorizontalGroup(
            greenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        greenLayout.setVerticalGroup(
            greenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        blue.setBackground(new java.awt.Color(196, 241, 249));
        blue.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));
        blue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        blue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blueMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout blueLayout = new javax.swing.GroupLayout(blue);
        blue.setLayout(blueLayout);
        blueLayout.setHorizontalGroup(
            blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        blueLayout.setVerticalGroup(
            blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        origin.setBackground(new java.awt.Color(235, 235, 235));
        origin.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));
        origin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        origin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                originMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout originLayout = new javax.swing.GroupLayout(origin);
        origin.setLayout(originLayout);
        originLayout.setHorizontalGroup(
            originLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        originLayout.setVerticalGroup(
            originLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout chngeBGLayout = new javax.swing.GroupLayout(chngeBG);
        chngeBG.setLayout(chngeBGLayout);
        chngeBGLayout.setHorizontalGroup(
            chngeBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chngeBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(changeBG, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(yellow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(green, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(blue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(origin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        chngeBGLayout.setVerticalGroup(
            chngeBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chngeBGLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(chngeBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yellow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(green, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(blue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(origin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changeBG, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(powerd, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(devloper, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chngeBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(line, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(powerd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(devloper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chngeBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        exit.setText("File");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        add_st_b.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        add_st_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sss.png"))); // NOI18N
        add_st_b.setText("New Student");
        add_st_b.setMaximumSize(new java.awt.Dimension(32767, 50));
        add_st_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_st_bActionPerformed(evt);
            }
        });
        exit.add(add_st_b);

        edit_st_b.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        edit_st_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin.png"))); // NOI18N
        edit_st_b.setText("Edit Student");
        edit_st_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_st_bActionPerformed(evt);
            }
        });
        exit.add(edit_st_b);

        delete_st_b.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.CTRL_MASK));
        delete_st_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dislike.png"))); // NOI18N
        delete_st_b.setText("Delete Student");
        delete_st_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_st_bActionPerformed(evt);
            }
        });
        exit.add(delete_st_b);
        exit.add(jSeparator1);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        jMenuItem4.setText("Exit Control Panel");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        exit.add(jMenuItem4);

        Menu.add(exit);

        Edit.setText("Edit");

        edit_st_b1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        edit_st_b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin.png"))); // NOI18N
        edit_st_b1.setText("Edit Student");
        edit_st_b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_st_b1ActionPerformed(evt);
            }
        });
        Edit.add(edit_st_b1);

        delete_st_b1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.CTRL_MASK));
        delete_st_b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dislike.png"))); // NOI18N
        delete_st_b1.setText("Delete Student");
        delete_st_b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_st_b1ActionPerformed(evt);
            }
        });
        Edit.add(delete_st_b1);

        Menu.add(Edit);

        jMenu1.setText("Help");

        about.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/call_me.png"))); // NOI18N
        about.setText("About us");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        jMenu1.add(about);

        version.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK));
        version.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/my_actions.png"))); // NOI18N
        version.setText("Version");
        version.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                versionActionPerformed(evt);
            }
        });
        jMenu1.add(version);

        Menu.add(jMenu1);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(top_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(left_part, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(right_part, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(top_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(left_part, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(right_part, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fullNameNewfullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameNewfullNameActionPerformed
        
    }//GEN-LAST:event_fullNameNewfullNameActionPerformed

    private void usernameNewusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameNewusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameNewusernameActionPerformed

    private void emailNewemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailNewemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailNewemailActionPerformed

    private void addNewaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewaddActionPerformed
        new addStudents().addStudents(table_st , fullNameNew, usernameNew, passwordNew, emailNew);
    }//GEN-LAST:event_addNewaddActionPerformed

    private void fullNameEditfullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameEditfullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameEditfullNameActionPerformed

    private void emailEditemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailEditemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailEditemailActionPerformed

    private void usernameEditusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameEditusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameEditusernameActionPerformed

    private void show2show_hide6show_hideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show2show_hide6show_hideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_show2show_hide6show_hideActionPerformed

    private void saveEditadd6addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveEditadd6addActionPerformed
        
        Edit StEdition = new Edit();
        int row = table_st.getSelectedRow();
        try{
            int row_selected = (int)(table_st.getModel().getValueAt(row, 0));
            StEdition.editStudent(table_st, row_selected, fullNameEdit, usernameEdit, passwordEdit, emailEdit);
        } catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "Please Choose a Student !", ":(", JOptionPane.WARNING_MESSAGE);
        }
        new showStudents().fillTable(table_st);
        try{
            table_st.setRowSelectionInterval(row, row);
        } catch(IllegalArgumentException r){
        }
    }//GEN-LAST:event_saveEditadd6addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int sure = JOptionPane.showConfirmDialog(rootPane, "Are you sure ?");
        if(sure == 0)
            new showInfo().deleteStudent(table_st, big_fullName, fullName_inDelete, username_inDelete , email_inDelete);
    }//GEN-LAST:event_deleteActionPerformed

    private void table_stMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_stMouseClicked
        int row = table_st.getSelectedRow();
        int row_selected = (int)(table_st.getModel().getValueAt(row, 0));
        new Edit().selectStudent(table_st, row_selected, fullNameEdit, usernameEdit, passwordEdit, emailEdit);
        new showInfo().selectStudentInfo(table_st, row_selected, big_fullName, fullName_inDelete , username_inDelete, email_inDelete);
    }//GEN-LAST:event_table_stMouseClicked

    private void searchfullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchfullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchfullNameActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        
        try{
            String search_txt = search.getText();
            String query = "SELECT * FROM list_st WHERE "
                    + "id like '%"+search_txt+"%' or "
                    + "fullName like '%"+search_txt+"%' or "
                    + "username like '%"+search_txt+"%' or "
                    + "email like '%"+search_txt+"%'";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            table_st.setModel(DbUtils.resultSetToTableModel(rs));
            if(search.getText().equals(""))
                new showStudents().fillTable(table_st);
        } catch(Exception e){
        }
        finally{
            try {
                rs.close();
                pst.close();
            } catch (SQLException ex) {
                
            }
            
        }
        
    }//GEN-LAST:event_searchKeyReleased

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        
    }//GEN-LAST:event_exitMouseClicked

    private void add_st_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_st_bActionPerformed
        JOptionPane.showMessageDialog(null, "-------Add a Students from 'Add Students'-------");
    }//GEN-LAST:event_add_st_bActionPerformed

    private void edit_st_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_st_bActionPerformed
        JOptionPane.showMessageDialog(null, "-------Edit The Students from 'Edit Students'-------");
    }//GEN-LAST:event_edit_st_bActionPerformed

    private void delete_st_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_st_bActionPerformed
        JOptionPane.showMessageDialog(null, "-------Delete The Students from 'Delete Students'-------");
    }//GEN-LAST:event_delete_st_bActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);
        try {
            rs.close();
            pst.close();
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void edit_st_b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_st_b1ActionPerformed
        JOptionPane.showMessageDialog(null, "-------Edit The Students from 'Edit Students'-------");
    }//GEN-LAST:event_edit_st_b1ActionPerformed

    private void delete_st_b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_st_b1ActionPerformed
        JOptionPane.showMessageDialog(null, "-------Delete The Students from 'Delete Students'-------");
    }//GEN-LAST:event_delete_st_b1ActionPerformed

    private void versionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_versionActionPerformed
        JOptionPane.showMessageDialog(rootPane, "This the first version, Fans us For Continue :)");
    }//GEN-LAST:event_versionActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        javax.swing.JMenuItem version_frame = new javax.swing.JMenuItem();
        version_frame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/first/img/YakobA.png"))); // NOI18N
        JOptionPane.showMessageDialog(rootPane,version_frame , "About us" , JOptionPane.NO_OPTION);
    }//GEN-LAST:event_aboutActionPerformed

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        if(!passwordNew.getText().equals(""))
            JOptionPane.showMessageDialog(rootPane, "The password is : \n" + passwordNew.getText());
        else
            JOptionPane.showMessageDialog(rootPane, "Please enter a password !" , "no password !" , JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_showMouseClicked

    private void show2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show2MouseClicked
        if(!passwordEdit.getText().equals(""))
            JOptionPane.showMessageDialog(rootPane, "The password is : \n" + passwordEdit.getText());
        else
            JOptionPane.showMessageDialog(rootPane, "The password field is empty !" , "no password !" , JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_show2MouseClicked

    private void yellowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yellowMouseClicked
        getContentPane().setBackground(yellow.getBackground());
    }//GEN-LAST:event_yellowMouseClicked

    private void greenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_greenMouseClicked
        getContentPane().setBackground(green.getBackground());
    }//GEN-LAST:event_greenMouseClicked

    private void blueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blueMouseClicked
        getContentPane().setBackground(blue.getBackground());
    }//GEN-LAST:event_blueMouseClicked

    private void originMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_originMouseClicked
        getContentPane().setBackground(origin.getBackground());
    }//GEN-LAST:event_originMouseClicked

    private void devloperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devloperMouseClicked
        javax.swing.JMenuItem version_frame = new javax.swing.JMenuItem();
        version_frame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/first/img/YakobA.png"))); // NOI18N
        JOptionPane.showMessageDialog(rootPane,version_frame , "About us" , JOptionPane.NO_OPTION);
    }//GEN-LAST:event_devloperMouseClicked

    private void passwordNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordNewActionPerformed
        
    }//GEN-LAST:event_passwordNewActionPerformed

    private void passwordNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordNewMouseClicked
        
    }//GEN-LAST:event_passwordNewMouseClicked

    private void delete_stMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_stMouseClicked
        this.table_st.clearSelection();
        this.big_fullName.setText("No Student Selected");
        this.fullName_inDelete.setText(null);
        this.username_inDelete.setText(null);
        this.email_inDelete.setText(null);
    }//GEN-LAST:event_delete_stMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Edit;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenuItem about;
    private javax.swing.JLabel action1;
    private javax.swing.JLabel action2;
    private javax.swing.JLabel action3;
    private javax.swing.JTabbedPane actions;
    private javax.swing.JButton addNew;
    private javax.swing.JPanel add_st;
    private javax.swing.JMenuItem add_st_b;
    private javax.swing.JLabel big_fullName;
    private javax.swing.JLabel big_fullName1;
    private javax.swing.JPanel blue;
    private javax.swing.JLabel changeBG;
    private javax.swing.JPanel chngeBG;
    private javax.swing.JButton delete;
    private javax.swing.JPanel delete_st;
    private javax.swing.JMenuItem delete_st_b;
    private javax.swing.JMenuItem delete_st_b1;
    private javax.swing.JLabel devloper;
    private javax.swing.JPanel edit_st;
    private javax.swing.JMenuItem edit_st_b;
    private javax.swing.JMenuItem edit_st_b1;
    private javax.swing.JTextField emailEdit;
    private javax.swing.JTextField emailNew;
    private javax.swing.JLabel email_inDelete;
    private javax.swing.JMenu exit;
    private javax.swing.JPanel footer;
    private javax.swing.JTextField fullNameEdit;
    private javax.swing.JTextField fullNameNew;
    private javax.swing.JLabel fullName_inDelete;
    private javax.swing.JPanel green;
    private javax.swing.JLabel info;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPanel left_part;
    private javax.swing.JLabel line;
    private javax.swing.JPanel origin;
    private javax.swing.JPasswordField passwordEdit;
    private javax.swing.JPasswordField passwordNew;
    private javax.swing.JLabel powerd;
    private javax.swing.JPanel right_part;
    private javax.swing.JButton saveEdit;
    private javax.swing.JTextField search;
    private javax.swing.JPanel search_box;
    private javax.swing.JButton show;
    private javax.swing.JButton show2;
    private javax.swing.JLabel smal_line;
    private javax.swing.JScrollPane tableShowSt;
    private javax.swing.JTable table_st;
    private javax.swing.JPanel top_logo;
    private javax.swing.JTextField usernameEdit;
    private javax.swing.JTextField usernameNew;
    private javax.swing.JLabel username_inDelete;
    private javax.swing.JMenuItem version;
    private javax.swing.JPanel yellow;
    // End of variables declaration//GEN-END:variables
}
