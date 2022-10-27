
package Modelo;


public class Utilizador {
 
    String nome;
    String email;
    String password;
    String nivel;
    
    public Utilizador(String nome, String email, String password, String nivel){
        
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.nivel = nivel;
        
    }

    public Utilizador (){
        
    }
   
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getEmail() {
        return email;
    }

   
    public void setEmail(String email) {
        this.email = email;
    }

 
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }

 
    public String getNivel() {
        return nivel;
    }

    
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
 
}
