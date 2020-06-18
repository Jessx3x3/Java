
public class Samurai extends Human{
	
	int cont=0;
	
	public Samurai(String nombre) {
		super(nombre);
	
		int health = 200;
		this.setHealth(health);
		cont++;
	}
	public Samurai() {
		cont++;
	}
	
	public int getCont() {
		return cont;
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
		System.out.println("Número de Samurais: "+this.getCont());
	}

}
