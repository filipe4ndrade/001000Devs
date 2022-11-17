package universidade;

public class FuncionarioAdministrativo extends Funcionario {

	private String funcaoAdm;
	private String senioridade;
	
	public FuncionarioAdministrativo() {
		
	}

	public FuncionarioAdministrativo(String nome, String cpf, Integer numeroRegistro, String orgaoLotacao,
			Double salario, String funcaoAdm, String senioridade) {
		super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
		this.funcaoAdm = funcaoAdm;
		this.senioridade = senioridade;
	}

	public String getFuncaoAdm() {
		return funcaoAdm;
	}

	public void setFuncaoAdm(String funcaoAdm) {
		this.funcaoAdm = funcaoAdm;
	}

	public String getSenioridade() {
		return senioridade;
	}

	public void setSenioridade(String senioridade) {
		this.senioridade = senioridade;
	}
	
}
