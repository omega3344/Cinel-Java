package papelaria;

public class Livro {

    private String titulo;
    private int ano;
    private double preco;

    @Override
    public String toString() {
        return "Título: " + this.titulo + "\nAno: " + this.ano + "\nPreço: " + this.preco + "\n";
    }

    public int getAnoL() {
        return ano;
    }
    public void setAnoL(int ano) {
        this.ano = ano;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}


