import java.util.ArrayList;

public class PrincipalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> edades = new ArrayList<>();
		
		edades.add(20);
		edades.add(30);
		edades.add(2);
		edades.add(70);
		edades.add(90);
		edades.add(40);
		edades.add(24);
		
		AnalisisEdad edadesObj = new AnalisisEdad(edades);
		
		System.out.println(edadesObj.contarEdades());
		
	}

}
