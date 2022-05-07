
package com.ChickenBros.Servicios;

import com.ChickenBros.Entidades.Usuario;
import com.ChickenBros.Repositorios.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioUsuario {
    
    @Autowired 
    private RepositorioUsuario repoUsuario;
    
    
    public void AgregarCliente()
    {
     Usuario usuario= new Usuario();
     
     usuario.setNombre("Maria");
     usuario.setApellido("Perezs");
     usuario.setEmail("maria.com");
     usuario.setClave("3334");
     
     repoUsuario.save(usuario);
    }
}
