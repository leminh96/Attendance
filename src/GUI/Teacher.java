package GUI;

import DAO.AttendanceDAO;
import DAO.AttendanceIDDAO;
import DAO.SubjectDAO;
import DAO.UserDAO;
import DAO.Student_SubjectDAO;
import Pojo.Attendance;
import Pojo.AttendanceId;
import Pojo.Subject;
import Pojo.SubjectUser;
import Pojo.User;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public final class Teacher extends javax.swing.JFrame {

    private final UserDAO usd = new UserDAO();
    private final SubjectDAO sud = new SubjectDAO();
    private final Student_SubjectDAO S_UD = new Student_SubjectDAO();
    private final AttendanceDAO atd = new AttendanceDAO();
    private final AttendanceIDDAO ATID = new AttendanceIDDAO();
    private DefaultTableModel dtm = new DefaultTableModel();
    private DefaultListModel dlm = new DefaultListModel();
    public Teacher() {
        initComponents();
    }
    
    public Teacher(String usname)
    {
        initComponents();
        loadStudentList();
        loadAvailableSubject();
        loadSelectSubject();
        usnameLabel.setText("Welcome " + usname + "!");
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        usnameLabel = new javax.swing.JLabel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        coursesCombobox = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        startdatePicker = new org.jdesktop.swingx.JXDatePicker();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        enddatePicker = new org.jdesktop.swingx.JXDatePicker();
        jLabel8 = new javax.swing.JLabel();
        weekdateComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        roomTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Date date = new Date();
        SpinnerDateModel sdm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        starttimeSpinner = new javax.swing.JSpinner(sdm);
        jLabel13 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        SpinnerDateModel sdm1 = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        endtimeSpinner = new javax.swing.JSpinner(sdm1);
        jScrollPane6 = new javax.swing.JScrollPane();
        availableSubjectList = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        addNewStudentToBDButton = new javax.swing.JButton();
        idNewStudentTextField = new javax.swing.JTextField();
        nameNewStudentTextField = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        createCSVTemplateButtom = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentListTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        selectSubjectCombobox = new javax.swing.JComboBox<>();
        selectSubjectName = new javax.swing.JTextField();
        importCSVButton = new javax.swing.JButton();
        csvFileNameTextField = new javax.swing.JTextField();
        addStudentFromListButton = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        logOutLabel = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Attendance");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("TEACHER MODE");

        usnameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usnameLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\quocm\\Desktop\\user 32.png")); // NOI18N

        jTabbedPane5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 153, 51));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 204));
        jLabel11.setText("Select courses");

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resultTable.setRowHeight(20);
        jScrollPane3.setViewportView(resultTable);
        ((DefaultTableCellRenderer)(resultTable.getTableHeader().getDefaultRenderer())).setHorizontalAlignment(SwingConstants.CENTER);

        coursesCombobox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        coursesCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesComboboxActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 204));
        jLabel17.setText("Y = Attend       N = Absent       N/A = No data");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(coursesCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane3)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(coursesCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Attendance Result", jPanel3);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setName(""); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Subject ID");

        idTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Subject name");

        nameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        startdatePicker.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        startdatePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startdatePickerActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Start date");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("End date");

        enddatePicker.setEditable(false);
        enddatePicker.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Weekdate");

        weekdateComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        weekdateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Room");

        roomTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Start time");

        JSpinner.DateEditor de = new JSpinner.DateEditor(starttimeSpinner, "HH:mm");
        starttimeSpinner.setEditor(de);
        starttimeSpinner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("End time");

        saveButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        JSpinner.DateEditor de1 = new JSpinner.DateEditor(endtimeSpinner, "HH:mm");
        endtimeSpinner.setEditor(de1);
        endtimeSpinner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        availableSubjectList.setBackground(new java.awt.Color(0, 153, 153));
        availableSubjectList.setBorder(javax.swing.BorderFactory.createTitledBorder("Available Subjects"));
        availableSubjectList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        availableSubjectList.setForeground(new java.awt.Color(255, 255, 255));
        availableSubjectList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        availableSubjectList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                availableSubjectListMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(availableSubjectList);
        availableSubjectList.setFixedCellHeight(30);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(116, 116, 116))
                                        .addComponent(weekdateComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addComponent(endtimeSpinner))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(45, 45, 45))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(25, 25, 25)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameTextField)
                                .addComponent(idTextField))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(50, 50, 50)
                        .addComponent(starttimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enddatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startdatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startdatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enddatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(starttimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(endtimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(weekdateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        idTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        nameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        roomTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());

        jTabbedPane5.addTab("New subject", jPanel1);

        jPanel4.setBackground(new java.awt.Color(255, 153, 51));

        addNewStudentToBDButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addNewStudentToBDButton.setText("Add");
        addNewStudentToBDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewStudentToBDButtonActionPerformed(evt);
            }
        });

        idNewStudentTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        nameNewStudentTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add new student to database");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("New student's default password is their ID.");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Student must change password when they login first time.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(jLabel15)
                .addGap(13, 13, 13)
                .addComponent(jLabel16))
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Student ID");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Student name");

        createCSVTemplateButtom.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        createCSVTemplateButtom.setText("Create .CSV template");
        createCSVTemplateButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCSVTemplateButtomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel14)
                        .addComponent(createCSVTemplateButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameNewStudentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(idNewStudentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(addNewStudentToBDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idNewStudentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameNewStudentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(addNewStudentToBDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(createCSVTemplateButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Add new student", jPanel4);

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        studentListTable.setBackground(new java.awt.Color(255, 153, 51));
        studentListTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studentListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studentListTable.setRowHeight(22);
        jScrollPane1.setViewportView(studentListTable);
        if (studentListTable.getColumnModel().getColumnCount() > 0) {
            studentListTable.getColumnModel().getColumn(0).setResizable(false);
            studentListTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            studentListTable.getColumnModel().getColumn(1).setResizable(false);
            studentListTable.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select subject");

        selectSubjectCombobox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectSubjectCombobox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        selectSubjectCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectSubjectComboboxActionPerformed(evt);
            }
        });

        selectSubjectName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        importCSVButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        importCSVButton.setText("Import from .CSV file");
        importCSVButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importCSVButtonActionPerformed(evt);
            }
        });

        csvFileNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        csvFileNameTextField.setText("template.csv");

        addStudentFromListButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addStudentFromListButton.setText("Add student from list");
        addStudentFromListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentFromListButtonActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("CSV file name");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(selectSubjectCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectSubjectName, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(addStudentFromListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(importCSVButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(csvFileNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(selectSubjectName)
                    .addComponent(selectSubjectCombobox, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(301, 301, 301)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(importCSVButton, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(addStudentFromListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addGap(5, 5, 5)
                .addComponent(csvFileNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)))
        );

        jTabbedPane5.addTab("Add student to courses", jPanel2);

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(usnameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(310, 310, 310)
                        .addComponent(logOutLabel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usnameLabel)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logOutLabel)))
                .addGap(32, 32, 32)
                .addComponent(jTabbedPane5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        addNewSubject();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void availableSubjectListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_availableSubjectListMouseClicked
        
    }//GEN-LAST:event_availableSubjectListMouseClicked

    private void addNewStudentToBDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewStudentToBDButtonActionPerformed
        User us = new User();
        us.setId(idNewStudentTextField.getText());
        us.setPassword(us.getId());
        us.setName(nameNewStudentTextField.getText());
        us.setType(1);
        if (!this.usd.save(us))
        {
            JOptionPane.showMessageDialog(null, "This student have been existed in database", "Error" , JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, us.getId() + " has been saved", "Info" , JOptionPane.INFORMATION_MESSAGE);
            dtm.addRow(new Object[]{us.getId(), us.getName()});
        }
    }//GEN-LAST:event_addNewStudentToBDButtonActionPerformed

    private void selectSubjectComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectSubjectComboboxActionPerformed
        Subject su = new Subject();
        su = sud.find(selectSubjectCombobox.getSelectedItem().toString());
        if (su != null)
        {
            selectSubjectName.setText(su.getName());
        } else {
        }
    }//GEN-LAST:event_selectSubjectComboboxActionPerformed

    private void addStudentFromListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentFromListButtonActionPerformed
        int row = studentListTable.getSelectedRow();
        boolean check = true;
        if (row != -1)
        {
            String studentID = this.studentListTable.getValueAt(this.studentListTable.getSelectedRow(), 0).toString();
            User us = this.usd.find(studentID);
            Subject su = sud.find(selectSubjectCombobox.getSelectedItem().toString());
            SubjectUser S_U = new SubjectUser();
            for (SubjectUser s_u : this.S_UD.findAll())
            {
                if (s_u.getUser().getId().equals(us.getId()) && s_u.getSubject().getId().equals(su.getId()))
                {
                    check = false;
                    break;
                }
            }
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to add " + us.getId() + " to " + su.getName(), "Confirm", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION)
            {
                S_U.setSubject(su);
                S_U.setUser(us);
                if (!check)
                {
                    JOptionPane.showMessageDialog(null, us.getId() + " have been existed in " + su.getName(), "Error" , JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, us.getId() + " has been saved to " + su.getName() + " course", "Saved" , JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a row", "Error" , JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addStudentFromListButtonActionPerformed

    private void startdatePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startdatePickerActionPerformed
        if (isMonday(startdatePicker.getDate()))
            enddatePicker.setDate(nextDate(startdatePicker.getDate(), 15 * 7));
        else
            JOptionPane.showMessageDialog(null, "Start date of courses must be Monday", "Error" , JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_startdatePickerActionPerformed

    private void coursesComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesComboboxActionPerformed
        Subject su = new Subject();
        String[] parts = coursesCombobox.getSelectedItem().toString().split("-");
        su = sud.find(parts[0]);
        DefaultTableModel dtm1 = new DefaultTableModel();
        dtm1.addColumn("ID");
        Object[]o = new Object[16];
        for (int i = 0; i < 15; i++)
        {
            dtm1.addColumn(i + 1);
        }
        for (SubjectUser SU : this.S_UD.findAll())
        {
            if (SU.getSubject().equals(su))
            {
                createListAttend(SU, o);
                dtm1.addRow(new Object[]{SU.getUser().getId(), o[0], o[1], o[2], o[3], o[4], o[5], o[6], o[7], o[8], o[9], o[10], o[11], o[12], o[13], o[14]});
            }
        }
        
        resultTable.setModel(dtm1);
        resizeColumnWidth(resultTable);
    }//GEN-LAST:event_coursesComboboxActionPerformed

    private void logOutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutLabelMouseClicked
        this.setVisible(false);
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_logOutLabelMouseClicked

    private void createCSVTemplateButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCSVTemplateButtomActionPerformed
        FileWriter fout;
        String filename = "template.csv";
        try {
            fout = new FileWriter(filename);
            fout.write("\"");
            fout.write("ID student 1" + "\",\"");
            fout.write("Name 1" + "\"");
            fout.write("\r\n");
            fout.write("\"");
            fout.write("ID student 2" + "\",\"");
            fout.write("Name 2" + "\"");
            fout.write("\r\n");
            fout.write("\"");
            fout.write("ID student 3" + "\",\"");
            fout.write("Name 3" + "\"");
            fout.close();
            JOptionPane.showMessageDialog(null, "Create CSV file completed", "Success" , JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_createCSVTemplateButtomActionPerformed

    private void importCSVButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importCSVButtonActionPerformed
        String line = "";
        String cvsSplitBy = ",";
        boolean wrongname = false;
        String csvFile = this.csvFileNameTextField.getText();
        Object[] options = {"Yes", "Yes To All", "Cancel"};
        if (csvFile == null)
        {
            JOptionPane.showMessageDialog(null, "Please insert CSV file name", "Error" , JOptionPane.ERROR_MESSAGE);
            csvFileNameTextField.requestFocus();
        }
        else
        {
            BufferedReader br = null;
            int flag = -1;
            try
            {
                br = new BufferedReader(new FileReader(csvFile));
                while ((line = br.readLine()) != null) 
                {
                    String[] info = line.split(cvsSplitBy);
                    User us = new User();
                    User us1 = new User();
                    us.setId(info[0]);
                    us.setPassword(info[0]);
                    us.setType(1);
                    us.setName(info[1]);
                    Subject su = new Subject();
                    su = sud.find(selectSubjectCombobox.getSelectedItem().toString());
                    SubjectUser SU = new SubjectUser();
                    SU.setUser(us);
                    SU.setSubject(su);
                    us1 = usd.find(info[0]);
                    boolean incourse = false;
                    for (SubjectUser s_u : this.S_UD.findAll())
                    {
                        if (s_u.getUser().getId().equals(us.getId()) && s_u.getSubject().getId().equals(su.getId()))
                        {
                            incourse = true;
                            break;
                        }
                    }
                    if (us1 == null)
                    {
                        switch (flag) 
                        {
                            case -1:
                                flag = JOptionPane.showOptionDialog(this, "Student " + info[0] + " is not exist in database. \nDo you want to create new student?",
                                "Question", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
                                if (flag != 2)
                                {
                                    usd.save(us);
                                    S_UD.save(SU);
                                    if (flag == 0)
                                    {
                                        flag = -1;
                                    }
                                }
                                break;
                            case 0:
                                usd.save(us);
                                S_UD.save(SU);
                                flag = -1;
                                break;
                            case 1:
                                usd.save(us);
                                S_UD.save(SU);
                                break;
                            default:
                                break;
                        }
                    }
                    else if (incourse == true)
                    {
                        JOptionPane.showMessageDialog(null, "Student " + us.getId() + " has been already in " + su.getName() , "Infomation" , JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        usd.save(us);
                        S_UD.save(SU);
                    }
                }
            }
            catch (FileNotFoundException e) 
            {
                JOptionPane.showMessageDialog(null, "Wrong CSV file name", "Error" , JOptionPane.ERROR_MESSAGE);
                csvFileNameTextField.requestFocus();
                wrongname = true;
            } catch (IOException ex) {
                Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (!wrongname)
        {
            JOptionPane.showMessageDialog(null, "Completed", "Infomation" , JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_importCSVButtonActionPerformed

    private void createListAttend(SubjectUser SU, Object[] o)
    {
        for (int i = 1; i < 16; i++)
        {
            if (SU.getAttendances() != null)
            {
                Attendance at = new Attendance();
                for (Attendance att : this.atd.findAll())
                {
                    if (att.getSubjectUser().getId() == SU.getId())
                    {
                        at = att;
                    }
                }
                if (at.getId() == null)
                {
                    o[i - 1] = "N/A";
                }
                else if (at.getId().getWeek() == i)
                {
                    o[i - 1] = "Y"; 
                }
                else
                {
                    o[i - 1] = "N";
                }
            }
        }
    }
    
    private Calendar toCalendar(Date date)
    { 
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal;
    }
    
    private boolean isMonday(Date d)
    {
        return toCalendar(d).get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY;
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Teacher().setVisible(true);
        });
    }
    
    private Date nextDate(Date d, int date)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.DATE, date);
        return cal.getTime();
    }
    
    public void addNewSubject()
    {
        SubjectDAO sud1 = new SubjectDAO();
        Subject su = new Subject();
        su.setId(idTextField.getText());
        su.setName(nameTextField.getText());
        su.setStartDate(startdatePicker.getDate());
        su.setEndDate(enddatePicker.getDate());
        Date t = new Date();
        t = (Date) starttimeSpinner.getValue();
        su.setStartTime(t);
        su.setEndTime(nextDate(t, 15 * 7));
        su.setRoom(roomTextField.getText());
        su.setWeekDate(weekdateComboBox.getSelectedItem().toString());
        if (!sud1.save(su))
        {
            JOptionPane.showMessageDialog(null, "This course have been existed", "Error" , JOptionPane.ERROR_MESSAGE);
        }
        else if (!isMonday(startdatePicker.getDate()))
        {
            JOptionPane.showMessageDialog(null, "Start date of courses must be Monday", "Error" , JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Saved", "Info" , JOptionPane.INFORMATION_MESSAGE);
            dlm.addElement(su.getName());
        }
    }
    
    private void loadStudentList()
    {
        dtm.addColumn("ID");
        dtm.addColumn("Name");
        this.usd.findAll().stream().filter((us) -> (us.getType() == 1)).forEachOrdered((us) -> {
            dtm.addRow(new Object[]{us.getId(), us.getName()});
        });
        studentListTable.setModel(dtm);
    }
    
    public void loadSelectSubject()
    {
        this.sud.findAll().forEach((su) -> {
            selectSubjectCombobox.addItem(su.getId());
        });
        Subject su = new Subject();
        su = sud.find(selectSubjectCombobox.getSelectedItem().toString());
        if (su != null)
        {
            selectSubjectName.setText(su.getName());
        }
    }
    
    public void resizeColumnWidth(JTable table) 
    {
        final TableColumnModel columnModel = table.getColumnModel();
        for (int column = 0; column < table.getColumnCount(); column++) 
        {
            int width = 15; // Min width
            for (int row = 0; row < table.getRowCount(); row++) 
            {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width +1 , width);
            }
            if(width > 300)
                width=300;
            columnModel.getColumn(column).setPreferredWidth(width);
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            resultTable.getColumnModel().getColumn(column).setCellRenderer(centerRenderer);
        }
    }
    
    public void loadAvailableSubject()
    {
        this.sud.findAll().forEach((su) -> {
            dlm.addElement(su.getName());
            coursesCombobox.addItem(su.getId() + "-" + su.getName());
        });
        availableSubjectList.setModel(dlm);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewStudentToBDButton;
    private javax.swing.JButton addStudentFromListButton;
    private javax.swing.JList<String> availableSubjectList;
    private javax.swing.JComboBox<String> coursesCombobox;
    private javax.swing.JButton createCSVTemplateButtom;
    private javax.swing.JTextField csvFileNameTextField;
    private static org.jdesktop.swingx.JXDatePicker enddatePicker;
    private static javax.swing.JSpinner endtimeSpinner;
    private javax.swing.JTextField idNewStudentTextField;
    private static javax.swing.JTextField idTextField;
    private javax.swing.JButton importCSVButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel logOutLabel;
    private javax.swing.JTextField nameNewStudentTextField;
    private static javax.swing.JTextField nameTextField;
    private javax.swing.JTable resultTable;
    private static javax.swing.JTextField roomTextField;
    private static javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> selectSubjectCombobox;
    private javax.swing.JTextField selectSubjectName;
    private static org.jdesktop.swingx.JXDatePicker startdatePicker;
    private static javax.swing.JSpinner starttimeSpinner;
    private javax.swing.JTable studentListTable;
    private javax.swing.JLabel usnameLabel;
    private static javax.swing.JComboBox<String> weekdateComboBox;
    // End of variables declaration//GEN-END:variables

}
