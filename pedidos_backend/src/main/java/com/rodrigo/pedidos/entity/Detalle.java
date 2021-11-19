package com.rodrigo.pedidos.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalle")
public class Detalle  implements Serializable{

	private static final long serialVersionUID = 5044662202963779213L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="id_detalle_pedido")
	private Integer idDetallePedido;
	
	@Column(name="nombre_articulo")
	private String nombreArticulo;
	
	@Column(name="codigo")
	private String codigo;
	
	@Column(name="precio")
	private Double precio;
	
	@Column(name="pedido_id_pedido")
	private Integer pedidoIdPedido;

	public Integer getIdDetallePedido() {
		return idDetallePedido;
	}

	public void setIdDetallePedido(Integer idDetallePedido) {
		this.idDetallePedido = idDetallePedido;
	}

	public String getNombreArticulo() {
		return nombreArticulo;
	}

	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getPedidoIdPedido() {
		return pedidoIdPedido;
	}

	public void setPedidoIdPedido(Integer pedidoIdPedido) {
		this.pedidoIdPedido = pedidoIdPedido;
	}
	
	
	

}
