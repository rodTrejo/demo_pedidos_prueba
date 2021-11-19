package com.rodrigo.pedidos.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido implements Serializable {

	private static final long serialVersionUID = -4704609429008236907L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="id_pedido")
	private Integer idPedido;
	
	@Column(name="ticket")
	private String ticket;
	
	@Column(name="nombre_cliente")
	private String nombreCliente;
	
	@Column(name="direccion_cliente")
	private String direccionCliente;
	
	@Column(name="total")
	private Double total;
	
	@Column(name="fecha_compra")
	private Date fechaCompra;
	
	@OneToMany(mappedBy = "pedidoIdPedido")
	private List<Detalle> detalleList;

	public Integer getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDireccionCliente() {
		return direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public List<Detalle> getDetalleList() {
		return detalleList;
	}

	public void setDetalleList(List<Detalle> detalleList) {
		this.detalleList = detalleList;
	}
	
	

}
