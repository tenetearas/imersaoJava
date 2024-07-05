package desafios;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Numero da conta: ");
        String numero = terminal.nextLine();

        System.out.println("Número da agência: ");
        String agencia = terminal.nextLine();

        System.out.println("Nome cliente: ");
        String titular = terminal.nextLine();

        System.out.println("Saldo da conta: ");
        double saldo = terminal.nextDouble();

        System.out.println("Olá, " + titular + "." +  "\nObrigado por criar uma conta em nosso banco");
        System.out.println("Os dados da sua conta são: ");
        System.out.println();
        System.out.println("**************************");
        System.out.println("Conta: " + numero);
        System.out.println("Agencia: " + agencia);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("**************************");



        terminal.close();
    }
}
