package instrumentos;

public abstract class Instrumento {

	private String nombre;
	private String descripcion;
	
	public Instrumento(String nombre, String desc) {
		this.nombre = nombre;
		this.descripcion = desc;
	}
	
	public abstract void tocar();

	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
	
}
