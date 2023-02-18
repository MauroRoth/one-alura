package empleados;

public abstract class Empleado {
	//miembros de clase
	
	//miembros de instancia
	//--atributos
	private String nombre;
	private String documento;
	protected String password;
	protected double basico;
	protected double salario;
	
	//--constructor
	public Empleado() {
		
	}
	//--getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//otros métodos
	public abstract double getBonificacion();
	
	public boolean autenticar(String password) {
	    if (this.password == password) {
	        return true;
	    } else {
	        return false;
	    }
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBasico() {
		return basico;
	}
	public void setBasico(double basico) {
		this.basico = basico;
	}
	public void str() {
		System.out.println(
				"\nnombre: " + this.getNombre()
				+ "\ndocumento: " + this.getDocumento()
				+ "\nsalario: " + this.getSalario()
				+ "\nbonificación: "+ this.getBonificacion());
		
	}
	
	
}
