package comunicacion;

public abstract class Escrito extends Pictograma{
	
	private String titulo;
	private String autor;
	private int paginas;
	
	public Escrito(String origen,String titulo, String autor, int paginas) {
		super(origen);
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public String resumen() {
		String st1 = this.getOrigen() + "\n";
		st1 += this.titulo + "\n";
		st1 += this.autor + "\n";
		st1 += this.paginas + "\n";
		return st1;
	}
	public abstract int palabrasTotales(int palabras);
	
	
	
	
}
