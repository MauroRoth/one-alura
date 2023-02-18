package empleados;

public class EditorVideo extends Empleado {
	@Override
	public double getBonificacion() {
		return 150.0;
	}
	@Override
	public void str() {
		System.out.print("Editor de Video");
		super.str();
	}
}
