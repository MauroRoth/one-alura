package cuentas;
import clientes.*;

class Cuenta {
	//miembros de clase
	private static int total = 0;
	public static int getTotal() {
		return Cuenta.total;
	}
	public static void setTotal() {
		Cuenta.total++;
	}
	//miembros de instancia
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	//constructor
	public Cuenta(int agencia, int numero){
		this.agencia = agencia;
	    this.numero = numero;
	    this.saldo = 0; 
	    
	    Cuenta.setTotal();
	    
		System.out.println("Creando una cuenta!");
	}
	
	//GETTERS AND SETTERS
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	//---------------------------------------------------
	
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
