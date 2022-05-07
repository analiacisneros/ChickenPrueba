
package com.ChickenBros.Repositorios;

import com.ChickenBros.Entidades.Pedido;
import com.ChickenBros.Entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioPedido extends JpaRepository<Pedido, String>{
    
    @Query("SELECT p FROM Pedido p WHERE p.id_pedido = :id")
    public Pedido buscarPorId(@Param("id") String id);
}
