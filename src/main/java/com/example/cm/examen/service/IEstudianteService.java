package com.example.cm.examen.service;

import java.util.List;

import com.example.cm.examen.repository.modelo.Estudiante;

public interface IEstudianteService {
    
    public void insertarEstudianteService (Estudiante estu);

    public List<Estudiante> buscarTodosService ();

}
