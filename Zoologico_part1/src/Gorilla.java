
public class Gorilla extends Animal{

	
	public void lanzarAlgo() 
	{
		
		System.out.println("\nEnergía inicial: "+this.getEnergia()+"\nEl gorilla a lanzado algo: -5");
		
		this.setEnergia(this.getEnergia()-5);

	}
	public void comerBananas() 
	{
		
		System.out.println("\nEnergía inicial: "+this.getEnergia()+"\nEl gorilla está comiendo babanas: +10");
		
		this.setEnergia(this.getEnergia()+10);
		
	}
	public void escalar() 
	{
		System.out.println("\nEnergía inicial: "+this.getEnergia()+"\nEl gorilla a trepado la cima del árbol: -10");
		
		this.setEnergia(this.getEnergia()-10);
		
	}
}
