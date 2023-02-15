
public class TestReferencia2 {
	public static void main(String[] args) {
		Cliente diego = new Cliente();
		
		diego.nombre = "Diego";
		diego.documento = "28365255";
		diego.telefono = "3644525859";
		
		Cuenta cuentaDeDiego = new Cuenta();
		
		cuentaDeDiego.titular = diego;
		System.out.println(cuentaDeDiego.titular.nombre + "\n"
						   +cuentaDeDiego.titular.documento);
	}
}
