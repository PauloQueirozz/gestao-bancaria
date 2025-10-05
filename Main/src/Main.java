import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nome do titular: ");
        String nomeTitular = input.nextLine();

        System.out.println("Número da conta: ");
        String numeroConta = input.nextLine();

        System.out.println("Saldo: ");
        double saldoConta = input.nextDouble();

        // System.out.println("Limite do cheque especial: ");
        // double limiteChequeEspecial = input.nextDouble();

        System.out.println("Taxa de rendimento mensal: ");
        double taxaRendimentoMensal = input.nextDouble();

        // Conta conta = new Conta(nomeTitular, numeroConta, saldoConta);
        // ContaCorrente contaCorrente = new ContaCorrente(nomeTitular, numeroConta, saldoConta, limiteChequeEspecial);
        ContaPoupanca contaPoupanca = new ContaPoupanca(nomeTitular, numeroConta, saldoConta, taxaRendimentoMensal);
        contaPoupanca.mostrarDados(true);

    }
}
