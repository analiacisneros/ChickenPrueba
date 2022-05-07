
package com.ChickenBros.Servicios;

import com.ChickenBros.Entidades.DetallePedido;
import com.ChickenBros.Entidades.Pedido;
import com.ChickenBros.Entidades.Producto;
import com.ChickenBros.Repositorios.RepositorioDetallePedido;
import com.ChickenBros.Repositorios.RepositorioPedido;
import com.ChickenBros.Repositorios.RepositorioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioDetallePedido {
    
    @Autowired
    private RepositorioDetallePedido repoDetalle;
    
    @Autowired
    private RepositorioPedido repoPedido;
    
    @Autowired
    private RepositorioProducto repoProducto;
    
    
    
    public void agregarDetalle()
    {
       String idProducto="8230832f-eec0-4a07-8239-fe78808c5dfb";
       String idPedido="1904bdff-b4d0-498a-803a-4d946f1a1328";
      DetallePedido dPedido=new DetallePedido();
      Pedido pedido=repoPedido.buscarPorId(idPedido);
      Producto producto=repoProducto.buscarPorId(idProducto);
      
      dPedido.setPedido(pedido);
      dPedido.setProducto(producto);
      dPedido.setCant_producto(3);
      
      repoDetalle.save(dPedido);
    }
    
}
