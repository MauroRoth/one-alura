
public class TestGerente {
	public static void main(String[] args) {
		Gerente raul = new Gerente();
		raul.setNombre("diego");
		raul.setDocumento("25633888");
		raul.setSalario(6000);
		raul.setPassword("huhu");
        boolean autentico = raul.autenticar("huhu");

		raul.str();
		System.out.println(autentico);
	}
}