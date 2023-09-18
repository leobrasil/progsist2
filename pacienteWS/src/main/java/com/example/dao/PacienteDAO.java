package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Paciente;

@Service
public class PacienteDAO {
    private Connection con;
    public PacienteDAO()throws Exception{
        Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://silly.db.elephantsql.com/iecipocq";
			String username="iecipocq";
			String password="N2Sr-gW1kadMT8RBrIjM2bktfDIckYcG";
			this.con = DriverManager.getConnection(url, username, password);
    }

    public Paciente create(Paciente paciente)throws Exception{
        PreparedStatement stmtInsert = con.prepareStatement("insert into pacientes values (?,?)");
			stmtInsert.setInt(1, paciente.getNroPaciente()); 
			stmtInsert.setString(2, paciente.getNome());
			int count = stmtInsert.executeUpdate();
			System.out.println("inseriu "+count+" linhas");

        return paciente;
    }

    public List<Paciente>listPaciente()throws Exception{
        Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from pacientes");

        List<Paciente> lista = new ArrayList<>();
			while(rs.next()){
				Paciente aux = new Paciente();

                aux.setNroPaciente(rs.getInt("nro_paciente"));
                aux.setNome(rs.getString(2));

                lista.add(aux);
			}

        return lista;
    }
}
