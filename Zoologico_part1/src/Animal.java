
public class Animal{
	
	int energia;
	
	public Animal(){
		this.energia = 100;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	public int displayEnergia() {
		System.out.println("\nEnergia de "+energia);
		return energia;
	}
	
}
