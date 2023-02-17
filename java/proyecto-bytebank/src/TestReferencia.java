
public class TestReferencia {
	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta(2,4);
		Cuenta cuenta2 = new Cuenta(3,5);
		Cuenta cuenta3 = cuenta2;
		
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		System.out.println(cuenta3);
	}
}
