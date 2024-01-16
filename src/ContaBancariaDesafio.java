import java.util.Scanner;

public class ContaBancariaDesafio {
    public static void main(String[] args) {

        String nomeTitular = "Vitoria Oliveira";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.50;

        String ResumoGeral = """
                %n
                *******************************************
                Dados iniciais do cliente: %s
                Tipo de conta: %s
                Saldo Inicial: %.2f
                *******************************************
                """.formatted(nomeTitular, tipoConta, saldoInicial);

        System.out.println(ResumoGeral);
        System.out.println("\nOlá, bem vindo ao Veni Bank, o que deseja fazer hoje?\n");

        String menu = """
                1 - Consultar saldo
                2 - Depósito
                3 - Saque
                4 - Sair
                """;
        int opcao = 0;
        while (opcao != 4) {
            System.out.println(menu);
            Scanner leitura = new Scanner(System.in);
            opcao = leitura.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(saldoInicial);
                    break;
                case 2:
                    System.out.println("Quanto deseja depositar?");
                    double valorDeposito = leitura.nextDouble();
                    if (valorDeposito > 0) {
                        saldoInicial += valorDeposito;
                        System.out.println("Saldo atualizado para " + saldoInicial);
                    } else {
                        System.out.println("Valor de depósito inválido");
                    }
                    break;
                case 3:
                    System.out.println("Quando deseja sacar?");
                    double valorSaque = leitura.nextDouble();
                    if (valorSaque < saldoInicial && valorSaque > 0) {
                        saldoInicial -= valorSaque;
                        System.out.println("Saldo atualizado para " + saldoInicial);
                        break;
                    } else if (valorSaque > saldoInicial) {
                        System.out.println("Você não possui esse valor disponível para saque.");
                        break;
                    } else {
                        System.out.println("Valor do saque inválido.Digite algo maior que 0");
                        break;
                    }
                case 4:
                    System.out.println("Até a próxima!");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
