
public class Gorilla extends Animal{

	
	public void lanzarAlgo() 
	{
		
		System.out.println("\nEnerg�a inicial: "+this.getEnergia()+"\nEl gorilla a lanzado algo: -5");
		
		this.setEnergia(this.getEnergia()-5);

	}
	public void comerBananas() 
	{
		
		System.out.println("\nEnerg�a inicial: "+this.getEnergia()+"\nEl gorilla est� comiendo babanas: +10");
		
		this.setEnergia(this.getEnergia()+10);
		
	}
	public void escalar() 
	{
		System.out.println("\nEnerg�a inicial: "+this.getEnergia()+"\nEl gorilla a trepado la cima del �rbol: -10");
		
		this.setEnergia(this.getEnergia()-10);
		
	}
}
