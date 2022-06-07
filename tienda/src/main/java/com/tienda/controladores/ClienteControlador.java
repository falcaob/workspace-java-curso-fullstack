package com.tienda.controladores;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.dao.ClienteDao;
import com.tienda.dao.TiendaDao;
import com.tienda.modelos.Tienda;
import com.tienda.vistas.DataEmpty;
import com.tienda.vistas.Respuesta;

@RestController
@RequestMapping("/cliente")
public class ClienteControlador {

	private TiendaDao tiendaDao;
	private ClienteDao clienteDao;
	
	@Autowired
	public ClienteControlador(TiendaDao tiendaDao, ClienteDao clienteDao) {
		this.tiendaDao = tiendaDao;
		this.clienteDao = clienteDao;
	}
	
	/*
	@PostMapping("/insertar")
	public Respuesta insertarClientes(@RequestBody Tienda tienda) {
		
		Tienda tiendaExistente = this.tiendaDao.obtenerPorId(tienda.getId());
		
		if(tiendaExistente == null) {
			return new Respuesta(false, "No existe la tienda con el id " + tienda.getId(), new DataEmpty());
		}
		
		// aquí se hace la aztualización
		tiendaExistente.setClientes(tienda.getClientes());
		this.tiendaDao.actualizar(tiendaExistente);
		return new Respuesta(false, "No existe la tienda con el id " + tienda.getId(), new DataEmpty());
		
	}
	*/
	
}
