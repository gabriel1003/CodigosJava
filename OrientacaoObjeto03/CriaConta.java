
public class CriaConta {
public static void main(String[] args) {
	Conta primeiraConta = new Conta();
	primeiraConta.saldo = 200;
	System.out.println(primeiraConta.saldo);
	primeiraConta.saldo += 150;
	System.out.println("A primeira conta tem: " +primeiraConta.saldo);
	
	Conta segundaConta = new Conta();
	segundaConta.saldo = 300;
	
	System.out.println("a primeira conta tem: " +primeiraConta.saldo);
	System.out.println("a segunda conta tem: " +segundaConta.saldo);
	segundaConta.agencia = 146;
	System.out.println("a ag�ncia �: " +primeiraConta.agencia);
	System.out.println("a agencia �: " +segundaConta.agencia);
	System.out.println("o n�mero da conta �: " +primeiraConta.numero);
	System.out.println("o n�mero da segunda conta �: " +segundaConta.numero);
	
	if (primeiraConta == segundaConta) {
		System.out.println("s�o as mesmas contas. ");
	}
	else {
		System.out.println("n�o s�o a mesma conta. ");
	}
}
}
