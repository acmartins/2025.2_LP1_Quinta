import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(1);
        conta.setTitular("Alexandre Chaves Martins");
        conta.setSaldo(0.00);

        ContaBancaria contaDestino = new ContaBancaria();
        contaDestino.setNumeroConta(2);
        contaDestino.setTitular("Luana Patricia");
        contaDestino.setSaldo(1000.00);

        double valorTransacao;
        double resultado;

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {

            valorTransacao = 0.00;
            resultado = 0.00;
            opcao = 0;

            System.out.printf("%nSelecione a transação:%n");
            System.out.println("----------------------");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.print("0 - para encerrar: ");
            opcao = sc.nextInt();

            if (opcao > 4) {
                System.out.println("Você digitou uma opção inválida. Redigite!");
            } else {

                if (opcao > 0) {

                    switch (opcao) {
                        case 1: // Exibir saldo
                            System.out.printf("%nO saldo da conta bancária é: %.2f%n", conta.getSaldo());
                            break;
                        case 2: // Realizar depósito
                            System.out.print("Informe o valor do depósito: ");
                            valorTransacao = sc.nextDouble();
                            System.out.printf("%nO saldo da conta bancária atualizado é: %.2f%n", conta.depositar(valorTransacao));
                            break;
                        case 3: // Saques
                            System.out.print("Informe o valor do saque: ");
                            valorTransacao = sc.nextDouble();

                            resultado = conta.sacar(valorTransacao);

                            if (resultado == -1.0) {
                                System.out.printf("%nTransação não pode ser realizada. Saldo insuficiente%n");
                            } else {
                                System.out.printf("%nO saldo da conta bancária atualizado é: %.2f%n", resultado);
                                }
                            break;
                        case 4: // Transferências
                            System.out.print("Informe o valor da transferência: ");
                            valorTransacao = sc.nextDouble();

                            resultado = conta.sacar(valorTransacao);

                            if (resultado == -1.0) {
                                System.out.printf("%nTransação não pode ser realizada. Saldo insuficiente%n");
                            } else {
                                contaDestino.depositar(valorTransacao);
                                System.out.printf("%nExtrato de Transferência:%n");
                                System.out.printf("-----------------------------------------------%n");
                                System.out.println("Nº Conta Crédito: " + conta.getNumeroConta());
                                System.out.println("Títular: " + conta.getTitular());
                                System.out.printf("-----------------------------------------------%n");
                                System.out.printf("Saldo Anterior: %.2f%n", conta.getSaldo() + valorTransacao);
                                System.out.printf("Valor Transferência: %.2f%n", valorTransacao);
                                System.out.printf("Saldo Atual: %.2f%n", conta.getSaldo());
                                System.out.printf("-----------------------------------------------%n");
                                System.out.println("Nº Conta Dédito: " + contaDestino.getNumeroConta());
                                System.out.println("Títular: " + contaDestino.getTitular());
                                System.out.printf("-----------------------------------------------%n");
                                System.out.printf("Saldo Anterior: %.2f%n", contaDestino.getSaldo() - valorTransacao);
                                System.out.printf("Valor Transferência: %.2f%n", valorTransacao);
                                System.out.printf("Saldo Atual: %.2f%n", contaDestino.getSaldo());

                            }
                            break;
                    }


                }

            }

        } while (opcao != 0);

    }
}