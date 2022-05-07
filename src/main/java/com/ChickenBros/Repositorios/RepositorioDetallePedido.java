
package com.ChickenBros.Repositorios;

import com.ChickenBros.Entidades.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioDetallePedido extends JpaRepository<DetallePedido, String>{
    
}
