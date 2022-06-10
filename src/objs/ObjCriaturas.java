package objs;

import inimigos.Inimigos;


public class ObjCriaturas{

	public static void main(String[] args) {
		
		
		Inimigos huskWarrior = new Inimigos();

		huskWarrior.setNome("Carcaça Guerreira");
		huskWarrior.setDescriçao("Os restos de um inseto, animado por uma força estranha. Empunha um ferrão e um carapaça.");
		huskWarrior.setComportamento("Patrulhas para frente e para trás. Uma vez perturbado, ele se defende com seu escudo, mesmo que o Cavaleiro tente realizar um golpe para baixo."
				+ "\nQuando ataca, realiza três golpes consecutivos antes de se defender com seu escudo novamente.");
		huskWarrior.setHp(15);
		huskWarrior.setLocalizaçao("Encruzilhada Esquecida");
		huskWarrior.setDrop("6 GEO");
		
		imprimirFicha(huskWarrior);
		huskWarrior.renascer();
		

		
		
		
		
	}

	private static void imprimirFicha(Inimigos inimigo) {
		
		System.out.println("Nome: "+inimigo.getNome());
		System.out.println("Descrição: "+inimigo.getDescriçao());
		System.out.println("Hp: "+inimigo.getHp());
		System.out.println("Localização: "+inimigo.getLocalizaçao());
		System.out.println("Drop: "+inimigo.getDrop());
		System.out.println("Comportamento: "+inimigo.getComportamento());
	}
	
	
	
}
