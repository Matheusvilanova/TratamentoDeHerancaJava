package inimigos;

public class Criaturas {
	
	private String nome;
	private String descriçao;
	private String localizaçao;
	private String comportamento;
	private int hp;
	private String drop;
	
	

	public String getNome() {
		
		return nome;
	}
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	public String getDescriçao(){
		return descriçao;
	}
	public void setDescriçao(String descriçao) {
		
		this.descriçao = descriçao;
	}
	public String getComportamento() {
		return comportamento;
	}
	
	public void setComportamento(String comportamento) {
		
		this.comportamento = comportamento;
	}
	public String getLocalizaçao(){
		
		return localizaçao;
	}
	public void setLocalizaçao(String localizaçao) {
		
		this.localizaçao = localizaçao;
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


