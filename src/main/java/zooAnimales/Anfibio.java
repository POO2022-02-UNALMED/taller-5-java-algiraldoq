package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static Integer ranas = 0;
	public static Integer salamandras = 0;
	private String colorPiel;
	private Boolean venenoso;

	public Anfibio() {
		listado.add(this);
		Animal.setTotalAnimales(Animal.getTotalAnimales() + 1);
	}

	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, Boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
		Animal.setTotalAnimales(Animal.getTotalAnimales() + 1);
	}

	public static Integer cantidadAnfibios() {
		return Anfibio.listado.size();
	}

	public String movimiento() {
		return "saltar";
	}

	public static Anfibio crearRana(String nombre, Integer edad, String genero) {
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		listado.add(rana);
		Anfibio.ranas++;
		Animal.setTotalAnimales();
		return rana;
	}

	public static Anfibio crearSalamandra(String nombre, Integer edad, String genero) {
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		Anfibio.listado.add(salamandra);
		Anfibio.salamandras++;
		Animal.setTotalAnimales();
		return salamandra;
	}

	public static ArrayList<Anfibio> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}

	public static int getRanas() {
		return ranas;
	}

	public static void setRanas(int ranas) {
		Anfibio.ranas = ranas;
	}

	public static int getSalamandras() {
		return salamandras;
	}

	public static void setSalamandras(int salamandras) {
		Anfibio.salamandras = salamandras;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public Boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(Boolean venenoso) {
		this.venenoso = venenoso;
	}

}
