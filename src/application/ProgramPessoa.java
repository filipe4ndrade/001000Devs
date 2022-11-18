package application;

import pessoa.Administrador;
import pessoa.Empregado;
import pessoa.Fornecedor;

public class ProgramPessoa {

	public static void main(String[] args) {
		
		Fornecedor fornecedor = new Fornecedor("JOAO FORNECEDOR", "SAO PAULO", "135465465", 2000.0, 150.0);
		Empregado empregado = new Empregado("JOAO EMPREGADO", "SAO PAULO", "24654564", 0, 1500.0, 0.09);
		Administrador administrador = new Administrador("JOAO ADMINISTRADOR", "SAO PAULO", "5464654", 1, 1500.0, 0.09, 500.0);
		
		System.out.println("TESTE OBTERSALDO " + fornecedor.obterSaldo());
		System.out.println("TESTE SALARIO EMPREGADO " + empregado.calcularSalario());
		System.out.println("TESTE SALARIO ADMINISTRADOR " + administrador.calcularSalario());
	

	}

}
