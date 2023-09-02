package com.example.cm.examen.controller;

import java.util.List;
import org.springframework.http.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cm.examen.repository.modelo.Estudiante;
import com.example.cm.examen.service.IEstudianteService;


@RestController
@RequestMapping("/estudiantes")
@CrossOrigin
public class EstudianteControllerRestful {
   
    @Autowired
    private IEstudianteService estudianteService;

    @GetMapping ( produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Estudiante> buscarLista(){
        List<Estudiante> lista=this.estudianteService.buscarTodosService();
        return lista;
    }

    @PostMapping()
    public void ingresarEstudiantes(@RequestBody Estudiante estudiante){
        this.estudianteService.insertarEstudianteService(estudiante);
    }

}
