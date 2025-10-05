package entities;

public class ContaInvestimento extends Conta {
    private double taxaAdministracao;

    public ContaInvestimento(String titular, String numero, double saldo, double taxaAdministracao) {
        super(titular, numero, saldo);
        this.taxaAdministracao = taxaAdministracao;
    }

    public double getTaxaAdministracao() {
        return taxaAdministracao;
    }

    public void setTaxaAdministracao(double taxaAdministracao) {
        this.taxaAdministracao = taxaAdministracao;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Taxa de administração: " +  this.taxaAdministracao);
    }

    public void mostrarDados(boolean considerarTaxa) {
        super.mostrarDados();
        if (considerarTaxa) {
            System.out.println("Saldo líquido: " + (getSaldo()-((getSaldo()/100)*this.taxaAdministracao)));
        } else {
            super.mostrarDados();
        }
    }
}
