package comunicacion;
import java.util.ArrayList;

public class Alfabeto extends Pictograma{
	private static ArrayList<String> letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String interpretacion) {
		super(origen);
		this.interpretacion = interpretacion;
	}

	public static ArrayList<String> getLetras() {
		return letras;
	}

	public static void setLetras(ArrayList<String> letras) {
		Alfabeto.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	
	
	public String interpretacion() {
		return interpretacion;
	}
	public String toString() {
		String st1 = ", ";
		String st2 = "";
		st2 = String.join(st1, getLetras());
		return st2;
	}
	public int cantiddadLetras() {
		return letras.size();
	}
	
	
	
}
