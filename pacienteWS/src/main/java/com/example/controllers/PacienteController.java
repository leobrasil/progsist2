package com.example.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.PacienteDAO;
import com.example.model.Paciente;

@RestController
public class PacienteController {
    
    @Autowired
    private PacienteDAO pacienteDao;
    
    @GetMapping("/api/pacientes")
    public List<Paciente> getPacientes() throws Exception{
        return pacienteDao.listPaciente();
        //return new ArrayList<Paciente>();
    }

    @PostMapping("/api/paciente")
    public Paciente inserePaciente(@RequestBody Paciente paciente) throws Exception{
        return this.pacienteDao.create(paciente);
    }
}
