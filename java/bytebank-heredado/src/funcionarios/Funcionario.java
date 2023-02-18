package funcionarios;

public class Funcionario {
	//miembros de clase
	
	//miembros de instancia
	//--atributos
	private String nombre;
	private String documento;
	private double salario;
	
	//--constructor
	public Funcionario() {
		
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
	public double getBonificacion() {
		return this.getSalario()*0.1;
	}
	
	public void str() {
		System.out.println(
				"\nnombre: " + this.getNombre()
				+ "\ndocumento: " + this.getDocumento()
				+ "\nsalario: " + this.getSalario()
				+ "\nbonificación: "+ this.getBonificacion());
		
	}
	
	
}
