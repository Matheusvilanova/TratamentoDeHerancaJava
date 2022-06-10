package inimigos;

public class Inimigos extends Criaturas {
	
	public Inimigos(){
		
		getNome();
		getDescriçao();
		getComportamento();
		getDescriçao();
		getLocalizaçao();
		getHp();
		getDrop();
	}
	public void renascer() {
		
			System.out.println("Método renascer: Quando o jogador morrer, descansar em um baco ou matar um chefe ele voltara a vida");
		}
}
