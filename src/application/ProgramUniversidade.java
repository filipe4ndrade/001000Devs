package application;

import universidade.Coordenador;
import universidade.FuncionarioAdministrativo;
import universidade.Professor;

public class ProgramUniversidade {

	public static void main(String[] args) {

		// Funcionario funcionario = new Funcionario();

		FuncionarioAdministrativo joao = new FuncionarioAdministrativo("Joao", "64325416735", 1,
				"FACULDADE DE COMPUTACAO", 5000.00, "SECRETARIO", "JUNIOR");
		Coordenador jose = new Coordenador("JOSE", "54641659", 2, "FACULDADE DE COMPUTACAO", 5000.00);
		Professor joaoProfessor = new Professor("JOAO", "654645", 465, "FACULDADE DE COMPUTACAO", 5000.00, "MESTRADO",
				"Orientacao a Objetos", 10, 1);
		Professor joseProfessor = new Professor("JOSE", "654645", 465, "FACULDADE DE COMPUTACAO", 5000.00, "MESTRADO",
				"Orientacao a Objetos", 10, 1);
		Professor crisProfessora = new Professor("Cris", "654645", 465, "FACULDADE DE COMPUTACAO", 5000.00, "MESTRADO",
				"Orientacao a Objetos", 10, 1);
		Coordenador lucas = new Coordenador("Lucas", "54641659", 2, "FACULDADE DE COMPUTACAO", 5000.00);

		
		jose.adicionaProfessor(joseProfessor);
		jose.adicionaProfessor(joaoProfessor);
		jose.adicionaProfessor(crisProfessora);
		
		joao.aumentaSalario();
		jose.aumentaSalario();
		
		System.out.println("SALARIO DO JOAO: " + joao.getSalario());
		System.out.println("SALARIO DO JOSE: " + jose.getSalario());
	}

}
