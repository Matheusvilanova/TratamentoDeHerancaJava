package objs;

import inimigos.Chefes;

public class ObjBoss {
	public static void main(String[] args) {
			
			
			Chefes mestreDasAlmas = new Chefes();
	
			mestreDasAlmas.setNome("Mestre Das Almas");
			mestreDasAlmas.setDescriçao("Chefe do Santuário das Almas. Alma acumulada na esperança de evitar a aflição de Hallownest, mas acabou se intoxicando por seu poder.");
			mestreDasAlmas.setComportamento("Na fase 1 O Mestre Das Almas teleporta pelo menos uma vez entre seus ataques: Dash, Orb, Clock, Slam, Fack Out Slam e Teleport"
					+ "\nNa fase 2 O Mestre Das Almas tem apenas três ataques, que fica alternado entre eles: Altered Slams, Fake Out Altered Slams, Altered Orb");
			mestreDasAlmas.setHp(385);
			mestreDasAlmas.setLocalizaçao("Santuário das almas");
			mestreDasAlmas.setDrop("380 GEO + Mergulho desolador");
			
			imprimirFicha(mestreDasAlmas);
			mestreDasAlmas.fases();
			mestreDasAlmas.musicaTema();
			
	}

	private static void imprimirFicha(Chefes inimigo) {
		
		System.out.println("Nome: "+inimigo.getNome());
		System.out.println("Descrição: "+inimigo.getDescriçao());
		System.out.println("Hp Total das duas fases: "+inimigo.getHp());
		System.out.println("Localização: "+inimigo.getLocalizaçao());
		System.out.println("Drop: "+inimigo.getDrop());
		System.out.println("Comportamento: "+inimigo.getComportamento());
	}
}
