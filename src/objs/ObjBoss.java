package objs;

import inimigos.Chefes;

public class ObjBoss {
	public static void main(String[] args) {
			
			
			Chefes mestreDasAlmas = new Chefes();
	
			mestreDasAlmas.setNome("Mestre Das Almas");
			mestreDasAlmas.setDescri�ao("Chefe do Santu�rio das Almas. Alma acumulada na esperan�a de evitar a afli��o de Hallownest, mas acabou se intoxicando por seu poder.");
			mestreDasAlmas.setComportamento("Na fase 1 O Mestre Das Almas teleporta pelo menos uma vez entre seus ataques: Dash, Orb, Clock, Slam, Fack Out Slam e Teleport"
					+ "\nNa fase 2 O Mestre Das Almas tem apenas tr�s ataques, que fica alternado entre eles: Altered Slams, Fake Out Altered Slams, Altered Orb");
			mestreDasAlmas.setHp(385);
			mestreDasAlmas.setLocaliza�ao("Santu�rio das almas");
			mestreDasAlmas.setDrop("380 GEO + Mergulho desolador");
			
			imprimirFicha(mestreDasAlmas);
			mestreDasAlmas.fases();
			mestreDasAlmas.musicaTema();
			
	}

	private static void imprimirFicha(Chefes inimigo) {
		
		System.out.println("Nome: "+inimigo.getNome());
		System.out.println("Descri��o: "+inimigo.getDescri�ao());
		System.out.println("Hp Total das duas fases: "+inimigo.getHp());
		System.out.println("Localiza��o: "+inimigo.getLocaliza�ao());
		System.out.println("Drop: "+inimigo.getDrop());
		System.out.println("Comportamento: "+inimigo.getComportamento());
	}
}
