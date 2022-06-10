package objs;

import inimigos.Inimigos;


public class ObjCriaturas{

	public static void main(String[] args) {
		
		
		Inimigos huskWarrior = new Inimigos();

		huskWarrior.setNome("Carca�a Guerreira");
		huskWarrior.setDescri�ao("Os restos de um inseto, animado por uma for�a estranha. Empunha um ferr�o e um carapa�a.");
		huskWarrior.setComportamento("Patrulhas para frente e para tr�s. Uma vez perturbado, ele se defende com seu escudo, mesmo que o Cavaleiro tente realizar um golpe para baixo."
				+ "\nQuando ataca, realiza tr�s golpes consecutivos antes de se defender com seu escudo novamente.");
		huskWarrior.setHp(15);
		huskWarrior.setLocaliza�ao("Encruzilhada Esquecida");
		huskWarrior.setDrop("6 GEO");
		
		imprimirFicha(huskWarrior);
		huskWarrior.renascer();
		

		
		
		
		
	}

	private static void imprimirFicha(Inimigos inimigo) {
		
		System.out.println("Nome: "+inimigo.getNome());
		System.out.println("Descri��o: "+inimigo.getDescri�ao());
		System.out.println("Hp: "+inimigo.getHp());
		System.out.println("Localiza��o: "+inimigo.getLocaliza�ao());
		System.out.println("Drop: "+inimigo.getDrop());
		System.out.println("Comportamento: "+inimigo.getComportamento());
	}
	
	
	
}
