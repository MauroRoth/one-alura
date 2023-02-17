
public class CrearCuenta {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(1,1);
		primeraCuenta.setSaldo(1000);
		System.out.println(primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = new Cuenta(1,2);
		segundaCuenta.setSaldo(500);
		System.out.println(segundaCuenta.getSaldo());
		
		primeraCuenta.depositar(2500);
		primeraCuenta.mostrarSaldo();
		
		primeraCuenta.retirar(400);
		primeraCuenta.mostrarSaldo();
		
		System.out.println("transferencia-----");
		primeraCuenta.mostrarSaldo();
		segundaCuenta.mostrarSaldo();
		if(primeraCuenta.transferir(3100, segundaCuenta)) {
			System.out.println("Transferencia Exitosa!!!");
		} else {
			System.out.println("No es posible transferir!!!");
		}
		
		primeraCuenta.mostrarSaldo();
		segundaCuenta.mostrarSaldo();
		
		System.out.println("Total de cuentas: "+Cuenta.getTotal());
	}
}
