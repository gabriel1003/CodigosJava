
public class DadosVoo {
public static void main(String[] args) {
	Aviao dados = new Aviao("boeng", 2002, "rio S�o Paulo");
	dados.setModelo("erbas");
	dados.setAno(2005);
	dados.setRota("Curitiba Brasilha");
	System.out.println("o modelo da aeronave �: " +dados.getModelo());
	System.out.println("o ano da aeronave �: " +dados.getAno());
	System.out.println("a rota do voo �: " +dados.getRota());
}
}
