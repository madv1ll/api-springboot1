package com.app.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.api.entidad.Estudiante;
import com.app.api.repositorio.EstudianteRepositorio;

@SpringBootApplication
public class ApiRestSpringBootApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ApiRestSpringBootApplication.class, args);
	}
	
	@Autowired
	private EstudianteRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
		/*Estudiante estudiante1= new Estudiante("Kevin","Tobar", "kevin1@gmail.com");
		repositorio.save(estudiante1);
		
		Estudiante estudiante2= new Estudiante("Martin","Tobar", "martin1@gmail.com");
		repositorio.save(estudiante2);*/
		
	}

}
