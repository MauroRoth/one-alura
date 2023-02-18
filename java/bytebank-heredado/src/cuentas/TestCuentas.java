package cuentas;

public class TestCuentas {
	public static void main(String[] args) {

		CuentaCorriente cc = new CuentaCorriente(111, 111);
	    cc.depositar(100.0);

	    CuentaAhorro cp = new CuentaAhorro(222, 222);
	    cp.depositar(100.0);
	    
	    cc.transferir(10.0, cp);
	    System.out.println("CC: " + cc.getSaldo());
	    System.out.println("CP: " + cp.getSaldo());
	}
}
