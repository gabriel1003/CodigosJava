
public class TestaValores {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 500;
		System.out.println(primeiraConta.saldo);
		Conta segundaConta = primeiraConta;
		System.out.println(segundaConta); //Quando esecutamos este c�digo, vemos que n�o temos o saldo anterior repedido mas sim, um n�mero estranho. � que, o que trasemos � a referencia do objeto e n�o o saldo atribuido.
		
		segundaConta.saldo += 1000;
		System.out.println(segundaConta.saldo);
	}
}
