package GUI;

import DAO.AttendanceDAO;
import DAO.Student_SubjectDAO;
import DAO.SubjectDAO;
import DAO.UserDAO;
import Pojo.Attendance;
import Pojo.AttendanceId;
import Pojo.Subject;
import Pojo.SubjectUser;
import Pojo.User;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jboss.logging.Logger;

public final class Student extends javax.swing.JFrame {
    private final UserDAO usd = new UserDAO();
    private final Student_SubjectDAO S_UD = new Student_SubjectDAO();
    private final SubjectDAO sud = new SubjectDAO();
    private final AttendanceDAO atd = new AttendanceDAO();
    private boolean isAvailable = false;
    private DefaultTableModel dtm = new DefaultTableModel();
    
    public Student() {
        initComponents();
        loadCurrentTime();
    }
    
    public Student(String id, String name) {
        initComponents();
        loadCurrentTime();
        idLabel.setText(id);
        nameLabel.setText("Student name: " + name);
        loadStudentCourses();
        loadAttendanceResult();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        timeLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        subjectIdCombobox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        starttimeTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        enddateTextField = new javax.swing.JTextField();
        endtimeTextField = new javax.swing.JTextField();
        roomTextField = new javax.swing.JTextField();
        attendButton = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        weekdateTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        startdateTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentCoursesList = new javax.swing.JList<>();
        dateLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        coursesCombobox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        coursesNameLabel = new javax.swing.JLabel();
        idLabel1 = new javax.swing.JLabel();
        logOutLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("STUDENT MODE");

        idLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idLabel.setText("ID");

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameLabel.setText("Name");

        jTabbedPane1.setBackground(new java.awt.Color(255, 153, 51));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        timeLabel.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(51, 153, 0));
        timeLabel.setText("Time");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Subject ID");

        subjectIdCombobox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subjectIdCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectIdComboboxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name");

        nameTextField.setEditable(false);
        nameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Start Time");

        starttimeTextField.setEditable(false);
        starttimeTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("End Date");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("End Time");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Room");

