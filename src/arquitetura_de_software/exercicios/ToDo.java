package arquitetura_de_software.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDo {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> tasks = new ArrayList<String>();
		boolean next = false;
		int quest = 1;
		int remove;
		
		do {
			System.out.print("Digite uma tarefa para inserir em sua lista de tarefas: ");
			tasks.add(scanner.nextLine());
			System.out.print("Deseja inserir uma nova tarefa [1]Sim [2]Não: ");
			quest = scanner.nextInt();
			scanner.nextLine(); //Limpando lixo de memória
			next = quest == 1 ? false : true;
		} while(!next);
		
		getTasks(tasks);
		next = false;
		quest = 1;
		
		do {
			System.out.print("\nDeseja retirar uma tarefa já concluída? [1]Sim [2]Não: ");
			quest = scanner.nextInt();
			scanner.nextLine(); //Limpando lixo de memória
			if(quest == 1) {
				System.out.print("Insira o ID da tarefa para retirá-la da lista: ");
				remove = scanner.nextInt();
				scanner.nextLine();
				tasks.remove(remove);
			}
			next = quest == 1 ? false : true;
		} while(!next);
	
		getTasks(tasks);
		scanner.close();
	}
	
	public static void getTasks(ArrayList<String> tasks) {
		System.out.println("\nLista de Tarefas\n");
		for(int i = 0; i< tasks.size(); i++) {
			System.out.println("ID " + i + " " + "-> " + tasks.get(i));
		}
	}
}
