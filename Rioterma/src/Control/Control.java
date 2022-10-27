
package Control;

import Modelo.Utilizador;
import Vista.FormLogin;
import Dados.BasesDados;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;



public class Control {

    private FormLogin formlogin;
    private BasesDados bdados;
    private ArrayList<Utilizador> listaDeUtilizadores = new ArrayList();
    
    public Control(FormLogin formloginrec){
        this.formlogin = formloginrec;   
    }
       
    public Control(){
        
    }
    
    public boolean entrarAplicacao(){
        
        String nome = formlogin.getTxtutilizador().getText();
        String senha = formlogin.getTxtpassword().getPassword().toString();
        
        Utilizador utilizador = new Utilizador();
        utilizador.setNome(nome);
        utilizador.setPassword(senha);
        
        
        bdados = new BasesDados();
        
        bdados.lerFicheiroUtilizadores();
        verificarLogin(nome,senha);
        if(verificarLogin(nome,senha)==false){   
            return false;
        }
        return true;           
    }   
    
     public boolean verificarLogin (String nome, String senha){
         
        listaDeUtilizadores = bdados.getListaDeUtilizadores();
        
        for(int i=0;i<listaDeUtilizadores.size();i++){
                if(listaDeUtilizadores.get(i).getNome().equals(nome)&&
                        (listaDeUtilizadores.get(i).getPassword().equals(senha))==true)            
                return true;         
        }
        return false;
    }
 
    public boolean validarNIF(String nif) {
        
        int max=9;
        if (!nif.matches("[0-9]+") || nif.length()!=max){
            JOptionPane.showMessageDialog(null, "NIF inválido!");
            return false;
        }
        int checkSum=0;
        for (int i=0; i<max-1; i++){
            checkSum+=(nif.charAt(i)-'0')*(max-i);
        }
        int checkDigit=11-(checkSum % 11);
        if (checkDigit>9) checkDigit=0;
        if(checkDigit==nif.charAt(max-1)-'0'==false){
            JOptionPane.showMessageDialog(null, "NIF inválido!");
            return false;
        }else return true;
    }

    public boolean validarPreco(String str){
        
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Entrada numérica inválida!");
        }
            return false;
    }
    
    public boolean validarEmail(String email) {
   
    if (email != null && email.length() > 0) {
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        }
    }
    JOptionPane.showMessageDialog(null, "Email inválido!");
    return false;
}
    
    public boolean validarTelefone(String telefone) {
        
        if (!telefone.matches("[0-9]+") || telefone.length()!=9){
            JOptionPane.showMessageDialog(null, "Telefone inválido!");
            return false;
        }else{
            return true;
        }
}
    
    public boolean validarTexto(String txt) {
        
        txt = txt.replace(" ", "");
        if ((txt.length()<=1)||(txt.length()>35)||(!txt.matches("[a-zA-Z]+"))){
            JOptionPane.showMessageDialog(null, "Entrada de texto inválida!");
            return false;
        }else{
            return true;
        }
    }
    
    public boolean validarMatricula(String txt) {
        
        if ((!txt.matches("[A-Z]{2} \\d{2} [A-Z]{2}"))||(!txt.matches("\\d{2}-[A-Z]{2}-\\d{2}"))){
            JOptionPane.showMessageDialog(null, "Matrícula inválida!");
            return false;
        }else{
            return true;
        }
    } 
    
}
