
public class Carro {

	private int ano;
	private String modelo;
	private double preco;
private static int total = 0;

	public Carro(int ano, String modelo, double preco) {
		Carro.total ++;
		System.out.println("O total de carros comprados foi: " +Carro.total);
		if (ano >= 1991) {
			this.ano = ano;
		} else {
			System.out.println("o ano é invalido então usaremos 2017. ");
			this.ano = 2017;
		}
		if (modelo != null) {
			this.modelo = modelo;
		} else {
			System.out.println("o modelo não foi informado por isso usaremos gol. ");
			this.modelo = "Gol";
		}
		if (preco >= 40.000) {
			this.preco = preco;
		} else {
			System.out.println("o preço não foi informado porisso usaremos 40.000");
			this.preco = 40.000;
		}
	}

	public int getAno() {
		return this.ano;
	}

	public String getModelo() {
		return this.modelo;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Carro(String modelo, double preco) {
		this(2017, modelo, preco);
	}
	public int getTtal() {
		return Carro.total;
	}
}
