package empleados;

public class TestEmpleado {
	public static void main(String[] args) {

		Gerente raul = new Gerente();
		raul.setNombre("Raúl");
		raul.setDocumento("25633888");
		raul.setSalario(8000);
		raul.setPassword("huhu");
		raul.str();
        boolean autentico = raul.autenticar("huhu");
        System.out.println("autentificación: "+autentico);
	
		Gerente diego = new Gerente();
		diego.setNombre("diego");
		diego.setDocumento("36095855");
		diego.setSalario(2000);
		diego.setPassword("258");
		diego.str();
        boolean autentico2 = diego.autenticar("258");
        System.out.println("autentificación: "+autentico2);
        
        EditorVideo martin = new EditorVideo();
		martin.setNombre("martin");
		martin.setDocumento("33545568");
		martin.setSalario(2500);
		martin.setPassword("28");
		martin.str();
        boolean autentico3 = martin.autenticar("28");
        System.out.println("autentificación: "+autentico3);
	}
}
