
package Vista;


public class FormMenu extends javax.swing.JFrame {

    private FormSimulador formsimulador;
    private FormVenda formvenda;
    private FormCliente formcliente;
    private FormViatura formviatura;
    //private FormLogin formlogin;
    private FormUtilizador formutilizador;
    private FormListagens formlistagens;

   
    public FormMenu() {
        initComponents();
        this.dispose();
        this.setUndecorated(true);
    }

   
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMcliente = new javax.swing.JMenuItem();
        jMviatura = new javax.swing.JMenuItem();
        jMutilizador = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMvendas = new javax.swing.JMenuItem();
        jMsimulador = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(930, 540));
        setPreferredSize(new java.awt.Dimension(930, 540));
        setResizable(false);
        setSize(new java.awt.Dimension(930, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Utilizador\\Documents\\NetBeansProjects\\Rioterma\\src\\Vista\\imagens\\porche1_1.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -40, 980, 560));

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorderPainted(false);

        jMenu1.setBackground(new java.awt.Color(102, 102, 102));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Configurações");
        jMenu1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N

        jMcliente.setBackground(new java.awt.Color(51, 51, 51));
        jMcliente.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jMcliente.setForeground(new java.awt.Color(255, 255, 255));
        jMcliente.setText("Cliente");
        jMcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMclienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMcliente);

        jMviatura.setBackground(new java.awt.Color(51, 51, 51));
        jMviatura.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jMviatura.setForeground(new java.awt.Color(255, 255, 255));
        jMviatura.setText("Viatura");
        jMviatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMviaturaActionPerformed(evt);
            }
        });
        jMenu1.add(jMviatura);

        jMutilizador.setBackground(new java.awt.Color(51, 51, 51));
        jMutilizador.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jMutilizador.setForeground(new java.awt.Color(255, 255, 255));
        jMutilizador.setText("Utilizador");
        jMutilizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMutilizadorActionPerformed(evt);
            }
        });
        jMenu1.add(jMutilizador);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Operações");
        jMenu2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jMenu2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMvendas.setBackground(new java.awt.Color(51, 51, 51));
        jMvendas.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jMvendas.setForeground(new java.awt.Color(255, 255, 255));
        jMvendas.setText("Vendas");
        jMvendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMvendasActionPerformed(evt);
            }
        });
        jMenu2.add(jMvendas);

        jMsimulador.setBackground(new java.awt.Color(51, 51, 51));
        jMsimulador.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jMsimulador.setForeground(new java.awt.Color(255, 255, 255));
        jMsimulador.setText("Simulador");
        jMsimulador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMsimuladorActionPerformed(evt);
            }
        });
        jMenu2.add(jMsimulador);

        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Listagens");
        jMenu3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N

        jMenuItem1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItem1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setText("Listagens PDF");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("Sair");
        jMenu4.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N

        jMenuItem2.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItem2.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setText("Sair do programa");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMsimuladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMsimuladorActionPerformed
        this.setVisible(false);
        formsimulador = new FormSimulador(this);
        formsimulador.dispose();
        formsimulador.setUndecorated( true );
        formsimulador.setVisible(true);    }//GEN-LAST:event_jMsimuladorActionPerformed

    private void jMvendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMvendasActionPerformed
        this.setVisible(false);
        formvenda = new FormVenda(this);
        formvenda.dispose();
        formvenda.setUndecorated( true );
        formvenda.setVisible(true);      
    }//GEN-LAST:event_jMvendasActionPerformed

    private void jMclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMclienteActionPerformed
        this.setVisible(false);
        formcliente = new FormCliente(this);
        formcliente.dispose();
        formcliente.setUndecorated( true );
        formcliente.setVisible(true);     }//GEN-LAST:event_jMclienteActionPerformed

    private void jMviaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMviaturaActionPerformed
        this.setVisible(false);
        formviatura = new FormViatura(this);
        formviatura.dispose();
        formviatura.setUndecorated( true );
        formviatura.setVisible(true);       }//GEN-LAST:event_jMviaturaActionPerformed

    private void jMutilizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMutilizadorActionPerformed
        this.setVisible(false);
        formutilizador = new FormUtilizador(this);
        formutilizador.dispose();
        formutilizador.setUndecorated( true );
        formutilizador.setVisible(true);       }//GEN-LAST:event_jMutilizadorActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        formlistagens = new FormListagens(this);
        formlistagens.dispose();
        formlistagens.setUndecorated( true );
        formlistagens.setVisible(true);        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMcliente;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMsimulador;
    private javax.swing.JMenuItem jMutilizador;
    private javax.swing.JMenuItem jMvendas;
    private javax.swing.JMenuItem jMviatura;
    // End of variables declaration//GEN-END:variables
}
