package com.example.cm.examen.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.cm.examen.repository.modelo.Estudiante;

@Transactional
@Repository
public class EstudianteRepoImpl implements IEstudianteRepo{

    @PersistenceContext
    private EntityManager em;

    @Override
    public void insertarEstudiante(Estudiante estu) {
        this.em.persist(estu);
    }

    @Override
    public List<Estudiante> buscarTodos() {
       TypedQuery<Estudiante> mQuery=this.em
       .createQuery("Select a from Estudiante a",Estudiante.class);
        return mQuery.getResultList();
    }
    
}
