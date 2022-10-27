
package Dados;


import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import Modelo.Cliente;
import Modelo.Viatura;
import Modelo.Utilizador;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
        

public class BasesDados {
    
   Viatura viatura;
   Cliente cliente;
   Utilizador utilizador;
   ArrayList<Cliente> listaDeClientes = new ArrayList();
   ArrayList<Viatura> listaDeViaturas = new ArrayList();
   ArrayList<Utilizador> listaDeUtilizadores = new ArrayList();

   
   public BasesDados(){
        
    }

    public ArrayList<Utilizador> getListaDeUtilizadores() {
        return listaDeUtilizadores;
    }

    public void setListaDeUtilizadores(ArrayList<Utilizador> listaDeUtilizadores) {
        this.listaDeUtilizadores = listaDeUtilizadores;
    }

    public ArrayList<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }

    public void setListaDeClientes(ArrayList<Cliente> listaDeClientes) {
        this.listaDeClientes = listaDeClientes;
    }

    public ArrayList<Viatura> getListaDeViaturas() {
        return listaDeViaturas;
    }

    public void setListaDeViaturas(ArrayList<Viatura> listaDeViaturas) {
        this.listaDeViaturas = listaDeViaturas;
    }
    
    
    public void gravarFicheiroVendas(Cliente cliente, Viatura viatura, String retoma) {
                 
        verificarExiste("vendas.txt");
        
        try{        
            FileWriter fw = new FileWriter("vendas.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(cliente.getNome());
            pw.println(cliente.getNif());
            pw.println(cliente.getTelefone());
            pw.println(cliente.getEmail());
            pw.println(viatura.getMatricula());
            pw.println(viatura.getMarca());
            pw.println(viatura.getModelo());
            pw.println(viatura.getPreco());
            pw.println(retoma);
            pw.flush();
            pw.close();
            fw.close();
        
       } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Venda registada!");
}
    
    public void gravarFicheiroUtilizadores(){
     
        verificarExiste("utilizadores.txt");
        
        try{        
            FileWriter fw = new FileWriter("utilizadores.txt", false);
            PrintWriter pw = new PrintWriter(fw);
            for(int i=0;i<listaDeUtilizadores.size();i++){
                pw.println(listaDeUtilizadores.get(i).getNome());
                pw.println(listaDeUtilizadores.get(i).getPassword());
                pw.println(listaDeUtilizadores.get(i).getEmail());
                pw.println(listaDeUtilizadores.get(i).getNivel());   
            }
            pw.flush();
            pw.close();
            fw.close();
        
       } catch (IOException ex) {
            Logger.getLogger(Utilizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void gravarFicheiroClientes(){
        
        verificarExiste("clientes.txt");
         
        try{        
            FileWriter fw = new FileWriter("clientes.txt", false);
            PrintWriter pw = new PrintWriter(fw);
            for(int i=0;i<listaDeClientes.size();i++){
                pw.println(listaDeClientes.get(i).getNif());
                pw.println(listaDeClientes.get(i).getNome());
                pw.println(listaDeClientes.get(i).getEmail());
                pw.println(listaDeClientes.get(i).getTelefone());   
            }
            pw.flush();
            pw.close();
            fw.close();
        
       } catch (IOException ex) {
            Logger.getLogger(Utilizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void gravarFicheiroViaturas(){
        
        verificarExiste("viaturas.txt");
         
        try{        
            FileWriter fw = new FileWriter("viaturas.txt", false);
            PrintWriter pw = new PrintWriter(fw);
            for(int i=0;i<listaDeViaturas.size();i++){
                pw.println(listaDeViaturas.get(i).getMatricula());
                pw.println(listaDeViaturas.get(i).getMarca());
                pw.println(listaDeViaturas.get(i).getModelo());
                pw.println(listaDeViaturas.get(i).getPreco());   
            }
            pw.flush();
            pw.close();
            fw.close();
        
       } catch (IOException ex) {
            Logger.getLogger(Utilizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void lerFicheiroUtilizadores(){
    
        String arquivo = "utilizadores.txt";
        
        verificarExiste(arquivo);
        
        List<String> texto = lerFicheiro(arquivo);
    
        for(int i=0;i<(texto.size()/4);i++){
          
          Utilizador utilizador = new Utilizador();

          utilizador.setNome(texto.get(i*4));
          utilizador.setPassword(texto.get(i*4+1));
          utilizador.setEmail(texto.get(i*4+2));
          utilizador.setNivel(texto.get(i*4+3));
      
        listaDeUtilizadores.add(utilizador);          
      }    
    
    } 
    
    public void lerFicheiroClientes(){
    
        String arquivo = "clientes.txt";
        
        verificarExiste(arquivo);
        
        List<String> texto = lerFicheiro(arquivo);
    
        for(int i=0;i<(texto.size()/4);i++){
          
          Cliente cliente = new Cliente();

          cliente.setNif(texto.get(i*4));
          cliente.setNome(texto.get(i*4+1));
          cliente.setEmail(texto.get(i*4+2));
          cliente.setTelefone(texto.get(i*4+3));
      
        listaDeClientes.add(cliente);          
      }    
    
    } 
     
    public void lerFicheiroViaturas(){
    
        String arquivo = "viaturas.txt";
        
        verificarExiste(arquivo);
        
        List<String> texto = lerFicheiro(arquivo);
        
        for(int i=0;i<(texto.size()/4);i++){
          
          Viatura viatura = new Viatura();

          viatura.setMatricula(texto.get(i*4));
          viatura.setMarca(texto.get(i*4+1));
          viatura.setModelo(texto.get(i*4+2));
          viatura.setPreco(texto.get(i*4+3));
      
          listaDeViaturas.add(viatura); 
        }
      }    
    
    
    public void verificarExiste(String arquivo){
 
        try {
            File fich = new File (arquivo);
            if(!fich.exists())
            fich.createNewFile();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();  
        }
    
    }  
 
    public List<String> lerFicheiro(String arquivo){
        
        List<String> texto = new ArrayList(); 
        
        try(BufferedReader ficheiro = new BufferedReader(new FileReader(arquivo))){
                String linha;
                while ((linha = ficheiro.readLine()) != null) {
                    texto.add(linha);
                }
            } catch (IOException er) {
                JOptionPane.showMessageDialog(null, er.getMessage());
                er.printStackTrace();
            }  
        return texto;
    }
    
    public void criarPdf(String nomeLista){
        
        if(nomeLista=="utilizadores.txt")
            criarPdfUtilizadores(nomeLista);
        if(nomeLista=="clientes.txt")
            criarPdfClientes(nomeLista);
        if(nomeLista=="viaturas.txt")
            criarPdfViaturas(nomeLista);
        if(nomeLista=="vendas.txt")
            criarPdfVendas(nomeLista);    
    }
    
    public void criarPdfUtilizadores(String nomeLista){
                
        verificarExiste(nomeLista);
        
        List<String> texto = lerFicheiro(nomeLista);
        
         if(texto.size()!=0){
        
        Document listagem = new Document();
           
        try {

            PdfWriter.getInstance(listagem, new FileOutputStream("utilizadores.pdf"));
            listagem.open();
            
            for(int i=0;i<(texto.size()/4);i++){ 
                listagem.add(new Paragraph("Nome: "+texto.get(i*4)));
                listagem.add(new Paragraph("Password: "+texto.get(i*4+1)));
                listagem.add(new Paragraph("Email: "+texto.get(i*4+2)));
                listagem.add(new Paragraph("Nivel: "+texto.get(i*4+3))); 
                listagem.add(new Paragraph(" "));
            }
        } catch(DocumentException de) {
            JOptionPane.showMessageDialog(null, de.getMessage());
                de.printStackTrace();
        } catch(IOException ioe) {
            JOptionPane.showMessageDialog(null, ioe.getMessage());
                ioe.printStackTrace();
        } finally {
            JOptionPane.showMessageDialog(null,"Ficheiro PDF criado!");
            listagem.close();
        } 
        }else
            JOptionPane.showMessageDialog(null,"O ficheiro está vazio!");
    }
    
    public void criarPdfClientes(String nomeLista){
                
        verificarExiste(nomeLista);
        
        List<String> texto = lerFicheiro(nomeLista);
        
        if(texto.size()!=0){
            
        Document listagem = new Document();
           
        try {

            PdfWriter.getInstance(listagem, new FileOutputStream("clientes.pdf"));
            listagem.open();
            
            for(int i=0;i<(texto.size()/4);i++){ 
                listagem.add(new Paragraph("Nif: "+texto.get(i*4)));
                listagem.add(new Paragraph("Nome: "+texto.get(i*4+1)));
                listagem.add(new Paragraph("Email: "+texto.get(i*4+2)));
                listagem.add(new Paragraph("Telefone: "+texto.get(i*4+3))); 
                listagem.add(new Paragraph(" "));
            }
        } catch(DocumentException de) {
            JOptionPane.showMessageDialog(null, de.getMessage());
                de.printStackTrace();
        } catch(IOException ioe) {
            JOptionPane.showMessageDialog(null, ioe.getMessage());
                ioe.printStackTrace();
        } finally {
            JOptionPane.showMessageDialog(null,"Ficheiro PDF criado!");
            listagem.close();
        }
        }else
            JOptionPane.showMessageDialog(null,"O ficheiro está vazio!");
       
    }
    
    public void criarPdfViaturas(String nomeLista){
                
        verificarExiste(nomeLista);
        
        List<String> texto = lerFicheiro(nomeLista);
        
        if(texto.size()!=0){
        
        Document listagem = new Document();
           
        try {

            PdfWriter.getInstance(listagem, new FileOutputStream("viaturas.pdf"));
            listagem.open();
            
            for(int i=0;i<(texto.size()/4);i++){ 
                listagem.add(new Paragraph("Matricula: "+texto.get(i*4)));
                listagem.add(new Paragraph("Marca: "+texto.get(i*4+1)));
                listagem.add(new Paragraph("Modelo: "+texto.get(i*4+2)));
                listagem.add(new Paragraph("Preco: "+texto.get(i*4+3))); 
                listagem.add(new Paragraph(" "));
            }
        } catch(DocumentException de) {
            JOptionPane.showMessageDialog(null, de.getMessage());
                de.printStackTrace();
        } catch(IOException ioe) {
            JOptionPane.showMessageDialog(null, ioe.getMessage());
                ioe.printStackTrace();
        } finally {
            JOptionPane.showMessageDialog(null,"Ficheiro PDF criado!");
            listagem.close();
        }
        }else
            JOptionPane.showMessageDialog(null,"O ficheiro está vazio!");        
    }
    
   public void criarPdfVendas(String nomeLista){
                
        verificarExiste(nomeLista);
        
        List<String> texto = lerFicheiro(nomeLista);
        
         if(texto.size()!=0){
        
        Document listagem = new Document();
           
        try {

            PdfWriter.getInstance(listagem, new FileOutputStream("vendas.pdf"));
            listagem.open();
            
            for(int i=0;i<(texto.size()/9);i++){ 
                listagem.add(new Paragraph("Nome: "+texto.get(i*9)));
                listagem.add(new Paragraph("NIF: "+texto.get(i*9+1)));
                listagem.add(new Paragraph("Telefone: "+texto.get(i*9+2)));
                listagem.add(new Paragraph("Email: "+texto.get(i*9+3))); 
                listagem.add(new Paragraph("Matricula: "+texto.get(i*9+4)));
                listagem.add(new Paragraph("Marca: "+texto.get(i*9+5)));
                listagem.add(new Paragraph("Modelo: "+texto.get(i*9+6)));
                listagem.add(new Paragraph("Preço: "+texto.get(i*9+7))); 
                listagem.add(new Paragraph("Valor retoma: "+texto.get(i*9+8)));  
                listagem.add(new Paragraph(" "));
            }
        } catch(DocumentException de) {
            JOptionPane.showMessageDialog(null, de.getMessage());
                de.printStackTrace();
        } catch(IOException ioe) {
            JOptionPane.showMessageDialog(null, ioe.getMessage());
                ioe.printStackTrace();
        } finally {
            JOptionPane.showMessageDialog(null,"Ficheiro PDF criado!");
            listagem.close();
        } 
        }else
            JOptionPane.showMessageDialog(null,"O ficheiro está vazio!");
    }
}

