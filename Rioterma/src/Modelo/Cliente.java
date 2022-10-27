
package Modelo;


public class Cliente {
   
    String nif;
    String nome;
    String telefone;
    String email;

   public Cliente(String nif, String nome, String telefone, String email) {
        this.nif = nif;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
   
    public Cliente() {
      
    }
    
    public String getNif() {
        return nif;
    }

  
    public void setNif(String nif) {
        this.nif = nif;
    }

 
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getTelefone() {
        return telefone;
    }

    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

  
    public String getEmail() {
        return email;
    }

  
    public void setEmail(String email) {
        this.email = email;
    } 
}
