package universidade;

public abstract class Funcionario {

	private String nome;
	private String cpf;
	private Integer numeroRegistro;
	private String orgaoLotacao;
	private Double salario;

	public Funcionario() {

	}

	public Funcionario(String nome, String cpf, Integer numeroRegistro, String orgaoLotacao, Double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.numeroRegistro = numeroRegistro;
		this.orgaoLotacao = orgaoLotacao;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public Integer getNumeroRegistro() {
		return numeroRegistro;
	}

	public String getOrgaoLotacao() {
		return orgaoLotacao;
	}

	public void setOrgaoLotacao(String orgaoLotacao) {
		this.orgaoLotacao = orgaoLotacao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void aumentaSalario() {
		this.salario = this.salario * 1.1;
	};

}
