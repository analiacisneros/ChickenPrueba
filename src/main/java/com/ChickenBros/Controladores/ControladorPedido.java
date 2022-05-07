
package com.ChickenBros.Controladores;

import com.ChickenBros.Servicios.ServicioPedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pedido")
public class ControladorPedido {
    
    @Autowired
    private ServicioPedido servpedido;
    
    @GetMapping("/agregar")
    public String agregarpedido()
    {
        
        servpedido.agregarPedido();
        
        return "crearpedido";
    }
}
