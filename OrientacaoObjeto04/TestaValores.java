
public class TestaValores {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 500;
		System.out.println(primeiraConta.saldo);
		Conta segundaConta = primeiraConta;
		System.out.println(segundaConta); //Quando esecutamos este código, vemos que não temos o saldo anterior repedido mas sim, um número estranho. É que, o que trasemos é a referencia do objeto e não o saldo atribuido.
		
		segundaConta.saldo += 1000;
		System.out.println(segundaConta.saldo);
	}
}
