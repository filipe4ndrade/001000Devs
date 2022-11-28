package exemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<String, String> map = new HashMap<>();

		for (int i = 0; i < 3; i++) {
			System.out.print("Digite seu CPF: ");
			String cpf = sc.next();
			System.out.print("Digite seu nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			map.put(cpf, nome);
		}
		
		printDados(map);
		
		System.out.print("\nDigite um CPF para remover: ");
		String cpf = sc.next();
		
		map.remove(cpf);
		
		printDados(map);
		
		sc.close();

	}
	
	public static void printDados(Map<String,String> map) {
		System.out.println("\nDADOS:");
		for(String key : map.keySet()) {
			System.out.println(key+": "+map.get(key));
		}
	}
	
}