
package Vista;

import Control.Control;
//import Vista.FormMenu;
//import Dados.BasesDados;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class FormLogin extends javax.swing.JFrame {

    private final Control control;
    private final FormMenu menu;
    
    
    public FormLogin() {
        initComponents();
        control = new Control(this);
        menu = new FormMenu();
        menu.setVisible(true);
        menu.setEnabled(false);
        this.dispose();
        this.setUndecorated( true );
        this.setVisible(true);
        adicionarMarcador(txtutilizador);
        adicionarMarcador(txtpassword);
    }
    
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtutilizador = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jBentrar = new javax.swing.JButton();
        jBentrar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 400));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Utilizador\\Documents\\NetBeansProjects\\Rioterma\\src\\Vista\\imagens\\user.png")); // NOI18N
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 20, 30));

        jLabel2.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Utilizador\\Documents\\NetBeansProjects\\Rioterma\\src\\Vista\\imagens\\padlock.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 20, 30));

        txtutilizador.setBackground(new java.awt.Color(51, 51, 51));
        txtutilizador.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtutilizador.setForeground(new java.awt.Color(255, 255, 255));
        txtutilizador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtutilizador.setText("Utilizador");
        txtutilizador.setBorder(null);
        txtutilizador.setCaretColor(new java.awt.Color(255, 255, 255));
        txtutilizador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtutilizadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtutilizadorFocusLost(evt);
            }
        });
        getContentPane().add(txtutilizador, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 140, 30));

        txtpassword.setBackground(new java.awt.Color(51, 51, 51));
        txtpassword.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(255, 255, 255));
        txtpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpassword.setText("Password");
        txtpassword.setBorder(null);
        txtpassword.setCaretColor(new java.awt.Color(255, 255, 255));
        txtpassword.setEchoChar('\u0000');
        txtpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpasswordFocusLost(evt);
            }
        });
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 140, 30));

        jBentrar.setBackground(new java.awt.Color(51, 51, 51));
        jBentrar.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jBentrar.setForeground(new java.awt.Color(255, 255, 255));
        jBentrar.setText("ENTRAR");
        jBentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBentrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBentrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 160, 30));

        jBentrar1.setBackground(new java.awt.Color(51, 51, 51));
        jBentrar1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jBentrar1.setForeground(new java.awt.Color(255, 255, 255));
        jBentrar1.setText("CANCELAR");
        jBentrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBentrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBentrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Utilizador\\Documents\\NetBeansProjects\\standRioterma\\src\\main\\java\\Vista\\imagens\\porsche911antigo.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 0, 810, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void jBentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBentrarActionPerformed
       
        if(this.control.entrarAplicacao()==false){
            JOptionPane.showMessageDialog(null,"Utilizador ou password inválidos!");
        }else{
            menu.setEnabled(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_jBentrarActionPerformed

    private void txtpasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusLost

        if(txtpassword.getPassword().toString().length()==0){
            adicionarMarcador(txtpassword);
            txtpassword.setText("Password");
            txtpassword.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_txtpasswordFocusLost

    private void txtpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusGained

         if(txtpassword.getPassword().toString().equals("Password")){
            txtpassword.setText(null);
            txtpassword.requestFocus();
            txtpassword.setEchoChar('*');
            removerMarcador(txtpassword);
        }
    }//GEN-LAST:event_txtpasswordFocusGained

    private void txtutilizadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtutilizadorFocusLost

        if(txtutilizador.getText().length()==0){
            adicionarMarcador(txtutilizador);
            txtutilizador.setText("Utilizador");
        }
    }//GEN-LAST:event_txtutilizadorFocusLost

    private void txtutilizadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtutilizadorFocusGained

        if(txtutilizador.getText().equals("Utilizador")){
            txtutilizador.setText(null);
            txtutilizador.requestFocus();
            removerMarcador(txtutilizador);
        }
    }//GEN-LAST:event_txtutilizadorFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void jBentrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBentrar1ActionPerformed
        
        menu.dispose();
        this.dispose();
    }//GEN-LAST:event_jBentrar1ActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormLogin formlogin = new FormLogin();
                formlogin.setVisible(true);
                formlogin.setUndecorated( true );
            }
        });
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBentrar;
    private javax.swing.JButton jBentrar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtutilizador;
    // End of variables declaration//GEN-END:variables

   
    public JPasswordField getTxtpassword() {
        return txtpassword;
    }

    public void setTxtpassword(JPasswordField txtpassword) {
        this.txtpassword = txtpassword;
    }

    public JTextField getTxtutilizador() {
        return txtutilizador;
    }

    public void setTxtutilizador(JTextField txtutilizador) {
        this.txtutilizador = txtutilizador;
    }

    public void adicionarMarcador (JTextField texto){
        
        Font font = texto.getFont();
        font = font.deriveFont(font.ITALIC);
        texto.setFont(font);
        texto.setForeground(Color.gray);    
    }
    public void removerMarcador (JTextField texto){
      
        Font font = texto.getFont();
        font = font.deriveFont(font.PLAIN|font.BOLD);
        texto.setFont(font);
        texto.setForeground(Color.white);  
    }
    
    
}
