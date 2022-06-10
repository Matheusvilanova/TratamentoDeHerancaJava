package inimigos;

public class  Chefes extends Criaturas{

	public Chefes(){
		
		getNome();
		getDescriçao();
		getComportamento();
		getDescriçao();
		getLocalizaçao();
		getHp();
		getDrop();
	}
	
	public void fases() {
		
		System.out.println("\nMétodo fases: Possui Duas fases, ao perder todo Hp na primeira fase, ele muda o padrão de ataques e vai para outro cenário, \nse o jogador morrer na segunda fase o Chefe volta para primeira fase.");
	}
	
	public void musicaTema(){
		
		System.out.println("\nMétodo musicaTema: Na primeira fase da batalha tocar a musica tema: Mage Boss.");
		System.out.println("\nNa segunda fase trocar a musica tema para: Mage Under Glass.");
	}
	
}
	
