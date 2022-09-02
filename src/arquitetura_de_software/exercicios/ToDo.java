package arquitetura_de_software.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDo {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> tasks = new ArrayList<String>();
		int resp = 1;
		int remove;
		
		while(resp != 0) {
			System.out.println("\nLista de Tarefas\n");
			for(int i = 0; i< tasks.size(); i++) {
				System.out.println("ID " + i + " " + "-> " + tasks.get(i));
			}
			System.out.print("\nSelecione uma opção [1]Adicionar - [2]Excluir - [3]Fechar -> ");
			resp = scanner.nextInt();
			scanner.nextLine();
			if(resp == 1) {
				System.out.print("Digite uma tarefa para inserir em sua lista de tarefas: ");
				tasks.add(scanner.nextLine());
			}else if(resp == 2) {
				System.out.print("Insira o ID da tarefa para retirá-la da lista: ");
				remove = scanner.nextInt();
				scanner.nextLine();
				tasks.remove(remove);
			}else {
				resp = 0;
			}
		}
		scanner.close();
	}
}