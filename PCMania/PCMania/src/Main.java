import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.println("Bem-vindo cliente!");
        System.out.println("Digite seu nome:");
        String entrada = scanner.nextLine();
        System.out.println("Digite seu cpf: ");
        long entrada2 = scanner.nextLong();
        cliente.nome = entrada;
        cliente.cpf = entrada2; // long;

        //criando computadores
        Computador computador1 = new Computador();
        computador1.marca = "Positivo";
        computador1.preco = 2300.00f;
        computador1.processador.nome = "Pentium Core i3";
        computador1.processador.capacidade = 2200;
        computador1.memoriaRAM.nome = "Memoria RAM";
        computador1.memoriaRAM.capacidade = 8;
        computador1.armazenamentoHD.nome = "HD";
        computador1.armazenamentoHD.capacidade = 500;
        computador1.sistemaOperacional.nome = "Linux Ubuntu";
        computador1.sistemaOperacional.tipo = 32;
        MemoriaUSB memoriaUSB = new MemoriaUSB();
        memoriaUSB.nome = "Pen-drive";
        memoriaUSB.capacidade = 16;
        computador1.addMemoriaUSB(memoriaUSB);

        Computador computador2 = new Computador();
        computador2.marca = "Acer";
        computador2.preco = 5800.00f;
        computador2.processador.nome = "Pentium Core i5";
        computador2.processador.capacidade = 3370;
        computador2.memoriaRAM.nome = "Memoria RAM";
        computador2.memoriaRAM.capacidade = 16;
        computador2.armazenamentoHD.nome = "HD";
        computador2.armazenamentoHD.capacidade = 1024;
        computador2.sistemaOperacional.nome = "Windows 8";
        computador2.sistemaOperacional.tipo = 64;
        MemoriaUSB memoriaUSB2 = new MemoriaUSB();
        memoriaUSB2.nome = "Pen-drive";
        memoriaUSB2.capacidade = 32;
        computador2.addMemoriaUSB(memoriaUSB2);

        Computador computador3 = new Computador();
        computador3.marca = "Vaio";
        computador3.preco = 1800.00f;
        computador3.processador.nome = "Pentium Core i7";
        computador3.processador.capacidade = 4500;
        computador3.memoriaRAM.nome = "Memoria RAM";
        computador3.memoriaRAM.capacidade = 32;
        computador3.armazenamentoHD.nome = "HD";
        computador3.armazenamentoHD.capacidade = 2048;
        computador3.sistemaOperacional.nome = "Windows 10";
        computador3.sistemaOperacional.tipo = 64;
        MemoriaUSB memoriaUSB3 = new MemoriaUSB();
        memoriaUSB3.nome = "HD Externo";
        memoriaUSB3.capacidade = 1024;
        computador3.addMemoriaUSB(memoriaUSB);

        boolean comprando = true;
        while (comprando) {
            System.out.println("Seleciona uma promoçao: ");
            System.out.println("0. Sair");
            System.out.println("1. Promoçao 1");
            System.out.println("2. Promoçao 2");
            System.out.println("3. Promoçao 3");
            break;
        }

        int userInput  =scanner.nextInt();

        switch (userInput) {
            case 0:
                comprando = false;
                System.out.println("========================================");
                System.out.println("Compra finalizada.\n");
                break;
            case 1:
                cliente.comprar(computador1);
                break;
            case 2:
                cliente.comprar(computador2);
                break;
            case 3:
                cliente.comprar(computador3);
                break;
            default:
                break;
        }


        scanner.close();

        System.out.println("Cliente: " + cliente.nome);
        System.out.println("CPF: " + cliente.cpf);
        System.out.println();
        System.out.println("PC's adquiridos: ");
        for (Computador comprado : cliente.computadoresComprados) {
            if (comprado != null)
                comprado.mostraPCConfigs();
        }
        System.out.println("Total da compra: R$" + cliente.calculaTotalCompra() + "\n");
    }
}