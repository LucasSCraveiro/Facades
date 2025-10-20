package model;

public class Bebida implements ItemCombo{

    String nome;
    Double preco;

    public Bebida(String nome, Double preco) 
    {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() 
    {
        return nome;
    }

    @Override
    public Double getPreco()
    {
        return preco;
    }

    @Override
    public String toString() 
    {
        return String.format("%s (R$ %.2f)", nome, preco);
    }

}
