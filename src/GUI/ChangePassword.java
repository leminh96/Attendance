package GUI;

import DAO.UserDAO;
import Pojo.User;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import org.mindrot.jbcrypt.BCrypt;

public class ChangePassword extends javax.swing.JDialog {

        UserDAO usd = new UserDAO();
       public ChangePassword(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        newPassTextField.requestFocus();
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        OKButton = new javax.swing.JButton();
        newPassTextField = new javax.swing.JPasswordField();
        confirmPassTextField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("New Password");

        idLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idLabel.setText("ID");

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameLabel.setText("Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Confirm Password");

        OKButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        newPassTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        confirmPassTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(idLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(62, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(newPassTextField)
                            .addComponent(confirmPassTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
                        .addGap(0, 75, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(OKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(nameLabel))
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPassTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmPassTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(OKButton, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        String newPass = new String(this.newPassTextField.getPassword());
        if (newPass.equals(this.idLabel.getText()))
        {
            JOptionPane.showMessageDialog(null, "Please set your password different your id", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (this.checkMatchPass())
        {
            JOptionPane.showMessageDialog(null, "Change password successful", "Success", JOptionPane.INFORMATION_MESSAGE);
            User us = new User();
            us = usd.find(this.idLabel.getText());
            us.setPassword(hashPassword(newPass));
            usd.update(us);
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Password not match", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_OKButtonActionPerformed

        public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            ChangePassword dialog = new ChangePassword(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }
        
    public boolean checkMatchPass()
    {
           return (new String(this.newPassTextField.getPassword()).equals(new String(this.confirmPassTextField.getPassword())));
    }
    
    public void setTextLabel(String a, String b)
    {
        this.idLabel.setText(a);
        this.nameLabel.setText(b);
    }
    
    public static String hashPassword(String password_plaintext) 
    {
        int workload = 12;
        String salt = BCrypt.gensalt(workload);
	String hashed_password = BCrypt.hashpw(password_plaintext, salt);
	return(hashed_password);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKButton;
    private javax.swing.JPasswordField confirmPassTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField newPassTextField;
    // End of variables declaration//GEN-END:variables
}
