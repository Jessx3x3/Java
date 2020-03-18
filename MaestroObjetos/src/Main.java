
public class Main {

	public static void main(String[] args) {
		
		Ninja jugador_1 = new Ninja("Doctor Simmy");
		
		Wizard jugador_2 = new Wizard("Doctora Polo");
		
		jugador_1.attack(jugador_2);
		jugador_1.attack(jugador_2);
		jugador_1.attack(jugador_2);
		
		jugador_2.attack(jugador_1);
		jugador_2.attack(jugador_1);
		jugador_2.attack(jugador_1);
		jugador_2.attack(jugador_1);
		jugador_2.attack(jugador_1);
		
	}

}
