package pais;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

@Entity
@Views({ @View(name = "MuySimple", members = "descripcion"), @View(members = "descripcion") })
public class Localidad extends Identifiable {

	@Required
	private String descripcion;

	@ManyToOne
	@ReferenceView("MuySimple")
	private Departamento departamento;

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

}
