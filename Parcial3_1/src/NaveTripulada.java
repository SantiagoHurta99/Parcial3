
public class NaveTripulada extends NaveEspacial {

	private double distanciaOrbita;
	private int capacidadPersonas;
	private String proposito;

	public NaveTripulada(String nombre, int peso, String combustible, String estadoActual, VehiculoLanzadera lanzadera,	double distanciaOrbita, int capacidadPersonas, String proposito) {
		super(nombre, peso, combustible, estadoActual, lanzadera);
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
	
	
}
