package com.jzleon.seguridadPedidos.Repositorios;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.jzleon.seguridadPedidos.Modelos.Usuario;

public interface RepositorioUsuario extends MongoRepository<Usuario,String>{

    @Query("{'correo': ?0}")
    public Usuario getUserByEmail(String correo);

}
