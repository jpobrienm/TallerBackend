package com.tallerBackend.demo.repositories;
import com.tallerBackend.demo.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.AbstractList;
import java.util.ArrayList;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    // se eliminan redundancias dentro de la interfaz
    public ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
    // se añaden metodos de busqueda
    public ArrayList<UsuarioModel> findByNombre(String nombre);
    public ArrayList<UsuarioModel> findByEmail(String email);
}
