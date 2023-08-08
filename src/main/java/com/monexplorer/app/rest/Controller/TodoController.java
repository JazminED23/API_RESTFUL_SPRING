package com.monexplorer.app.rest.Controller;

import com.monexplorer.app.rest.Model.Alumno;
import com.monexplorer.app.rest.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;
    @GetMapping(value="/")
    public String holaMundo(){

        return "HOLA MUNDO!!!";
    }
    @GetMapping(value="/alumno")
    public List<Alumno> getTask(){

        return todoRepository.findAll();
    }
    @PostMapping(value="/savealumno")
    public String saveAlumno(@RequestBody Alumno task){
        todoRepository.save(task);
        return "Saved alumno";
    }
    @PutMapping(value="/update/{num_control}")
    public String updateAlumno(@PathVariable int num_control,@RequestBody Alumno alumno){
        Alumno updatedAlumno =todoRepository.findById(num_control).get();
        updatedAlumno.setNombre(alumno.getNombre());
        updatedAlumno.setApellido(alumno.getApellido());
        updatedAlumno.setCorreo(alumno.getApellido());
        updatedAlumno.setCarrera(alumno.getCarrera());
        updatedAlumno.setDireccion(alumno.getDireccion());
        todoRepository.save(updatedAlumno);
        return "Updated Alumno";
    }
    @DeleteMapping(value="delete/{num_control}")
    public String deleteAlumno(@PathVariable int num_control){
        Alumno deletedAlumno=todoRepository.findById(num_control).get();
        todoRepository.delete(deletedAlumno);
        return "Deleted Alumno";
    }
}
