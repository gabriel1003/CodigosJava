
public class Principal {
	public static void main(String[] args) {

		Cliente dados = new Cliente();
		dados.nome = "gabriel Samersla";
		dados.cpf = "222.22.22.222-22";
		dados.profissao = "programador";
		Conta contaGabriel = new Conta();
		contaGabriel.deposita(100);
		contaGabriel.titular = dados;
		System.out.println(contaGabriel.titular.nome);
	}
}
