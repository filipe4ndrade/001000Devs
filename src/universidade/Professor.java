package universidade;

public class Professor extends Funcionario {

	private String nivelGraduacao;
	private String disciplina;
	private Integer quantidadeAlunos;
	private Integer quantidadeTurma;
	
	public Professor() {
		
	}

	public Professor(String nome, String cpf, Integer numeroRegistro, String orgaoLotacao, Double salario,
			String nivelGraduacao, String disciplina, Integer quantidadeAlunos,Integer quantidadeTurma) {
		super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
		this.nivelGraduacao = nivelGraduacao;
		this.disciplina = disciplina;
		this.quantidadeAlunos = quantidadeAlunos;
		this.quantidadeTurma = quantidadeTurma;
	}

	public String getNivelGraduacao() {
		return nivelGraduacao;
	}

	public void setNivelGraduacao(String nivelGraduacao) {
		this.nivelGraduacao = nivelGraduacao;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public Integer getQuantidadeAlunos() {
		return quantidadeAlunos;
	}

	public void setQuantidadeAlunos(Integer quantidadeAlunos) {
		this.quantidadeAlunos = quantidadeAlunos;
	}
	public Integer getQuantidadeTurma() {
		return quantidadeTurma;
	}
	
}
