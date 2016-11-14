package tpcolleciones;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Bar {
	private Set<Cliente> clientes;
	private Boolean abierto;
	
	public Bar(){
		this.abierto = true;
		this.clientes = new TreeSet<Cliente>();
	}
	
	public Boolean abierto(){
		return this.abierto;
	}
	
	public void abrir(){
		this.abierto = true;
	}
	
	public void cerrar(){
		this.abierto = false;
	}
	
	public void nuevoCliente(Cliente cliente){
		this.clientes.add(cliente);
	}
	
	public Set<Cliente> getClientes(){
		return this.clientes;
	}
	
	public ArrayList<Cliente> getClentesPorEdad(){
		ArrayList<Cliente> clientes = new ArrayList<Cliente>(this.clientes);
		Collections.sort(clientes, new ComparaPorEdad());
		return clientes;
	}
}
