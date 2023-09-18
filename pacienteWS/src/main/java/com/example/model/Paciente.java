package com.example.model;

public class Paciente {
    private int nroPaciente;
    private String nome;

    public void setNroPaciente(int num){
        this.nroPaciente = num;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getNroPaciente(){
        return this.nroPaciente;
    }

    public String getNome(){
        return this.nome;
    }

}
