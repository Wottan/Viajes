package empresa;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import escuela.*;
import pais.*;

@Entity
public class Empresa extends Identifiable{
	
	@Required
	private String descripcion;
	
	@ManyToOne
	@DescriptionsList
	private Departamento departamento;
	
	@ManyToOne
	@DescriptionsList(depends = "departamento", condition = "${departamento.id}=?")
	private Localidad localidad;
	
	@Embedded
	private Direccion direccion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	
}
