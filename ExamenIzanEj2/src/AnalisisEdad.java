import java.util.ArrayList;

public class AnalisisEdad {
	private ArrayList<Integer> edades;


	/**
	 * @param edades
	 */
	public AnalisisEdad(ArrayList<Integer> edades) {
		super();
		this.edades = edades;
	}
	
	
	public String contarEdades() {
		String cadena="";
		int contMen = 0, contMay = 0, contJub = 0;
		
		for(int i = 0; i<edades.size(); i++) {
			if (edades.get(i) < 18) {
				contMen++;
			}else if(edades.get(i) < 65) {
				contMay++;
			}else {
				contJub++;
			}
		}
		
		cadena = "Menores de edad: " + contMen + ", Mayores de edad: " + contMay + ", Jubilidados: " + contJub;
		
		return cadena;
		
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> refs/heads/funcionalidadClase
