package inimigos;

public class Criaturas {
	
	private String nome;
	private String descri�ao;
	private String localiza�ao;
	private String comportamento;
	private int hp;
	private String drop;
	
	

	public String getNome() {
		
		return nome;
	}
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	public String getDescri�ao(){
		return descri�ao;
	}
	public void setDescri�ao(String descri�ao) {
		
		this.descri�ao = descri�ao;
	}
	public String getComportamento() {
		return comportamento;
	}
	
	public void setComportamento(String comportamento) {
		
		this.comportamento = comportamento;
	}
	public String getLocaliza�ao(){
		
		return localiza�ao;
	}
	public void setLocaliza�ao(String localiza�ao) {
		
		this.localiza�ao = localiza�ao;
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


