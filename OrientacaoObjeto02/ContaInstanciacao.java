
public class ContaInstanciacao {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.agencia = 'x';
		System.out.println("Agencia: " +conta.agencia);
		conta.saldo = 200.00;
		System.out.println("o seu saldo é de: " + conta.saldo);
		System.out.println(conta.titular);
	}
}
