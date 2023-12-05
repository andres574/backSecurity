package com.jzleon.seguridadPedidos.Repositorios;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.jzleon.seguridadPedidos.Modelos.Permiso;
import org.springframework.data.mongodb.repository.Query;

public interface RepositorioPermiso extends MongoRepository<Permiso,String>{
    @Query("{'url':?0,'metodo':?1}")
    Permiso getPermiso(String url, String metodo);
}
