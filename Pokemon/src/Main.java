
public class Main {

	public static void main(String[] args) {
		
		
		Pokemon atacante_1 = new Pokemon("Sandshrew", 50, "Tierra");
		Pokemon atacante_2 = new Pokemon("Nidorino", 61, "Veneno");
		
		Pokemon atacante_3 = new Pokemon("Charizard", 78, "Fuego");
		Pokemon atacante_4 = new Pokemon("Poliwag", 40, "Agua");
		
		atacante_1.attackPokemon(atacante_2);
		atacante_2.attackPokemon(atacante_4);
		atacante_3.attackPokemon(atacante_1);
		atacante_2.attackPokemon(atacante_3);

		Pokedex pokedex = new Pokedex();
		pokedex.listPokemon(atacante_3.getCount());
	
	}
	
}
