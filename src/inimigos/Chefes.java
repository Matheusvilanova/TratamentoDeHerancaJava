package inimigos;

public class  Chefes extends Criaturas{

	public Chefes(){
		
		getNome();
		getDescri�ao();
		getComportamento();
		getDescri�ao();
		getLocaliza�ao();
		getHp();
		getDrop();
	}
	
	public void fases() {
		
		System.out.println("\nM�todo fases: Possui Duas fases, ao perder todo Hp na primeira fase, ele muda o padr�o de ataques e vai para outro cen�rio, \nse o jogador morrer na segunda fase o Chefe volta para primeira fase.");
	}
	
	public void musicaTema(){
		
		System.out.println("\nM�todo musicaTema: Na primeira fase da batalha tocar a musica tema: Mage Boss.");
		System.out.println("\nNa segunda fase trocar a musica tema para: Mage Under Glass.");
	}
	
}
	
