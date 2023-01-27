package com.app.alumnos.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.alumnos.model.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
    
}
