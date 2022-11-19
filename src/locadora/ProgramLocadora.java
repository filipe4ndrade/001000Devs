package locadora;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ProgramLocadora {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/mm/yyyy hh:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.println("Retirada (dd/mm/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine());
		System.out.println("Retorno (dd/mm/yyyy hh:mm):");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine());
		
		CarRental cr = new CarRental(start,finish,new Veiculo(carModel));
		
		sc.close();

	}

}
