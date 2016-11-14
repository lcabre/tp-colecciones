package tpcolleciones;

import static org.junit.Assert.*;

import org.junit.Test;

public class testBar {
	
	@Test
	public void probarQueElBarSeAbraSinClientes(){
		Bar bar = new Bar();
		assertTrue(bar.abierto());
		
		bar.cerrar();
		assertTrue(bar.abierto() == false);
		
		//los clientes tienen que ser cero
		assertTrue(bar.getClientes().size() == 0);
	}
	
	@Test
	public void probarQueNoDupliqueClientesPorNombre(){
		Bar bar = new Bar();
		Cliente cliente1 = new Cliente("adrian",45);
		Cliente cliente2 = new Cliente("adrian",20);
		
		bar.nuevoCliente(cliente1);
		bar.nuevoCliente(cliente2);
		
		System.out.println("### TEST 1 ###");
		System.out.println(bar.getClientes());
	}
	
	@Test
	public void probarQueEstenOrdenadosPorNombre(){
		Bar bar = new Bar();
		Cliente cliente1 = new Cliente("leo",30);
		Cliente cliente2 = new Cliente("carlos",22);
		Cliente cliente3 = new Cliente("juan",13);
		Cliente cliente4 = new Cliente("mariano",41);
		Cliente cliente5 = new Cliente("adrian",45);
		
		bar.nuevoCliente(cliente1);
		bar.nuevoCliente(cliente2);
		bar.nuevoCliente(cliente3);
		bar.nuevoCliente(cliente4);
		bar.nuevoCliente(cliente5);
		
		System.out.println("### TEST 2 ###");
		System.out.println(bar.getClientes());
	}
	
	@Test
	public void ProbarCompararClientes(){
		Bar bar = new Bar ();
		Cliente c1 = new Cliente("Leo", 22);
		Cliente c2 = new Cliente("Carlos", 34);
		Cliente c3 = new Cliente("Carlos", 55);
		Cliente c4 = new Cliente("Diego", 26);
		
		/*Comparo dos clientes fuea del bar */
		assertTrue(c1.compareTo(c4) > 0);
		
		/*Comparo un cliente dentro del bar con otro fuera del mismo */
		bar.nuevoCliente(c3);
		assertEquals(0, bar.getClientes().iterator().next().compareTo(c2));
	}
	
	@Test
	public void probarQueEstenOrdenadosPorEdad(){
		Bar bar = new Bar();
		Cliente cliente1 = new Cliente("leo",30);
		Cliente cliente2 = new Cliente("carlos",22);
		Cliente cliente3 = new Cliente("juan",13);
		Cliente cliente4 = new Cliente("mariano",41);
		Cliente cliente5 = new Cliente("adrian",45);
	
		bar.nuevoCliente(cliente1);
		bar.nuevoCliente(cliente2);
		bar.nuevoCliente(cliente3);
		bar.nuevoCliente(cliente4);
		bar.nuevoCliente(cliente5);
		
		System.out.println("### TEST 3 ###");
		System.out.println(bar.getClentesPorEdad());
	}

}