        enddateTextField.setEditable(false);
        enddateTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        endtimeTextField.setEditable(false);
        endtimeTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        roomTextField.setEditable(false);
        roomTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        attendButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        attendButton.setText("ATTEND");
        attendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendButtonActionPerformed(evt);
            }
        });

        statusLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        statusLabel.setText("No course available");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Weekdate");

        weekdateTextField.setEditable(false);
        weekdateTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Start Date");

        startdateTextField.setEditable(false);
        startdateTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        studentCoursesList.setBackground(new java.awt.Color(0, 153, 153));
        studentCoursesList.setBorder(javax.swing.BorderFactory.createTitledBorder("Your courses"));
        studentCoursesList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studentCoursesList.setForeground(new java.awt.Color(255, 255, 255));
        studentCoursesList.setPreferredSize(new java.awt.Dimension(847, 602));
        studentCoursesList.setFixedCellHeight(30);
        jScrollPane2.setViewportView(studentCoursesList);

        dateLabel.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(51, 153, 0));
        dateLabel.setText("Date");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(40, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subjectIdCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enddateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(starttimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(endtimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(roomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(weekdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(timeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dateLabel)
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusLabel)
                            .addComponent(attendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(subjectIdCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(startdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(enddateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(starttimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(endtimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(roomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(weekdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statusLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(attendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLabel)
                    .addComponent(dateLabel))
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(23, 23, 23)
                .addComponent(jLabel10)
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );

        jTabbedPane1.addTab("Attendance", jPanel2);

        resultTable.setBackground(new java.awt.Color(255, 153, 51));
        resultTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Week", "Attendance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resultTable.setRowHeight(22);
        jScrollPane1.setViewportView(resultTable);
        if (resultTable.getColumnModel().getColumnCount() > 0) {
            resultTable.getColumnModel().getColumn(0).setResizable(false);
            resultTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            resultTable.getColumnModel().getColumn(1).setResizable(false);
            resultTable.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        coursesCombobox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        coursesCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesComboboxActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Select courses");

        coursesNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        coursesNameLabel.setText("Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(36, 36, 36)
                .addComponent(coursesCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(coursesNameLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coursesCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(coursesNameLabel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Result", jPanel1);

        idLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idLabel1.setText("Student ID: ");

        logOutLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logOutLabel.setText("Log out");
        logOutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(idLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(idLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logOutLabel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(logOutLabel))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(nameLabel)
                    .addComponent(idLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subjectIdComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectIdComboboxActionPerformed
        String id = subjectIdCombobox.getSelectedItem().toString();
        Subject su = new Subject();
        su = sud.find(id);
        nameTextField.setText(su.getName());
        startdateTextField.setText(su.getStartDate().toString());
        enddateTextField.setText(su.getEndDate().toString());
        starttimeTextField.setText(su.getStartTime().toString());
        endtimeTextField.setText(su.getEndTime().toString());
        roomTextField.setText(su.getRoom());
        weekdateTextField.setText(su.getWeekDate());
        isAvailable = loadStatusText();
    }//GEN-LAST:event_subjectIdComboboxActionPerformed

    private void attendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendButtonActionPerformed
        if (isAvailable)
        {
            Attendance at = new Attendance();
            AttendanceId atid = new AttendanceId();
            User us = new User();
            Subject su = new Subject();
            SubjectUser SU = new SubjectUser();
            us = usd.find(idLabel.getText());
            su = sud.find(subjectIdCombobox.getSelectedItem().toString());
            for (SubjectUser SUt : this.S_UD.findAll())
            {
                if (SUt.getUser().getId().equals(us.getId()) && SUt.getSubject().getId().equals(su.getId()))
                {
                    SU = SUt;
                    break;
                }
            }
            atid.setWeek(weekCount(su));
            atid.setId(SU.getId());
            at.setSubjectUser(SU);
            at.setId(atid);
            if (atd.save(at))
            {
                loadAttendanceResult();
                
                JOptionPane.showMessageDialog(null, "Attended", "Success" , JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Attended already", "Error" , JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Cannot attend", "Error" , JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_attendButtonActionPerformed

    private void coursesComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesComboboxActionPerformed
        Subject su = new Subject();
        su = sud.find(coursesCombobox.getSelectedItem().toString());
        if (su != null)
            coursesNameLabel.setText(su.getName());
    }//GEN-LAST:event_coursesComboboxActionPerformed

    private void logOutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutLabelMouseClicked
        this.setVisible(false);
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_logOutLabelMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new Student().setVisible(true);
        });
    }
    
    private void loadCurrentTime()
    {
        Thread clock = new Thread()
        {
            @Override
            public void run()
            {
                for(;;)
                {
                    Calendar cal = new GregorianCalendar();
                    int h = cal.get(Calendar.HOUR_OF_DAY);
                    int m = cal.get(Calendar.MINUTE);
                    int s = cal.get(Calendar.SECOND);
                    timeLabel.setText(h + ":" + m + ":" + s);
                    try
                    {
                        sleep(1000);
                    }
                    catch (InterruptedException e)
                    {
                        Logger.getLogger(Student.class.getName()).log(Logger.Level.FATAL, e);
                    }
                }
            }
        };
        clock.start();
        Date d = new Date();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("E dd-MM-yyyy");
        String temp = dateFormatter.format(d);
        dateLabel.setText(temp);
    }
    
    public void loadStudentCourses()
    {
        DefaultListModel dlm = new DefaultListModel();
        User us = new User();
        us = this.usd.find(idLabel.getText());
        for (SubjectUser SU : S_UD.findAll())
        {
            if (SU.getUser().getId().equals(us.getId()))
            {
                dlm.addElement(SU.getSubject().getId() + " - " + SU.getSubject().getName());
                subjectIdCombobox.addItem(SU.getSubject().getId());
                coursesCombobox.addItem(SU.getSubject().getId());
            }
        }
        studentCoursesList.setModel(dlm);
    }
    
    private boolean checkInTime()
    {
        Subject su = new Subject();
        su = sud.find(subjectIdCombobox.getSelectedItem().toString());
        LocalTime now = LocalTime.now();
        
        Date start = su.getStartTime();
        Instant instant = Instant.ofEpochMilli(start.getTime());
        LocalTime startlocal = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalTime();
        
        Date end = su.getEndTime();
        Instant instant1 = Instant.ofEpochMilli(end.getTime());
        LocalTime endlocal = LocalDateTime.ofInstant(instant1, ZoneId.systemDefault()).toLocalTime();
        
        return startlocal.isBefore(now) && endlocal.isAfter(now);
    }
    
    private boolean checkInDate(Date s, Date e)
    {
        boolean b = false;
        Date d = new Date();
        b = d.compareTo(s) > 0 && d.compareTo(e) < 0;
        return b;
    }
    
    private boolean checkInWeek(Subject s)
    {
        Date d = new Date();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("E");
        String temp = dateFormatter.format(d);
        return (s.getWeekDate().startsWith(temp));
    }
    
    private boolean loadStatusText()
    {
        Subject su = new Subject();
        su = this.sud.find(subjectIdCombobox.getSelectedItem().toString());
        if (su == null)
        {
            statusLabel.setText("No course available");
            return false;
        }
        else if (checkInTime() && checkInDate(su.getStartDate(), su.getEndDate()) && checkInWeek(su))
        {
            statusLabel.setText("This course is available for attend");
            statusLabel.setForeground(new java.awt.Color(0, 0, 255));
            return true;
        }
        else
        {
            statusLabel.setText("This course NOT available for attend");
            statusLabel.setForeground(new java.awt.Color(255, 0, 0));
            return false;
        }
    }
    
    private int weekCount(Subject s)
    {
        int a = 0;
        Date d = new Date();
        long temp = d.getTime() - s.getStartDate().getTime();
        a = (int) (temp / (1000 * 3600 * 24 * 7));
        return a;
    }
    
    private void loadAttendanceResult()
    {
        User us = new User();
        Subject su = new Subject();
        us = usd.find(idLabel.getText());
        dtm.addColumn("Week");
            dtm.addColumn("Attendance");
        if (coursesCombobox.getItemCount() != 0)
        {
            su = sud.find(coursesCombobox.getSelectedItem().toString());
            for (int j = 1; j < 16; j++)
            {
                if (j < weekCount(su))
                    dtm.addRow(new Object[]{j, "Absent"});
                else
                    dtm.addRow(new Object[]{j, "No data"});
            }
            for (Attendance at : this.atd.findAll())
            {
                if (at.getSubjectUser().getUser().getId().equals(us.getId()) && at.getSubjectUser().getSubject().getId().equals(su.getId()))
                {
                    dtm.setValueAt("Attendant", at.getId().getWeek() - 1, 1);
                }
            }
            resultTable.setModel(dtm);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attendButton;
    private javax.swing.JComboBox<String> coursesCombobox;
    private javax.swing.JLabel coursesNameLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField enddateTextField;
    private javax.swing.JTextField endtimeTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel logOutLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTable resultTable;
    private javax.swing.JTextField roomTextField;
    private javax.swing.JTextField startdateTextField;
    private javax.swing.JTextField starttimeTextField;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JList<String> studentCoursesList;
    private javax.swing.JComboBox<String> subjectIdCombobox;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JTextField weekdateTextField;
    // End of variables declaration//GEN-END:variables
}
