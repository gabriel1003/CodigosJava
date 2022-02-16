
public class TesteGetESet {
	public static void main(String[] args) {

		Conta conta = new Conta(1337, 24226);
		Conta conta2 = new Conta(1337, 16549);
		Conta conta3 = new Conta(2112, 14660);
		System.out.println("o total de contas é: " + Conta.getTotal());
		conta.setAgencia(1232123);
		System.out.println(conta.getAgencia());
		conta.setNumero(-337);
		System.out.println(conta.getNumero());

		Cliente gabriel = new Cliente();
		gabriel.setNome("Gabriel Samersla");
		conta.setTitular(gabriel);
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("programador");
		System.out.println(conta.getTitular().getProfissao());
	}
}
