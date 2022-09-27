package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static Integer caballos;
	public static Integer leones;
	private Boolean pelaje;
	private Integer patas;

	public Mamifero() {
		listado.add(this);
	}

	public Mamifero(String nombre, Integer edad, String habitat, String genero, Boolean pelaje, Integer patas) {
		super(nombre, edad, habitat, genero);
		this.patas = patas;
		this.pelaje = pelaje;
		listado.add(this);
	}

	public static Integer cantidadMamiferos() {
		return Mamifero.listado.size();
	}

	public static Mamifero crearCaballo(String nombre, Integer edad, String genero) {
		Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		caballos++;
		Animal.setTotalAnimales();
		listado.add(caballo);
		return caballo;
	}

	public static Mamifero crearLeon(String nombre, Integer edad, String genero) {
		Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
		Mamifero.listado.add(leon);
		leones++;
		Animal.setTotalAnimales();
		return leon;
	}

	public static Integer getCaballos() {
		return caballos;
	}

	public static void setCaballos(Integer caballos) {
		Mamifero.caballos = caballos;
	}

	public static Integer getLeones() {
		return leones;
	}

	public static void setLeones(Integer leones) {
		Mamifero.leones = leones;
	}

	public static ArrayList<Mamifero> getListado() {
		return Mamifero.listado;
	}

	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}

	public Integer getPatas() {
		return patas;
	}

	public void setPatas(Integer patas) {
		this.patas = patas;
	}

	public Boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(Boolean pelaje) {
		this.pelaje = pelaje;
	}
}
