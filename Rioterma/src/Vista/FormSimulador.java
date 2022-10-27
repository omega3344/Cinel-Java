
package Vista;


public class FormSimulador extends javax.swing.JFrame {

    FormMenu menu;
    
    public FormSimulador(FormMenu menurec) {
        initComponents();
        
        menu = menurec;
    }
  
    public FormSimulador(){
        
    } 
    
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSmeses = new javax.swing.JSlider();
        jLmeses = new javax.swing.JLabel();
        jSmontante = new javax.swing.JSlider();
        jLmontante = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbsair = new javax.swing.JButton();
        jLmensalidade = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 440));
        setPreferredSize(new java.awt.Dimension(620, 440));
        setResizable(false);
        setSize(new java.awt.Dimension(620, 440));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSmeses.setBackground(new java.awt.Color(210, 210, 255));
        jSmeses.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jSmeses.setMajorTickSpacing(12);
        jSmeses.setMaximum(120);
        jSmeses.setMinimum(24);
        jSmeses.setSnapToTicks(true);
        jSmeses.setToolTipText("");
        jSmeses.setValue(0);
        jSmeses.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSmeses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSmeses.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSmesesStateChanged(evt);
            }
        });
        getContentPane().add(jSmeses, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 240, -1));

        jLmeses.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLmeses.setForeground(new java.awt.Color(204, 204, 204));
        jLmeses.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLmeses.setText("24");
        getContentPane().add(jLmeses, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 40, -1));

        jSmontante.setBackground(new java.awt.Color(210, 210, 255));
        jSmontante.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jSmontante.setMajorTickSpacing(100);
        jSmontante.setMaximum(30000);
        jSmontante.setMinimum(1000);
        jSmontante.setSnapToTicks(true);
        jSmontante.setToolTipText("");
        jSmontante.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSmontante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSmontante.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSmontanteStateChanged(evt);
            }
        });
        getContentPane().add(jSmontante, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 240, -1));

        jLmontante.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLmontante.setForeground(new java.awt.Color(204, 204, 204));
        jLmontante.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLmontante.setText("1000");
        getContentPane().add(jLmontante, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 60, -1));

        jLabel2.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Mensalidade");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Prazo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Montante");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Candara", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("SIMULADOR");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("€");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 20, -1));

        jbsair.setBackground(new java.awt.Color(204, 204, 204));
        jbsair.setForeground(new java.awt.Color(51, 51, 51));
        jbsair.setText("SAIR");
        jbsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsairActionPerformed(evt);
            }
        });
        getContentPane().add(jbsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        jLmensalidade.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLmensalidade.setForeground(new java.awt.Color(204, 204, 204));
        jLmensalidade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLmensalidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 100, 30));

        jLabel7.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("meses");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("€");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 20, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Utilizador\\Documents\\NetBeansProjects\\standRioterma\\src\\main\\java\\Vista\\imagens\\porscheclassico.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jSmesesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSmesesStateChanged

        jLmeses.setText(Integer.toString(jSmeses.getValue()));
        calcularMensalidade();
    }//GEN-LAST:event_jSmesesStateChanged

    private void jSmontanteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSmontanteStateChanged

        jLmontante.setText(Integer.toString(jSmontante.getValue()));
        calcularMensalidade();
    }//GEN-LAST:event_jSmontanteStateChanged

    private void jbsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsairActionPerformed

        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbsairActionPerformed

     public void calcularMensalidade(){
        
        double taxaJurosAnual = 0.04;
        double juros = taxaJurosAnual/12;
        int montante = jSmontante.getValue();
        int prazo = jSmeses.getValue();
        double potencia = Math.pow(1+juros,(double)prazo);
        double mensalidade = montante*(potencia*juros)/(potencia-1);
        mensalidade = Math.round(mensalidade*100.0)/100.0;
        
        jLmensalidade.setText(Double.toString(mensalidade));
        
    }
    
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSimulador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLmensalidade;
    private javax.swing.JLabel jLmeses;
    private javax.swing.JLabel jLmontante;
    private javax.swing.JSlider jSmeses;
    private javax.swing.JSlider jSmontante;
    private javax.swing.JButton jbsair;
    // End of variables declaration//GEN-END:variables
}
