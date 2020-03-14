
public class Project {
	
	String name;
	String description;
	
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public void setName(String newName) {
	    this.name = newName;
	}
	public void setDescription(String newDescription) {
	    this.description = newDescription;
	  }
	
	Project() {
	}
	
	Project(String name) {
		this.name = name;
	}
	
	Project(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public void crearNuevoProyecto(String value_1, String value_2) {
		Project nuevoProyecto = new Project(value_1, value_2);
		System.out.println(nuevoProyecto.getName()+" : "+nuevoProyecto.getDescription());
	}
}
