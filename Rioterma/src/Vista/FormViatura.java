
package Vista;

import Control.Control;
import Dados.BasesDados;
import Modelo.Viatura;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormViatura extends javax.swing.JFrame {

    private FormMenu menu;
    private Viatura viatura;
    private BasesDados bdados;
    private Control control;
    private ArrayList<Viatura> listaDeViaturas = new ArrayList();

    public FormViatura(FormMenu menurec){
        initComponents();
        menu = menurec;
        bdados = new BasesDados();
    }
   
    public FormViatura() {
        control = new Control();
    }
  
    public Viatura getViatura() {
        return viatura;
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
        tabelaViat = new javax.swing.JTable();
        txtmodelo = new javax.swing.JTextField();
        txtpreco = new javax.swing.JTextField();
        jBinserir = new javax.swing.JButton();
        jBapagar = new javax.swing.JButton();
        jBsair = new javax.swing.JButton();
        txtmatricula = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(840, 580));
        setPreferredSize(new java.awt.Dimension(840, 580));
        setResizable(false);
        setSize(new java.awt.Dimension(840, 580));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel2.setText("MENU VIATURA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 310, -1));

        jLabel3.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel3.setText("MODELO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 110, -1));

        jLabel4.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel4.setText("MATRICULA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 140, -1));

        jLabel5.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel5.setText("PREÇO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 110, -1));

        jLabel6.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel6.setText("MARCA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 140, -1));

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

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
        jScrollPane1.setViewportView(tabelaViat);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 850, 120));

        txtmodelo.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txtmodelo.setForeground(new java.awt.Color(51, 51, 51));
        txtmodelo.setBorder(null);
        getContentPane().add(txtmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 290, -1));

        txtpreco.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txtpreco.setForeground(new java.awt.Color(51, 51, 51));
        txtpreco.setBorder(null);
        getContentPane().add(txtpreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 190, -1));

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

        txtmatricula.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txtmatricula.setForeground(new java.awt.Color(51, 51, 51));
        txtmatricula.setBorder(null);
        getContentPane().add(txtmatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 290, -1));

        txtmarca.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txtmarca.setForeground(new java.awt.Color(51, 51, 51));
        txtmarca.setBorder(null);
        getContentPane().add(txtmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 290, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Utilizador\\Documents\\NetBeansProjects\\standRioterma\\src\\main\\java\\Vista\\imagens\\porsche911.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaViatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaViatMouseClicked

        if(tabelaViat.getSelectedRow()!= -1){
            txtmatricula.setText(tabelaViat.getValueAt(tabelaViat.getSelectedRow(),0).toString());
            txtmarca.setText(tabelaViat.getValueAt(tabelaViat.getSelectedRow(),1).toString());
            txtmodelo.setText(tabelaViat.getValueAt(tabelaViat.getSelectedRow(),2).toString());
            txtpreco.setText(tabelaViat.getValueAt(tabelaViat.getSelectedRow(),3).toString());
        }
    }//GEN-LAST:event_tabelaViatMouseClicked

    private void jBinserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBinserirActionPerformed

        Viatura viatura = new Viatura();
        control = new Control();
                
        viatura.setMatricula(txtmatricula.getText().trim());
        viatura.setMarca(txtmarca.getText().trim());
        viatura.setModelo(txtmodelo.getText().trim());
        viatura.setPreco(txtpreco.getText().trim());
       
        if((control.validarMatricula(viatura.getMatricula())==true)
            &&(control.validarTexto(viatura.getMarca())==true)
            &&(control.validarTexto(viatura.getModelo())==true)
            &&(control.validarPreco(viatura.getPreco())==true)){
                bdados.getListaDeViaturas().add(viatura);
        
                DefaultTableModel tabviat = (DefaultTableModel) tabelaViat.getModel();
                Object linha[] = new Object[4];
        
                    linha[0] = viatura.getMatricula();
                    linha[1] = viatura.getMarca();
                    linha[2] = viatura.getModelo();
                    linha[3] = viatura.getPreco();
                    tabviat.addRow(linha);
               
        limparCampos();

        txtmatricula.requestFocus();
        }
                    }//GEN-LAST:event_jBinserirActionPerformed

    private void jBapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBapagarActionPerformed

        if(tabelaViat.getSelectedRow()!= -1){
            listaDeViaturas.remove(tabelaViat.getSelectedRow());
            ((DefaultTableModel) tabelaViat.getModel()).removeRow(tabelaViat.getSelectedRow());
        }else{
            JOptionPane.showMessageDialog(null,"Selecione a linha a excluir");
        }
        
        limparCampos();
    }//GEN-LAST:event_jBapagarActionPerformed

    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
        
        bdados.gravarFicheiroViaturas();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jBsairActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        bdados = new BasesDados();
        bdados.lerFicheiroViaturas();
        popularTabelaViaturas();
    }//GEN-LAST:event_formWindowActivated

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

    public void limparCampos(){
        
        txtmatricula.setText("");
        txtmarca.setText("");
        txtmodelo.setText("");
        txtpreco.setText("");  
    }
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormViatura().setVisible(true);
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
    private javax.swing.JTable tabelaViat;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmatricula;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtpreco;
    // End of variables declaration//GEN-END:variables
}
