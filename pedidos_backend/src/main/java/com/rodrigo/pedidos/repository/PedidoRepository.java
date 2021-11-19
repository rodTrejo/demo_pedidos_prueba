package com.rodrigo.pedidos.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rodrigo.pedidos.entity.Pedido;

@Repository("pedidoRepository")
public interface PedidoRepository extends JpaRepository<Pedido, Serializable> {
	
	
	@Query(value="select * from Pedido p left join Detalle d on p.id_pedido=d.pedido_id_pedido where p.ticket = :ticket ", nativeQuery = true)
	public List<Pedido> getPedidoByTicket(@Param("ticket") String ticket);

}
