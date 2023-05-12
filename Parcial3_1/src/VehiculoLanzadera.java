
public class VehiculoLanzadera {
	
	private String nombre;
	private double potencia; //empuje
	private String CargaUtil;
	private String combustible;
	private double peso;
	private int capacidadCarga; //toneladas
	private int altura;
	private String estadoActual;
	
	public VehiculoLanzadera(String nombre, double potencia, String cargaUtil, String combustible, double peso, int capacidadCarga, int altura, String estadoActual) {
		this.nombre = nombre;
		this.potencia = potencia;
		this.CargaUtil = cargaUtil;
		this.combustible = combustible;
		this.peso = peso;
		this.capacidadCarga = capacidadCarga;
		this.altura = altura;
		this.estadoActual = estadoActual;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public String getCargaUtil() {
		return CargaUtil;
	}

	public void setCargaUtil(String cargaUtil) {
		CargaUtil = cargaUtil;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getEstadoActual() {
		return estadoActual;
	}

	public void setEstadoActual(String estadoActual) {
		this.estadoActual = estadoActual;
	}
	
	
}
