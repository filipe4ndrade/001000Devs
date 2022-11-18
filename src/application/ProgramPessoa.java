package application;

import pessoa.Pessoa;
import pessoa.Fornecedor;

public class ProgramPessoa {

	public static void main(String[] args) {
		
		Fornecedor fornecedor = new Fornecedor("Filipe","rua 12","65823",1000.00,200.00);
		
		System.out.println(fornecedor.obterSaldo());

	}

}
