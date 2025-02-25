package model;

public class ContaCliente {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public ContaCliente (int numero, String agencia, String nomeCliente, double saldo) {
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String toString() {
        return "Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia + ", conta " + this.numero + " e seu saldo " + this.saldo + " já está disponível para saque";
    }
}
