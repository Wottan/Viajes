package pais;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

@Entity
@Views({ @View(name = "MuySimple", members = "descripcion"), @View(members = "descripcion;departamentos") })
public class Provincia extends Identifiable {

	@Required
	private String descripcion;

	@ManyToOne
	private Pais pais;

	@NewAction("")
	@OneToMany(mappedBy = "provincia")
	private List<Departamento> departamentos;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public List<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(List<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

}
