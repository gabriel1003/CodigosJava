
public class TestaMetodo {
public static void main(String[] args) {
	Conta contaGabriel = new Conta();
	contaGabriel.saldo = 100;
	System.out.println("o saldo atual da conta Gabriel � de : " +contaGabriel.saldo);
	
	contaGabriel.deposita(150);
	System.out.println("o valor do dep�sito � 150");
	
	System.out.println("o valor atual � de: " +contaGabriel.saldo);
	
	boolean conseguiuRetirar = contaGabriel.saca(200);
	System.out.println("o valor do saque � de: " +contaGabriel.saldo);
	
	Conta contaMarcela = new Conta();
	contaMarcela.deposita(1000);
	System.out.println("o saldo da conta da Marcela � de: " +contaMarcela.saldo);
	
	boolean sucessoTransferencia = contaMarcela.transfere(300, contaGabriel);
	if (sucessoTransferencia) {
		System.out.println("trasferencia feita com sucesso. ");
	}
	else {
		System.out.println("o saldo � insuficiente. ");
	}
	System.out.println("o saldo atual � de: " +contaMarcela.saldo);
	System.out.println("o saldo atual � de: " +contaGabriel.saldo);
}
}
