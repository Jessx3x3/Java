
public class Pokemon {
	String name;
	int health;
	String type;
	static int count = 0;
	
	Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		count++;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}
	public int getCount() {
		return count;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	void attackPokemon(Pokemon pokemon) {
		System.out.print("\nEl pokemón ["+getName()+"] a atacado a ["+pokemon.getName()+"] descontando su salud desde: ["+pokemon.getHealth()+"] a ["+(pokemon.getHealth()-10)+"]");
		pokemon.setHealth(getHealth() - 10);
	}
}
