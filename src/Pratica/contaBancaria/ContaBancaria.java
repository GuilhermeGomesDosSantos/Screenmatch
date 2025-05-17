/*
Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico).
Implemente métodos getters e setters para os atributos privados.*/

package Pratica.contaBancaria;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String titular;

    public int getNumeroConta(){
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }
}
