
public class Samurai extends Human{
	
	public Samurai(String nombre) {
		super(nombre);
	
		int health = 200;
		
		this.setHealth(health);
	}
	public void deathBlow(Human human) {
		System.out.println("El participante: "+human.getName()+" Ha sido asesinado por: "+getName()+"\n"+getName()+" Ha percibido daño");
		setHealth(health/2);
	}
	public void meditate() {
		System.out.println("El "+getName()+" Se ha curado en la mitad de punto health");
		setHealth(health+(health/2));
	}
	public void howMany() {
		System.out.println("Health: "+getHealth());
	}

}
