package funcionarios;

public class Gerente extends Funcionario{
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public double getBonificacion() {
		return super.getBonificacion()
				+super.getSalario();
	}
	public boolean autenticar(String password) {
	    if (this.getPassword() == password) {
	        return true;
	    } else {
	        return false;
	    }
	}
	
	public void str() {
		super.str();
		System.out.println("soy el gerente");
		
	}
}
