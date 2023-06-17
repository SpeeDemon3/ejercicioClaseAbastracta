package ejerciciosClasesAbastractas.ejercicio1;
/**
 * 
 * @author speedemon
 *
 */
public class Cactus extends Planta {


	// Constructor con atributos heredados
	public Cactus(String type, int numberLeaves) {
		super(type, numberLeaves);
	}
	
	// Metodo heredado he implementado de la clase Planta
	public void regar(int cantidad, int tiempo) {
		System.out.println("Cantidad de agua: " + cantidad
				+ "\nTiempo: " + tiempo);
	}
}
