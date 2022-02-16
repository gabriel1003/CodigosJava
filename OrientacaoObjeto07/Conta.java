
public class Conta {

	double saldo;
	int numero;
	int agencia;
	Cliente titular;
	public void deposita(double valor) {
		this.saldo += valor;
	}
}
