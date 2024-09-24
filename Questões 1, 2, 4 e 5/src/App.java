import java.util.Scanner;

import respostas.*;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\n============TESTE DE ESTÁGIO - TARGET SISTEMAS============\n");

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu de Opções:");
            System.out.println("1 - Executar soma");
            System.out.println("2 - Verificar número na sequência de Fibonacci");
            System.out.println("3 - Inverter uma string");
            System.out.println("4 - faturamento mensal detalhado por estado");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    Incrementar.somar();
                    break;

                case 2:
                    System.out.println("Digite um número:");
                    int num = scanner.nextInt();
                    scanner.nextLine();
                    if (Fibonacci.isFibonacci(num)) {
                        System.out.println(num + " está na sequência de Fibonacci.");
                    } else {
                        System.out.println(num + " não está na sequência de Fibonacci.");
                    }
                    break;

                case 3:
                    System.out.println("Digite a frase que deseja inverter: ");
                    String original = scanner.nextLine();
                    String invertida = InverterString.inverterString(original);
                    System.out.println("String invertida---> " + invertida);
                    break;
                
                case 4:
                    FaturamentoPercentual.PercentutalPorEstado();
                    break;

                case 5:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
            System.out.println("-------------------------------------------------");
        } while (opcao != 5);

        scanner.close();

    }
}