
public class ConstutoresSegundaParte {
public static void main(String[] args) {
	Conta conta = new Conta(1522, 1235);
	conta.setNumero(1312);
	conta.setAgencia(1510);
	Conta outraConta = new Conta(15123, 1245);
	outraConta.deposita(150);
	System.out.println("o saldo é de: " +conta.getSaldo());
}
}
