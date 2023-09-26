package com.empleado.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleado {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "idEmpleado", nullable = false,length = 7,columnDefinition = "CHAR(7)")
    private String idEmpleado;

    @Column(name = "apellidos", nullable = false, length = 50, columnDefinition = "VARCHAR(50)")
    private String apellidos;

    @Column(name = "nombres", nullable = false, length = 50, columnDefinition = "VARCHAR(50)")
    private String nombres;

    @Column(name = "edad", nullable = false ,columnDefinition = "INT")
    private int edad;

    @Column(name = "sexo", nullable = false, length = 1, columnDefinition = "CHAR(1)")
    private String sexo;

    @Column(name = "salario", nullable = false,columnDefinition = "INT")
    private int salario;
	
	public Empleado() {
		
	}

	public Empleado(Long id, String idEmpleado, String apellidos, String nombres, int edad, String sexo, int salario) {
		
		this.id = id;
		this.idEmpleado = idEmpleado;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.edad = edad;
		this.sexo = sexo;
		this.salario = salario;
	}
	
	public Empleado( String idEmpleado, String apellidos, String nombres, int edad, String sexo, int salario) {
		
		this.idEmpleado = idEmpleado;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.edad = edad;
		this.sexo = sexo;
		this.salario = salario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", idEmpleado=" + idEmpleado + ", apellidos=" + apellidos + ", nombres=" + nombres
				+ ", edad=" + edad + ", sexo=" + sexo + ", salario=" + salario + "]";
	}
	
	
	
	
}
