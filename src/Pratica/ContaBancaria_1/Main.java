package Pratica.ContaBancaria_1;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.depositar(2000);
        contaCorrente.sacar(3000);
        contaCorrente.sacar(300);
        contaCorrente.consultarSaldo();
        contaCorrente.cobrarTarifaMensal(50);
    }
}
