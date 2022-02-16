
public class UsandoMetodos {
public static void main(String[] args) {
	Conta conta = new Conta();
	conta.deposita(100);
	System.out.println("o saldo da conta é de: " +conta.pegaSaldo());
	conta.saca(101);
	System.out.println(conta.pegaSaldo());
}
}
