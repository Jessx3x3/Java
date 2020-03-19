
public class Wizard extends Human{

	public Wizard(String nombre) {
		super(nombre);

		int intelligence = 8;
		int health = 50;
		
		this.setHealth(health);
		this.setIntelligence(intelligence);

	}
	public void heal(Human human) {
		System.out.println("El oponente: "+human.getName()+"\nTe ha robado inteligencia "+getName());
		human.setIntelligence(human.getIntelligence()+intelligence);
	}
	public void fireball(Human human) {
		System.out.println("\n"+getName()+" Le haz disminuído la salud a "+human.getName()+" de: "+human.getHealth()+" a: "+getIntelligence()*3);
		human.setHealth(getIntelligence()*3);
	}

}
