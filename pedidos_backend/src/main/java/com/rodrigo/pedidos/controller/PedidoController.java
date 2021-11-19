package com.rodrigo.pedidos.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigo.pedidos.entity.Detalle;
import com.rodrigo.pedidos.entity.Pedido;
import com.rodrigo.pedidos.repository.DetalleRepository;
import com.rodrigo.pedidos.repository.PedidoRepository;

@RestController
@RequestMapping("/pedido")
@CrossOrigin
public class PedidoController {
	
	@Autowired
	PedidoRepository pedidoRepository;
	
	@Autowired
	DetalleRepository detalleRepository;
	
	@GetMapping(path="/get")
	public List<Pedido> getAll(){
		
		return pedidoRepository.findAll();
	}
	
	@PutMapping(path="/guardar")
	public Pedido guardar(@RequestBody Pedido pedido) {
		
		List<Detalle> detalles = pedido.getDetalleList();
		pedido.setDetalleList(null);
		
		Double total = 0.0;
		
		for(Detalle det:detalles) {
			total += det.getPrecio();
		}
		pedido.setTotal(total);
		
		pedidoRepository.save(pedido);
		
		for(Detalle det:detalles) {
			det.setPedidoIdPedido(pedido.getIdPedido());
		}
		
		detalleRepository.saveAll(detalles);
		
		pedido.setDetalleList(detalles);
		
		return pedido;
		
	}
	
	@GetMapping(path="buscar_ticket/{ticket}")
	public List<Pedido> buscarTicket(@PathVariable("ticket") String ticket){
		
		return pedidoRepository.getPedidoByTicket(ticket);
		
	}
	

}
