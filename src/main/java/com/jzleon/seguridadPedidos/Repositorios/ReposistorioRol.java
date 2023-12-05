package com.jzleon.seguridadPedidos.Repositorios;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.jzleon.seguridadPedidos.Modelos.Rol;

public interface ReposistorioRol extends MongoRepository<Rol,String>{
}
