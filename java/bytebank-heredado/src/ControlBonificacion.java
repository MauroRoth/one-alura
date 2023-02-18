import funcionarios.Funcionario;

public class ControlBonificacion {
	private double suma;

	public double getSuma() {
		return this.suma;
	}
	
	public void registrar(Funcionario funcionario) {
		double boni = funcionario.getBonificacion();
		this.suma += boni;
	}
}
