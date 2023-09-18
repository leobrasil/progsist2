package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.dao.PacienteDAO;
import com.example.model.Paciente;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.example")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


		/*try{
			
			PacienteDAO dao = new PacienteDAO();
			List<Paciente> ret = dao.listPaciente();


			for (Paciente paciente : ret) {
				System.out.println(paciente.getNome());
			}
			



			
		}catch(Exception ex){
			ex.printStackTrace();
		}*/

	}

}
