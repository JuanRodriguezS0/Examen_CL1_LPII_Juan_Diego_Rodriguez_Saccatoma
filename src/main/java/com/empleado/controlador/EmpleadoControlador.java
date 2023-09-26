package com.empleado.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.empleado.entidad.Empleado;
import com.empleado.servicio.EmpleadoServicio;

@Controller
public class EmpleadoControlador {

	@Autowired
	private EmpleadoServicio servicio;
	
	@GetMapping({"/empleados","/"})
	private String listarEmpleados(Model modelo) {
		modelo.addAttribute("empleados",servicio.listarEmpleados());
		return "empleados";
	}
	
	@GetMapping("/empleados/nuevo")
	public String mostrarRegistroEmpleado(Model modelo) {
		Empleado empleado = new Empleado();
		modelo.addAttribute("empleado",empleado);
		return "crear_empleado";
	}
	
	@PostMapping("/empleados")
	public String guardarEmpleado(@ModelAttribute("empleado") Empleado empleado) {
		servicio.guardarEmpleado(empleado);
		return "redirect:/empleados";
	}
}
