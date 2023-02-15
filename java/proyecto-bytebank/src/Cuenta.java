
class Cuenta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void depositar(double valor) {
		this.saldo += valor; 
	}
	public void mostrarSaldo () {
		System.out.println("Su saldo es: "+this.saldo);
	}
	public boolean retirar(double valor) {
		if(this.saldo>=valor) {
			this.saldo-=valor;
			return true;
		}
		return false;
	}
	public boolean transferir(double valor, Cuenta cuenta) {
		if(this.saldo>=valor) {
			this.retirar(valor);
			cuenta.depositar(valor);
			return true;
		}
		return false;
	}
	
}
