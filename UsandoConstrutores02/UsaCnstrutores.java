
public class UsaCnstrutores {
public static void main(String[] args) {
	Conta conta = new Conta(1337, 24226);
	conta.deposita(300);
	System.out.println(conta.getSaldo());
	conta.saca(200);
	System.out.println("o seu saldo é de: " +conta.getSaldo());
	System.out.println("o total de contas é: " +Conta.getTotal());
}
}
