package inimigos;

public class Inimigos extends Criaturas {
	
	public Inimigos(){
		
		getNome();
		getDescri�ao();
		getComportamento();
		getDescri�ao();
		getLocaliza�ao();
		getHp();
		getDrop();
	}
	public void renascer() {
		
			System.out.println("M�todo renascer: Quando o jogador morrer, descansar em um baco ou matar um chefe ele voltara a vida");
		}
}
