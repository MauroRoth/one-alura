package cuentas;


public class CuentaCorriente extends Cuenta {
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	@Override
	public boolean retirar(double valor) {
		double valorARetirar = valor + 0.2;
		return super.retirar(valorARetirar);
	}
}
