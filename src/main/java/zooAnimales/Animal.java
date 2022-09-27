package zooAnimales;

import java.util.ArrayList;
import main.java.gestion.Zona;

public class Animal {
	private static Integer totalAnimales;
	private String nombre;
	private Integer edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona = new ArrayList<Zona>();

	public Animal() {

	}

	public Animal(String nombre, Integer edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}

	public String movimiento() {
		return "desplazarse";
	}

	public static String totalPorTipo() {
		int nMamiferos = Mamifero.cantidadMamiferos();
		int nAves = Ave.cantidadAves();
		int nReptiles = Reptil.cantidadReptiles();
		int nPeces = Pez.cantidadPeces();
		int nAnfibios = Anfibio.cantidadAnfibios();
		return "Mamiferos: " + nMamiferos + "\nAves: " + nAves + "\nReptiles: " + nReptiles + "\nPeces: " + nPeces
				+ "\nAnfibios: " + nAnfibios;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Zona> getZona() {
		return zona;
	}

	public void setZona(ArrayList<Zona> zona) {
		this.zona = zona;
	}

	public void setZona(Zona nZona) {
		zona.add(nZona);
	}

	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}

	public static Integer getTotalAnimales() {
		return totalAnimales;
	}

	public static void setTotalAnimales() {
		Animal.totalAnimales++;
	}

	public String toString() {
		if (zona.size() == 1) {
			return "Mi nombre es " + getNombre() + ", tengo una edad de " + getEdad() + ", habito en " + getHabitat()
					+ " y mi genero es " + getGenero() + ", la zona en la que me ubico es " + zona.get(0) + ", en el "
					+ zona.get(0).getZoo();
		} else {
			return "Mi nombre es " + getNombre() + ", tengo una edad de " + getEdad() + ", habito en " + getHabitat()
					+ " y mi genero es " + getGenero();
		}
	}

}
