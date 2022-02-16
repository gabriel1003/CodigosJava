
public class Conta {

	private double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int numero, int agencia) {
		Conta.total ++;
		System.out.println("o total de contas é: " +Conta.total);
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = 100;
		System.out.println("estou criando uma nova conta: " +this.numero);
		System.out.println("a agéncia é: " +this.agencia);
	}
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
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("não pode número menor ou = 0.");
			return;
		}
		this.numero = numero;
	}
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("não pode ter agéncia negativa ou = 0. ");
			return;
		}
		this.agencia = agencia;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return this.titular;
	}
	public static int getTotal() {
		return Conta.total;
	}
}
