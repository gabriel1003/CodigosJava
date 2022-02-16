
public class Aviao {

	private String modelo;
	private int ano;
	private String rota;
	private static int quantidadeVoo = 0;
	
	public Aviao(String modelo, int ano, String rota) {
		Aviao.quantidadeVoo ++;
		System.out.println("a quantidade média de voo deste avião é de: " +Aviao.quantidadeVoo);
		this.modelo = modelo;
		this.ano = ano;
		this.rota = rota;
	}
	public String getModelo() {
		return this.modelo;
	}
	public int getAno() {
		return this.ano;
	}
	public String getRota() {
		return this.rota;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void setRota(String rota) {
		this.rota = rota;
	}
}
