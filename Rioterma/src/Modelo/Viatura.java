
package Modelo;


public class Viatura {
     
    String matricula;
    String marca;
    String modelo;
    String preco;

   public Viatura(String matricula, String marca, String modelo, String preco) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public Viatura() {
        
    }
  
    public String getMatricula() {
        return matricula;
    }

  
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

 
    public String getMarca() {
        return marca;
    }

   
    public void setMarca(String marca) {
        this.marca = marca;
    }

  
    public String getModelo() {
        return modelo;
    }

   
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

  
    public String getPreco() {
        return preco;
    }

  
    public void setPreco(String preco) {
        this.preco = preco;
    }
}
