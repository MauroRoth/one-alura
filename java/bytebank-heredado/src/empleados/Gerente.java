package empleados;

public class Gerente extends Empleado{
	
	@Override
	public double getBonificacion() {
		return this.salario*1.1;
	}
	@Override
	public void str() {
		System.out.print("Gerente");
		super.str();
	}
	
	
	
	
}
