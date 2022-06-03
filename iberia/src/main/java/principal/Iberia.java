package principal;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.ajbrown.namemachine.Name;
import org.ajbrown.namemachine.NameGenerator;

import com.github.javafaker.Faker;

import modelos.Avion;
import modelos.Base;
import modelos.Miembro;
import modelos.Piloto;
import modelos.Vuelo;

public class Iberia {
	
	private Database db;

	public Iberia() {
		this.db = new Database();
	}
	
	public void insertarDatos() {
		
		NameGenerator generator = new NameGenerator();
		Faker faker = new Faker();

		List<Name> personas = generator.generateNames(100);

		// insertamos 100 pilotos, 100 aviones y 100 miembros de tripulación
		for(int i=0; i<100; i++) {
			Piloto piloto = new Piloto(0, String.valueOf(i), personas.get(i).getFirstName(), 100);
			this.db.insertarPiloto(piloto);
			
			Avion avion = new Avion (0, String.valueOf(i), faker.pokemon().name(), null, null);
			this.db.insertarAvion(avion);
			
			Miembro miembro = new Miembro(0, String.valueOf(i), faker.dog().name());
			this.db.insertarMiembro(miembro);
			
			Vuelo vuelo = new Vuelo(0, faker.country().capital(), 
			faker.country().capital(), LocalTime.of(12,  12 , 12), "ABC", i);
			this.db.insertarVuelo(vuelo);
		}
		
		// insertamos 10 bases
		for (int i = 0; i < 10; i++) {
			Base base = new Base(0, faker.aviation().airport());
			this.db.insertarBase(base);
		}
	}

	public void vaciarBaseDatos() {
		this.db.vaciarTablas();
		
	}

	public void llevarAvionABase(int idAvion, int idBase) {
		
		Avion avion = this.db.obtenerAvionPorId(idAvion);
		// si avion es null, entonces no existe
		if(avion == null) {
			System.out.println("Avión no existe");
			return;
		}
		
		Base base = this.db.obtenerBasePorId(idBase);
		if(base == null) {
			System.out.println("Base no existe");
			return;
		}
		
		// cambiar el idBase de avión al nuevo 
		avion.setIdBase(idBase);
		avion.setIdVuelo(null);
		// ahora hay que actualizar el avión para que se guarde en la BD
		this.db.actualizarAvion(avion);
		
		
	}

	
	public void volarAvion(int idAvion, Vuelo vuelo) {
		
		Avion avion = this.db.obtenerAvionPorId(idAvion);
		if(avion == null) {
			System.out.println("Avión no existe");
			return;
		}
		
		Piloto piloto = this.db.obtenerPilotoPorId(vuelo.getIdPiloto());
		if(piloto == null) {
			System.out.println("Piloto no existe");
			return;
		}
		
		// inserto vuelo
		//System.out.println(vuelo.getId());
		this.db.insertarVuelo(vuelo);
		//System.out.println(vuelo.getId());
		
		// actualizo avión
		avion.setIdBase(null);
		avion.setIdVuelo(vuelo.getId());
		this.db.actualizarAvion(avion);
		
		
	}

	public void crearVuelosParaAvion() {
		
		Faker faker = new Faker();
		
		// crear avión
		Avion avion = new Avion(0, faker.book().title(), "BOING-747", null, null);
		this.db.insertarAvion(avion);
		
		//System.out.println(avion.getId());
		
		ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();
		for(int i=0; i<100; i++) {
			Vuelo vuelo = new Vuelo(0, "Madrid", faker.country().capital(), LocalTime.now(), String.valueOf(i), 0, avion);
			this.db.insertarVuelo(vuelo);
			//vuelos.add(vuelo);
		}
		
		avion.setVuelos(vuelos);
		
		Avion avionSeleccionado = this.db.obtenerAvionPorId(avion.getId());
		for (Vuelo vuelo : avionSeleccionado.getVuelos()) {
			System.out.println(vuelo.getId() + "." + vuelo.getDestino());
		}
	}

}
