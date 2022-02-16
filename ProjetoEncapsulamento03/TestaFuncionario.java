
public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Gabriel Samersla");
		funcionario.setCpf("015.18.17.00-53");
		funcionario.setSalario(3000);
		System.out.println("Funcionario: " +funcionario.getNome());
		System.out.println("de CPF: " +funcionario.getCpf());
		System.out.println("o salario atual é de: " + funcionario.getSalario());
		System.out.println("sua bonificação será de : " + funcionario.getBonificacao());
	}
}
