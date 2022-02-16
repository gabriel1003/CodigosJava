
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
		System.out.println("O saldo da conta é " + conta.getSaldo());
		System.out.println("A sua agéncia é: " +conta.getAgencia());
		System.out.println("o nome do titular é: " +gabriel.getNome());
		System.out.println("o titular da conta é: " +conta.getTitular().getNome());
		System.out.println("o número da sua conta é: " +conta.getNumero());
		System.out.println("a profição do titular é: " +gabriel.getProficao());
		System.out.println("o CPF do titular é: " +gabriel.getCpf());
	}
}
