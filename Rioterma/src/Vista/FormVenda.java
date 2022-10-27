

package Vista;

import Control.Control;
import Dados.BasesDados;
import Modelo.Cliente;
import Modelo.Viatura;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class FormVenda extends javax.swing.JFrame {

    //private FormMenu FormMenu;
    private Cliente cliente;
    private Viatura viatura;
    private Control control;
    private FormMenu menu;
    private BasesDados bdados;
    private ArrayList<Cliente> listaDeClientes = new ArrayList();
    private ArrayList<Viatura> listaDeViaturas = new ArrayList();

    
    public FormVenda (FormMenu menurec){
        initComponents();
        menu = menurec;
        bdados = new BasesDados();
    }
    
    public FormVenda() {
        control = new Control();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Viatura getViatura() {
        return viatura;
    }

    public void setViatura(Viatura viatura) {
        this.viatura = viatura;
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
        jBgravar = new javax.swing.JButton();
        jBlimpar = new javax.swing.JButton();
        jBsair = new javax.swing.JButton();
        txtnif = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaViat = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtmatricula = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        txtmodelo = new javax.swing.JTextField();
        txtretoma = new javax.swing.JTextField();
        txtretoma.setVisible(false);
        txtpreco = new javax.swing.JTextField();
        jCBretoma = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(895, 590));
        setPreferredSize(new java.awt.Dimension(895, 590));
        setResizable(false);
        setSize(new java.awt.Dimension(895, 590));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel2.setText("MENU VENDA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 310, -1));

        jLabel3.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel3.setText("EMAIL");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 110, -1));

        jLabel4.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel4.setText("NIF");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 110, -1));

        jLabel5.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel5.setText("TELEFONE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 110, -1));

        jLabel6.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel6.setText("NOME");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 110, -1));

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        tabelaCli.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tabelaCli.setForeground(new java.awt.Color(51, 51, 51));
        tabelaCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "NIF", "Email", "Telefone"
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 460, 120));

        txtemail.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txtemail.setForeground(new java.awt.Color(51, 51, 51));
        txtemail.setBorder(null);
        txtemail.setFocusable(false);
        txtemail.setRequestFocusEnabled(false);
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 270, -1));

        txttelefone.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txttelefone.setForeground(new java.awt.Color(51, 51, 51));
        txttelefone.setBorder(null);
        txttelefone.setFocusable(false);
        txttelefone.setRequestFocusEnabled(false);
        getContentPane().add(txttelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 190, -1));

        jBgravar.setBackground(new java.awt.Color(102, 102, 102));
        jBgravar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jBgravar.setForeground(new java.awt.Color(255, 255, 255));
        jBgravar.setText("GRAVAR");
        jBgravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBgravarActionPerformed(evt);
            }
        });
        getContentPane().add(jBgravar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, -1, -1));

        jBlimpar.setBackground(new java.awt.Color(102, 102, 102));
        jBlimpar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jBlimpar.setForeground(new java.awt.Color(255, 255, 255));
        jBlimpar.setText("LIMPAR");
        jBlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimparActionPerformed(evt);
            }
        });
        getContentPane().add(jBlimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, -1, -1));

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
        txtnif.setFocusable(false);
        txtnif.setRequestFocusEnabled(false);
        getContentPane().add(txtnif, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 270, -1));

        txtnome.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txtnome.setForeground(new java.awt.Color(51, 51, 51));
        txtnome.setBorder(null);
        txtnome.setFocusable(false);
        txtnome.setRequestFocusEnabled(false);
        getContentPane().add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 270, -1));

        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        tabelaViat.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tabelaViat.setForeground(new java.awt.Color(51, 51, 51));
        tabelaViat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Marca", "Modelo", "Preço"
            }
        ));
        tabelaViat.setGridColor(new java.awt.Color(51, 51, 51));
        tabelaViat.setPreferredSize(new java.awt.Dimension(450, 80));
        tabelaViat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaViatMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaViat);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 440, 120));

        jLabel7.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel7.setText("MATRICULA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 140, -1));

        jLabel8.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel8.setText("MARCA");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 140, -1));

        jLabel9.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel9.setText("MODELO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 110, -1));

        jLabel10.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel10.setText("RETOMA");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 110, -1));

        txtmatricula.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txtmatricula.setForeground(new java.awt.Color(51, 51, 51));
        txtmatricula.setBorder(null);
        txtmatricula.setFocusable(false);
        txtmatricula.setRequestFocusEnabled(false);
        getContentPane().add(txtmatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 270, -1));

        txtmarca.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txtmarca.setForeground(new java.awt.Color(51, 51, 51));
        txtmarca.setBorder(null);
        txtmarca.setFocusable(false);
        txtmarca.setRequestFocusEnabled(false);
        getContentPane().add(txtmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 270, -1));

        txtmodelo.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txtmodelo.setForeground(new java.awt.Color(51, 51, 51));
        txtmodelo.setBorder(null);
        txtmodelo.setFocusable(false);
        txtmodelo.setRequestFocusEnabled(false);
        getContentPane().add(txtmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 270, -1));

        txtretoma.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txtretoma.setForeground(new java.awt.Color(51, 51, 51));
        txtretoma.setBorder(null);
        txtretoma.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        getContentPane().add(txtretoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 190, -1));

        txtpreco.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txtpreco.setForeground(new java.awt.Color(51, 51, 51));
        txtpreco.setBorder(null);
        txtpreco.setFocusable(false);
        txtpreco.setRequestFocusEnabled(false);
        getContentPane().add(txtpreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 190, -1));

        jCBretoma.setBackground(new java.awt.Color(175, 135, 65));
        jCBretoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBretomaActionPerformed(evt);
            }
        });
        getContentPane().add(jCBretoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, -1, -1));

        jLabel11.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel11.setText("PREÇO");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 110, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Utilizador\\Documents\\NetBeansProjects\\standRioterma\\src\\main\\java\\Vista\\imagens\\porsche911.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

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
    private void tabelaViatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaViatMouseClicked

        if(tabelaViat.getSelectedRow()!= -1){
            txtmatricula.setText(tabelaViat.getValueAt(tabelaViat.getSelectedRow(),0).toString());
            txtmarca.setText(tabelaViat.getValueAt(tabelaViat.getSelectedRow(),1).toString());
            txtmodelo.setText(tabelaViat.getValueAt(tabelaViat.getSelectedRow(),2).toString());
            txtpreco.setText(tabelaViat.getValueAt(tabelaViat.getSelectedRow(),3).toString());
        }
    }//GEN-LAST:event_tabelaViatMouseClicked

    private void jBgravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBgravarActionPerformed
        
        Cliente cliente = new Cliente();
        Viatura viatura = new Viatura();
        control = new Control();
                
        cliente.setNome(txtnome.getText().trim());
        cliente.setNif(txtnif.getText().trim());
        cliente.setTelefone(txttelefone.getText().trim());
        cliente.setEmail(txtemail.getText().trim());
        
        viatura.setMatricula(txtmatricula.getText().trim());
        viatura.setMarca(txtmarca.getText().trim());
        viatura.setModelo(txtmodelo.getText().trim());
        viatura.setPreco(txtpreco.getText().trim());
        
        String retoma = "0";
        if(jCBretoma.isSelected()==true){
            if((control.validarPreco(txtretoma.getText())==true)){
                retoma = txtretoma.getText();
                bdados.gravarFicheiroVendas(cliente, viatura, retoma);
            }
        }else
            bdados.gravarFicheiroVendas(cliente, viatura, retoma);
    }//GEN-LAST:event_jBgravarActionPerformed

    private void jBlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimparActionPerformed
        
        txtnome.setText("");
        txtnif.setText("");
        txttelefone.setText("");
        txtemail.setText("");

        txtmatricula.setText("");
        txtmarca.setText("");
        txtmodelo.setText("");
        txtpreco.setText("");
        
        txtnif.requestFocus();
    }//GEN-LAST:event_jBlimparActionPerformed

    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
        
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jBsairActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
        bdados = new BasesDados();
        bdados.lerFicheiroClientes();
        bdados.lerFicheiroViaturas();
        popularTabelaClientes();
        popularTabelaViaturas();
    }//GEN-LAST:event_formWindowActivated

    private void jCBretomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBretomaActionPerformed
        
        if(jCBretoma.isSelected()==true){
            txtretoma.setVisible(true);
        }else
            txtretoma.setVisible(false);
    }//GEN-LAST:event_jCBretomaActionPerformed

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
    
    public void popularTabelaViaturas(){
        
        listaDeViaturas = bdados.getListaDeViaturas();
        
        DefaultTableModel tabviat = (DefaultTableModel) tabelaViat.getModel();
        tabviat.setNumRows(0);
        Object linha[] = new Object[4];
        
        for (int i=0;i<listaDeViaturas.size();i++){
            linha[0] = listaDeViaturas.get(i).getMatricula();
            linha[1] = listaDeViaturas.get(i).getMarca();
            linha[2] = listaDeViaturas.get(i).getModelo(); 
            linha[3] = listaDeViaturas.get(i).getPreco();  
            tabviat.addRow(linha);
        }
    
    }
    
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBgravar;
    private javax.swing.JButton jBlimpar;
    private javax.swing.JButton jBsair;
    private javax.swing.JCheckBox jCBretoma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaCli;
    private javax.swing.JTable tabelaViat;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmatricula;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtnif;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtpreco;
    private javax.swing.JTextField txtretoma;
    private javax.swing.JTextField txttelefone;
    // End of variables declaration//GEN-END:variables
}
