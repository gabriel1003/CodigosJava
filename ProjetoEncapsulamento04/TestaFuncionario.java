
public class TestaFuncionario {
public static void main(String[] args) {
	Funcionario f1 = new Funcionario();
	f1.setSalario(3000);
	f1.setNome("Gabriel Samersla");
	System.out.println("Voc� � um funcionario comum: " +f1.getTipo());
	System.out.println("o seu salario � de: " +f1.getSalario());
	System.out.println("a sua bonifica��o � de: " +f1.getBonificacao());
	
	Funcionario f2 = new Funcionario();
	f2.setSalario(5000);
	f2.setNome("Paulo Silveira");
	f2.setTipo(1);
	System.out.println("Voc� � um gerente: " +f2.getTipo());
	System.out.println("seu salario �: " +f2.getSalario());
	System.out.println("voc� n�o possue bonifica��es: ");
	
	Funcionario f3 = new Funcionario();
	f3.setSalario(6000);
	f3.setTipo(2);
	System.out.println("Voc� � um diretor: " +f3.getTipo());
	System.out.println("seu salario �: " +f3.getSalario());
	System.out.println("sua bonifica��o � de: " +f3.getBonificacao());
}
}
