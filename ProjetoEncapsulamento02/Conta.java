
public class Conta {

	private double saldo;
	private char agencia;
	private int numero;
	private Cliente titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		else {
			return false;
		}
	}
	public double getSaldo() {
		return this.saldo;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int novoNumero) {
		this.numero = novoNumero;
	}
	public Cliente getTitular() {
		return this.titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public char getAgencia() {
		return this.agencia;
	}
	public void setAgencia(char agencia) {
		this.agencia = agencia;
	}
}
