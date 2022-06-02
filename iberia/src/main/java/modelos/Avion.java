package modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="avion")
@AllArgsConstructor
public @Data class Avion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "codigo")
	private String codigo;
	
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "id_base")
	private Integer idBase;
	
	@Column(name = "idVuelo")
	private Integer idVuelo;
	
	// hibernate requiere constructor por defecto para Entity
	public Avion() {}
}

