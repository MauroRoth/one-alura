import empleados.Empleado;

public class ControlBonificacion {
	private double suma;

	public double getSuma() {
		return this.suma;
	}
	
	public void registrar(Empleado funcionario) {
		double boni = funcionario.getBonificacion();
		this.suma += boni;
	}
}
