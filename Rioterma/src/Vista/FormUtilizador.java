
package Vista;

import Control.Control;
import Dados.BasesDados;
import Modelo.Utilizador;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormUtilizador extends javax.swing.JFrame {

    private FormMenu menu;
    private Utilizador utilizador;
    private BasesDados bdados;
    private Control control;
    private ArrayList<Utilizador> listaDeUtilizadores = new ArrayList();

    public FormUtilizador(FormMenu menurec){
        initComponents();
        menu = menurec;
    }
    
    public FormUtilizador() {
        control = new Control();
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }
    
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnivel = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUtil = new javax.swing.JTable();
        txtemail = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jBinserir = new javax.swing.JButton();
        jBapagar = new javax.swing.JButton();
        jBsair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(840, 570));
        setPreferredSize(new java.awt.Dimension(840, 570));
        setResizable(false);
        setSize(new java.awt.Dimension(840, 570));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel2.setText("MENU UTILIZADOR");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 310, -1));

        jLabel3.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel3.setText("EMAIL");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 110, -1));

        jLabel4.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel4.setText("NOME");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 110, -1));

        jLabel5.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel5.setText("NIVEL");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 110, -1));

        jLabel6.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel6.setText("PASSWORD");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 140, -1));

        txtnivel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txtnivel.setForeground(new java.awt.Color(51, 51, 51));
        txtnivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Utilizador", "Administrador" }));
        txtnivel.setBorder(null);
        getContentPane().add(txtnivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 180, -1));

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        tabelaUtil.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tabelaUtil.setForeground(new java.awt.Color(51, 51, 51));
        tabelaUtil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Email", "Nivel"
            }
        ));
        tabelaUtil.setGridColor(new java.awt.Color(51, 51, 51));
        tabelaUtil.setPreferredSize(new java.awt.Dimension(450, 80));
        tabelaUtil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUtilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaUtil);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 850, 120));

        txtemail.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txtemail.setForeground(new java.awt.Color(51, 51, 51));
        txtemail.setBorder(null);
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 290, -1));

        txtnome.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txtnome.setForeground(new java.awt.Color(51, 51, 51));
        txtnome.setBorder(null);
        getContentPane().add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 290, -1));

        txtpassword.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(51, 51, 51));
        txtpassword.setBorder(null);
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 290, -1));

        jBinserir.setBackground(new java.awt.Color(102, 102, 102));
        jBinserir.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jBinserir.setForeground(new java.awt.Color(255, 255, 255));
        jBinserir.setText("INSERIR");
        jBinserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBinserirActionPerformed(evt);
            }
        });
        getContentPane().add(jBinserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, -1, -1));

        jBapagar.setBackground(new java.awt.Color(102, 102, 102));
        jBapagar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jBapagar.setForeground(new java.awt.Color(255, 255, 255));
        jBapagar.setText("APAGAR");
        jBapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBapagarActionPerformed(evt);
            }
        });
        getContentPane().add(jBapagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, -1, -1));

        jBsair.setBackground(new java.awt.Color(102, 102, 102));
        jBsair.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jBsair.setForeground(new java.awt.Color(255, 255, 255));
        jBsair.setText("SAIR");
        jBsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsairActionPerformed(evt);
            }
        });
        getContentPane().add(jBsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Utilizador\\Documents\\NetBeansProjects\\standRioterma\\src\\main\\java\\Vista\\imagens\\porsche911.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaUtilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUtilMouseClicked

        if(tabelaUtil.getSelectedRow()!= -1){
            txtnome.setText(tabelaUtil.getValueAt(tabelaUtil.getSelectedRow(),0).toString());
            txtemail.setText(tabelaUtil.getValueAt(tabelaUtil.getSelectedRow(),1).toString());
            //txtpassword.setText(tabelaUtil.getValueAt(tabelaUtil.getSelectedRow(),2).toString());
        }
    }//GEN-LAST:event_tabelaUtilMouseClicked
    
    private void jBinserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBinserirActionPerformed

        Utilizador utilizador = new Utilizador();
        control = new Control();
       
        utilizador.setNome(txtnome.getText().trim());
        utilizador.setPassword(txtpassword.getPassword().toString().trim());
        utilizador.setEmail(txtemail.getText().trim());
        utilizador.setNivel((String)txtnivel.getSelectedItem());
        
         if((control.validarTexto(utilizador.getNome())==true)
            &&(control.validarEmail(utilizador.getEmail())==true)
            &&(control.validarTexto(utilizador.getPassword())==true)){
                
                bdados.getListaDeUtilizadores().add(utilizador);

                DefaultTableModel tabutil = (DefaultTableModel) tabelaUtil.getModel();
                Object linha[] = new Object[3];
        
                    linha[0] = utilizador.getNome();
                    linha[1] = utilizador.getEmail();
                    linha[2] = utilizador.getNivel();
                    tabutil.addRow(linha); 
        
                limparCampos();
         }
    }//GEN-LAST:event_jBinserirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        bdados = new BasesDados();
        bdados.lerFicheiroUtilizadores();  
        popularTabelaUtilizadores();
    }//GEN-LAST:event_formWindowActivated

    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
       
        bdados.gravarFicheiroUtilizadores();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jBsairActionPerformed

    private void jBapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBapagarActionPerformed

        if(tabelaUtil.getSelectedRow()!= -1){
            listaDeUtilizadores.remove(tabelaUtil.getSelectedRow());
            ((DefaultTableModel) tabelaUtil.getModel()).removeRow(tabelaUtil.getSelectedRow());
        }else{
            JOptionPane.showMessageDialog(null,"Selecione a linha a excluir");
        }
        
        limparCampos();
    }//GEN-LAST:event_jBapagarActionPerformed

    public void popularTabelaUtilizadores(){
        
        listaDeUtilizadores = bdados.getListaDeUtilizadores();
        
        DefaultTableModel tabutil = (DefaultTableModel) tabelaUtil.getModel();
        tabutil.setNumRows(0);
        Object linha[] = new Object[3];
        
        for (int i=0;i<listaDeUtilizadores.size();i++){
            linha[0] = listaDeUtilizadores.get(i).getNome();
            linha[1] = listaDeUtilizadores.get(i).getEmail();
            linha[2] = listaDeUtilizadores.get(i).getNivel();  
            tabutil.addRow(linha);
        }
    
    }
      
    public void limparCampos(){
        
        txtnome.setText("");
        txtpassword.setText("");
        txtemail.setText(""); 
    }
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUtilizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBapagar;
    private javax.swing.JButton jBinserir;
    private javax.swing.JButton jBsair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaUtil;
    private javax.swing.JTextField txtemail;
    private javax.swing.JComboBox<String> txtnivel;
    private javax.swing.JTextField txtnome;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
