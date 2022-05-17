package comunicacion;

public class Tesis extends Escrito{
	String idea;
	static String argumentos[];
	String conclusion;
	String referencias;
	String interpretacion;
	
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion,
			String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		Tesis.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}


	public String getIdea() {
		return idea;
	}


	public void setIdea(String idea) {
		this.idea = idea;
	}


	public static String[]getArgumentos() {
		return argumentos;
	}


	public static void setArgumentos(String[] argumentos) {
		Tesis.argumentos = argumentos;
	}


	public String getConclusion() {
		return conclusion;
	}


	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}


	public String getReferencias() {
		return referencias;
	}


	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}


	public String interpretacion() {
		return interpretacion;
	}


	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	public String toString() {
		return super.getOrigen() + "\n"+
				super.getTitulo() + "\n"+
				super.getAutor()+ "\n"+
				super.getPaginas()+"\n"+
				this.getIdea()+"\n"+
				this.getConclusion()+"\n"+
				this.getReferencias();
				
				
	}
	public int palabrasTotales(int palabras) {
		return super.getPaginas()*5*palabras;
	}
}
