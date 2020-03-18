
public class Bat extends Animal {

	public void fly() {
		System.out.println("RAWWWWR! -despegando-");
		this.setEnergia(this.getEnergia() - 50);
	}

	public void eatHumans() {
		System.out.println("Bueno, no importa");
		this.setEnergia(this.getEnergia() + 25);
	}

	public void attackTown() {
		System.out.println("Me gusta quemar pipol");
		this.setEnergia(this.getEnergia() - 100);
	}

}
