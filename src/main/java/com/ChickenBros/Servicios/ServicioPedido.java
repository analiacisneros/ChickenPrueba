
package com.ChickenBros.Servicios;


import com.ChickenBros.Entidades.Pedido;
import com.ChickenBros.Entidades.Usuario;
import com.ChickenBros.Repositorios.RepositorioPedido;
import com.ChickenBros.Repositorios.RepositorioUsuario;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioPedido {
 
    @Autowired
    private RepositorioPedido repoPedido;
    @Autowired
    private RepositorioUsuario repoUsuario;
   
    
    public void agregarPedido(){
        
        String id="fb27ec3a-c254-4b6a-9be1-2a9e6f31ca6b";
        Pedido pedido= new Pedido();
        
        Usuario usuario=repoUsuario.buscarPorId(id);
        
        pedido.setId_cliente(usuario);
        pedido.setMonto_total(1200.0);
        pedido.setHora_entrega(new Time(119, 6, 18)); //Agrega Horario
        
        pedido.setFecha(new GregorianCalendar());
        pedido.setLugar(true);
        pedido.setEstado(1);
        
        repoPedido.save(pedido);
    }
    
    
    /* Referencia de validacion
    return a;
    }
    
    public void validar(String nombre) throws Exception{
    
          if(nombre==null || nombre.isEmpty())
          {
              throw new Exception("El nombre debe ser colcoado");
          }
    }*/
}
