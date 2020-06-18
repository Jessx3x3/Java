
public class Ninja extends Human{

	public Ninja(String nombre) {
		super(nombre);
		
		int stealth = 10;
		this.setStealth(stealth);		
	}
	public void steal(Human human) {
		System.out.println("a "+human.getName()+" Le han robado: "+getStealth()+ " de su vida");
		human.setHealth(human.getHealth()-stealth);
	}
	public void runAway() {
		this.setHealth(getHealth()-10);
	}

}
