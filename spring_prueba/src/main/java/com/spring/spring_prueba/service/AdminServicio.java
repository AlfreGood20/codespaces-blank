package com.spring.spring_prueba.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.spring_prueba.repository.AdminRepositorio;
import com.spring.spring_prueba.entity.Administrador;

@Service
public class AdminServicio{

    @Autowired
    private AdminRepositorio adminRepositorio;

     public List<Administrador> listarTodas() {
        return adminRepositorio.findAll();
    }

    public Administrador guardar(Administrador admin) {
        return adminRepositorio.save(admin);
    }

    public Administrador obtenerPorId(Long id) {
        return adminRepositorio.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        adminRepositorio.deleteById(id);
    }
}