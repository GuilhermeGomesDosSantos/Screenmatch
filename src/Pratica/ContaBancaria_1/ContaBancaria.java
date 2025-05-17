package Pratica.ContaBancaria_1;
/*
Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo().
Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria.
Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
*/
public class ContaBancaria {
    protected double saldo;

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valorDepositar){
        saldo += valorDepositar;
    }

    public void sacar(double valorSacar){

        if (valorSacar > saldo) {
            System.out.println("Não é possivel realizar a operação");
        } else {
            saldo -= valorSacar;
            System.out.println("Valor enviado com sucesso");
        }
    }

    public void consultarSaldo(){
        System.out.println("O saldo é de R$ " + getSaldo());
    }
}
