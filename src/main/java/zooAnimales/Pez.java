package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static Integer salmones = 0;
	public static Integer bacalaos = 0;
	private String colorEscamas;
	private Integer cantidadAletas;

	public Pez() {
		listado.add(this);
	}

	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}

	public static Integer cantidadPeces() {
		return Pez.listado.size();
	}

	public String movimiento() {
		return "nadar";
	}

	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		Pez.listado.add(salmon);
		Pez.salmones++;
		Animal.setTotalAnimales();
		return salmon;
	}

	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		Pez.listado.add(bacalao);
		Pez.bacalaos++;
		Animal.setTotalAnimales();
		return bacalao;
	}

	public static ArrayList<Pez> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public Integer getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(Integer cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}

	public static Integer getSalmones() {
		return salmones;
	}

	public static void setSalmones(Integer salmones) {
		Pez.salmones = salmones;
	}

	public static Integer getBacalaos() {
		return bacalaos;
	}

	public static void setBacalaos(Integer bacalaos) {
		Pez.bacalaos = bacalaos;
	}

}
