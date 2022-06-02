package modelos;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="vuelo")
@AllArgsConstructor
public @Data class Vuelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "origen")
	private String origen;
	
	@Column(name = "destino")
	private String destino;
	
	@Column(name = "hora")
	private LocalTime hora;
	
	@Column(name = "numero_vuelo")
	private String numeroVuelo;
	
	@Column(name = "id_piloto")
	private int idPiloto;
	
	public Vuelo() {}
}
