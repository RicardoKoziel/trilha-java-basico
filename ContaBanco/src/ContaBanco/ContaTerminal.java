package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Por favor, digite o número da conta: ");
		int numero = leitor.nextInt();
		leitor.nextLine();
		System.out.println("Agora digite o número da Agência: ");
		String agencia = leitor.nextLine();
		System.out.println("Digite o seu nome: ");
		String nomeCliente = leitor.nextLine();
		System.out.println("Qual o saldo da sua conta? ");
		float saldo = leitor.nextFloat();
		
		System.out.println(".................. Carregando ......................");
		System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
		
		
	}

}
