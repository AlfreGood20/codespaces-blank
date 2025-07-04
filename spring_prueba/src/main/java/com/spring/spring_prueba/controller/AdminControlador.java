package com.spring.spring_prueba.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.spring.spring_prueba.entity.Administrador;
import com.spring.spring_prueba.service.AdminServicio;

@Controller
public class AdminControlador {

    @Autowired
    private AdminServicio adminService;

    @GetMapping("/listaAdministradores")
      public String listarPersonas(Model model) {
          model.addAttribute("personas", adminService.listarTodas());
          return "admin-list";
      }

     @GetMapping("/nuevoAdmin")
      public String mostrarFormularioNuevaPersona(Model model) {
          model.addAttribute("persona", new Administrador());
          return "admin-form";
      }

      @GetMapping("/")
    public String mostrarSaludo(Model model) {
        model.addAttribute("saludo", "HOLA MUNDO DESDE JAVA jiji");
        return "administrador";
    }
}