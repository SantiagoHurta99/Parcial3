package clases;
import abstracts.NaveEspacial;

public class NaveNoTripulada extends NaveEspacial {
	
	private double velocidad;
	private double potencia; //empuje
	
	public NaveNoTripulada(String nombre, VehiculoLanzadera lanzadera) {
		setNombre(nombre);
		setPeso(0);
		setCombustible("N/A");
		setEstadoActual("N/A");
		setLanzadera(lanzadera);
		this.velocidad = 0;
		this.potencia = 0;
	}

	public NaveNoTripulada(String nombre, int peso, String combustible, String estadoActual, VehiculoLanzadera lanzadera, double velocidad, double potencia) {
		setNombre(nombre);
		setPeso(peso);
		setCombustible(combustible);
		setEstadoActual(estadoActual);
		setLanzadera(lanzadera);
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

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nPeso: " + peso + "\nCombustible: " + combustible + "\nEstadoActual: "
				+ estadoActual + "\nLanzadera: " + lanzadera.getNombre() + "\nVelocidad: " + velocidad + "\nPotencia: " + potencia;
	}
	
}
