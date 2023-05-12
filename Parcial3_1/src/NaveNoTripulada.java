
public class NaveNoTripulada extends NaveEspacial {
	
	private double velocidad;
	private double potencia; //empuje
	
	public NaveNoTripulada(String nombre, int peso, String combustible, String estadoActual, VehiculoLanzadera lanzadera, double velocidad, double potencia) {
		super(nombre, peso, combustible, estadoActual, lanzadera);
		this.velocidad = velocidad;
		this.potencia = potencia;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	
}
