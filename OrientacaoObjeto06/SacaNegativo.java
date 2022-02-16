
public class SacaNegativo {
public static void main(String[] args) {
	
	Conta conta = new Conta();
	conta.deposita(100);
	System.out.println("o valor em conta é de: " +conta.saldo);
	System.out.println("o valor do saque é de: " +conta.saca(101));
	System.out.println(conta.saldo);
	
	//desta forma teremos um retorno, false pois o valor do saque é maior que o saldo.
	
	conta.saldo = conta.saldo - 101;
	System.out.println("o saldo da conta é de: " +conta.saldo);
	
}
}
