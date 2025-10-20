package model;

public class Hamburger implements ItemCombo{

    String nome;
    Double preco;

    public Hamburger(String nome, Double preco) 
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
