package model;

public class Combo {

    private ItemCombo Hamburger;
    private ItemCombo Bebida;
    private ItemCombo Sobremesa;

    public Combo(ItemCombo Hamburger, ItemCombo Bebida, ItemCombo Sobremesa)
    {
        this.Hamburger = Hamburger;
        this.Bebida = Bebida;
        this.Sobremesa = Sobremesa;
    }

    public ItemCombo getHamburger()
    {
        return Hamburger;
    }

    public ItemCombo getBebida()
    {
        return Bebida;
    }

    public ItemCombo getSobremesa()
    {
        return Sobremesa;
    }

    public double getPrecoTotal()
    {
        Double total;
        total = Hamburger.getPreco() + Bebida.getPreco() + Sobremesa.getPreco();
        return total;
    }

}
