package com.app.alumnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.alumnos.model.Alumno;
import com.app.alumnos.reposiroty.AlumnoRepository;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api")
public class AlumnoController {
    
    @Autowired
    private AlumnoRepository alumnoRepository;

    @GetMapping
    public List<Alumno> listar(){
        return alumnoRepository.findAll();
    }

    @PostMapping
    public void agregarAlumno(@RequestBody Alumno alumno){
        alumnoRepository.save(alumno);
    }

    @PutMapping
    public void modificarAlumno(@RequestBody Alumno alumno){
        alumnoRepository.save(alumno);
    }

    @DeleteMapping(value = "/{id}")
    public void borrar(@PathVariable("id") Long id){
        alumnoRepository.deleteById(id);
    }
}
