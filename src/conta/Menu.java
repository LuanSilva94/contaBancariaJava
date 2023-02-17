package conta;

import java.util.Scanner;

import conta.model.Conta;

public class Menu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int option = 0;
		
		//Criamo o objeto Conta C1
		Conta c1 = new Conta(1, 123, 1, "Luan Silva", 50000.0f);
		
		//Visualizamos os dados da conta C1
		c1.visualizar();
		
		//Fizemos uma alteração no saldo de C1
		c1.setSaldo(700000.0f);
		System.out.println("saldo alterado para: \n\n" + c1.getSaldo());

		//Criamo o objeto Conta C2
		Conta c2 = new Conta(2, 123, 1, "Ivone Silva", 100000.0f);
		
		//Visualizamos a conta C2
		c2.visualizar();

		//Fizemos um saque da conta C2
		if (c2.sacar(5000.0f)) 
			System.out.println("\n\nO seu novo saldo é: ");
			System.out.println(+c2.getSaldo());
			
		//Fizemos um deposito na conta C1
		c1.depositar(25000.0f);			
		
		//Vizualizamos o saldo da conta C1
		c1.visualizar();
			System.out.println("Seu novo saldo é: ");
			System.out.println(c1.getSaldo());
			
		while (true) {
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("                            BANCO FOICE E MARTELO                            ");
			System.out.println("----------------------------------------------------------------------------------");
			// 82 linhas
			System.out.println("                                                                                     ");
			System.out.println("                                1 - Criar Conta                                    ");
			System.out.println("                                2 - Listar todas as contas                        ");
			System.out.println("                                3 - Buscar Conta por Número                       ");
			System.out.println("                                4 - Atualizar Dados da Conta                      ");
			System.out.println("                                5 - Apagar Conta                                  ");
			System.out.println("                                6 - Sacar                                         ");
			System.out.println("                                7 - Depositar                                    ");
			System.out.println("                                8 - Transferir Valores entre Contas               ");
			System.out.println("                                9 - Sair                            ");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("Entre com a opção desejada:                                                          ");
			System.out.println("                                                                                     ");

			option = sc.nextInt();

			if (option == 9) {
				System.out.println("\nBanco Foice e Martelo - Aqui o que é Seu é Nosso!");
				sc.close();
				System.exit(0);
			}

			switch (option) {
			case 1:
				System.out.println("Criar Conta: ");

				System.out.println("Conta criada com sucesso!");
				break;
			case 2:
				System.out.println("Listar todas as contas: ");

				break;
			case 3:
				System.out.println("Buscar Conta por Número: ");

				break;
			case 4:
				System.out.println("Atualizar Dados da Conta: ");

				break;
			case 5:
				System.out.println("Apagar Conta: ");

				break;
			case 6:
				System.out.println("Sacar: ");

				break;
			case 7:
				System.out.println("Depósito: ");

				break;
			case 8:
				System.out.println("Transferência entre Contas: ");

				break;
			case 9:
				System.out.println("Seção Encerrada ");

				break;
			default:
				if (option > 3)
					System.out.println("Opção inválida! Por favor digite novamente: ");

				break;
			}

		}

	}

}