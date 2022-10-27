
package Vista;

import Control.Control;
import Dados.BasesDados;
import Modelo.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormCliente extends javax.swing.JFrame {

    private FormMenu menu;
    private Cliente cliente;
    private BasesDados bdados;
    private Control control;
    private ArrayList<Cliente> listaDeClientes = new ArrayList();
    

    public FormCliente() {
         control = new Control();
    }
     
    public FormCliente(FormMenu menurec){
        initComponents();
        menu = menurec;
        bdados = new BasesDados(); 
    }
       
    public Cliente getCliente() {
        return cliente;
    }

    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCli = new javax.swing.JTable();
        txtemail = new javax.swing.JTextField();
        txttelefone = new javax.swing.JTextField();
        jBinserir = new javax.swing.JButton();
        jBapagar3 = new javax.swing.JButton();
        jBsair = new javax.swing.JButton();
        txtnif = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
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
        jLabel2.setText("MENU CLIENTE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 310, -1));

        jLabel3.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel3.setText("EMAIL");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 110, -1));

        jLabel4.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel4.setText("NIF");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 110, -1));

        jLabel5.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel5.setText("TELEFONE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 110, -1));

        jLabel6.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel6.setText("NOME");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 140, -1));

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        tabelaCli.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tabelaCli.setForeground(new java.awt.Color(51, 51, 51));
        tabelaCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIF", "Nome", "Email", "Telefone"
            }
        ));
        tabelaCli.setGridColor(new java.awt.Color(51, 51, 51));
        tabelaCli.setPreferredSize(new java.awt.Dimension(450, 80));
        tabelaCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCli);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 850, 120));

        txtemail.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txtemail.setForeground(new java.awt.Color(51, 51, 51));
        txtemail.setBorder(null);
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 290, -1));

        txttelefone.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txttelefone.setForeground(new java.awt.Color(51, 51, 51));
        txttelefone.setBorder(null);
        getContentPane().add(txttelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 190, -1));

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

        jBapagar3.setBackground(new java.awt.Color(102, 102, 102));
        jBapagar3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jBapagar3.setForeground(new java.awt.Color(255, 255, 255));
        jBapagar3.setText("APAGAR");
        jBapagar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBapagar3ActionPerformed(evt);
            }
        });
        getContentPane().add(jBapagar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, -1, -1));

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

        txtnif.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txtnif.setForeground(new java.awt.Color(51, 51, 51));
        txtnif.setBorder(null);
        getContentPane().add(txtnif, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 290, -1));

        txtnome.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txtnome.setForeground(new java.awt.Color(51, 51, 51));
        txtnome.setBorder(null);
        getContentPane().add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 290, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Utilizador\\Documents\\NetBeansProjects\\standRioterma\\src\\main\\java\\Vista\\imagens\\porsche911.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCliMouseClicked

        if(tabelaCli.getSelectedRow()!= -1){
            txtnif.setText(tabelaCli.getValueAt(tabelaCli.getSelectedRow(),0).toString());
            txtnome.setText(tabelaCli.getValueAt(tabelaCli.getSelectedRow(),1).toString());
            txtemail.setText(tabelaCli.getValueAt(tabelaCli.getSelectedRow(),2).toString());
            txttelefone.setText(tabelaCli.getValueAt(tabelaCli.getSelectedRow(),3).toString());
    }//GEN-LAST:event_tabelaCliMouseClicked
    } 
        
    private void jBinserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBinserirActionPerformed
       
        Cliente cliente = new Cliente();
        control = new Control();
        
        cliente.setNif(txtnif.getText().trim());
        cliente.setNome(txtnome.getText().trim());
        cliente.setTelefone(txttelefone.getText().trim());
        cliente.setEmail(txtemail.getText().trim());
        
        if((control.validarNIF(cliente.getNif())==true)
            &&(control.validarTexto(cliente.getNome())==true)
            &&(control.validarEmail(cliente.getEmail())==true)
            &&(control.validarTelefone(cliente.getTelefone())==true)){
                bdados.getListaDeClientes().add(cliente);     
                 
                System.out.println("teste");
        
                DefaultTableModel tabcli = (DefaultTableModel) tabelaCli.getModel();
                Object linha[] = new Object[4];
        
                    linha[0] = cliente.getNif();
                    linha[1] = cliente.getNome();
                    linha[2] = cliente.getEmail();
                    linha[3] = cliente.getTelefone();
            
                    tabcli.addRow(linha); 
        
                limparCampos();
        
                txtnif.requestFocus();  
        }
    }//GEN-LAST:event_jBinserirActionPerformed

    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
       
        bdados.gravarFicheiroClientes();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jBsairActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        bdados = new BasesDados();
        bdados.lerFicheiroClientes();
        popularTabelaClientes();
    }//GEN-LAST:event_formWindowActivated

    private void jBapagar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBapagar3ActionPerformed

        if(tabelaCli.getSelectedRow()!= -1){
            listaDeClientes.remove(tabelaCli.getSelectedRow());
            ((DefaultTableModel) tabelaCli.getModel()).removeRow(tabelaCli.getSelectedRow());
        }else{
            JOptionPane.showMessageDialog(null,"Selecione a linha a excluir");
        }
        limparCampos();
    }//GEN-LAST:event_jBapagar3ActionPerformed

    public void popularTabelaClientes(){
        
        listaDeClientes = bdados.getListaDeClientes();
        
        DefaultTableModel tabcli = (DefaultTableModel) tabelaCli.getModel();
        tabcli.setNumRows(0);
        Object linha[] = new Object[4];
        
        for (int i=0;i<listaDeClientes.size();i++){
            linha[0] = listaDeClientes.get(i).getNif();
            linha[1] = listaDeClientes.get(i).getNome();
            linha[2] = listaDeClientes.get(i).getEmail(); 
            linha[3] = listaDeClientes.get(i).getTelefone();  
            tabcli.addRow(linha);
        }
    
    }
    
    public void limparCampos(){
        
        txtnome.setText("");
        txtnif.setText("");
        txtemail.setText("");
        txttelefone.setText(""); 
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBapagar3;
    private javax.swing.JButton jBinserir;
    private javax.swing.JButton jBsair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaCli;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnif;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txttelefone;
    // End of variables declaration//GEN-END:variables
}
