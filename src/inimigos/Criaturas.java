package inimigos;

public class Criaturas {
	
	private String nome;
	private String descrišao;
	private String localizašao;
	private String comportamento;
	private int hp;
	private String drop;
	
	

	public String getNome() {
		
		return nome;
	}
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	public String getDescrišao(){
		return descrišao;
	}
	public void setDescrišao(String descrišao) {
		
		this.descrišao = descrišao;
	}
	public String getComportamento() {
		return comportamento;
	}
	
	public void setComportamento(String comportamento) {
		
		this.comportamento = comportamento;
	}
	public String getLocalizašao(){
		
		return localizašao;
	}
	public void setLocalizašao(String localizašao) {
		
		this.localizašao = localizašao;
	}
	
	public int getHp() {
		
		return hp;
	}
	public void setHp(int hp) {
		
		this.hp = hp;
	}
	public String getDrop(){
		
		return drop;
	}
	public void setDrop(String drop) {
		
		this.drop = drop;
	}
	
}


