package PraticaListas.ContaBancaria;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ContaBancaria bank1 = new ContaBancaria(123, 4000);
        ContaBancaria bank2 = new ContaBancaria(321, 3213);
        ContaBancaria bank3 = new ContaBancaria(333, 1234);
        ContaBancaria bank4 = new ContaBancaria(431, 221);
        ContaBancaria bank5 = new ContaBancaria(121, 213);
        ContaBancaria bank6 = new ContaBancaria(127, 10213);

        ArrayList<ContaBancaria> listBank = new ArrayList<>();

        listBank.add(bank1);
        listBank.add(bank2);
        listBank.add(bank3);
        listBank.add(bank4);
        listBank.add(bank5);
        listBank.add(bank6);

        ContaBancaria maiorConta = listBank.get(0);

        for(ContaBancaria bank : listBank){
            if(bank.getSaldo() > maiorConta.getSaldo()){
                maiorConta = bank;
            }
        }
        System.out.println(String.format("A conta com o maior saldo é: N° da Conta: " + maiorConta.getNumeroConta() + ", Saldo R$:%.2f", maiorConta.getSaldo()));
    }
}
