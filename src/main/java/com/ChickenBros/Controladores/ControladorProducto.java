
package com.ChickenBros.Controladores;

import com.ChickenBros.Servicios.ServicioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/producto")
public class ControladorProducto {
    
    @Autowired
    private ServicioProducto servProducto;
    
    @GetMapping("/agregar")
    public String agregarProducto()
    {
       servProducto.agregarProducto();
        return "crearproducto";
    }
}
