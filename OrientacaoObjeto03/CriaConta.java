
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
	System.out.println("a agéncia é: " +primeiraConta.agencia);
	System.out.println("a agencia é: " +segundaConta.agencia);
	System.out.println("o número da conta é: " +primeiraConta.numero);
	System.out.println("o número da segunda conta é: " +segundaConta.numero);
	
	if (primeiraConta == segundaConta) {
		System.out.println("são as mesmas contas. ");
	}
	else {
		System.out.println("não são a mesma conta. ");
	}
}
}
