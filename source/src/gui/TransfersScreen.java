package gui;

import database.InformationController;
import database.transactions.AccountInformations;
import database.transactions.Transfers;
import settings.ActionSettings;
import settings.Edits;
import settings.TextSettings;
import javax.swing.JOptionPane;
import settings.Dialogs;

public class TransfersScreen extends javax.swing.JFrame implements Edits,InformationController {

    private Transfers transfersObject  = null;
    private int transferMoney=0;
    private final String customertextoriginal="Customer Number";
    
    public TransfersScreen() {
        initComponents();
        getEdits();
    }

    @Override
    public boolean isInformationsValid() {
        return !(this.amountText.getText().equals("") || this.whoText.getText().equals(customertextoriginal));
    }

    @Override
    public AccountInformations getAccountInformations() {
       return AccountInformations.getInstance();
    }

    public Transfers getTransfersObject() {
       if(this.transfersObject == null){
           transfersObject = new Transfers();
       }
        return transfersObject;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        transfersPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        warningLabel = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        balanceLabel2 = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        amountText = new javax.swing.JTextField();
        whoLabel = new javax.swing.JLabel();
        whoText = new javax.swing.JTextField();
        whoGuideLabel = new javax.swing.JLabel();
        transferButton = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TRANSFERS - KOZY BANK");

        transfersPanel.setBackground(new java.awt.Color(51, 51, 51));
        transfersPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/goBackIcon.png"))); // NOI18N
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        transfersPanel.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        nameLabel.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(204, 204, 204));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nameLabel.setText("Dear [NAME SURNAME]");
        transfersPanel.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, -1, -1));

        warningLabel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        warningLabel.setForeground(new java.awt.Color(204, 204, 204));
        warningLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        warningLabel.setText("You can transfer $20.000 or less in one time.");
        transfersPanel.add(warningLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 140, -1, -1));

        balanceLabel.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        balanceLabel.setForeground(new java.awt.Color(204, 204, 204));
        balanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        balanceLabel.setText("BALANCE :");
        transfersPanel.add(balanceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        balanceLabel2.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        balanceLabel2.setForeground(new java.awt.Color(204, 204, 204));
        balanceLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balanceLabel2.setText("[BALANCE]");
        balanceLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        transfersPanel.add(balanceLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 270, 45));

        amountLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        amountLabel.setForeground(new java.awt.Color(204, 204, 204));
        amountLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        amountLabel.setText("Transfer amount :");
        transfersPanel.add(amountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 353, -1, -1));

        amountText.setBackground(new java.awt.Color(70, 80, 82));
        amountText.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        amountText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        amountText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        amountText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        amountText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                amountTextKeyReleased(evt);
            }
        });
        transfersPanel.add(amountText, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 353, 300, -1));

        whoLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        whoLabel.setForeground(new java.awt.Color(204, 204, 204));
        whoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        whoLabel.setText("To who :");
        transfersPanel.add(whoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 410, -1, -1));

        whoText.setBackground(new java.awt.Color(70, 80, 82));
        whoText.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        whoText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        whoText.setToolTipText("");
        whoText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        whoText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                whoTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                whoTextFocusLost(evt);
            }
        });
        transfersPanel.add(whoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 410, 300, -1));

        whoGuideLabel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        whoGuideLabel.setForeground(new java.awt.Color(204, 204, 204));
        whoGuideLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        whoGuideLabel.setText("Please use recipient's customer number. ");
        transfersPanel.add(whoGuideLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 447, -1, -1));

        transferButton.setBackground(new java.awt.Color(60, 63, 65));
        transferButton.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        transferButton.setForeground(new java.awt.Color(204, 204, 204));
        transferButton.setText("Transfer");
        transferButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transferButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferButtonActionPerformed(evt);
            }
        });
        transfersPanel.add(transferButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, -1, -1));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/background.jpg"))); // NOI18N
        transfersPanel.add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 768));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(transfersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(transfersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void amountTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountTextKeyReleased

      this.transferMoney = TextSettings.checkTheTextKeyReleased(amountText, 20000);
    }//GEN-LAST:event_amountTextKeyReleased

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked

        ActionSettings.setVisible(this, new AccountScreen());
    }//GEN-LAST:event_backButtonMouseClicked
//----------------------------------------------------------------------------------------------
    private void transferButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferButtonActionPerformed
        if(this.isInformationsValid()){
            this.makeTransfer();
        } else {
            Dialogs.showCannotBeEmptyMessage(this);
        }
            
            
    }//GEN-LAST:event_transferButtonActionPerformed

    private void makeTransfer() {
        getTransfersObject().setTransferAmount(this.transferMoney);
        getTransfersObject().setToWho(this.whoText.getText());
        
        if (getTransfersObject().isItOk()) {
           JOptionPane.showMessageDialog(this, "ACCOMPLISHED\nAmount of money transfered : $"+this.transferMoney+"\nCustomer Number : "+whoText.getText());
           ActionSettings.setVisible(this, new AccountScreen());
        } else if(this.transferMoney==0){
            Dialogs.showDefaultMessage(this,"You cannot send 0$.");
        } else if(transferMoney > getAccountInformations().getBalance()) {
            Dialogs.showDefaultMessage(this,"You have not enough balance.\nYou need "+(transferMoney-getAccountInformations().getBalance())+ "$ more.");
        } else {
            Dialogs.showDefaultMessage(this, "Transfer process has failed.\nPlease check your informations. ");
        }
    }
    //---------------------------------------------------------------------------------------------
    private void whoTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_whoTextFocusGained

        TextSettings.checkTheTextFocusGained(whoText, customertextoriginal);
    }//GEN-LAST:event_whoTextFocusGained

    private void whoTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_whoTextFocusLost

        TextSettings.checkTheTextFocusLost(whoText);
    }//GEN-LAST:event_whoTextFocusLost

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        transfersPanel.setFocusable(true);
        TextSettings.setOnlyNumber(amountText);
        TextSettings.setMaxLimit(amountText, 5);
        whoText.setText(customertextoriginal);
        TextSettings.setOnlyNumber(whoText);
        TextSettings.setMaxLimit(whoText, 11);
         this.nameLabel.setText("Dear "+getAccountInformations().getNameSurname());
        this.balanceLabel2.setText(String.valueOf(getAccountInformations().getBalance())+" $");
        
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TransfersScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransfersScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransfersScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransfersScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransfersScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountLabel;
    private javax.swing.JTextField amountText;
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JLabel balanceLabel2;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton transferButton;
    private javax.swing.JPanel transfersPanel;
    private javax.swing.JLabel warningLabel;
    private javax.swing.JLabel whoGuideLabel;
    private javax.swing.JLabel whoLabel;
    private javax.swing.JTextField whoText;
    // End of variables declaration//GEN-END:variables
}
