package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static Integer halcones;
	public static Integer aguilas;
	private String colorPlumas;

	public Ave() {
		listado.add(this);
	}

	public Ave(String nombre, Integer edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}

	public static Integer cantidadAves() {
		return Ave.listado.size();
	}

	public String movimiento() {
		return "volar";
	}

	public static Ave crearHalcon(String nombre, Integer edad, String genero) {
		Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		Ave.listado.add(halcon);
		Ave.halcones++;
		Animal.setTotalAnimales();
		return halcon;
	}

	public static Ave crearAguila(String nombre, Integer edad, String genero) {
		Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		Ave.listado.add(aguila);
		Ave.aguilas++;
		Animal.setTotalAnimales();
		return aguila;
	}

	public static ArrayList<Ave> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}

	public static Integer getHalcones() {
		return halcones;
	}

	public static void setHalcones(Integer halcones) {
		Ave.halcones = halcones;
	}

	public static Integer getAguilas() {
		return aguilas;
	}

	public static void setAguilas(Integer aguilas) {
		Ave.aguilas = aguilas;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

}
