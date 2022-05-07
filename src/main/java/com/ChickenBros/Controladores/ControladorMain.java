
package com.ChickenBros.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


 @Controller
@RequestMapping("/")//hace referencia a http:localhost:8080
public class ControladorMain {
       
    @GetMapping("/")
    public String index() {
        return "index.html";
    }
    

}
