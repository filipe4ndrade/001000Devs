package exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		String corAtual = null;
		
		do {
			System.out.print("Digite uma cor: ");
			corAtual = sc.nextLine();
			list.add(corAtual);
			
			
		}while(!corAtual.equals("preto"));
		
		for(String s : list) {
			System.out.println("Cor: "+s);
		}
		
		sc.close();
		
	}
}