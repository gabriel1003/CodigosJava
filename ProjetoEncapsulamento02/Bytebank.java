
public class Bytebank {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1239);
		Cliente gabriel = new Cliente();
		gabriel.setNome("Gabriel Samersla Merconi");
		conta.deposita(1000);
		conta.setTitular(gabriel);
		gabriel.setProficao("programador");
		gabriel.setCpf("012.542.322.22");
		conta.setAgencia('x');
		System.out.println("O saldo da conta � " + conta.getSaldo());
		System.out.println("A sua ag�ncia �: " +conta.getAgencia());
		System.out.println("o nome do titular �: " +gabriel.getNome());
		System.out.println("o titular da conta �: " +conta.getTitular().getNome());
		System.out.println("o n�mero da sua conta �: " +conta.getNumero());
		System.out.println("a profi��o do titular �: " +gabriel.getProficao());
		System.out.println("o CPF do titular �: " +gabriel.getCpf());
	}
}
