
public class Main {

	public static void main(String[] args) {
		
		
		Ninja jugador_1 = new Ninja("Doctor Simmy");
		
		Wizard jugador_2 = new Wizard("Doctora Polo");
		
		Samurai manuel = new Samurai("Manuel");
		
		jugador_1.attack(jugador_2);
		jugador_2.attack(jugador_1);
		
		jugador_2.fireball(jugador_1);
		System.out.println("\nSalud de: "+jugador_2.getName()+"\nEs:"+jugador_2.getHealth());
		System.out.println("\nSalud de: "+jugador_1.getName()+"\nEs:"+jugador_1.getHealth());
		
	}

}
