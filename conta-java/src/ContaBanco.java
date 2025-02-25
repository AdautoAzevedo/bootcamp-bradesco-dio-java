import java.util.Scanner;

import model.ContaCliente;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Olá, que bom ver você! Vamos criar sua conta?");
        System.out.println("Por favor, digite o número da Agência");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o código da Agência");
        agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite seu nome");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo que deseja depositar");
        saldo = scanner.nextDouble();
        
        ContaCliente contaCliente = new ContaCliente(numero, agencia, nomeCliente, saldo);

        System.out.println(contaCliente.toString());

        scanner.close();
    }
}
