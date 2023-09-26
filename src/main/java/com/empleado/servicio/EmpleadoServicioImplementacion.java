package com.empleado.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empleado.entidad.Empleado;
import com.empleado.repositorio.EmpleadoRepositorio;

@Service
public class EmpleadoServicioImplementacion implements EmpleadoServicio {
	
	@Autowired
	private EmpleadoRepositorio repositorio;

	@Override
	public List<Empleado> listarEmpleados() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		
		return repositorio.save(empleado);
	}

}
