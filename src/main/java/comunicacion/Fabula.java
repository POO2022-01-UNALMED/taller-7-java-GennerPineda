package comunicacion;

public class Fabula extends Escrito{
	
	private String ensenanza;
	private String iterpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String iterpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.iterpretacion = iterpretacion;
	}
	public String getEnsenanza() {
		return ensenanza;
	}
	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	public String interpretacion() {
		return iterpretacion;
	}
	public String getIterpretacion() {
		return iterpretacion;
	}
	public void setIterpretacion(String iterpretacion) {
		this.iterpretacion = iterpretacion;
	}
	public String toString() {
		return super.getOrigen() + "\n"+
				super.getTitulo() + "\n"+
				super.getAutor()+ "\n"+
				super.getPaginas()+"\n"+
				this.getEnsenanza();
	}
	public int palabrasTotales(int palabras) {
		return super.getPaginas()*palabras;
	}

}
