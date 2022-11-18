package pessoa;

public class Administrador extends Empregado {

	private Double ajudaDeCusto;
	
	public Administrador() {
		
	}

	

	public Administrador(String nome, String endereço, String telefone, Integer codigoSetor, Double salarioBase,
			Double imposto, Double ajudaDeCusto) {
		super(nome, endereço, telefone, codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}



	public Double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(Double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	@Override
	public double calcularSalario() {
		return super.calcularSalario() + ajudaDeCusto;
	}
}
