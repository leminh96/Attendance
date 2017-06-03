package GUI;

import DAO.UserDAO;
import Pojo.User;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;

public class Login extends javax.swing.JFrame {

    UserDAO usd = new UserDAO();
    public Login() {
        initComponents();
        usernameTextField.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        signinButton = new javax.swing.JButton();
        passwordTextField = new javax.swing.JPasswordField();
        usernameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 460));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\quocm\\Desktop\\user.png")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("Password");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Username");

        signinButton.setBackground(new java.awt.Color(255, 153, 51));
        signinButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        signinButton.setText("SIGN IN");
        signinButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signinButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signinButtonMouseExited(evt);
            }
        });
        signinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinButtonActionPerformed(evt);
            }
        });

        passwordTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordTextField.setText("1234");

        usernameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usernameTextField.setText("1412320");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ATTENDANCE");

        jLabel5.setText("Version 1.0 © Le Minh 2017");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 114, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(usernameTextField)
                    .addComponent(jLabel3)
                    .addComponent(passwordTextField)
                    .addComponent(signinButton, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(signinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinButtonActionPerformed
        User us = new User();
        us = usd.find(usernameTextField.getText());
        if (us != null)
        {
            String yourpass = new String(passwordTextField.getPassword());
            if (yourpass.equals(us.getId()) && !us.getPassword().startsWith("$2a$"))
            {
                JOptionPane.showMessageDialog(null, "Please change your password", "Requirement", JOptionPane.INFORMATION_MESSAGE);
                ChangePassword c = new ChangePassword(this, true);
                c.setTextLabel(us.getId(), us.getName());
                c.setVisible(true);
                this.setVisible(false);
                if (c.checkMatchPass())
                {
                    if (us.getType() == 1)
                    {
                        Student s = new Student(us.getId(), us.getName());
                        s.setVisible(true);
                    }
                    else if (us.getType() == 2)
                    {
                        Teacher t = new Teacher(us.getName());
                        t.setVisible(true);
                    }
                    this.dispose();
                    c.dispose();
                }
            }
            else if (checkPassword(new String(this.passwordTextField.getPassword()), us.getPassword()))
            {
                if (us.getType() == 1)
                {
                    Student s = new Student(us.getId(), us.getName());
                    s.setVisible(true);
                }
                else if (us.getType() == 2)
                {
                    Teacher t = new Teacher(us.getName());
                    t.setVisible(true);
                }
                this.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Wrong password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Invalid user", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_signinButtonActionPerformed

    private void signinButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButtonMouseExited
        signinButton.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_signinButtonMouseExited

    private void signinButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButtonMouseEntered
        signinButton.setForeground(new java.awt.Color(255, 153, 51));
    }//GEN-LAST:event_signinButtonMouseEntered

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }
    
    public boolean checkPassword(String password_plaintext, String stored_hash) 
    {
	boolean password_verified = false;

	if(null == stored_hash || !stored_hash.startsWith("$2a$"))
        {
            throw new java.lang.IllegalArgumentException("Invalid hash provided for comparison");
        }

	password_verified = BCrypt.checkpw(password_plaintext, stored_hash);
        return(password_verified);
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton signinButton;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
