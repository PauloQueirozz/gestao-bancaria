import entities.Conta;
import entities.ContaCorrente;
import entities.ContaInvestimento;
import entities.ContaPoupanca;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Conta> listaContas = new ArrayList<>();

        while (true) {
            System.out.println("======================SISTEMA DE GESTÃO BANCÁRIA======================");

            System.out.println("1 → Conta Corrente \n2 → Conta Poupança \n3 → Conta Investimento \n0 → Encerrar o programa");
            int opcoes = input.nextInt();

            if (opcoes == 0) {
                break;
            }

            System.out.println("Nome do titular: ");
            String nomeTitular = input.next();

            input.nextLine();

            System.out.println("Número da conta: ");
            String numeroConta = input.nextLine();

            System.out.println("Saldo: ");
            double saldoConta = input.nextDouble();

            switch (opcoes) {
                case 1:
                    System.out.println("Limite do cheque especial: ");
                    double limiteChequeEspecial = input.nextDouble();

                    ContaCorrente contaCorrente = new ContaCorrente(nomeTitular, numeroConta, saldoConta, limiteChequeEspecial);
                    listaContas.add(contaCorrente);
                    break;

                case 2:
                    System.out.println("Taxa de rendimento mensal: ");
                    double taxaRendimentoMensal = input.nextDouble();

                    ContaPoupanca contaPoupanca = new ContaPoupanca(nomeTitular,  numeroConta, saldoConta, taxaRendimentoMensal);
                    listaContas.add(contaPoupanca);
                    break;

                case 3:
                    System.out.println("Taxa de admnistração: ");
                    double taxaAdministracao =  input.nextDouble();

                    ContaInvestimento contaInvestimento = new ContaInvestimento(nomeTitular, numeroConta, saldoConta, taxaAdministracao);
                    listaContas.add(contaInvestimento);
                    break;

            }

            System.out.println("Continuar: [s/n] ");
            String continuar = input.next();
            if (continuar.equals("n")) {
                System.out.println("==========Contas Cadastradas==========");
                for  (Conta conta : listaContas) {
                    conta.mostrarDados();
                }
                break;
            }
        }
    }
}
