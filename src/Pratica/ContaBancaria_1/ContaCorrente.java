package Pratica.ContaBancaria_1;

public class ContaCorrente extends ContaBancaria{
    public void cobrarTarifaMensal(double tarifa){
        saldo -= tarifa;

        System.out.println("Tarifa de R$ " + tarifa + " foi descontada mensalmente" + "\n" +
                "Saldo atual de R$ " + getSaldo());
    }
}
