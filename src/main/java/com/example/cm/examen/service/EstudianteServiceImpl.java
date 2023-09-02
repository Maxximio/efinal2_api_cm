package com.example.cm.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cm.examen.repository.IEstudianteRepo;
import com.example.cm.examen.repository.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements IEstudianteService{


    @Autowired
    private IEstudianteRepo estudianteRepo;

    @Override
    public void insertarEstudianteService(Estudiante estu) {
       this.estudianteRepo.insertarEstudiante(estu);
    }

    @Override
    public List<Estudiante> buscarTodosService() {
       return this.estudianteRepo.buscarTodos();    
    }
    
}
