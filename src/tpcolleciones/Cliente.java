package tpcolleciones;

public class Cliente implements Comparable<Cliente>{
	private String nombre;
	private int edad;
	
	public Cliente(String nombre, int edad){
		this.nombre=nombre;
		this.edad=edad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
			
	@Override
	public int compareTo(Cliente cli) {
		return this.nombre.compareTo(cli.getNombre());
	}
	
	@Override
	public String toString() {
		return this.nombre+" - "+this.edad;
	}
}
