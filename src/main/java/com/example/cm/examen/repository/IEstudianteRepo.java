package com.example.cm.examen.repository;

import java.util.List;

import com.example.cm.examen.repository.modelo.Estudiante;

public interface IEstudianteRepo {
    
    public void insertarEstudiante (Estudiante estu);

    public List<Estudiante> buscarTodos ();

}
