package tarefas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class crud {

	public static void main(String[] args) {
		List<String> anotacoes = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		int escolha = 0;
		String menu = """
				**Escolha sua opção **
				1 - Adicionar Tarefa
				2 - Remover Tarefa
				3 - Atualizar Tarefa
				4 - Sair
				""";
		String adicionar;

		System.out.println(menu);

		while (escolha != 4) {
			System.out.println("Opção: ");
			escolha = ler.nextInt();

			ler.nextLine();

			switch (escolha) {

			case 1:
				System.out.print("Digite a tarefa: ");
				adicionar = ler.nextLine();
				anotacoes.add(adicionar);
				break;
			case 2:
				System.out.println("Lista de Tarefas:");
				for (int i = 0; i < anotacoes.size(); i++) {
					System.out.println(i + ": " + anotacoes.get(i));
				}

				System.out.print("Digite o índice da tarefa a ser removida: ");
				int anotacoesRemover = ler.nextInt();

				if (anotacoesRemover >= 0 && anotacoesRemover < anotacoes.size()) {
					anotacoes.remove(anotacoesRemover);
					System.out.println("Tarefa removida com sucesso.");
				} else {
					System.out.println("Índice inválido.");
				}
				break;
			case 3:
				System.out.println("Lista de Tarefas:");
				for (int i = 0; i < anotacoes.size(); i++) {
					System.out.println(i + ": " + anotacoes.get(i));
				}

				System.out.println("Digite o índice da tarefa que gostaria de atualizar: ");
				int updateAnota = ler.nextInt();

				ler.nextLine();

				if (updateAnota >= 0 && updateAnota < anotacoes.size()) {
					System.out.print("Digite a nova tarefa: ");
					String novaTarefa = ler.nextLine();
					anotacoes.set(updateAnota, novaTarefa);
					System.out.println("Tarefa atualizada com sucesso.");
				} else {
					System.out.println("Índice inválido.");
				}
				break;
			case 4:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida.");
			}

		}

	}
}
