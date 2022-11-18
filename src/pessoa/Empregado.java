package pessoa;

public class Empregado extends Pessoa {

	private Integer codigoSetor;
	private Double salarioBase;
	private Double imposto;
	
	public Empregado() {
		
	}

	public Empregado(String nome, String endereço, String telefone, Integer codigoSetor, Double salarioBase,
			Double imposto) {
		super(nome, endereço, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public Integer getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(Integer codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}
	
	public double calcularSalario() {
		return salarioBase - imposto;
	}
	
	
}
