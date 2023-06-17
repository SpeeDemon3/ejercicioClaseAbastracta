package ejerciciosClasesAbastractas.ejercicio1;
/*
 * 
 */
public abstract class Planta {

	/*
	 * EJERCICIO 1
	 * Crear la clase abstracta Planta con un método abstracto:
	 * void regar(int cantidad, int tiempo)
	 * además crearemos todas propiedades y métodos que se os ocurran
	 * Creamos las clases PlantaTropical, Cactus donde implementaremos el método abstracto.
	 */
	
	
	// Atributos
	private String type;
	private int numberLeaves;
	
	// Constructor
	public Planta(String type, int numberLeaves) {
		this.type = type;
		this.numberLeaves = numberLeaves;
	}
	
	// Setters && Getters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumberLeaves() {
		return numberLeaves;
	}

	public void setNumberLeaves(int numberLeaves) {
		this.numberLeaves = numberLeaves;
	}


	// Metodo abstracto
	public abstract void regar(int cantidad, int tiempo);

}	
	
