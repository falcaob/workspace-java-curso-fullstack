package com.tienda.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tienda.modelos.Tienda;

// aquí código de hibernate
@Repository
public class TiendaDao {

	private EntityManager entityManager;
	
	// funciona como factory
	// INYECCIÓN
	@Autowired
	public TiendaDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	// esta anotación en todos los métodos
	@Transactional
	public void guardar(Tienda tienda) {
		Session session = this.entityManager.unwrap(Session.class);
		session.save(tienda);
	}

	@Transactional
	public List<Tienda> obtener() {
		Session session = this.entityManager.unwrap(Session.class);
		// para que devuelva tienda sin ningún filtro
		// para que lo devuelva en forma de lista .getResultList
		List <Tienda> tiendas = session.createQuery("from Tienda", Tienda.class).getResultList();
		return tiendas;
	}
	
	
	@Transactional
	public Tienda obtenerPorId(int id) {
		Session session = this.entityManager.unwrap(Session.class);
		Tienda tienda = session.get(Tienda.class, id);
		return tienda;
	}

	@Transactional
	public void actualizar(Tienda tienda) {
		Session session = this.entityManager.unwrap(Session.class);
		session.update(tienda);
		
	}

	@Transactional
	public void eliminarPorId(int id) {
		// solicitar a hibernate la entidad a través del id 
		// tiene que ser desde la base datos
		Session session = this.entityManager.unwrap(Session.class);
		session.remove(this.obtenerPorId(id));	
	}
	
}
