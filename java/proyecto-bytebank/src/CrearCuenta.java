
public class CrearCuenta {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 1000;
		System.out.println(primeraCuenta.saldo);
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 500;
		System.out.println(segundaCuenta.saldo);
		
		
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
	}
}
