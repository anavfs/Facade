class Produto {
    private final String descricao;
    private final double preco;

    public Produto(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }
}

class Burguer extends Produto {
    public Burguer(int gramas) {
        super("Burguer", calcularPrecoBurguer(gramas));
    }

    private static double calcularPrecoBurguer(int gramas) {
        if (gramas <= 200) {
            return 10.0;
        } else if (gramas <= 300) {
            return 15.0;
        } else {
            return 20.0;
        }
    }
}

class Sobremesa extends Produto {
    public Sobremesa(String tamanho) {
        super("Sobremesa", calcularPrecoSobremesa(tamanho));
    }

    private static double calcularPrecoSobremesa(String tamanho) {
        if (tamanho.equalsIgnoreCase("Pequena")) {
            return 5.0;
        } else if (tamanho.equalsIgnoreCase("Média")) {
            return 7.0;
        } else if (tamanho.equalsIgnoreCase("Grande")) {
            return 10.0;
        }
        return 0.0;
    }
}

class Bebida extends Produto {
    public Bebida(int ml) {
        super("Bebida", calcularPrecoBebida(ml));
    }

    private static double calcularPrecoBebida(int ml) {
        if (ml <= 300) {
            return 3.0;
        } else if (ml <= 500) {
            return 5.0;
        } else {
            return 7.0;
        }
    }
}

class ProdutoFactory {
    public Burguer criarBurguer(int gramas) {
        return new Burguer(gramas);
    }

    public Sobremesa criarSobremesa(String tamanho) {
        return new Sobremesa(tamanho);
    }

    public Bebida criarBebida(int ml) {
        return new Bebida(ml);
    }
}