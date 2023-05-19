package Main;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import clases.NaveNoTripulada;
import clases.NaveTripulada;
import clases.VehiculoLanzadera;

public class Principal {

	public static void main(String[] args) {
		int opMenu = 0;
		int opNave = 0;
		ArrayList<VehiculoLanzadera> listaLanzaderas = new ArrayList<>();
		ArrayList<NaveNoTripulada> listaNavesNoTripuladas = new ArrayList<>();
		ArrayList<NaveTripulada> listaNavesTripuladas = new ArrayList<>();

		while (opMenu != 4) {
			opNave = 0;
			opMenu = Integer.parseInt(JOptionPane.showInputDialog("Menú\n" + "1. Registrar una nave\n"
					+ "2. Buscar una nave\n" + "3. Mostrar todas las naves creadas\n" + "4. Salir"));
			switch (opMenu) {
			case 1:
				while (opNave != 4) {
					opNave = Integer.parseInt(
							JOptionPane.showInputDialog("Que tipo de nave va a registrar?\n" + "1. Vehiculo Lanzadera\n"
									+ "2. Nave no tripulada\n" + "3. Nave tripulada\n" + "4. Retroceder"));
					switch (opNave) {
					case 1:
//						VehiculoLanzadera lanzadera = new VehiculoLanzadera("Saturno V");
//						lanzadera.setNombre(JOptionPane.showInputDialog("Ingrese el nombre:"));
//						lanzadera.setPotencia(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la potencia:")));
//						lanzadera.setCargaUtil(JOptionPane.showInputDialog("Ingrese la carga:"));
//						lanzadera.setCombustible(JOptionPane.showInputDialog("Ingrese el combustible:"));
//						lanzadera.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso:")));
//						lanzadera.setCapacidadCarga(Integer.parseInt(JOptionPane.showInputDialog("Ingrece la capacidad de carga:")));
//						lanzadera.setAltura(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura:")));
//						lanzadera.setEstadoActual(JOptionPane.showInputDialog("Ingrese el estado actual:"));
						VehiculoLanzadera lanzadera = new VehiculoLanzadera("Saturno V");
						lanzadera.setPotencia(3500);
						lanzadera.setPeso(2900);
						lanzadera.setCapacidadCarga(118);
						lanzadera.setAltura(100);
						lanzadera.setEstadoActual("Retirado en 1973");
						listaLanzaderas.add(lanzadera);
						JOptionPane.showMessageDialog(null,
								"Vehiculo lanzadera '" + lanzadera.getNombre() + "' registrado correctamente.");
						VehiculoLanzadera lanzadera2 = new VehiculoLanzadera("Energia");
						listaLanzaderas.add(lanzadera2);
						JOptionPane.showMessageDialog(null,
								"Vehiculo lanzadera '" + lanzadera2.getNombre() + "' registrado correctamente.");
						VehiculoLanzadera lanzadera3 = new VehiculoLanzadera("Transbordador espacial");
						listaLanzaderas.add(lanzadera3);
						JOptionPane.showMessageDialog(null,
								"Vehiculo lanzadera '" + lanzadera3.getNombre() + "' registrado correctamente.");
						opNave = 4;
						break;
					case 2:
						NaveNoTripulada noTripulada = new NaveNoTripulada("Transbordador Buran", listaLanzaderas.get(0));
						listaNavesNoTripuladas.add(noTripulada);
						JOptionPane.showMessageDialog(null,
								"Nave no tripulada '" + noTripulada.getNombre() + "' registrada correctamente.");
						NaveNoTripulada noTripulada1 = new NaveNoTripulada("Progreso M", listaLanzaderas.get(1));
						listaNavesNoTripuladas.add(noTripulada1);
						JOptionPane.showMessageDialog(null,
								"Nave no tripulada '" + noTripulada1.getNombre() + "' registrada correctamente.");
						NaveNoTripulada noTripulada2 = new NaveNoTripulada("Sputnik", listaLanzaderas.get(2));
						listaNavesNoTripuladas.add(noTripulada2);
						JOptionPane.showMessageDialog(null,
								"Nave no tripulada '" + noTripulada2.getNombre() + "' registrada correctamente.");
						opNave = 4;
						break;
					case 3:
						NaveTripulada tripulada = new NaveTripulada("Apolo", listaLanzaderas.get(0));
						listaNavesTripuladas.add(tripulada);
						JOptionPane.showMessageDialog(null,
								"Nave tripulada '" + tripulada.getNombre() + "' registrada correctamente.");
						NaveTripulada tripulada1 = new NaveTripulada("EEI", listaLanzaderas.get(2));
						listaNavesTripuladas.add(tripulada1);
						JOptionPane.showMessageDialog(null,
								"Nave tripulada '" + tripulada1.getNombre() + "' registrada correctamente.");
						NaveTripulada tripulada2 = new NaveTripulada("Vostok", listaLanzaderas.get(1));
						listaNavesTripuladas.add(tripulada2);
						JOptionPane.showMessageDialog(null,
								"Nave tripulada '" + tripulada2.getNombre() + "' registrada correctamente.");
						opNave = 4;
						break;
					case 4:
						break;

					default:
						JOptionPane.showMessageDialog(null, "La opción ingresada no es valida!");
						break;
					}
				}
				break;
			case 2:
				String naveBuscar = JOptionPane.showInputDialog("Ingrese el nombre de la nave que desea buscar:");
				boolean NoCoincidencias = false;
				for (VehiculoLanzadera lanzadera : listaLanzaderas) {
					if (lanzadera.getNombre().equalsIgnoreCase(naveBuscar)) {
						JOptionPane.showMessageDialog(null,
								"La nave consultada es una lanzadera y su información es:\n\n" + lanzadera.toString());
						NoCoincidencias = true;
					}
				}
				for (NaveNoTripulada noTripulada : listaNavesNoTripuladas) {
					if (noTripulada.getNombre().equalsIgnoreCase(naveBuscar)) {
						JOptionPane.showMessageDialog(null,
								"La nave consultada es una nave no tripulada y su información es:\n\n"
										+ noTripulada.toString());
						NoCoincidencias = true;
					}
				}
				for (NaveTripulada tripulada : listaNavesTripuladas) {
					if (tripulada.getNombre().equalsIgnoreCase(naveBuscar)) {
						JOptionPane.showMessageDialog(null,
								"La nave consultada es una nave tripulada y su información es:\n\n"
										+ tripulada.toString());
						NoCoincidencias = true;
					}
				}
				if (NoCoincidencias == false) {
					JOptionPane.showMessageDialog(null, "La nave consultada no se encuentra registrada!");
				}
				break;
			case 3:
				String infoLanzaderas = "Lanzaderas:\n";
				for (VehiculoLanzadera lanzadera : listaLanzaderas) {
					infoLanzaderas += lanzadera.toString() + "\n\n";
				}
				JOptionPane.showMessageDialog(null, infoLanzaderas);
				String infoNoTripuladas = "Naves no tripuladas:\n";
				for (NaveNoTripulada noTripulada : listaNavesNoTripuladas) {
					infoNoTripuladas += noTripulada.toString() + "\n\n";
				}
				JOptionPane.showMessageDialog(null, infoNoTripuladas);
				String infoTripuladas = "Naves tripuladas:\n";
				for (NaveTripulada naveTripulada : listaNavesTripuladas) {
					infoTripuladas += naveTripulada.toString() + "\n\n";
				}
				JOptionPane.showMessageDialog(null, infoTripuladas);
				break;
			case 4:
				break;

			default:
				JOptionPane.showMessageDialog(null, "La opción ingresada no es valida!");
				break;
			}
		}

	}

}
