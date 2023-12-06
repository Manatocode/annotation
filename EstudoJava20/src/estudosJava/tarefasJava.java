package estudosJava;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class tarefasJava {

	public static void main(String[] args) {
		List<String> anotacoes = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		int escolha = 0;
		String Menu = """
				**Escolha sua opção **
				1 - Adicionar Tarefa
				2 - Remover Tarefa
				3 - Atualizar Tarefa
				""";
		String adicionar;
		System.out.println(Menu);
		
		while (escolha != 4 ) {			
			System.out.println("Opção: ");
			escolha = ler.nextInt();
			ler.nextLine();
			switch(escolha) {
			
			case 1:
				System.out.print("Digite a tarefa:");
				adicionar = ler.nextLine();
				anotacoes.add(adicionar);
				break;
			case 2:
				
			}
			System.out.println(anotacoes);
		}
		
		
		
		
	}

}
