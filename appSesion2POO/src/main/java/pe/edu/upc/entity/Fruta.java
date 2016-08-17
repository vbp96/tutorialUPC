package pe.edu.upc.entity;

public class Fruta 
{
	//
	public Fruta(String nombre, String color, String sabor) {
		super(); //heredar constructor de la clase Padre
		this.nombre = nombre;
		this.color = color;
		this.sabor = sabor;
		this.puedoHacerJugo = false;
	}
	
	//constructor sobrecarga
	public Fruta()
	{
		this.nombre = "Indefinido";
		this.color = "S/C";
		this.sabor = "S/C";
		this.puedoHacerJugo = false;
	}

	//atributos de instancia: sus valores cambiaran por cada objeto que se agregue
	private String nombre;
	private String color;
	private String sabor;
	private boolean puedoHacerJugo;
	
	public static String LugarOrigen = "UPC"; //atributos de clase;se le coloca estatico si el objeto depende de la clase; todos los
											  //objetos tendrán el mismo lugar de origen

	//metodos de acceso a datos (get y set)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean isPuedoHacerJugo() {
		return puedoHacerJugo;
	}

	public void setPuedoHacerJugo(boolean puedoHacerJugo) {
		this.puedoHacerJugo = puedoHacerJugo;
	}

	//sobreescritura de metodos heredados
	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + ", color=" + color + ", sabor=" + sabor + ", puedoHacerJugo="
				+ puedoHacerJugo + "]";
	}
	
	
}
