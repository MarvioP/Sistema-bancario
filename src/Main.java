import entities.ContaBancaria;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        ContaBancaria minhaConta = new ContaBancaria("Adalberto Pessoa", 150.00);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n**********************");
            System.out.println("Bem-vindo(a), " + minhaConta.getNomeCliente());
            System.out.println("1 - Consultar Saldo ");
            System.out.println("2 - Realizar depósito");
            System.out.println("3 - Realizar Saque");
            System.out.println("0 - Sair");
            System.out.println("************************");
            System.out.println("Digite a opção desejada: ");

            opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Obrigado por usar nosso banco. Até logo!");
                break;
            }

            switch (opcao){
                case 1:
                    System.out.println("Seu saldo atual é: R$" +minhaConta.getSaldo());
                    break;
                case 2:
                    System.out.println("Digite o valor do depósito: R$");
                    double valorDeposito = scanner.nextDouble();
                    minhaConta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.println("Digite o valor para saque: R$");
                    double valorSaque = scanner.nextDouble();
                    minhaConta.sacar(valorSaque);
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }
}