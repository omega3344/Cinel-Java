
package Vista;

import Dados.BasesDados;


public class FormListagens extends javax.swing.JFrame {

    private FormMenu menu;
    private BasesDados bdados;
    String nomeLista = "";
    
    public FormListagens() {
        initComponents();
    }
    
    public FormListagens(FormMenu menurec){
        initComponents();
        menu = menurec;
        bdados = new BasesDados(); 
    }
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jBcriarpdf = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBsair1 = new javax.swing.JButton();
        jRBclientes = new javax.swing.JRadioButton();
        jRBviaturas = new javax.swing.JRadioButton();
        jRBvendas = new javax.swing.JRadioButton();
        jRButilizadores = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(850, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(850, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel5.setText("Listagem de Utilizadores");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 270, -1));

        jBcriarpdf.setBackground(new java.awt.Color(102, 102, 102));
        jBcriarpdf.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jBcriarpdf.setForeground(new java.awt.Color(255, 255, 255));
        jBcriarpdf.setText("CRIAR PDF");
        jBcriarpdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcriarpdfActionPerformed(evt);
            }
        });
        getContentPane().add(jBcriarpdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, -1, -1));

        jLabel4.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel4.setText("Listagem de Clientes");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 260, -1));

        jLabel3.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel3.setText("Listagem de Vendas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 270, -1));

        jLabel6.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel6.setText("Listagem de Viaturas");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 250, -1));

        jLabel2.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel2.setText("MENU LISTAGENS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 310, -1));

        jBsair1.setBackground(new java.awt.Color(102, 102, 102));
        jBsair1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jBsair1.setForeground(new java.awt.Color(255, 255, 255));
        jBsair1.setText("SAIR");
        jBsair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsair1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBsair1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, -1, -1));

        jRBclientes.setBackground(new java.awt.Color(175, 135, 75));
        buttonGroup1.add(jRBclientes);
        jRBclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBclientesActionPerformed(evt);
            }
        });
        getContentPane().add(jRBclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jRBviaturas.setBackground(new java.awt.Color(175, 135, 75));
        buttonGroup1.add(jRBviaturas);
        jRBviaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBviaturasActionPerformed(evt);
            }
        });
        getContentPane().add(jRBviaturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jRBvendas.setBackground(new java.awt.Color(175, 135, 75));
        buttonGroup1.add(jRBvendas);
        jRBvendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBvendasActionPerformed(evt);
            }
        });
        getContentPane().add(jRBvendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        jRButilizadores.setBackground(new java.awt.Color(175, 135, 75));
        buttonGroup1.add(jRButilizadores);
        jRButilizadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRButilizadoresActionPerformed(evt);
            }
        });
        getContentPane().add(jRButilizadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Utilizador\\Documents\\NetBeansProjects\\standRioterma\\src\\main\\java\\Vista\\imagens\\porsche911.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBcriarpdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcriarpdfActionPerformed

        bdados.criarPdf(nomeLista);
    }//GEN-LAST:event_jBcriarpdfActionPerformed

    private void jBsair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsair1ActionPerformed
        
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jBsair1ActionPerformed

    private void jRBclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBclientesActionPerformed

        nomeLista = "clientes.txt";
    }//GEN-LAST:event_jRBclientesActionPerformed

    private void jRBviaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBviaturasActionPerformed
        
        nomeLista = "viaturas.txt";
    }//GEN-LAST:event_jRBviaturasActionPerformed

    private void jRBvendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBvendasActionPerformed

        nomeLista = "vendas.txt";
    }//GEN-LAST:event_jRBvendasActionPerformed

    private void jRButilizadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRButilizadoresActionPerformed

        nomeLista = "utilizadores.txt";
    }//GEN-LAST:event_jRButilizadoresActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormListagens().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBcriarpdf;
    private javax.swing.JButton jBsair1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRBclientes;
    private javax.swing.JRadioButton jRButilizadores;
    private javax.swing.JRadioButton jRBvendas;
    private javax.swing.JRadioButton jRBviaturas;
    // End of variables declaration//GEN-END:variables

    
}
