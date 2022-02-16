
public class DadosVoo {
public static void main(String[] args) {
	Aviao dados = new Aviao("boeng", 2002, "rio São Paulo");
	dados.setModelo("erbas");
	dados.setAno(2005);
	dados.setRota("Curitiba Brasilha");
	System.out.println("o modelo da aeronave é: " +dados.getModelo());
	System.out.println("o ano da aeronave é: " +dados.getAno());
	System.out.println("a rota do voo é: " +dados.getRota());
}
}
