package com.empleado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.empleado.entidad.Empleado;
import com.empleado.repositorio.EmpleadoRepositorio;

@SpringBootApplication
public class Cl1LpiiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Cl1LpiiApplication.class, args);
	}

	@Autowired
	private EmpleadoRepositorio repositorio;
	
	@Override
	public void run(String... args) throws Exception {
		
		Empleado empleado1 = new Empleado("EMP0001", "TORRES","JOSE", 22,"M", 1500);
		repositorio.save(empleado1);
		
		Empleado empleado2 = new Empleado("EMP0002", "GARCIA","MARIA", 21,"F", 1750);
		repositorio.save(empleado2);
		
		Empleado empleado3 = new Empleado("EMP0003", "FLORES","JUAN", 22,"M", 1850);
		repositorio.save(empleado3);
		
		Empleado empleado4 = new Empleado("EMP0004", "CASAS","ANA", 23,"F", 2000);
		repositorio.save(empleado4);
	}

}
