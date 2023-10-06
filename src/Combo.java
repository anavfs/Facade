public class Combo {
    private Produto burguer;
    private Produto sobremesa;
    private Produto bebida;

    public void criarCombo(int tipo) {
        ProdutoFactory factory = new ProdutoFactory();

        if (tipo == 1) {
            burguer = factory.criarBurguer(300);
            sobremesa = factory.criarSobremesa("Grande");
            bebida = factory.criarBebida(500);
        } else if (tipo == 2) {
            burguer = factory.criarBurguer(200);
            sobremesa = factory.criarSobremesa("Média");
            bebida = factory.criarBebida(300);
        } else {
            System.out.println("Tipo de combo inválido.");
        }
    }

    public void mostrarItensCombo() {
        System.out.println("Itens do Combo:");
        if (burguer != null) {
            System.out.println(burguer.getDescricao() + " - R$" + burguer.getPreco());
        }
        if (sobremesa != null) {
            System.out.println(sobremesa.getDescricao() + " - R$" + sobremesa.getPreco());
        }
        if (bebida != null) {
            System.out.println(bebida.getDescricao() + " - R$" + bebida.getPreco());
        }
    }
}