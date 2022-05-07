
package com.ChickenBros.Controladores;

import com.ChickenBros.Servicios.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class ControladorUsuario {
    
    @Autowired
    private ServicioUsuario servicioUsuario;
    
    @GetMapping("/agregar")
    public String agregarUsuario()
    {
        
        servicioUsuario.AgregarCliente();
        
        return "crearusuario";
    }
}
