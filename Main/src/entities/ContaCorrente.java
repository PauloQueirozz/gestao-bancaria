package entities;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, String numero, double saldo, double limiteChequeEspecial) {
        super(titular, numero, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Limite Cheque: " + this.limiteChequeEspecial);
    }

    public void mostrarDados(boolean detalharLimite){
        super.mostrarDados();
        if(detalharLimite){
            System.out.println("Saldo total (com limite): " + (this.limiteChequeEspecial + getSaldo()));
        } else {
            super.mostrarDados();
        }
    }
}
