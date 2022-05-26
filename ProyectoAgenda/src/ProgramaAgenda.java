import java.time.LocalDate;

public class ProgramaAgenda {

	public static void main(String[] args) {
		
		// hay que crear objeto de la clase Agenda 
		Agenda agenda =  new Agenda();
		
		// probar método agregar contacto
		//Contacto contacto1 = new Contacto("Ana", 666888555);
		//Contacto contacto2 = new Contacto("Edu", 666222333);
		
		//System.out.println(agenda.agregarContacto(contacto1));
		//System.out.println(agenda.agregarContacto(contacto1));
		
		//Contacto contacto1 = new Contacto("Ana", 666555444);
		//agenda.agregarContacto(contacto1);
		//System.out.println(agenda.eliminarContacto("Juan"));
		//System.out.println(agenda.eliminarContacto("Ana"));
		//System.out.println(agenda.eliminarContacto("Ana"));
		
		//System.out.println(agenda.existeContacto("Ana"));
		
		// hay que pasarle los 2 valores que espera el constructor
		// probamos el método listarContactos
//		agenda.agregarContacto(new Contacto("Ana", 666555441));
//		agenda.agregarContacto(new Contacto("Pedro", 666555442));
//		agenda.agregarContacto(new Contacto("Juan", 666555443));
//		agenda.agregarContacto(new Contacto("Enrique", 666555444));
//		agenda.listarContactos();
		
		// probamos el método buscarContactos
		
		LocalDate ld = LocalDate.of(2005, 01, 12);
		agenda.agregarContacto(new ContactoPersona("Ana", 666555441, ld.toString()));
		agenda.agregarContacto(new ContactoPersona("Pedro", 666555442, ld.toString()));
		agenda.agregarContacto(new ContactoEmpresa("Ontech", 666555443, "http://www.ontech.es"));
		agenda.agregarContacto(new ContactoEmpresa("CoreNetwork", 666555444, "http://www.corenetwork.com"));
		//System.out.println(agenda.buscarContacto("Ana"));  // Contacto [nombre=Ana, telefono=666555441]
		//System.out.println(agenda.buscarContacto("Chema")); // null
		
		
		agenda.listarContactos();
		
	}
}
