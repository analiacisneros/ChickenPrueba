
package com.ChickenBros.Repositorios;

import com.ChickenBros.Entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioProducto extends JpaRepository<Producto, String> {
   
  @Query("SELECT p FROM Producto p WHERE p.id_producto = :id")
    public Producto buscarPorId(@Param("id") String id);
    
}
