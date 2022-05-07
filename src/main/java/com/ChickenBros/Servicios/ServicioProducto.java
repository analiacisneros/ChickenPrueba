
package com.ChickenBros.Servicios;

import com.ChickenBros.Entidades.Producto;
import com.ChickenBros.Repositorios.RepositorioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ServicioProducto {
    
    @Autowired
    private RepositorioProducto repoProducto;
  
    public void agregarProducto()
    {
      Producto producto = new Producto();
      
      producto.setNombre("Pollo empanizado");
      producto.setDescripcion("Frito");
      producto.setPrecio(305);
      producto.setImagen("polloempanizado.jpg");
      producto.setHabilitado(true);

      repoProducto.save(producto);
    }
}
