
package com.ChickenBros.Controladores;

import com.ChickenBros.Servicios.ServicioDetallePedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/detallePedido")
public class ControladorDetallePedido {
    
    @Autowired
    private ServicioDetallePedido servDetPedido; 
    
    @GetMapping("/agregar")
    public String agregarDetalle()
    {
        servDetPedido.agregarDetalle();
     return "detallepedido";
    }
}
