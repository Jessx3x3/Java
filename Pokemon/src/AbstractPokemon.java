
public abstract class AbstractPokemon implements PokemonInterface{
	// implementando los metodos de la interfaz
	
	public Pokemon createPokemon(String name, int health, String type) {
		return new Pokemon(name, health, type);
	}
	public String pokemonInfo(Pokemon pokemon) {
		return String.format("Nombre:%s - HP:%s  Tipo:%s", pokemon.getName(), pokemon.getHealth(), pokemon.getType() );
	}
}
