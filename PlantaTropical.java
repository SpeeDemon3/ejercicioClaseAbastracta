package ejerciciosClasesAbastractas.ejercicio1;
/**
 * 
 * @author speedemon
 *
 */
public class PlantaTropical extends Planta{
	
	// Constructor con atributos heredados
	public PlantaTropical(String type, int numberLeaves) {
		super(type, numberLeaves);
	}
	
	// Metodo heredado he implementado de la clase Planta
	public void regar(int cantidad, int tiempo) {
		System.out.println("Cantidad de agua: " + cantidad
				+ "\nTiempo: " + tiempo);
	}
	
}
