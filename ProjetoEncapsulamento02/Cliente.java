
public class Cliente {

	private String tinome;
	private String cpf;
	private String proficao;
	
	public String getNome() {
		return this.tinome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public String getProficao() {
		return this.proficao;
	}
	public void setNome(String nome) {
		this.tinome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setProficao(String proficao) {
		this.proficao = proficao;
	}
}
