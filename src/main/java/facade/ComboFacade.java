package facade;

import model.Bebida;
import model.Combo;
import model.Hamburger;
import model.Sobremesa;

public class ComboFacade {

    private Combo combo;

    public void criarCombo(int codigo)
    {
        Hamburger h;
        Bebida b;
        Sobremesa s;
        switch (codigo)
        {
            case 1:
                h = new Hamburger("Big Cheddar", 18.0);
                b = new Bebida("Coca-Cola", 8.0);
                s = new Sobremesa("Sundae", 9.9);
                combo = new Combo(h, b, s);
                break;
            case 2:
                h = new Hamburger("Mega Bacon", 16.0);
                b = new Bebida("Guaraná", 7.5);
                s = new Sobremesa("Torta de Maçã", 9.0);
                combo = new Combo(h, b, s);
                break;
            case 3:
                h = new Hamburger("Mini burguer", 12.0);
                b = new Bebida("Suco de Laranja", 6.0);
                s = new Sobremesa("Sorvete", 4.9);
                combo = new Combo(h, b, s);
                break;
            default:
                System.out.println("Código de combo inválido!");
                break;
        }
    }

    public void exibirItens()
    {
        if (combo == null)
        {
            System.out.println("Nenhum combo criado ainda!");
            return;
        }
        System.out.println("\n=== Detalhes do Pedido ===");
        System.out.println(combo.getHamburger().toString());
        System.out.println(combo.getBebida().toString());
        System.out.println(combo.getSobremesa().toString());
        System.out.println("==========================");
    }

    public double getPrecoTotal()
    {
        return combo.getPrecoTotal();
    }
}
