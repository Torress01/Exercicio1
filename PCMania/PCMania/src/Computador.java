public class Computador {
    public String marca;
    public float preco;
    public HardwareBasico processador;
    public HardwareBasico memoriaRAM;
    public HardwareBasico armazenamentoHD;
    public SistemaOperacional sistemaOperacional;
    public MemoriaUSB memoriaUSB = null;


    public Computador() {
        this.processador = new HardwareBasico();
        this.memoriaRAM = new HardwareBasico();
        this.armazenamentoHD = new HardwareBasico();
        this.sistemaOperacional = new SistemaOperacional();
    }

    public void mostraPCConfigs() {
        System.out.println("--------------------");
        System.out.println("Processador: " + processador.nome + " | " + processador.capacidade + " Mhz");
        System.out.println("Memoria RAM: " + memoriaRAM.nome + " | " + memoriaRAM.capacidade + " GB");
        System.out.println("Armazenamento: " + armazenamentoHD.nome + " | " + armazenamentoHD.capacidade + " GB");
        System.out.println("Sistema Operacional: " + sistemaOperacional.nome + " | " + sistemaOperacional.tipo + " bits");
        if (memoriaUSB != null)
            System.out.println("Processador: " + memoriaUSB.nome + " | " + memoriaUSB.capacidade + " GB");
        System.out.println("--------------------");
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }
}
