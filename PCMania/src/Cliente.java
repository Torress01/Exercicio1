public class Cliente {
    public String nome;
    public long cpf;
    public Computador[] computadoresComprados = new Computador[10];


    public float calculaTotalCompra() {
        float totalGasto = 0.0f;
        for (Computador comprado : computadoresComprados) {
            if (comprado != null)
                totalGasto += comprado.preco;
        }
        return totalGasto;
    }

    public void comprar(Computador computador) {
        for (int i = 0; i < computadoresComprados.length; i++) {
            if (computadoresComprados[i] == null) {
                computadoresComprados[i] = computador;
                System.out.println("\nCompra efetuada com sucesso.\n");
                return;
            }
        }
        System.out.println("Limite de compra atingido.");
    }
}

