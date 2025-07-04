package PraticaListas.ContaBancaria;
/*
Crie uma classe ContaBancaria com propriedades como número da conta e saldo.
Em seguida, crie uma lista de contas bancárias com diferentes saldos.
Utilize um loop para encontrar e imprimir a conta com o maior saldo.
*/

public class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }
}
