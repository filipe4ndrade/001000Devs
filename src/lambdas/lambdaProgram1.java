package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class lambdaProgram1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//Function<Product, String> func = p-> p.getName().toUpperCase();
		//map só funciona pra stream
		List<String> names = list.stream().map(p-> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}

}
