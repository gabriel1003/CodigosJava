//como sempre no java precisamos criar variaveis e seus tipos, assim como quando usamos o double aqui criaremos o tipo Conta que �, a nossa outra class, a variavel �a primeiraConta e o new nos faz a referencia��o.

public class Criaconta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo)
		primeiraConta.saldo += 100;
		System.out.println("a primeira conta tem: " +primeiraConta.saldo);
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("a segunda conta tem: " +segundaConta.saldo);
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		System.out.println(segundaConta.numero);
		System.out.println(segundaConta.agencia);
	}
}
