package com.spring.spring_prueba.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.spring_prueba.entity.Administrador;

@Repository
public interface AdminRepositorio extends JpaRepository<Administrador,Long>{
}
