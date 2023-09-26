package com.empleado.servicio;

import java.util.List;

import com.empleado.entidad.Empleado;

public interface EmpleadoServicio {

	public List<Empleado> listarEmpleados();
	
	public Empleado guardarEmpleado(Empleado empleado);
}
