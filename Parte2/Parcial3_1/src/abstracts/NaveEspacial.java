package abstracts;
import clases.VehiculoLanzadera;

public abstract class NaveEspacial {
	
	protected String nombre;
	protected int peso;
	protected String combustible;
	protected String estadoActual;
	protected VehiculoLanzadera lanzadera;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String getEstadoActual() {
		return estadoActual;
	}

	public void setEstadoActual(String estadoActual) {
		this.estadoActual = estadoActual;
	}

	public VehiculoLanzadera getLanzadera() {
		return lanzadera;
	}

	public void setLanzadera(VehiculoLanzadera lanzadera) {
		this.lanzadera = lanzadera;
	}

}
