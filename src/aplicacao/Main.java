package aplicacao;

import entities.Operacoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operacoes op = new Operacoes();
        double numero1;
        double numero2;

        int opcao;

        do {
            String menu = """
                Digite a operação que deseja: 
                1 - Soma
                2 - Subtração
                3 - Multiplicação
                4 - Divisão
                5 - Raiz quadrada
                0 - Sair""";
            System.out.println(menu);

            opcao = sc.nextInt();

            if (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4) {
                System.out.println("Digite o primeiro número: ");
                numero1 = sc.nextDouble();
                System.out.println("Digite o segundo número: ");
                numero2 = sc.nextDouble();
            } else if (opcao == 5) {
                System.out.println("Digite o número: ");
                numero1 = sc.nextDouble();
                numero2 = 0; // apenas para evitar erro de variável não inicializada
            } else {
                continue; // continua o loop sem executar operações caso a opção seja inválida
            }

            switch (opcao) {
                case 1 -> System.out.println("Resultado: " + op.soma(numero1, numero2));
                case 2 -> System.out.println("Resultado: " + op.subtrai(numero1, numero2));
                case 3 -> System.out.println("Resultado: " + op.multiplica(numero1, numero2));
                case 4 -> System.out.println("Resultado: " + op.divide(numero1, numero2));
                case 5 -> System.out.println("Resultado: " + op.raizQuadrada(numero1));
            }

        } while (opcao != 0);

        sc.close();
        System.out.println("Programa encerrado.");
    }
}
