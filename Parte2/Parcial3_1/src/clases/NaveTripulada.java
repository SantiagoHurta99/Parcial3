package clases;
import abstracts.NaveEspacial;

public class NaveTripulada extends NaveEspacial {

	private double distanciaOrbita;
	private int capacidadPersonas;
	private String proposito;

	public NaveTripulada(String nombre, VehiculoLanzadera lanzadera) {
		setNombre(nombre);
		setPeso(0);
		setCombustible("N/A");
		setEstadoActual("N/A");
		setLanzadera(lanzadera);
		this.distanciaOrbita = 0;
		this.capacidadPersonas = 0;
		this.proposito = "N/A";
	}
	
	public NaveTripulada(String nombre, int peso, String combustible, String estadoActual, VehiculoLanzadera lanzadera,	double distanciaOrbita, int capacidadPersonas, String proposito) {
		setNombre(nombre);
		setPeso(peso);
		setCombustible(combustible);
		setEstadoActual(estadoActual);
		setLanzadera(lanzadera);
		this.distanciaOrbita = distanciaOrbita;
		this.capacidadPersonas = capacidadPersonas;
		this.proposito = proposito;
	}

	public double getDistanciaOrbita() {
		return distanciaOrbita;
	}

	public void setDistanciaOrbita(double distanciaOrbita) {
		this.distanciaOrbita = distanciaOrbita;
	}

	public int getCapacidadPersonas() {
		return capacidadPersonas;
	}

	public void setCapacidadPersonas(int capacidadPersonas) {
		this.capacidadPersonas = capacidadPersonas;
	}

	public String getProposito() {
		return proposito;
	}

	public void setProposito(String proposito) {
		this.proposito = proposito;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nPeso: " + peso + "\nCombustible: " + combustible + "\nEstadoActual: " + estadoActual + 
				"\nLanzadera: " + lanzadera.getNombre() + "\nDistanciaOrbita: " + distanciaOrbita + "\nCapacidadPersonas=" + capacidadPersonas
				+ "\nProposito=" + proposito;
	}
	
	
}
