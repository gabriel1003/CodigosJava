
public class Conta {

	private double saldo;
	private int numero;
	private int agencia;
private static int total = 0;
	public Conta(int numero, int agencia) {
		Conta.total ++;
		this.numero = numero;
		this.agencia = agencia;
		System.out.println("estou criando uma nova conta: " + this.numero);
		System.out.println("A agéncia é: " +this.agencia);
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
	public double getSaldo() {
		return this.saldo;
	}
	public static int getTotal() {
		return Conta.total;
	}
}
