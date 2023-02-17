
public class TestReferencia2 {
	public static void main(String[] args) {
		Cliente diego = new Cliente();
		
		diego.setNombre("Diego");
		diego.setDocumento("28365255");
		diego.setTelefono("3644525859");
		
		Cuenta cuentaDeDiego = new Cuenta(2,3);
		
		cuentaDeDiego.setTitular(diego);
		System.out.println(cuentaDeDiego.getTitular().getNombre() + "\n"
						   +cuentaDeDiego.getTitular().getDocumento());
	}
}
