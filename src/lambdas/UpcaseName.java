package lambdas;

import java.util.function.Function;

public class UpcaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		
		return p.getName().toUpperCase();
	}

}
