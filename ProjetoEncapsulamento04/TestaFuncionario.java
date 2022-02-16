
public class TestaFuncionario {
public static void main(String[] args) {
	Funcionario f1 = new Funcionario();
	f1.setSalario(3000);
	f1.setNome("Gabriel Samersla");
	System.out.println("Você é um funcionario comum: " +f1.getTipo());
	System.out.println("o seu salario é de: " +f1.getSalario());
	System.out.println("a sua bonificação é de: " +f1.getBonificacao());
	
	Funcionario f2 = new Funcionario();
	f2.setSalario(5000);
	f2.setNome("Paulo Silveira");
	f2.setTipo(1);
	System.out.println("Você é um gerente: " +f2.getTipo());
	System.out.println("seu salario é: " +f2.getSalario());
	System.out.println("você não possue bonificações: ");
	
	Funcionario f3 = new Funcionario();
	f3.setSalario(6000);
	f3.setTipo(2);
	System.out.println("Você é um diretor: " +f3.getTipo());
	System.out.println("seu salario é: " +f3.getSalario());
	System.out.println("sua bonificação é de: " +f3.getBonificacao());
}
}
