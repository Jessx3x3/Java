
public class Human {

	String name;
	int strength = 3;
	int stealth = 3;
	int intelligence = 3;
	int health = 100;
	
	public Human(String name) {
		this.name = name;
	}
	public Human() {
		
	}
	
	void attack(Human human) {
		
		System.out.println("Inicial vida: ["+ human.getHealth()+"] de "+human.getName());
		
		human.setHealth(human.getHealth() - getStrength());
		
		System.out.println("Después del golpe: ["+ human.getHealth()+"] de "+getName());
		
		if(human.getHealth() <= 0) {
			System.out.println("El participante: "+human.getName()+", falleció");
		}
		
		System.out.println("______________________________________");
		
	}
	
	public String getName() {
		return name;
	}
	public int getStrength() {
		return strength;
	}
	public int getStealth() {
		return stealth;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public int getHealth() {
		return health;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public void setHealth(int health) {
		this.health = health;
	}
}
