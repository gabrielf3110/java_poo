package model;

public class Produto {

    private Double preco;
    private String nome;
    private String tipo;
    private Integer quantidade;

    public void setPreco(double preco) {
        if(preco >= 10.00) {
            this.preco = preco;
        }
    }

    public double getPreco() {
        return this.preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setQuantidade(int quantidade) {
        if(this.quantidade != null && this.quantidade == 0) {
            return;
        }
        this.quantidade = quantidade;
    }

    public void removeQuantidade(int quantidade) {
        if(this.quantidade != null && this.quantidade == 0) {
            return;
        }
        this.quantidade = this.quantidade - quantidade;
    }

    public double getQuantidade() {
        return this.quantidade;
    }

    public String toString() {
        return "Preço: " + preco
                + "\nNome: " + nome
                + "\nTipo: " + tipo
                + "\nQuantidade: " + quantidade;
    }
}
