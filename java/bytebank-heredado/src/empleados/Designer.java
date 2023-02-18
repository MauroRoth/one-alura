package empleados;

public class Designer extends Empleado{
	@Override
	public double getBonificacion() {
		return 200.0;
	}
	@Override
	public void str() {
		System.out.print("Designer");
		super.str();
	}
}
