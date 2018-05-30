package escuela;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import pais.*;

@Entity
public class Escuela extends Identifiable {

	private String cue;

	@Required
	private String descripcion;

	@ManyToOne
	@DescriptionsList
	@NoCreate
	@NoModify
	private Departamento departamento;

	@ManyToOne
	@NoCreate
	@NoModify
	@DescriptionsList(depends = "departamento", condition = "${departamento.id}=?")
	private Localidad localidad;

	@Embedded
	private Direccion direccion;

	public String getCue() {
		return cue;
	}

	public void setCue(String cue) {
		this.cue = cue;
	}

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
