package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	    System.out.println("Digite o número da conta: ");
	    int numeroConta = input.nextInt();
	    input.nextLine();
	    System.out.println("Digite o número da agência: ");
	    String numeroAgencia = input.nextLine();
	    System.out.println("Digite o nome do cliente: ");
	    String nomeCliente = input.nextLine();
	    System.out.println("Digite o saldo: ");
	    double saldo = input.nextDouble();
	    
	    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, "
	    		+ "conta %d e seu saldo R$%.2f", nomeCliente, numeroAgencia, numeroConta, saldo);
	    
	}

}
