package universidade;



public class Coordenador extends Funcionario {

	private Professor[] professoresSupervisionados;
	
	public Coordenador() {
		
	}

	public Coordenador(String nome, String cpf, Integer numeroRegistro, String orgaoLotacao, Double salario) {
		super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
		this.professoresSupervisionados = new Professor[10];
	}

	public void adicionaProfessor(Professor professor) {
		
		for(int i=0; i<professoresSupervisionados.length; i++) {
			if (this.professoresSupervisionados[i] == null) {
				this.professoresSupervisionados[i] = professor;		
			}
		}
	}
	
	public Professor[] getProfessoresSupervisionados() {
		return professoresSupervisionados;
	}

	@Override
	public void aumentaSalario() {
		super.setSalario(super.getSalario()*1.05);
	}
	
	
}
