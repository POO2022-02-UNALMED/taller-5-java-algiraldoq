package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public static Integer iguanas = 0;
	public static Integer serpientes = 0;
	private String colorEscamas;
	private Integer largoCola;

	public Reptil() {
		listado.add(this);
	}

	public Reptil(String nombre, Integer edad, String habitat, String genero, String colorEscamas, Integer largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}

	public static Integer cantidadReptiles() {
		return Reptil.listado.size();
	}

	public String movimiento() {
		return "reptar";
	}

	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		Reptil.listado.add(iguana);
		Reptil.iguanas++;
		Animal.setTotalAnimales();
		return iguana;
	}

	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		Reptil.listado.add(serpiente);
		Reptil.serpientes++;
		Animal.setTotalAnimales();
		return serpiente;
	}

	public static ArrayList<Reptil> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}

	public static Integer getIguanas() {
		return iguanas;
	}

	public static void setIguanas(Integer iguanas) {
		Reptil.iguanas = iguanas;
	}

	public static Integer getSerpientes() {
		return serpientes;
	}

	public static void setSerpientes(Integer serpientes) {
		Reptil.serpientes = serpientes;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public Integer getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(Integer largoCola) {
		this.largoCola = largoCola;
	}
}
